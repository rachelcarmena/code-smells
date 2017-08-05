package es.rachelcarmena.couplers.smell1;

import java.time.LocalDate;

public class Payment {
    private String id;
    private Amount amount;
    private String method;
    private LocalDate date;

    public Payment(String id, String amount, String method, LocalDate date) {
        this.id = id;
        this.amount = Amount.from(amount);
        this.method = method;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Amount getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public LocalDate getDate() {
        return date;
    }
}
