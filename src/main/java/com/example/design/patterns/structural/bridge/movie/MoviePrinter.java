package com.example.design.patterns.structural.bridge.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getGenre();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> movieDetails = new ArrayList<>();
        movieDetails.add(new Detail("Title", movie.getTitle()));
        movieDetails.add(new Detail("Year", movie.getReleasedDate()));
        movieDetails.add(new Detail("Runtime", movie.getRuntime()));
        return movieDetails;
    }
}
