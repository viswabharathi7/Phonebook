package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Contacts {
    @Id
    private Long id;

    private List<Phonenumber> phonenumberList;
    private String name;
    private String Email;
}
