package com.wheresapp.bussiness.routes.factory.imp;

import com.wheresapp.bussiness.routes.ASRoutes;
import com.wheresapp.bussiness.routes.factory.ASRoutesFactory;
import com.wheresapp.bussiness.routes.imp.ASRoutesImp;

/**
 * Created by Victorma on 26/11/2014.
 */
public class ASRoutesFactoryImp extends ASRoutesFactory {
    @Override
    public ASRoutes getInstanceASRoutes() {
        return new ASRoutesImp();
    }
}
