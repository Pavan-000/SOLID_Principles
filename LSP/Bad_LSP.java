class Bird {
    public void fly () {

    }
}

class Ostrich extends Bird {
    // Ostrich can't fly but forced to implement fly() 
}

/*

 -> Substituting Ostrich for Bird breaks expectations

 -> Violates the LSP because child doesnt behave like parent 

*/