package com.egitim.ders.controller;

import com.egitim.ders.model.Kullanici;
import com.egitim.ders.service.KullaniciService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciController {

    final KullaniciService kullaniciService;

    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @GetMapping("/")
    public List<Kullanici> getAllKullanici() {
        return kullaniciService.getAllKullanici();
    }


}
