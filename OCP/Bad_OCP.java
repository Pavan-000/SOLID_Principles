class PaymentProcessor {
    public void processPayment(String type){
        if(type.equls("CreditCard")){
            // Process Credit Card
        }
        else if(type.equals("UPI")){
            // Process UPI
        }
    }
}

/*

 -> Every New Payment Type -> Modify the class.

 -> Voilates the OCP : Not closed for modification

*/