package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappBooking;
import doan.backend.transport.repository.TicketappBookingRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements dao<TicketappBooking> {
    @Autowired
    TicketappBookingRepository ticketappBookingRepository;

    public List<TicketappBooking> findBookingOfTimetable(int id)
    {
        return ticketappBookingRepository.findBookingOfTimetable(id);
    }

    @Override
    public List<TicketappBooking> getList() {
        return ticketappBookingRepository.findAll();
    }

    @Override
    public Optional<TicketappBooking> findById(int id) {
        return ticketappBookingRepository.findById(id);
    }

    @Override
    public void insert(TicketappBooking booking) {
        booking.setCreatedDate(new Date());
        ticketappBookingRepository.save(booking);
    }

    @Override
    public void update(TicketappBooking booking) {
        booking.setCreatedDate(new Date());
        ticketappBookingRepository.save(booking);
    }

    @Override
    public void delete(int id) {
        ticketappBookingRepository.deleteById(id);
    }
}
