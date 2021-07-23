package com.zup.blog.service.serviceImpl;

import com.zup.blog.model.Post;
import com.zup.blog.repository.PostRepository;
import com.zup.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> buscarTodos() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> buscarPorId(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Optional<Post> salvar(Post post) {
        return Optional.of(postRepository.save(post));
    }

    @Override
    public void remover(Post post) {
        postRepository.delete(post);
    }
}
