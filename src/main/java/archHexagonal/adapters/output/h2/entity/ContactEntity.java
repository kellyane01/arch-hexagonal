package archHexagonal.adapters.output.h2.entity;

import archHexagonal.application.domain.Contact;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    private String email;

    public static ContactEntity toContactEntity(Contact domain){
        return ContactEntity.builder()
                .nome(domain.nome)
                .email(domain.email)
                .build();
    }

    public static Contact toContactDomain(ContactEntity entity){
        return Contact.builder()
                .id(entity.id)
                .nome(entity.nome)
                .email(entity.email)
                .build();
    }
}
