package ma.amine.charite_app.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="org")
public class Donation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  Double montant;
    @DateTimeFormat
    private Date date;
}
