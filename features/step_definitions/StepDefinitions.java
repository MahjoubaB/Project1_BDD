package com.example;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("^Je suis connecté$")
    public void jeSuisConnecte() {
        actionwords.jeSuisConnecte();
    }

    @When("^je clic sur ajouter bouton$")
    public void jeClicSurAjouterBouton() {
        actionwords.jeClicSurAjouterBouton();
    }

    @Then("^la formulaire s'affiche$")
    public void laFormulaireSaffiche() {
        actionwords.laFormulaireSaffiche();
    }
}