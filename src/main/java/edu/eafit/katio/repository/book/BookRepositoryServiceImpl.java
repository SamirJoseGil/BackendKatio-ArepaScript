package edu.eafit.katio.repository.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import edu.eafit.katio.models.Book;

import java.util.List;

@Service
public class BookRepositoryServiceImpl {

    @Autowired
    private BookRepository bookRepository;

    public ResponseEntity<List<Book>> findByNombre(String nombre){

        List<Book> response = bookRepository.findByNombre(nombre);

        if(response.size() > 0){
            return new ResponseEntity<List<Book>>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Book>>(response, HttpStatus.NO_CONTENT);
        }
    }
    
}
