package com.basespringboot.repository;

import com.basespringboot.entity.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository 
public interface PostRepository extends JpaRepository<Post, Long> {
    // WHERE post_id = ?
    List<Post> findByPostId(Long post_id);

    // WHERE post_title = ?
    List<Post> findByPostTitle(String post_title);

    // WHERE post_desc = ?
    List<Post> findByPostDesc(String post_desc);
}
