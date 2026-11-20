package com.basespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.basespringboot.entity.*;
import java.util.List;

@Repository 
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    // WHERE reply_id = ?
    List<Reply> findByReplyId(Long reply_id);

    // WHERE reply_content = ?
    List<Reply> findByPostContent(String reply_content);
}
