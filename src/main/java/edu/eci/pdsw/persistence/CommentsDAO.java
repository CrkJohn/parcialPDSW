package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentsDAO {
	List<Comment> loadComment(String title) throws PersistenceException;
}
