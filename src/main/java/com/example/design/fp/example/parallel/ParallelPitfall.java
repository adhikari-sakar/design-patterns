package com.example.design.fp.example.parallel;

import java.util.stream.LongStream;

import static com.example.design.fp.example.parallel.ParallelBenchmark.measureSumPerf;

public class ParallelPitfall {

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n)
                .forEach(accumulator::add);
        return accumulator.total;
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n)
                .parallel()
                .forEach(accumulator::add);
        return accumulator.total;
    }

    public static void main(String[] args) {
        System.out.println("SideEffect sum done in: " +
                measureSumPerf(ParallelPitfall::sideEffectSum, 10_000_000L) + "msecs" );
        System.out.println("SideEffect parallel sum done in: " +
                        measureSumPerf(ParallelPitfall::sideEffectParallelSum, 10_000_000L) + "msecs" );
    }
}
