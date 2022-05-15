package core;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject subscription = new JSONObject("        {\n" +
                                                 "            \"authenticationType\": \"Basic\",\n" +
                                                 "                \"authenticationParameters\": {\n" +
                                                 "            \"userName\" : \"${p:system/cm_username}\",\n" +
                                                 "                    \"password\" : \"${p:system/cm_password}\"\n" +
                                                 "        },\n" +
                                                 "            \"url\": \"http://requestb.in/173majy1\",\n" +
                                                 "                \"externalData\": {\n" +
                                                 "            \"name1\": \"value1\"\n" +
                                                 "        },\n" +
                                                 "            \"subscriberId\":\"dimensions-cm\",\n" +
                                                 "                \"httpMethod\":\"put\"\n" +
                                                 "        }");



        JSONArray array = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("subscriptionentityType", "application");
        array.put(UUID.randomUUID());
        array.put(UUID.randomUUID());
        array.put(UUID.randomUUID());
        obj.put("objects", array);

        JSONArray array1 = new JSONArray();
        array1.put(UUID.randomUUID());
        array1.put(UUID.randomUUID());
        array1.put(UUID.randomUUID());
        JSONObject obj1 = new JSONObject();
        obj1.put("subscriptiontype", "component");
        obj1.put("objects", array1);
        JSONArray oneArray = new JSONArray();
        oneArray.put(obj);
        oneArray.put(obj1);

        subscription.put("subscriptionObjects", oneArray);

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.remove(4);
        System.out.println(set);


        "hello Message";
    }
}
