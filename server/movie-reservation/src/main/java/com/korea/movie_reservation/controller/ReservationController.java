package com.korea.movie_reservation.controller;

import com.korea.movie_reservation.service.ReservationService;
import com.korea.movie_reservation.vo.ReservationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public String insertReservation(@RequestBody ReservationVO reservationVO) {
        int result = reservationService.insertReservation(reservationVO);
        return (result == 1) ? "예매 등록 성공" : "예매 등록 실패";
    }

    @PutMapping("/{reservationId}")
    public String updateReservation(@PathVariable int reservationId, @RequestBody ReservationVO reservationVO) {
        reservationVO.setReservationId(reservationId);
        int result = reservationService.updateReservation(reservationVO);
        return (result == 1) ? "예매 수정 성공" : "예매 수정 실패";
    }

    @GetMapping("/details")
    public List<ReservationVO> findReservationDetails() {
        return reservationService.findReservationDetails();
    }
}
