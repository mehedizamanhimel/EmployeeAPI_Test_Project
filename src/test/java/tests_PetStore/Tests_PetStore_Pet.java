package tests_PetStore;

import org.testng.annotations.Test;
import petStore_Pets.*;

public class Tests_PetStore_Pet {

    CreatingPet petCreation = new CreatingPet();
    DeletePet petDeletion = new DeletePet();
    GetPetByID gettingPetID = new GetPetByID();
    GetPetByStatus gettingPetByStatus = new GetPetByStatus();
    UpdatePet updatingPet = new UpdatePet();


    @Test
    public void SampleTest(){
        petCreation.CreateNewPet("", "", "", "");
    }

}
