package com.rd.redoapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.rd.redoapp.BlogEntry;
import com.rd.redoapp.dao.common.Dao;

@Local
public interface BlogEntryDao extends Dao<BlogEntry> {

	List<BlogEntry> find(int maxresults, int firstresult);

	Long count();

}
