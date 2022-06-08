package pt.paterns.creational.prototype.sql_demo;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {
    public static void main(String[] args) {

        String sql = """
                SELECT *
                FROM movies
                WHERE title = ?""";

        List<String> parameters = new ArrayList<>();
        parameters.add("Star Wars");

        Record recordDb = new Record();

        Statement firstStatement = new Statement(sql, parameters, recordDb);

        System.out.println("First Statement:");
        System.out.println(firstStatement);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecordDb());


        Statement secondStatement = new Statement(firstStatement);

        System.out.println("second Statement:");
        System.out.println(secondStatement);
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecordDb());


        Statement thirdStatement = firstStatement.clone();

        System.out.println("Third Statement:");
        System.out.println(thirdStatement);
        System.out.println(thirdStatement.getSql());
        System.out.println(thirdStatement.getParameters());
        System.out.println(thirdStatement.getRecordDb());
    }
}
