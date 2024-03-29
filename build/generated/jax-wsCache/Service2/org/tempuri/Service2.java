
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Service2", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8895/Service2.svc?singleWsdl")
public class Service2
    extends Service
{

    private final static URL SERVICE2_WSDL_LOCATION;
    private final static WebServiceException SERVICE2_EXCEPTION;
    private final static QName SERVICE2_QNAME = new QName("http://tempuri.org/", "Service2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8895/Service2.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE2_WSDL_LOCATION = url;
        SERVICE2_EXCEPTION = e;
    }

    public Service2() {
        super(__getWsdlLocation(), SERVICE2_QNAME);
    }

    public Service2(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE2_QNAME, features);
    }

    public Service2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE2_QNAME);
    }

    public Service2(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE2_QNAME, features);
    }

    public Service2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service2(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IService2
     */
    @WebEndpoint(name = "BasicHttpBinding_IService2")
    public IService2 getBasicHttpBindingIService2() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IService2"), IService2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IService2
     */
    @WebEndpoint(name = "BasicHttpBinding_IService2")
    public IService2 getBasicHttpBindingIService2(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IService2"), IService2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE2_EXCEPTION!= null) {
            throw SERVICE2_EXCEPTION;
        }
        return SERVICE2_WSDL_LOCATION;
    }

}
