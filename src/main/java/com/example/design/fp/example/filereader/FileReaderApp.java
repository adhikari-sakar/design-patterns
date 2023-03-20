package com.example.design.fp.example.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileReaderApp {

    public static String process(String file, FileProcessor<BufferedReader, String> processor) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(file)))) {
            return processor.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String readSingleLine = process("Test.txt", BufferedReader::readLine);
        String readDoubleLine = process("Test.txt", br -> br.readLine() + br.readLine());

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Integer> squareInts = integers.stream().map(i -> i * i).collect(Collectors.toList());
//        IntStream.of(1, 2, 3, 4, 5).map( i -> i * i);
    }
}
