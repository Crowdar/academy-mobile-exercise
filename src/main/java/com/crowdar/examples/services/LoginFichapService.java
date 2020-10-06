package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.FichapLoginConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;


public class LoginFichapService {

    public static void Loguearse(String email, String password){
        MobileActionManager.setInput(FichapLoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(FichapLoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(FichapLoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void VerificarPantalla() {
        MobileActionManager.waitVisibility(FichapLoginConstants.SIGN_IN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstants.EMAIL_INPUT_LOCATOR));
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstants.PASSWORD_INPUT_LOCATOR));
    }

    public static void tomarFoto(){
        MobileActionManager.click(FichapLoginConstants.ACEPTAR_FOTO_BUTTON_LOCATOR);
        MobileActionManager.click(FichapLoginConstants.TOMAR_FOTO_BTN);
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstants.MENU_HAMBURGUESA));
    }

    public static void abrirMenu(){
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstants.MENU_HAMBURGUESA));
        MobileActionManager.click(FichapLoginConstants.MENU_HAMBURGUESA);

    }

    public static void modificarPerfil(String nombre, String apellido, String direccion){
        MobileActionManager.click(FichapLoginConstants.SELECT_PERFIL_BTN);
        MobileActionManager.setInput(FichapLoginConstants.NOMBRE_INPUT, nombre);
        MobileActionManager.setInput(FichapLoginConstants.APELLIDO_INPUT, apellido);
        MobileActionManager.setInput(FichapLoginConstants.DIRECCION_INPUT, direccion);
        MobileActionManager.click(FichapLoginConstants.GUARDAR_DATOS_PERFIL_BTN);
    }
}
