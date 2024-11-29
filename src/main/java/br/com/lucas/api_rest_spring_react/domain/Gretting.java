package br.com.lucas.api_rest_spring_react.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gretting {

    private final long id;
    private final String content;

    public Gretting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
