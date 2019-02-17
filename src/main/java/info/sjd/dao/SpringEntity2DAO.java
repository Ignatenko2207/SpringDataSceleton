package info.sjd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.sjd.model.SpringEntity2;

@Repository
public interface SpringEntity2DAO extends JpaRepository<SpringEntity2, Integer>{

}
