package com.amar.test.Repositories;

import com.amar.test.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book,Long> {
    @Override
    default <S extends Book> S save(S s) {
        return null;
    }

    @Override
    default <S extends Book> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default Optional<Book> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Book> findAll() {
        return null;
    }

    @Override
    default Iterable<Book> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Book book) {

    }

    @Override
    default void deleteAll(Iterable<? extends Book> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
