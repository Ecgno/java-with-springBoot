package com.rafael.projeto_spring.spring_projetorestful.trashclasses.classes;

public class Greetings {

    private final long id;
    private final String content;

    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void Call(System e) {

        e.out.println("id :" + this.id + " content:" + this.content);

    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

}
