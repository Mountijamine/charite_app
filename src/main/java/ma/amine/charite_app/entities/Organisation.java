package ma.amine.charite_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public abstract class Organisation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nom", nullable = false)
    private String name;
    private String description;
    private String adresseLegale;
    private boolean valide;
    private String Contact;
    public Organisation(String name, String description, String adresseLegale, boolean valide, String Contact) {}

    public void modifier_Profil() {}
    public void  register_organisation(){}


}
