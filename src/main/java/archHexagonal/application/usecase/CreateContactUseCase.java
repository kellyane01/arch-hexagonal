package archHexagonal.application.usecase;

import archHexagonal.application.domain.Contact;
import archHexagonal.application.ports.input.ICreateContactUseCase;
import archHexagonal.application.ports.output.IContactRespositoryPort;
import archHexagonal.application.utils.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class CreateContactUseCase implements ICreateContactUseCase {

    private final IContactRespositoryPort iContactRespositoryPort;

    public Contact execute(Contact contactDomain) {
        return contactDomain.save(iContactRespositoryPort);
    }
}
