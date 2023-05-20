package archHexagonal.adapters.input.web.api.request;

import archHexagonal.application.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ContactRequest {
    private String nome;
    private String email;

    public Contact toContactDomain(ContactRequest request){
        return Contact.builder()
                .nome(request.nome)
                .email(request.email)
                .build();
    }
}
