package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Comment;

public interface CommentsDAO {
	List<Comment> loadComment(String title) throws PersistenceException;
}
