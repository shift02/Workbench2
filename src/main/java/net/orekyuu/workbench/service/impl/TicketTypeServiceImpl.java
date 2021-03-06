package net.orekyuu.workbench.service.impl;

import net.orekyuu.workbench.entity.TicketType;
import net.orekyuu.workbench.entity.dao.TicketTypeDao;
import net.orekyuu.workbench.service.TicketTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
public class TicketTypeServiceImpl implements TicketTypeService {

    @Autowired
    private TicketTypeDao typeDao;

    @Override
    public List<TicketType> findByProject(String projectId) {
        return typeDao.findByProject(projectId, Collectors.toList());
    }

    @Override
    public Optional<TicketType> findById(int id) {
        return typeDao.findById(id);
    }
}
