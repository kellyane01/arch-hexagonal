package archHexagonal.adapters.input.web.api;

import archHexagonal.adapters.input.web.api.request.ContactRequest;
import archHexagonal.adapters.input.web.api.response.ContactResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/contacts")
public interface ContactApi {
    @PostMapping
    public ContactResponse create(@RequestBody ContactRequest request);
}
