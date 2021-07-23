package com.zup.blog.service;

import com.zup.blog.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> buscarTodos();
    Optional<Post>  buscarPorId(Long id);
    Optional<Post> salvar(Post post);
    void remover(Post post);

}
