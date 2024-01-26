package com.egitim.ders.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="kullanici",schema = "public")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kullanici_id_seq")
    @SequenceGenerator(name = "kullanici_id_seq", sequenceName = "kullanici_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "create_user_id")
    private Long createUserId;

    @Column(name = "create_datetime")
    private Timestamp createDatetime;

    @Column(name = "update_user_id")
    private Long updateUserId;

    @Column(name = "update_datetime")
    private Timestamp updateDatetime;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "firstname", length = 200)
    private String firstname;

    @Column(name = "surname", length = 200)
    private String surname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Timestamp getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Timestamp getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
