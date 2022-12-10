package com.msz.rest;

import com.msz.dao.SingersDAO;
import com.msz.entity.Singer;
import com.msz.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")

public class SingersRestController {

    List<Singer> tempList = new ArrayList<>();

    @Autowired
    private SingerService singerService;

    //Test
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World from REST app made by my own hands from scratch...";
    }

    //Get List of Singers
    @GetMapping("/singers")
    public List<Singer> getSingers(){
        return singerService.getSingers();
    //return singerService.getSingers().stream().filter(str -> str.getFirstName().startsWith("K")).collect(Collectors.toList());
    }

    //Get one Singer
    @GetMapping("/singers/{singerId}")
    public Singer getSingers(@PathVariable int singerId){

        Singer tempSinger = singerService.getSinger(singerId);
        if (tempSinger == null){
            throw new SingersNotFoundException("Singer id not found - "+singerId);
        }
        return tempSinger;
    }
    //Add a Singer
    @PostMapping("/singers")
    public void addSinger(@RequestBody Singer theSinger){
        //Check that Singer isn't null
        if(theSinger == null){
            throw new SingersNotFoundException("Singer id not foun - "+theSinger.getId());
        }
        //Add singer
        singerService.saveSinger(theSinger);
    }

    //Update Singer by Id
    @PutMapping("/singers")
    public void updateSinger(@RequestBody Singer theSinger){
        //Check that Singer isn't null
        if(theSinger == null){
            throw new SingersNotFoundException("Singer id not foun - "+theSinger.getId());
        }
        //Update singer
        singerService.saveSinger(theSinger);
    }


}
