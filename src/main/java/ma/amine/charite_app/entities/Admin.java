package ma.amine.charite_app.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class Admin {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nom", nullable = false)
    private String nom;
    private String prenom;
    private String email;
    private String Password;
    private Role role;
    public Admin(String nom, String prenom, String email, String Password, Role role) {}
    public void valide_organisation(){}

}
