package ws;

import lombok.*;

import java.util.Date;


@Data @NoArgsConstructor @AllArgsConstructor
public class Account {
    private int code;
    private double balance;
    private Date createdAt;
}
