package ma.amine.charite_app.controllers;

import ma.amine.charite_app.entities.Organisation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganisationController {
    @GetMapping("/getOrganisation/{id}")
   public Organisation recupererOrganisation(@pathVariable long id){
       return null;
   }
}
