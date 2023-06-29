package com.myCode.bookStore.controller;

import com.myCode.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){

        BookDto newBook = new BookDto("My first Book");
        List<BookDto> bookList = new ArrayList<BookDto>();
        bookList.add(newBook);

        return ResponseEntity.ok(bookList);
    }
}
