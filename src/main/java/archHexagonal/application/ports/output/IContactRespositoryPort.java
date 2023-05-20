package archHexagonal.application.ports.output;

import archHexagonal.application.domain.Contact;

public interface IContactRespositoryPort {
    Contact createContact(Contact contactDomain);
}
