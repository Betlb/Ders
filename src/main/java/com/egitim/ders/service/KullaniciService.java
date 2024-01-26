package com.egitim.ders.service;

import com.egitim.ders.model.Kullanici;
import com.egitim.ders.repository.KullaniciRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    public Kullanici getKullaniciById(Long id) {
        return kullaniciRepository.findById(id).orElse(null);
    }


    public Kullanici addKullanici(Kullanici kullanici){
        return kullaniciRepository.save(kullanici);
    }


    public Kullanici editKullanici(Long id, Kullanici kullanici) {
        Kullanici kullanicidb = kullaniciRepository.findById(id).orElseThrow(() -> new IllegalStateException("Böyle bir kullanıcı yok!!"));
        kullanicidb.setUsername(kullanici.getUsername());
        kullanicidb.setFirstname(kullanici.getFirstname());
        kullanicidb.setSurname(kullanici.getSurname());
        return kullaniciRepository.save(kullanicidb);
    }

    public void removeKullanici(Long id) {
        kullaniciRepository.deleteById(id);
    }
}