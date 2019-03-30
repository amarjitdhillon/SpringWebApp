package com.amar.test.Repositories;

import com.amar.test.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author,Long> {
    @Override
    default <S extends Author> S save(S s) {
        return null;
    }

    @Override
    default <S extends Author> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default Optional<Author> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Author> findAll() {
        return null;
    }

    @Override
    default Iterable<Author> findAllById(Iterable<Long> iterable) {
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
    default void delete(Author author) {

    }

    @Override
    default void deleteAll(Iterable<? extends Author> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
