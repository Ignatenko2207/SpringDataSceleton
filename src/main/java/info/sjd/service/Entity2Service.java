package info.sjd.service;

import info.sjd.model.SpringEntity2;

public interface Entity2Service {

	public void save(SpringEntity2 entity2);
	public void edit(SpringEntity2 entity2);
	public void findOne(Integer id);
	public void delete(Integer id);
}
