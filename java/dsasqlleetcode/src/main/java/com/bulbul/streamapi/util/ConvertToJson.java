package com.bulbul.streamapi.util;

import java.util.Map;

public  class ConvertToJson {

    public static String mapToJson(Map<?, ?> map) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        boolean firstEntry = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!firstEntry) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\"").append(entry.getKey().toString()).append("\":").append(entry.getValue().toString());
            firstEntry = false;
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
