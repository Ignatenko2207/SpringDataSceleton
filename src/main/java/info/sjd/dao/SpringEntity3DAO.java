package info.sjd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.sjd.model.SpringEntity3;

@Repository
public interface SpringEntity3DAO extends JpaRepository<SpringEntity3, Integer>{

}
