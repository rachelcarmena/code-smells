package es.rachelcarmena.oo.abusers.smell2;

public class Tenant {
    private final String name;
    private final TenantType type;
    private final int deposit;

    public Tenant(String name, TenantType type, int deposit) {
        this.name = name;
        this.type = type;
        this.deposit = deposit;
    }

    public int calculateDepositAfterRenting() {
        switch (type) {
            case BAD:
                return 0;
            case NORMAL:
                return deposit;
            case SUPER:
                return deposit * 2;
        }
        return 0;
    }
}
