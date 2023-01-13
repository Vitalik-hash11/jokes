package com.app.jokes.services;

import org.springframework.stereotype.Component;

@Component
public interface JokeService {

  String getJoke();

}
