package model.services;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 06 16:07:59 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for fabricreport_vo1.
     * @return fabricreport_vo1
     */
    public ViewObjectImpl getfabricreport_vo1() {
        return (ViewObjectImpl)findViewObject("fabricreport_vo1");
    }

    /**
     * Container's getter for searchvo1.
     * @return searchvo1
     */
    public ViewObjectImpl getsearchvo1() {
        return (ViewObjectImpl)findViewObject("searchvo1");
    }
}
