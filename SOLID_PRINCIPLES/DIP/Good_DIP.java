interface Database {

    void connect ();
}

class MySQLDatabse implements Database {
    
    public void connect () {

    }
}

class PostgresSQL implements Database {

    public void connect () {

    }
}

class UserService {
    private Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void saveUser() {
        db.connect();
    }
}

/*

    -> UserService depends on abstraction database

    -> Works with any database  -> just inject the dependency 

    -> Promotes loose coupling 

*/