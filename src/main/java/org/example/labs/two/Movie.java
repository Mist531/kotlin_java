package org.example.labs.two;

public class Movie {
    private String title;
    private String director;
    private int year;
    private String genre;
    private double duration;

    //region Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    //endregion

    //region Constructors
    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public Movie(String title, int year, double duration) {
        this.title = title;
        this.year = year;
        this.duration = duration;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Movie(int year, double duration) {
        this.year = year;
        this.duration = duration;
    }

    public Movie(String title, String director, int year, double duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
    }

    public Movie(String title, String director, int year, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
    }

    public Movie(String title, String director, int year, String genre, double duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }
    //endregion

    public void printInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Year: " + this.year);
        System.out.println("Genre: " + this.genre);
        System.out.println("Duration: " + this.duration);
    }
}

