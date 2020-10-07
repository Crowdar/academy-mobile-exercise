package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.JobConstants;

public class JornadaStartService {
    public static void startJob(){
        MobileActionManager.click(JobConstants.CLICK_STARTJOB_INPUT_LOCATOR);
        MobileActionManager.click(JobConstants.CLICK_SACAR_FOTO_INPUT_LOCATOR);
        MobileActionManager.click(JobConstants.CLICK_REPORTAR_INPUT_LOCATOR);
        MobileActionManager.click(JobConstants.CLICK_JORNADASTART_INPUT_LOCATOR);
    }
    public static void finalJob(){
        MobileActionManager.click(JobConstants.CLICK_FINJOB_INPUT_LOCATOR);
        MobileActionManager.click(JobConstants.CLICK_OK_INPUT_LOCATOR);
        MobileActionManager.click(JobConstants.CLICK_FINALIZAR_INPUT_LOCATOR);
    }

}
