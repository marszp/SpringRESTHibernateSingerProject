package com.msz.service;

import com.msz.dao.SingersDAO;
import com.msz.entity.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService{

    @Autowired
    SingersDAO singersDAO;

    @Override
    @Transactional
    public List<Singer> getSingers() {
        return singersDAO.getSingers();
    }

    @Override
    @Transactional
    public void saveSinger(Singer theSinger) {
        singersDAO.saveSinger(theSinger);
    }

    @Override
    @Transactional
    public Singer getSinger(int theId) {
        return singersDAO.getSinger(theId);
    }

    @Override
    @Transactional
    public void deleteSinger(int theId) {
        singersDAO.deleteSinger(theId);
    }
}
