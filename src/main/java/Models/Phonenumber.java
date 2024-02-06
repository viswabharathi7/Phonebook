package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Phonenumber {
    @Id
    private long id;

    @OneToMany
    private Phonenumber phonenumber;
    private String code;
    private String Number;

}
