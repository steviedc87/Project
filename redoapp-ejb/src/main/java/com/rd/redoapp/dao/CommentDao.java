package com.rd.redoapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.rd.redoapp.BlogEntry;
import com.rd.redoapp.Comment;
import com.rd.redoapp.dao.common.Dao;

@Local
public interface CommentDao extends Dao<Comment> {

	List<Comment> findComments(BlogEntry blogEntry);

}
