package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ReporteConstant;
import org.testng.Assert;

public class ReporteService {

    public static void verifyReportSuccess(){
        Assert.assertEquals(MobileActionManager.getText(ReporteConstant.MODAL_TITLE_REPORT_LOCATOR),"Reporte Exitoso");
    }

    public static void clickButton() {
        MobileActionManager.click(ReporteConstant.BUTTON_COMENZAR_JORNADA_LOCATOR);
    }
}
