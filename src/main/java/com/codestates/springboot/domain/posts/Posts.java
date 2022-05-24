package com.codestates.springboot.domain.posts;
import com.codestates.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter // 클래스 내 모든 필드의 Getter 메서드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 아래 클래스로 데이터베이스의 테이블에 접근 가능
public class Posts extends BaseTimeEntity {
    @Id // 아래 필드 id가 PK임을 나타냄.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment 적용
    private Long id;  // PK 타입은 Long 타입이 적절함. 이렇게 하면 mySQL에서 bigint 타입이 됨.

    private String author;
    // String의 기본값은 varchar(255) -> 기본값 사용 시 @Column 필요하지 않음.

    @Column(length = 500, nullable = false)
    private String title;
    // 기본값을 사용하지 않음. varchar(500)

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    // 기본값을 사용하지 않음. (text 타입)

    @Builder // (롬복) 해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
