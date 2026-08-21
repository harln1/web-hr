package com.korea.movie_reservation.vo;

import java.time.LocalDateTime;

public class MovieVO {
    private Integer movieId;
    private String movieTitle;
    private String movieGenre;
    private Integer runningTime;
    private Integer ticketPrice;
    private LocalDateTime releaseDate;

    public Integer getMovieId() { return movieId; }
    public void setMovieId(Integer movieId) { this.movieId = movieId; }
    public String getMovieTitle() { return movieTitle; }
    public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }
    public String getMovieGenre() { return movieGenre; }
    public void setMovieGenre(String movieGenre) { this.movieGenre = movieGenre; }
    public Integer getRunningTime() { return runningTime; }
    public void setRunningTime(Integer runningTime) { this.runningTime = runningTime; }
    public Integer getTicketPrice() { return ticketPrice; }
    public void setTicketPrice(Integer ticketPrice) { this.ticketPrice = ticketPrice; }
    public LocalDateTime getReleaseDate() { return releaseDate; }
    public void setReleaseDate(LocalDateTime releaseDate) { this.releaseDate = releaseDate; }
}
