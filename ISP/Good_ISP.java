interface Printer {

    void print ();
}

interface Scanner {

    void scan ();
}

class BasicPrinter implements Printer {
    public void print () {
        // No need of unused or unsupportive methods
    }
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print () {

    }

    public void scan () {

    }
}

/*

    -> Client only implements what they need 

    -> flexiblle design and avoids bloated interfaces 

*/