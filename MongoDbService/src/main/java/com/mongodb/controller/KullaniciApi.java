package com.mongodb.controller;

import com.mongodb.enyity.Kullanici;
import com.mongodb.services.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {

    @Autowired
    KullaniciService kullaniciService;


    @PostMapping
    public ResponseEntity<Kullanici> kullaniciEkle(@RequestBody Kullanici kullanici)
    {
        return new ResponseEntity<>(kullaniciService.addKullanici(kullanici), HttpStatus.OK);
    }

    @PostConstruct
    public void init()
    {
        kullaniciService.addKullanici(new Kullanici("1","erdal","Karagöz"));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> kullaniciList()
    {
        return new ResponseEntity<>(kullaniciService.allKullanici(),HttpStatus.OK);
    }
}
