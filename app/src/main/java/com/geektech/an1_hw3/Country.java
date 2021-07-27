package com.geektech.an1_hw3;

 public class Country {

    private int ImageView;
    private String country;
    private String capital;

    public Country(int imageView, String country, String capital) {
        ImageView = imageView;
        this.country = country;
        this.capital = capital;
    }


    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}