package com.reactiveprogramming.reactive;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {


    @Test
    public void testMono(){
        Mono monoString  =  Mono.just("hello world").log();
        monoString.subscribe(System.out::println);
    }

    @Test
    public void testFlux(){
        Flux fluxString = Flux.just("hello","wolrd").log();
        fluxString.subscribe(System.out::println);
    }
}
