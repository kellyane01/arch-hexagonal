package archHexagonal.application.domain;

import archHexagonal.application.ports.output.IContactRespositoryPort;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Contact {

    private Long id;
    private String nome;
    private String email;

    public Contact save(IContactRespositoryPort iContactRespositoryPort) {
        return iContactRespositoryPort.createContact(this);
    }
}
