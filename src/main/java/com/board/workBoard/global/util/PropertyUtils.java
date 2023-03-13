package com.board.workBoard.global.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

@Component
@RequiredArgsConstructor
public class PropertyUtils {

    private static final String PROFILE = System.getProperty("spring.profiles.active");

    /**
     * <p> Properties Key값을 가져옵니다. </p>
     *
     * @return String
     * @auth jongseop
     */
    public static String getProperty(String key) {
        String result = "";
        String resource = "application-" + PROFILE + ".properties";
        Properties properties = new Properties();

        try {
            InputStream reader = PropertyUtils.class.getResourceAsStream(resource);
            properties.load(reader);

            result = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public static String getYaml(String key) {
        String result = "";
        String resource = "application-" + PROFILE + ".yml";

        InputStream reader = PropertyUtils.class.getResourceAsStream(resource);
        Map<String, Object> keyMaps = new Yaml().load(reader);

        if (key.contains(".")) {
            String[] arrKey = key.split("\\.");
            for (String k : arrKey) {
                if (keyMaps.containsKey(k)) {
                    if (keyMaps.get(k).getClass().getSimpleName().equals("LinkedHashMap")) {
                        keyMaps = (Map<String, Object>) keyMaps.get(k);
                    } else {
                        result = keyMaps.get(k).toString();
                    }
                }
            }
        } else {
            result = keyMaps.get(key).toString();
        }
        return result;
    }
}
