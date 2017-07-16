package es.rachelcarmena.oo.abusers.smell1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CoolStackShould {

    @Test
    public void push_and_pop_elements() {
        CoolStack coolStack = new CoolStack();
        coolStack.push("lala");
        coolStack.push("lolo");

        assertThat(coolStack.pop(), is("lolo"));
        assertThat(coolStack.pop(), is("lala"));
    }

    @Test
    public void return_size() {
        CoolStack coolStack = new CoolStack();
        coolStack.push("lala");
        coolStack.push("lolo");

        assertThat(coolStack.size(), is(2));
    }

    @Test
    public void inform_that_is_empty_when_it_has_no_elements() {
        CoolStack coolStack = new CoolStack();

        assertTrue(coolStack.isEmpty());
    }

    @Test
    public void inform_that_is_not_empty_when_it_has_elements() {
        CoolStack coolStack = new CoolStack();
        coolStack.push("lala");

        assertFalse(coolStack.isEmpty());
    }
}
