package com.codestates.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>{
    @Query("SELECT p from Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}

/*
* JpaRepository
* - DB layer 접근자
* - 인터페이스를 생성한 후, JpaRepository<Entity 클래스, PK 타입>을 상속하면 기본적인 CRUD 메서드가 자동으로 생성된다.
* */