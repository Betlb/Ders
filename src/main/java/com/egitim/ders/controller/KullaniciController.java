package com.egitim.ders.controller;

import com.egitim.ders.model.Kullanici;
import com.egitim.ders.service.KullaniciService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/id")
    public Kullanici getKullaniciById(@RequestParam Long id) {
        return kullaniciService.getKullaniciById(id);
    }

    @PostMapping("/add")
    public Kullanici addKullanici(@RequestBody Kullanici kullanici){
        return kullaniciService.addKullanici(kullanici);
    }
    @PutMapping("/edit")
    public Kullanici editKullanici(@RequestParam Long id,@RequestBody Kullanici kullanici){
        return kullaniciService.editKullanici(id,kullanici);
    }
}

