package pt.paterns.creational.prototype.sql_demo;

import java.util.ArrayList;
import java.util.List;

public class Statement implements Cloneable {

    private final String sql;
    private final List<String> parameters;
    private final Record recordDb;

    public Statement(String sql, List<String> parameters, Record recordDb) {
        this.sql = sql;
        this.parameters = parameters;
        this.recordDb = recordDb;
    }

    public Statement() {
        // Empty constructor
        this.sql = "";
        this.parameters = new ArrayList<>();
        this.recordDb = new Record();
    }

    public Statement(Statement statement) {
        // Copy constructor (shallow)
        this.sql = statement.sql;
        this.parameters = statement.parameters;
        this.recordDb = statement.recordDb;
    }

    @Override
    public Statement clone() {
        // "clone" should not be overridden, copy constructor or copy factory should be used instead.
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new Statement();
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecordDb() {
        return recordDb;
    }
}
