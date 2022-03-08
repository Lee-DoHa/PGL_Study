package dev.doha.mybaits.mapper;

import dev.doha.mybaits.dto.PostDto;

import java.util.List;

public interface PostMapper {
    int createPost(PostDto dto);
    PostDto readPost(int id);
    List<PostDto> readPostAll();
    int updatePost(PostDto dto);
    int deletePost(int id);
}
