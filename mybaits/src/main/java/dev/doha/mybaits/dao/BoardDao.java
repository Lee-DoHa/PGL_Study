package dev.doha.mybaits.dao;

import dev.doha.mybaits.dto.BoardDto;
import dev.doha.mybaits.mapper.BoardMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
    private final SqlSessionFactory sessionFactory;

    public BoardDao(@Autowired SqlSessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public int createBoard(BoardDto dto){
        try (SqlSession session = sessionFactory.openSession()){
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            return mapper.createBoard(dto);
        }
    }
}