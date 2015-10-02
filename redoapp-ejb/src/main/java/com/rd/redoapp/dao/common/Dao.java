package com.rd.redoapp.dao.common;

import java.util.List;

import com.rd.redoapp.common.AbstractEntity;

public interface Dao<E extends AbstractEntity> {

	void persist(E instance);

	E find(long id);

	void remove(E instance);

	E merge(E instance);

	List<E> findAll();

}
