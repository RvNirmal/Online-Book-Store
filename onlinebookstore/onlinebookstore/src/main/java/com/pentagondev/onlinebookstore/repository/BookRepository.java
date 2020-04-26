package com.pentagondev.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pentagondev.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
