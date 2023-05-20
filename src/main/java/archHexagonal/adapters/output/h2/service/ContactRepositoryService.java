package archHexagonal.adapters.output.h2.service;

import archHexagonal.adapters.output.h2.entity.ContactEntity;
import archHexagonal.adapters.output.h2.repository.ContactRepository;
import archHexagonal.application.domain.Contact;
import archHexagonal.application.ports.output.IContactRespositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ContactRepositoryService implements IContactRespositoryPort {
    private final ContactRepository contactRepository;

    @Override
    public Contact createContact(Contact contactDomain){
        var entitySave = ContactEntity.toContactEntity(contactDomain);
        var entity = contactRepository.save(entitySave);
        return ContactEntity.toContactDomain(entity);
    }
}
