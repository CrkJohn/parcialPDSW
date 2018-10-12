package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import edu.eci.pdsw.entities.Comment;
public interface ComentMapper{
	List<Comment> loadComment(@Param("tituloBlog") String title);
}
