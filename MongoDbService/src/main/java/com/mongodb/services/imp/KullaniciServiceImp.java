package com.mongodb.services.imp;

import com.mongodb.enyity.Kullanici;
import com.mongodb.repository.KullaniciRepository;
import com.mongodb.services.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciServiceImp implements KullaniciService {

    @Autowired
    KullaniciRepository kullaniciRepository;

    @Override
    public Kullanici addKullanici(Kullanici kullanici)
    {
        return  kullaniciRepository.save(kullanici);
    }

    @Override
    public List<Kullanici> allKullanici()
    {
      return kullaniciRepository.findAll();
    }
}
