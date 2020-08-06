package es.springframework.chucknorrisjokesforactuator.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImplementation implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImplementation(){
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
