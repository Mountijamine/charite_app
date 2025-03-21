package ma.amine.charite_app.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()

public class CharityAction {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private Date date;
    private String lieu;
    private status status;
    public CharityAction(String title, String description, Date date, String lieu, status status) {}
    public void createAction(){}
    public void updateAction(){}
    public void ArchiveAction(){}
}
