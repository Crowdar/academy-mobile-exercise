package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class ApiDemoHome extends PageBaseMobile {

    private final String ACTION_BAR_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String TEXT_VIEW_XPATH = "//android.widget.TextView";
    /******FICHAP******/
    public static final String MENU_BTN = "HomeView.menuBtn";
    public static final String NOTIFICACIONES_BTN = "HomeView.notifyBtn";
    public static final String COMENZAR_JORNADA_BTN = "HomeView.comenzarJornadaBtn";
    public static final String FINALIZAR_JORNADA_BTN = "HomeView.finalizarJornadaBtn";
    public static final String COMENZAR_JORNADA_POPUP_REPORTE_BTN = "HomeView.comenzarJornadaReportePopUpBtn";
    public static final String FINALIZAR_JORNADA_ACEPTAR_POP_UP_BTN = "HomeView.aceptarFinalizarJornadaBtn";
    public static final String TERMINAR_BTN = "HomeView.terminarBtn";


    public static final String TITULO_TXT = "HomeView.tituloTxt";

    public ApiDemoHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getTitle() {
        return getWebElement(By.xpath(ACTION_BAR_XPATH)).findElement(By.xpath(TEXT_VIEW_XPATH)).getText();
    }

    private WebElement getMenuElement(String menu) {
        return getWebElement(By.xpath("//android.widget.TextView[@content-desc=" + "\"" + menu + "\"" + "]"));
    }

    public void clickMenuElement(String menu) {
        WebElement element = getMenuElement(menu);
        clickElement(element);
    }

}
