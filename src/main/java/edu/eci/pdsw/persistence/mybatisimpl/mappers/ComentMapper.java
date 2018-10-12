package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

public interface ComentMapper{

	void loadComment(@Param("title") String title);

}
