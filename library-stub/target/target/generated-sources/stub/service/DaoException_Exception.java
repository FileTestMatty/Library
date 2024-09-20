
package service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DaoException", targetNamespace = "http://alfasoft.it/authors")
public class DaoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DaoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DaoException_Exception(String message, DaoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DaoException_Exception(String message, DaoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: service.DaoException
     */
    public DaoException getFaultInfo() {
        return faultInfo;
    }

}
