package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappBookinghistory;
import doan.backend.transport.repository.TicketappBookinghistoryRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookinghistoryService implements dao<TicketappBookinghistory> {
    @Autowired
    TicketappBookinghistoryRepository ticketappBookinghistoryRepository;

    @Override
    public List<TicketappBookinghistory> getList() {
        return ticketappBookinghistoryRepository.findAll();
    }

    @Override
    public Optional<TicketappBookinghistory> findById(int id) {
        return ticketappBookinghistoryRepository.findById(id);
    }

    @Override
    public void insert(TicketappBookinghistory vo) {
        vo.setCreatedDate(new Date());
        ticketappBookinghistoryRepository.save(vo);
    }

    @Override
    public void update(TicketappBookinghistory vo) {
        vo.setCreatedDate(new Date());
        ticketappBookinghistoryRepository.save(vo);
    }

    @Override
    public void delete(int id) {
        ticketappBookinghistoryRepository.deleteById(id);
    }
}
