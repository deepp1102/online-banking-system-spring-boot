@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody AccountRequest req) {
        return new ResponseEntity<>(service.createAccount(req), HttpStatus.CREATED);
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestBody TransferRequest req) {
        service.transfer(req);
        return ResponseEntity.ok("Transfer Successful");
    }
}