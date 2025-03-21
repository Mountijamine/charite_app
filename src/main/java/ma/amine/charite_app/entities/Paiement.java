package ma.amine.charite_app.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double Montant;
    private  Methode paymentMethod;
    public Paiement (Double Montant, String Methode) {}
    public void effectuerPaiement(){}

}
