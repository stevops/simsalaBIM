package org.bimserver.generatedclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-31T16:04:16.429+02:00
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "ServiceInterfaceService", 
                  wsdlLocation = "generated/ServiceInterface.wsdl",
                  targetNamespace = "org.bimserver") 
public class ServiceInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("org.bimserver", "ServiceInterfaceService");
    public final static QName ServiceInterfacePort = new QName("org.bimserver", "ServiceInterfacePort");
    static {
        URL url = ServiceInterfaceService.class.getResource("generated/ServiceInterface.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ServiceInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "generated/ServiceInterface.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ServiceInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ServiceInterface
     */
    @WebEndpoint(name = "ServiceInterfacePort")
    public ServiceInterface getServiceInterfacePort() {
        return super.getPort(ServiceInterfacePort, ServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceInterface
     */
    @WebEndpoint(name = "ServiceInterfacePort")
    public ServiceInterface getServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(ServiceInterfacePort, ServiceInterface.class, features);
    }

}