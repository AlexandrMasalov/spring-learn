package ru.my_project.spring_learn.repo;

import org.springframework.data.repository.CrudRepository;
import ru.my_project.spring_learn.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
