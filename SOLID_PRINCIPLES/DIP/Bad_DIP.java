class MySQLDatabase {
    public void connect () {

    }
}

class UserService {
    private MySQLDatabase db = new MySQLDatabase();

    public void saveUser () {
        db.connect();
    }
}

/*

    -> UserService depend on concrete MYSQLDatabase

    -> if we switch to PostgresSQL, we must change the UserService

*/