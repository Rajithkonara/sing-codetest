package com.singtel.challenge.utils;

import java.util.HashMap;

public class LanguageUtil {

    public static String translate(String language) {

        HashMap<String, String> sounds = new HashMap<>();
        sounds.put("Danish", "kykyliky");
        sounds.put("Dutch", "kukeleku");
        sounds.put("Sinhala", "kukuku kuu");

        return sounds.get(language);
    }

}
