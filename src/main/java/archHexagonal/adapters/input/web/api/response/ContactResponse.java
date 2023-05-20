package archHexagonal.adapters.input.web.api.response;

import archHexagonal.application.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ContactResponse {
    private Long id;
    private String nome;
    private String email;

    public static ContactResponse toContactResponse(Contact domain) {
        return ContactResponse.buildar()
                .id(domain.getId())
                .nome(domain.getNome())
                .email(domain.getEmail())
                .build();
    }
}
