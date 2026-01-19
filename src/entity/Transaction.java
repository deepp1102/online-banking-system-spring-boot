@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fromAccount;
    private String toAccount;
    private double amount;
    private LocalDateTime timestamp;
}