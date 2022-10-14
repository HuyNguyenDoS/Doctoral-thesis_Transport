package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappSeat;
import doan.backend.transport.repository.TicketappSeatRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatService implements dao<TicketappSeat> {
    @Autowired
    TicketappSeatRepository seatRepository;

    public List<TicketappSeat> findSeatOfTypebus(int id)
    {
        return seatRepository.findSeatOfTypebus(id);
    }

    @Override
    public List<TicketappSeat> getList() {
        return seatRepository.findAll();
    }

    @Override
    public Optional<TicketappSeat> findById(int id) {
        return seatRepository.findById(id);
    }

    @Override
    public void insert(TicketappSeat seat) {
        seatRepository.save(seat);
    }

    @Override
    public void update(TicketappSeat seat) {
        seatRepository.save(seat);
    }

    @Override
    public void delete(int id) {
        seatRepository.deleteById(id);
    }
}
