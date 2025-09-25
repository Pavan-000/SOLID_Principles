interface Payment {
    void pay();
}

class CrediCardPayment implements Payment {
    public void pay() {

    }
}

class UPI implements Payment {
    public void pay() {

    }
}

class PaymentProcessor {
    public void process (Payment payment) {
        payment.pay();
    }
}

/*

   -> To Add New Payment (eg : Paypal ) just create new class 
                            -> no changes in exsiting code
        
   -> Extensible without modifying core logic 

*/