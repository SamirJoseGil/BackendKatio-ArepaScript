package edu.eafit.katio.controllers;

import edu.eafit.katio.models.Book;
import edu.eafit.katio.repository.book.BookRepositoryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/katio/books")
public class BooksController {

    @Autowired
    private BookRepositoryServiceImpl service;

    @GetMapping("/get-by-name")
    public @ResponseBody ResponseEntity<List<Book>> getByNombre(@RequestParam(value = "nombre") String nombre){
        return service.findByNombre(nombre);
    }
}
