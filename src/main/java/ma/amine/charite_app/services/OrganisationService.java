package ma.amine.charite_app.services;

import ma.amine.charite_app.entities.Organisation;

public interface OrganisationService {

    public void insersion();
    Organisation lectureparID();
    list<Organisation>lectureOrganisation();
    Organisation modifcation(Organisation organisation);
    void supprimion(Organisation organisation);
}
