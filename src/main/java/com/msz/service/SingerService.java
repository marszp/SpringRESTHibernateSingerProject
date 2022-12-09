package com.msz.service;
import com.msz.entity.Singer;

import java.util.List;

public interface SingerService {

    public List<Singer> getSingers();

    public void saveSinger(Singer theSinger);

    public Singer getSinger(int theId);

    public void deleteSinger(int theId);

}
