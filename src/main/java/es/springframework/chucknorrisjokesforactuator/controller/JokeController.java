package es.springframework.chucknorrisjokesforactuator.controller;

import es.springframework.chucknorrisjokesforactuator.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping({"/test", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chuckNorris";
    }
}
