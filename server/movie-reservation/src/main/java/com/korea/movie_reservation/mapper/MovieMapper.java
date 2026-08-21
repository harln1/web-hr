package com.korea.movie_reservation.mapper;


import com.korea.movie_reservation.vo.MovieVO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MovieMapper {
    int insertMovie(MovieVO movieVO);
    MovieVO findMovieById(int movieId);
}
