package com.brucemelo;

import io.micronaut.sourcegen.annotations.Builder;
import io.micronaut.sourcegen.annotations.Wither;

@Builder
@Wither
public record Person(String name, String email) implements PersonWither {
}
