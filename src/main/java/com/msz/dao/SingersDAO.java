package com.msz.dao;

import com.msz.entity.Singer;

import java.util.List;

public interface SingersDAO {

    public List<Singer> getSingers();

    public Singer getSinger(int theId);

    public void saveSinger(Singer theSinger);

    public void deleteSinger(int theId);
}
