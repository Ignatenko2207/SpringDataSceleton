package info.sjd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.sjd.dao.SpringEntity1DAO;
import info.sjd.model.SpringEntity1;
import info.sjd.service.Entity1Service;

@Service
public class Entity1ServiceImpl implements Entity1Service {

	@Autowired
	SpringEntity1DAO entity1DAO;

	public SpringEntity1 save(SpringEntity1 entity1) {
		SpringEntity1 entityFromDB = entity1DAO.findOne(entity1.getEntityId());
		if (entityFromDB == null) {
			return entity1DAO.saveAndFlush(entity1);
		}
		return null;
	}

	public SpringEntity1 edit(SpringEntity1 entity1) {
		SpringEntity1 entityFromDB = entity1DAO.findOne(entity1.getEntityId());
		if (entityFromDB != null) {
			return entity1DAO.saveAndFlush(entity1);
		}
		return null;
	}

	public SpringEntity1 findOne(Integer id) {
		return entity1DAO.findOne(id);
	}

	public void delete(Integer id) {
		entity1DAO.delete(id);
	}

	public List<SpringEntity1> findAllByBooleanProperty(Boolean flag) {
		return entity1DAO.findAllByBooleanProperty(flag);
	}

}
