class User{
    public void SaveToDB(){
        // Save Data to Database
        System.out.println("Save Data to Database");
    }
    public void generateReport(){
        // Generate User Report
        System.out.println("Generate User Report");

    }
}

/*

Here, User is doing two jobs

    1) Managing User Data
    2) Handling Persistance and reporting

If tommorow the reporting format changes, 
we will modify User, which risks breaking DB logic

*/