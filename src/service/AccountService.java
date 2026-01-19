@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepo;

    @Autowired
    private TransactionRepository transactionRepo;

    public Account createAccount(AccountRequest req) {
        Account acc = new Account();
        acc.setAccountNumber(req.accountNumber);
        acc.setBalance(req.initialBalance);
        return accountRepo.save(acc);
    }

    public void transfer(TransferRequest req) {
        Account from = accountRepo.findByAccountNumber(req.fromAccount).orElseThrow();
        Account to = accountRepo.findByAccountNumber(req.toAccount).orElseThrow();

        if (from.getBalance() < req.amount)
            throw new RuntimeException("Insufficient Balance");

        from.setBalance(from.getBalance() - req.amount);
        to.setBalance(to.getBalance() + req.amount);

        accountRepo.save(from);
        accountRepo.save(to);

        Transaction tx = new Transaction();
        tx.setFromAccount(req.fromAccount);
        tx.setToAccount(req.toAccount);
        tx.setAmount(req.amount);
        tx.setTimestamp(LocalDateTime.now());
        transactionRepo.save(tx);
    }
}