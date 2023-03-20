package com.example.design.fp.example.filereader;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

@FunctionalInterface
public interface FileProcessor<T extends Reader & Closeable, R> {
    R process(T reader) throws IOException;
}
