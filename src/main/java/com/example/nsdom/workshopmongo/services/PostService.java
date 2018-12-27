package com.example.nsdom.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nsdom.workshopmongo.domain.Post;
import com.example.nsdom.workshopmongo.repository.PostRepository;
import com.example.nsdom.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService  {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitle(text);
	}
	
	
}
