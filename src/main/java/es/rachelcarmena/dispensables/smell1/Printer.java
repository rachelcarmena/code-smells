package es.rachelcarmena.dispensables.smell1;

public class Printer {
    private Console console;

    public Printer(Console console) {
        this.console = console;
    }

    public void printUser(User user) {
        printBanner();

        //print details
        console.print("name:" + user.name);
        console.print("surname:" + user.surname);
    }

    private void printBanner() {
        console.print("*** User details ***");
    }
}