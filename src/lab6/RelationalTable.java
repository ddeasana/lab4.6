package lab6;
import java.util.HashMap;
import java.util.Map;

/**
 *  Class, defining the relational table
 */

class RelationalTable {
    private String tableName;
    private Map<String, Object> tableData;

    /**
     * constructor
     * @param tableName name of table
     */
    public RelationalTable(String tableName) {
        this.tableName = tableName;
        tableData = new HashMap<>();
    }

    /**
     * func to insert some data into the table
     * @param id id of a person
     * @param name of a person
     */
    public void insertData(String id, String name) {
        tableData.put(id, name);
    }

    /**
     * func to get name based on id
     * @param id id of a person
     * @return name of a person
     */
    public Object getData(String id) {
        return tableData.get(id);
    }
}