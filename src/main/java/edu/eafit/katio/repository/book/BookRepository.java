package edu.eafit.katio.repository.book;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.eafit.katio.models.Book;

import java.util.Date;

public interface BookRepository extends CrudRepository<Book, Integer>{

    @Query(value = "SELECT * FROM books b WHERE b.nombre ILIKE '%:nombre%'",
    nativeQuery = true)
    List<Book> findByNombre(@Param("nombre") String nombre);

    List<Book> findByAutorId(Integer autorId);

    List<Book> findByISBN(String ISBN);

    List<Book> findByFechaPublicacion(Date fechaPublicacion);
    
}
