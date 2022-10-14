package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappTypebus;
import doan.backend.transport.repository.TicketappTypebusRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TypebusService implements dao<TicketappTypebus> {
    @Autowired
    TicketappTypebusRepository ticketappTypebusRepository;

    @Override
    public List<TicketappTypebus> getList() {
        return ticketappTypebusRepository.findAll();
    }

    @Override
    public Optional<TicketappTypebus> findById(int id) {
        return ticketappTypebusRepository.findById(id);
    }

    @Override
    public void insert(TicketappTypebus vo) {
        vo.setCreatedDate(new Date());
        ticketappTypebusRepository.save(vo);
    }

    @Override
    public void update(TicketappTypebus vo) {
        vo.setCreatedDate(new Date());
        ticketappTypebusRepository.save(vo);
    }

    @Override
    public void delete(int id) {
        ticketappTypebusRepository.deleteById(id);
    }
}
