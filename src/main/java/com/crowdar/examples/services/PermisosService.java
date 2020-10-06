package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.PermisosConstants;

public class PermisosService {
    public static void aceptarPermisos(){
        do{
            //MobileActionManager.waitPresence(PermisosConstants.DAR_PERMISOS);
            MobileActionManager.click(PermisosConstants.DAR_PERMISOS);
        }while(MobileActionManager.isPresent("PermisosView.permitir"));
    }
}
