package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappComment;
import doan.backend.transport.repository.TicketappCommentRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements dao<TicketappComment> {
    @Autowired
    TicketappCommentRepository ticketappCommentRepository;

    @Override
    public List<TicketappComment> getList() {
        return ticketappCommentRepository.findAll();
    }

    @Override
    public Optional<TicketappComment> findById(int id) {
        return ticketappCommentRepository.findById(id);
    }

    @Override
    public void insert(TicketappComment comment) {
        comment.setCreatedDate(new Date());
        ticketappCommentRepository.save(comment);
    }

    @Override
    public void update(TicketappComment comment) {
        comment.setCreatedDate(new Date());
        ticketappCommentRepository.save(comment);
    }

    @Override
    public void delete(int id) {
        ticketappCommentRepository.deleteById(id);
    }
}
