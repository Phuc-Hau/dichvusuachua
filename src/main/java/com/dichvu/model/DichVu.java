package com.dichvu.model;

import javax.persistence.*;

@Entity
@Table(name = "dichvu")
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tiled;
    private String img;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTiled() {
        return tiled;
    }

    public void setTiled(String tiled) {
        this.tiled = tiled;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
