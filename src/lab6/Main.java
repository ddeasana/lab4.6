package lab6;

public class Main {
    public static void main(String[] args) {
        // Create database schema
        DatabaseSchema dbSchema = DatabaseSchema.getInstance();
        dbSchema.addTable("Users", "int ID, String Name");

        // Create relational table
        RelationalTable usersTable = new RelationalTable("Users");
        usersTable.insertData("1", "Ann");
        usersTable.insertData("2", "Mary");

        // Validate request
        RequestValidator validator = new RequestValidator();
        String request = "Return a name of user based on id";
        boolean isValidRequest = validator.validateRequest(request, "1", usersTable);
        System.out.println("Is request valid? " + isValidRequest);
    }
}