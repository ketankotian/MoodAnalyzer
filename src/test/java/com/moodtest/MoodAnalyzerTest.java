package com.moodtest;

import com.mood.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSAD_ShouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in SAD mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenConstructorMessage_WhenSAD_ShouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in sad mood ");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("Hello world");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenConstructorMessage_WhenNotSad_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello world");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in HAPPY mood");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenConstructorMessage_WhenHappy_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am happy");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMessage_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood(null);
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void givenNullConstructorMessage_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void givenEmptyConstuctorMessage_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
