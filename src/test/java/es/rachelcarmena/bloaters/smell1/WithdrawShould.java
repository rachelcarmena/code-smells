package es.rachelcarmena.bloaters.smell1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WithdrawShould {

    @Test
    public void keep_the_amount() {
        Withdraw withdraw = new Withdraw(560d);

        assertThat(withdraw.getAmount(), is(560d));
    }
}
