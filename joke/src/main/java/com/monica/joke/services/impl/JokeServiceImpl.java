package com.monica.joke.services.impl;

import org.springframework.stereotype.Service;

import com.monica.joke.services.JokeService;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    public final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(final ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getQuote() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
