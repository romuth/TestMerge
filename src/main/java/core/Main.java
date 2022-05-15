package core;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        Object[][] obj = new Object[][]{
                {new JSONObject("{\"executionTimeout\":\"3\"}"), true},
                {new JSONObject("{\"executionTimeoutMinutes\":\"3\"}"), false},
                {new JSONObject(), false},
                {new JSONObject("{\"executionTimeoutMinutes\":\"1\"}"), true},
                {new JSONObject("{\"executionTimeoutHours\":\"1\"}"), true},
                {new JSONObject("{\"executionTimeoutHours\":\"1\"}"), false},
                {new JSONObject(), false},
                {
                        new JSONObject(
                                "{\"executionTimeoutHours\":\"1\",\"executionTimeoutMinutes\":\"5\"}"),
                        true
                },
                {
                        new JSONObject(
                                "{\"executionTimeoutHours\":\"1\",\"executionTimeoutMinutes\":\"5\"}"),
                        false
                },
                {
                        new JSONObject(
                                "{\"executionTimeoutHours\":\"1\",\"executionTimeoutMinutes\":\"1\"}"),
                        true
                },
                {new JSONObject("{\"executionTimeout\":\"61\"}"), false}



        };
        for (Object[] objects : obj) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }

        new JSONObject().put("sda");
    }
}
