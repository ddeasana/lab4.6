package lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Singleton class for the database schema
  */

class DatabaseSchema {
    private static DatabaseSchema instance;
    private ArrayList<RelationalTable> schema;

    /**
     * private constructor
     */
    private DatabaseSchema() {
        // Initialize database schema
        schema = new ArrayList<>();
    }

    /**
     * getInstance function
     * @return instance of database
     */
    public static DatabaseSchema getInstance() {
        if (instance == null) {
            instance = new DatabaseSchema();
        }
        return instance;
    }

    /**
     * func for adding tables to database
     * @param table is a table to be added
     */
    public void addTable(RelationalTable table) {
        schema.add(table);
    }



}
