package com.korea.movie_reservation.mapper;

import com.korea.movie_reservation.vo.ReservationVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ReservationMapper {
    int insertReservation(ReservationVO reservationVO);
    int updateReservation(ReservationVO reservationVO);
    List<ReservationVO> findReservationDetails();
}
