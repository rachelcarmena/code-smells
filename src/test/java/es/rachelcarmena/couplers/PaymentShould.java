package es.rachelcarmena.couplers;

import es.rachelcarmena.couplers.smell1.Payment;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PaymentShould {

    @Test
    public void allow_get_amount_with_2_decimals() {
        Payment payment = new Payment("000012", "12.4563", "OneMethod", LocalDate.now());
        BigDecimal paymentValue = payment.getAmount().getValue();
        String printedValue = paymentValue.setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();

        assertThat(printedValue, is("12.46"));
    }

    @Test
    public void allow_get_amount_with_2_decimals_when_no_decimals() {
        Payment payment = new Payment("000012", "18", "OneMethod", LocalDate.now());
        BigDecimal paymentValue = payment.getAmount().getValue();
        String printedValue = paymentValue.setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();

        assertThat(printedValue, is("18.00"));
    }
}
