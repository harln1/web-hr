package com.korea.movie_reservation.controller;

import com.korea.movie_reservation.service.MovieService;
import com.korea.movie_reservation.vo.MovieVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public String insertMovie(@RequestBody MovieVO movieVO) {
        int result = movieService.insertMovie(movieVO);
        return (result == 1) ? "영화 등록 성공" : "영화 등록 실패";
    }

    @GetMapping("/{movieId}")
    public MovieVO findMovieById(@PathVariable int movieId) {
        return movieService.findMovieById(movieId);
    }
}
