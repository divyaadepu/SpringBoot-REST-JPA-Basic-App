package com.springboot.person;

import java.util.Map;

public class AthenaQuery {

    private String table;
    private Map<String, String> queryParams;

    public AthenaRequest(String table, Map<String, String> queryParams) {
        this.table = table;
        this.queryParams = queryParams;
    }

    public String buildQuery() {
        String query = "SELECT * FROM " + table;
        if (!queryParams.isEmpty()) {  
            query = query + " WHERE ";
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                query = query + entry.getKey() + " = '" + entry.getValue() + "' AND ";  
            }
            query = query.substring(0, query.length() - 5);  
        }
        return query;
    }

    public void printQuery() {
        System.out.println(buildQuery());  
    }
}

