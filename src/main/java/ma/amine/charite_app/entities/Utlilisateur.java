package ma.amine.charite_app.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class Utlilisateur {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nom", nullable = false)
    private String name;
    private String Email;
    private String phone;
    private String MotDePasse;
    public Utlilisateur(String name, String email, String phone, String MotDePasse) {}

    public void SInscrire() {}
    public void seConnecter() {}
    public void modifierProfil() {}
    public void consulterHistoriqueDons() {}
}

