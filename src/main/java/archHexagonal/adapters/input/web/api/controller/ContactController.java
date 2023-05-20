package archHexagonal.adapters.input.web.api.controller;

import archHexagonal.adapters.input.web.api.ContactApi;
import archHexagonal.adapters.input.web.api.request.ContactRequest;
import archHexagonal.adapters.input.web.api.response.ContactResponse;
import archHexagonal.application.ports.input.ICreateContactUseCase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class ContactController implements ContactApi {

    private final ICreateContactUseCase iCreateContactUseCase;

    @Override
    public ContactResponse create(ContactRequest request){
        var domain = iCreateContactUseCase.execute(request.toContactDomain(request));
        return ContactResponse.toContactResponse(domain);
    }
}
