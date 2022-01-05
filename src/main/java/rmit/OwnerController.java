package rmit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/owners")
public class OwnerController {


        @Autowired
        private OwnerRepository repository;

        @RequestMapping(path = "", method = RequestMethod.GET)
        public List<Owner> getAllOwners() {
            return repository.findAll();
        }

        @RequestMapping(path = "", method = RequestMethod.POST)
        public Owner addOwner(@RequestBody Owner owner) {
                repository.save(owner);
                return owner;
        }


}

