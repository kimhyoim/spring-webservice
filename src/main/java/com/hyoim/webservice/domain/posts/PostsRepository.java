package com.hyoim.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("select p " + "From Posts p " + "Order by p.id Desc")
    Stream<Posts> findAllDesc();
}
