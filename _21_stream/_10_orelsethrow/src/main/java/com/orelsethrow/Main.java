package com.orelsethrow;

import java.util.Optional;

/**
 * #20211117_0723_277
 */
public class Main {

    public static void main(String... __) throws Exception {
        Optional<String> o = Optional.empty();
//        o.orElseThrow(() -> throw new RuntimeException()); //does not compile
        o.orElseThrow(Exception::new);
        o.orElseThrow();
    }
}
