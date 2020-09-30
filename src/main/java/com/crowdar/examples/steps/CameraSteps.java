package com.crowdar.examples.steps;

import com.crowdar.examples.services.CameraService;
import io.cucumber.java.en.When;

public class CameraSteps {
    @When("realiza una foto")
    public void realizaFoto() {
        CameraService.takePicture();
    }
}
