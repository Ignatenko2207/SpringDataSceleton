package info.sjd.service;

import java.util.List;

import info.sjd.model.SpringEntity1;

public interface Entity1Service {

	public SpringEntity1 save(SpringEntity1 entity1);
	public SpringEntity1 edit(SpringEntity1 entity1);
	public SpringEntity1 findOne(Integer id);
	public void delete(Integer id);
	public List<SpringEntity1> findAllByBooleanProperty(Boolean flag);
}
