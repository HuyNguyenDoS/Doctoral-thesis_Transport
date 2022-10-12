package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappBus;
import doan.backend.transport.repository.TicketappBusRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BusService implements dao<TicketappBus> {
    @Autowired
    TicketappBusRepository busRepository;

    @Override
    public List<TicketappBus> getList() {
        return busRepository.findAll();
    }

    @Override
    public Optional<TicketappBus> findById(int id) {
        return busRepository.findById(id);
    }

    @Override
    public void insert(TicketappBus bus) {
        bus.setCreatedDate(new Date());
        busRepository.save(bus);
    }

    @Override
    public void update(TicketappBus bus) {
        bus.setCreatedDate(new Date());
        busRepository.save(bus);
    }

    @Override
    public void delete(int id) {
        busRepository.deleteById(id);
    }
}
