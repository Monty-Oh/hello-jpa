package hello.hellojpa.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    private String email;
    private String name;

    @Temporal(TemporalType.TIMESTAMP)   // java.sql.Timestamp를 이용해서 매핑을 처리함을 뜻함.
    @Column(name = "create_date")       // 매핑할 테이블의 이름을 지정
    private Date createDate;

    public User() {
        this.createDate = new Date();
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}
