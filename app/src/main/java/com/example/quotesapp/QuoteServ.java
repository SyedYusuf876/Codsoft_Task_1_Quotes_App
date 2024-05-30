package com.example.quotesapp;

import java.util.concurrent.ThreadLocalRandom;

public class QuoteServ {
    String[] getQuotes(){
        String[] quotes = new String[] {"Hello there, \"\"Nice to meet you! \"\"I'm a mobile app developer",};
        return quotes;
    }
    String getRandomQuotes(){
        String quote;
        int quotesArrayLen = getQuotes().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote = getQuotes()
        [randomNum];
        return quote;
    }
}
