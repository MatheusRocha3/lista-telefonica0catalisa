package Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agenda_telefonica")
public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoContato;

    @Column(length = 50, nullable = false)
    private String nomeDoContato;

    @Column(length = 50, nullable = false)
    private String numeroDoContato;
}
