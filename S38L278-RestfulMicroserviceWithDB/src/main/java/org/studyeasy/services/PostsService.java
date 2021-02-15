package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.Post;
import org.studyeasy.repository.PostRepository;

@Service
public class PostsService {

	@Autowired
	private PostRepository repo;
	
	//view all
	public List<Post> getPosts(){
		List<Post> list = new ArrayList<>();
		//repo.findAll();		// get all the post from the database
		for(Post post:repo.findAll()) {
			list.add(post);
		}
		return list;
	}
	
	//view specific
	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	//add
	public void addPost(Post listElement) {		
		repo.save(listElement);
	}
	
	//update
	public void updatePost(Post post) {
		repo.save(post);
	}

	public void deletePost(int id) {
		repo.deleteById(id);		
	}

}
