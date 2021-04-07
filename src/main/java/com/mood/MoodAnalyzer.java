package com.mood;

import com.mood.com.mood.MoodAnalyzerException;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        try {
            this.message = message;
            if (message == null || message.isEmpty()) {
                throw new MoodAnalyzerException();
            }

        } catch (MoodAnalyzerException e) {
            return "happy";
        }
        return analyseMood();
    }

    public String analyseMood() {
        try {
            if (message.contains("SAD") || message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "happy";
        }
    }
}
