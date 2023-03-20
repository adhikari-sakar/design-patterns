package com.example.design.patterns.structural.bridge.movie;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setGenre("Comedy");
        movie.setReleasedDate("2021");
        movie.setRuntime("2:00");
        movie.setTitle("Friends");

        Printer csvPrinter = new MoviePrinter(movie);
        System.out.println(csvPrinter.print(new CsvFormatter()));

        Printer htmlPrinter = new MoviePrinter(movie);
        System.out.println(htmlPrinter.print(new HtmlFormatter()));
    }
}
