package com.korea.movie_reservation.service;

import com.korea.movie_reservation.mapper.MovieMapper;
import com.korea.movie_reservation.vo.MovieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieMapper movieMapper;

    public int insertMovie(MovieVO movieVO) {
        return movieMapper.insertMovie(movieVO);
    }

    public MovieVO findMovieById(int movieId) {
        return movieMapper.findMovieById(movieId);
    }
}
