package lab6;
import java.util.HashMap;
import java.util.Map;

/**
 * Singleton class for the database schema
  */

class DatabaseSchema {
    private static DatabaseSchema instance;
    private Map<String, String> schema;

    /**
     * private constructor
     */
    private DatabaseSchema() {
        // Initialize database schema
        schema = new HashMap<>();
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
     * @param tableName name of table
     * @param tableDefinition type of table data
     */
    public void addTable(String tableName, String tableDefinition) {
        schema.put(tableName, tableDefinition);
    }

    /**
     * func to get definition of table
     * @param tableName name of table
     * @return table definition
     */
    public String getTableDefinition(String tableName) {
        return schema.get(tableName);
    }
}
