package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappGarage;
import doan.backend.transport.repository.TicketappGarageRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class GarageService implements dao<TicketappGarage> {
    @Autowired
    TicketappGarageRepository ticketappGarageRepository;

    @Override
    public List<TicketappGarage> getList() {
        return ticketappGarageRepository.findAll();
    }

    @Override
    public Optional<TicketappGarage> findById(int id) {
        return ticketappGarageRepository.findById(id);
    }

    @Override
    public void insert(TicketappGarage vo) {
        vo.setCreatedDate(new Date());
        ticketappGarageRepository.save(vo);
    }

    @Override
    public void update(TicketappGarage vo) {
        vo.setCreatedDate(new Date());
        ticketappGarageRepository.save(vo);
    }

    @Override
    public void delete(int id) {
        ticketappGarageRepository.deleteById(id);
    }
}
