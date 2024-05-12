package lab6;

/**
 * Class for validating requests to the table
 */

class RequestValidator {

    /**
     * func to validate requests
     * @param request text of a request
     * @param id person id
     * @param table table to which the request is sent
     * @return true or false
     */
    public boolean validateRequest(String request, String id, RelationalTable table) {

        return request != null && !request.isEmpty() && table.getData(id) != null;
    }
}
