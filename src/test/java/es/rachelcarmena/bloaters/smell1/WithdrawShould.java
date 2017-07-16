package es.rachelcarmena.bloaters.smell1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WithdrawShould {
    private final double A_VALUE = 560d;

    @Test
    public void keep_the_amount() {
        Withdraw withdraw = new Withdraw(new AmountFake(A_VALUE));

        assertThat(withdraw.getAmount(), is(new AmountFake(A_VALUE)));
    }

    private class AmountFake extends Amount {
        public AmountFake(double amount) {
            super(amount);
        }

        @Override
        public boolean equals(Object obj) {
            Amount amount = (Amount) obj;
            return amount.value == this.value;
        }
    }
}