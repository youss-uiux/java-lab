package com.javalab.core.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utilitaire de logging simple pour le projet Java Lab
 */
public class Logger {
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public static void info(String message) {
        log("INFO", message);
    }
    
    public static void debug(String message) {
        log("DEBUG", message);
    }
    
    public static void error(String message) {
        log("ERROR", message);
    }
    
    private static void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        System.out.println(String.format("[%s] [%s] %s", timestamp, level, message));
    }
}
