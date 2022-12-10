package com.msz.dao;

import java.util.List;
import com.msz.entity.Singer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.msz.entity.Singer;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SingerDAOImplementation implements SingersDAO{

    //Use SPRING to AUTOWIRE loclaVariables
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Singer> getSingers() {
        // get the current session
        Session currentSession = sessionFactory.getCurrentSession();
        // create querry ... sort by last name
        Query<Singer> theQuerry =
                currentSession.createQuery("from Singer order by lastName",Singer.class);
        // save results from querry to the list
        List<Singer> singers = theQuerry.getResultList();
        // return list with results
        return singers;
    }

    @Override
    public Singer getSinger(int theId) {
        Singer tempSinger = sessionFactory.getCurrentSession().get(Singer.class,theId);
        return tempSinger;
    }

    @Override
    public void saveSinger(Singer theSinger) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theSinger);
    }

    @Override
    public void deleteSinger(int theId) {

    }
}
