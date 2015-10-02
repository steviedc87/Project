package com.rd.redoapp.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.rd.redoapp.BlogEntry;
import com.rd.redoapp.Comment;
import com.rd.redoapp.Comment_;
import com.rd.redoapp.dao.common.AbstractDaoBean;

@Stateless
public class CommentDaoBean extends AbstractDaoBean<Comment> implements
		CommentDao {

	@Inject
	private Logger log;

	@Override
	public List<Comment> findComments(final BlogEntry blogEntry) {
		log.info("find comment for blog entry " + blogEntry);

		CriteriaBuilder builder = getCriteriaBuilder();
		CriteriaQuery<Comment> query = builder.createQuery(Comment.class);

		Root<Comment> from = query.from(Comment.class);
		query.select(from)
				.where(builder.equal(from.get(Comment_.blogEntry), blogEntry))
				.orderBy(builder.asc(from.get(Comment_.created)));
		return getResultList(query);
	}
}
