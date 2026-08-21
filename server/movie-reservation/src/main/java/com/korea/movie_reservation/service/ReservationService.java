package com.korea.movie_reservation.service;


import com.korea.movie_reservation.mapper.ReservationMapper;
import com.korea.movie_reservation.vo.ReservationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    public int insertReservation(ReservationVO reservationVO) {
        return reservationMapper.insertReservation(reservationVO);
    }

    public int updateReservation(ReservationVO reservationVO) {
        return reservationMapper.updateReservation(reservationVO);
    }

    public List<ReservationVO> findReservationDetails() {
        return reservationMapper.findReservationDetails();
    }
}
