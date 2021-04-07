package com.mood;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() {
        if (message.contains("SAD") || message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
