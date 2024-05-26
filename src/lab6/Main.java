package lab6;

public class Main {
    public static void main(String[] args) {
        // Create database schema
        DatabaseSchema dbSchema = DatabaseSchema.getInstance();


        // Create relational table
        RelationalTable usersTable;
        dbSchema.addTable( usersTable = new RelationalTable("Users"));
        usersTable.insertData("1", "Ann");
        usersTable.insertData("2", "Mary");

        RelationalTable usersTable2;
        dbSchema.addTable( usersTable2 = new RelationalTable("Another Users"));
        usersTable2.insertData("3", "Max");
        usersTable2.insertData("4", "Oleg");

        // Validate request
        RequestValidator validator = new RequestValidator();
        String request = "Return a name of user based on id";
        boolean isValidRequest = validator.validateRequest(request, "1", usersTable);
        System.out.println("Is request valid? " + isValidRequest);
    }
}