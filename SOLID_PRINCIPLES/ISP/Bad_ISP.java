interface Machine {

    void print ();
    void scan ();
    void fax ();

}

class BasicPrinter implements MAchine {
    public void print (){
        // It supports
    }

    public void scan () {
        /* It doen't support  scan */
    }

    public void fax () {
        /* IT doesn't support Fax */
    }
}

/*

    -> BasicPrinter is forced to implement methods it doesnt use

    -> Leads to "empty" or "unsupported" implementations 

*/
