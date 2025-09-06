interface Bird {

}

interface FlyableBird extends Bird {
    void fly(){

    }
}

class Sparrow implements FlyableBird {
    public void fly () {

    }
}

class Ostrich implements Bird {

}

/*

  -> Now, Ostrich is a bird without flying ability

  -> Substitution works safely -> LSP satisfied

*/