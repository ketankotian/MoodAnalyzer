package com.mood;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("SAD") || message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
