/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.Blog;
import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.BlogDAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.BlogMapper;

/**
 *
 * @author hcadavid
 */
public class MyBatisBlogDAO implements BlogDAO {

	@Inject
	BlogMapper blogMapper;

	@Override
	public List<Blog> loadAll() throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void save(Blog b) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void update(Blog b) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void addComment(int blogId, Comment comment) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Blog load(int blogID) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	


	@Override
	public Blog load(String title) throws PersistenceException {
		try {
			return blogMapper.loadBlogTitle(title);
		}catch (Exception e) {
			throw new PersistenceException("No se encontro el blog con el titulo "+title);
		}
	}

	@Override 
	public List<Comment> loadComment(String title) throws PersistenceException{
		try{
			return blogMapper.loadCommet(title);
		}catch (Exception e) {
			throw new PersistenceException("No se encontraron comentario del blog" + title);
		}
	}
	
	@Override 
	public Blog loadBlogComentariosOfensivos() throws PersistenceException{
		try{
			return blogMapper.loadBlogComentariosOfensivos();
		}catch (Exception e) {
			throw new PersistenceException("ERROR AL ENCONTRAR COMENTARIOS OFENSIVOS DE LOS BLOGS");
		}
		
		
	}
	
	
	
	@Override
	public List<Blog> loadByUser(String login) throws PersistenceException {
		return blogMapper.findByUser(login);
	}
	
	
}
