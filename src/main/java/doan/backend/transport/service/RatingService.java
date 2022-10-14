package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappRating;
import doan.backend.transport.repository.TicketappRatingRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RatingService implements dao<TicketappRating> {
    @Autowired
    TicketappRatingRepository ticketappRatingRepository;

    public List<TicketappRating> findRatingOfRoute(int id)
    {
        return ticketappRatingRepository.findRatingOfRoute(id);
    }

    @Override
    public List<TicketappRating> getList() {
        return ticketappRatingRepository.findAll();
    }

    @Override
    public Optional<TicketappRating> findById(int id) {
        return ticketappRatingRepository.findById(id);
    }

    @Override
    public void insert(TicketappRating vo) {
        vo.setCreatedDate(new Date());
        ticketappRatingRepository.save(vo);
    }

    @Override
    public void update(TicketappRating vo) {
        vo.setCreatedDate(new Date());
        ticketappRatingRepository.save(vo);
    }

    @Override
    public void delete(int id) {
        ticketappRatingRepository.deleteById(id);
    }
}
