package dev.doha.jpa.repository;

import dev.doha.jpa.entity.BoardEntity;
import dev.doha.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> findAllByWriter(String writer); // where writer = ?
    List<PostEntity> findAllByWriterAndBoardEntity(String writer, BoardEntity boardEntity); //where writer = ? and boardEntity?
}
