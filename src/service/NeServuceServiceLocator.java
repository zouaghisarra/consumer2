/**
 * NeServuceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class NeServuceServiceLocator extends org.apache.axis.client.Service implements service.NeServuceService {

    public NeServuceServiceLocator() {
    }


    public NeServuceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NeServuceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NeServucePort
    private java.lang.String NeServucePort_address = "http://localhost:8090/ess3hopital/services/NeServucePort";

    public java.lang.String getNeServucePortAddress() {
        return NeServucePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NeServucePortWSDDServiceName = "NeServucePort";

    public java.lang.String getNeServucePortWSDDServiceName() {
        return NeServucePortWSDDServiceName;
    }

    public void setNeServucePortWSDDServiceName(java.lang.String name) {
        NeServucePortWSDDServiceName = name;
    }

    public service.NeServuce getNeServucePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NeServucePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNeServucePort(endpoint);
    }

    public service.NeServuce getNeServucePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.NeServuceServiceSoapBindingStub _stub = new service.NeServuceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getNeServucePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNeServucePortEndpointAddress(java.lang.String address) {
        NeServucePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.NeServuce.class.isAssignableFrom(serviceEndpointInterface)) {
                service.NeServuceServiceSoapBindingStub _stub = new service.NeServuceServiceSoapBindingStub(new java.net.URL(NeServucePort_address), this);
                _stub.setPortName(getNeServucePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NeServucePort".equals(inputPortName)) {
            return getNeServucePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "NeServuceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "NeServucePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NeServucePort".equals(portName)) {
            setNeServucePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
