package com.hacidoganilbars.entity;

public class Yonetmenler {

        private int id;
        private String isim;

        public Yonetmenler() {
        }

        public Yonetmenler(int id, String isim) {
            this.id = id;
            this.isim = isim;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }
    }


