package archHexagonal.adapters.output.h2.repository;

import archHexagonal.adapters.output.h2.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository extends JpaRepository<ContactEntity contactEntity> {

}
