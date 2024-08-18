package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import objects.About;
import objects.AboutLang;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    public static AboutLang readAbout(String lang) throws IOException {
        File jsonFile = new File("src/test/resources/localization/about/about.json");
        AboutLang aboutLang = null;
        if (lang.equals("ar")) {
            ObjectMapper objectMapper = new ObjectMapper();
            aboutLang = objectMapper.readValue(jsonFile, About.class).getAr();
        } else if (lang.equals("en")) {
            ObjectMapper objectMapper = new ObjectMapper();
            aboutLang = objectMapper.readValue(jsonFile, About.class).getEn();
        } else {
            throw new IllegalArgumentException("Error: Value must be positive.");
        }
        return aboutLang;
    }
}
