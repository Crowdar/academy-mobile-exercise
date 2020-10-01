package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.PermisosConstants;

public class PermisosService {
    public static void aceptarPermisos(){
        MobileActionManager.click(PermisosConstants.ACEPTAR_ALMACENAMIENTO);
        MobileActionManager.click(PermisosConstants.ACEPTAR_CAMARA);
        MobileActionManager.click(PermisosConstants.ACEPTAR_MICROFONO);
        MobileActionManager.click(PermisosConstants.ACEPTAR_UBICACION);
    }
}
