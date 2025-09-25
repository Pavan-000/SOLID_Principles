class User{}

class UserRepository{
    public void save(User user);
}

class ReportGenerator{
    public void generate(User user);
}

/*

-> Now each class has one responsibility.

-> changes in reporting wont effect the database operations.

-> High cohesion, low coupling -> better maintainability.

*/