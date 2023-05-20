package archHexagonal.application.ports.input;

import archHexagonal.application.domain.Contact;

public interface ICreateContactUseCase {
    Contact execute(Contact contactDomain);
}
