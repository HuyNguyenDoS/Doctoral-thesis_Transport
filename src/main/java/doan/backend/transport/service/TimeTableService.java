package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappGarage;
import doan.backend.transport.entity.TicketappTimetable;
import doan.backend.transport.repository.TicketappTimetableRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TimeTableService implements dao<TicketappTimetable> {
    @Autowired
    TicketappTimetableRepository ticketappTimetableRepository;

    public List<TicketappGarage> findTimetable(int id)
    {
        return ticketappTimetableRepository.findTimetable(id);
    }

    @Override
    public List<TicketappTimetable> getList() {
        return ticketappTimetableRepository.findAll();
    }

    @Override
    public Optional<TicketappTimetable> findById(int id) {
        return ticketappTimetableRepository.findById(id);
    }

    @Override
    public void insert(TicketappTimetable vo) {
        vo.setCreatedDate(new Date());
        ticketappTimetableRepository.save(vo);
    }

    @Override
    public void update(TicketappTimetable vo) {
        vo.setCreatedDate(new Date());
        ticketappTimetableRepository.save(vo);
    }

    @Override
    public void delete(int id) {
        ticketappTimetableRepository.deleteById(id);
    }
}
