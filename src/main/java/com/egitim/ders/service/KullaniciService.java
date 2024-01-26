package com.egitim.ders.service;

import com.egitim.ders.model.Kullanici;
import com.egitim.ders.repository.KullaniciRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciService {
    final KullaniciRepository kullaniciRepository;

    public KullaniciService(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }



    public List<Kullanici> getAllKullanici() {
        return kullaniciRepository.findAll();
    }
}
