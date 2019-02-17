package info.sjd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import info.sjd.model.SpringEntity1;

@Repository
public interface SpringEntity1DAO extends JpaRepository<SpringEntity1, Integer>{

	@Query(value = "SELECT * FROM entity_1 WHERE boolean_col = 1?", nativeQuery = true)
	List<SpringEntity1> findAllByBooleanProperty(Boolean flag);
}
