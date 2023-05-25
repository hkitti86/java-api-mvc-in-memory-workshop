package com.booleanuk.api;

import com.booleanuk.api.requests.Author;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Author firstAuthor = new Author("Charles Dickens", "dickens@charles.com");
        System.out.println(firstAuthor.getId());

        Author secondAuthor = new Author("Cervantes", "cervantes@miguelde.com");
        System.out.println(secondAuthor.getId());

    }
}