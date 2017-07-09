package es.rachelcarmena.dispensables.smell1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PrinterShould {

    @Mock
    Console console;

    @Test
    public void printUser() {
        User user = new User("lala", "lolo");
        Printer printer = new Printer(console);

        printer.printUser(user);

        verify(console).print("*** User details ***");
        verify(console).print("name:lala");
        verify(console).print("surname:lolo");
    }
}
