package info.sjd.service;

import info.sjd.model.SpringEntity3;

public interface Entity3Service {

	public void save(SpringEntity3 entity3);
	public void edit(SpringEntity3 entity3);
	public void findOne(Integer id);
	public void delete(Integer id);
}
