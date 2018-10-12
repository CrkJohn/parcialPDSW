package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.Blog;
import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.CommentsDAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.BlogMapper;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.ComentMapper;

public class MyBatisCommentsDAO implements CommentsDAO{
	
	@Inject
	ComentMapper comentMapper;

	@Override
	public List<Comment> loadComment(String title) throws PersistenceException{
                System.err.println(title);
		return comentMapper.loadComment(title);
	}

}
