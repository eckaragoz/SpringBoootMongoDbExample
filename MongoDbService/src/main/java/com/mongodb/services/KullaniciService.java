package com.mongodb.services;

import com.mongodb.enyity.Kullanici;

import java.util.List;

public interface KullaniciService {
    Kullanici addKullanici(Kullanici kullanici);
    List<Kullanici> allKullanici();
}
