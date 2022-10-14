package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappBookingdetail;
import doan.backend.transport.repository.TicketappBookingdetailRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingDetailService implements dao<TicketappBookingdetail> {
    @Autowired
    TicketappBookingdetailRepository ticketappBookingdetailRepository;

    public List<TicketappBookingdetail> findBookingdetailOfTimetable(int id)
    {
        return ticketappBookingdetailRepository.findBookingdetailOfTimetable(id);
    }

    public List<TicketappBookingdetail> findBookingdetailOfBooking(int id)
    {
        return ticketappBookingdetailRepository.findBookingdetailOfBooking(id);
    }

    @Override
    public List<TicketappBookingdetail> getList() {
        return ticketappBookingdetailRepository.findAll();
    }

    @Override
    public Optional<TicketappBookingdetail> findById(int id) {
        return ticketappBookingdetailRepository.findById(id);
    }

    @Override
    public void insert(TicketappBookingdetail vo) {
        vo.setCreatedDate(new Date());
        ticketappBookingdetailRepository.save(vo);
    }

    @Override
    public void update(TicketappBookingdetail vo) {
        vo.setCreatedDate(new Date());
        ticketappBookingdetailRepository.save(vo);
    }

    @Override
    public void delete(int id) {
        ticketappBookingdetailRepository.deleteById(id);
    }
}
