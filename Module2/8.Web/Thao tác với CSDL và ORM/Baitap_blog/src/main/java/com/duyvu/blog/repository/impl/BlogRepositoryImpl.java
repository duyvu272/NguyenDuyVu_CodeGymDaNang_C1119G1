package com.duyvu.blog.repository.impl;

import com.duyvu.blog.model.Blog;
import com.duyvu.blog.repository.BlogRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BlogRepositoryImpl implements BlogRepository {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Blog> finAllBlog() {
        TypedQuery<Blog> query = em.createQuery("select b from Blog b",Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(long id) {
        TypedQuery<Blog> query = em.createQuery("select b from Blog b where b.id = :id",Blog.class);
        query.setParameter("id",id);
        try{
            return query.getSingleResult();
        }catch (NoResultException  e){
            return null;
        }

    }

    @Override
    public void delete(long id) {
        Blog blog = findById(id);
            if(blog!=null){
                    em.remove(blog);
            }
    }

    @Override
    public void save( Blog blog) {
            if(blog.getId() != null){
                em.merge(blog);
            }else{
                em.persist(blog);
            }
    }
}
