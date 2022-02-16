package nvc.bcit.icefactory.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Event {
    private int amount;

    @CreatedDate
    private Date createdAt;
}
