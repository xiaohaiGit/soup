package com.upchina.soup;

import com.google.errorprone.annotations.Var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

public class Utils {


    public static String getSoup() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Map> entity = restTemplate.getForEntity("https://api.nextrt.com/V1/Dutang", Map.class);
            HttpStatus statusCode = entity.getStatusCode();
            if (statusCode.is2xxSuccessful()) {
                Map body = entity.getBody();
                List list = (List) body.get("data");
                Map map = (Map)list.get(0);
                String content = (String) map.get("content");
                return content;
            }
        } catch (Exception ex) {
            return ex.toString();
        }
        return "null";
    }

}
