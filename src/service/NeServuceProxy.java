package service;

public class NeServuceProxy implements service.NeServuce {
  private String _endpoint = null;
  private service.NeServuce neServuce = null;
  
  public NeServuceProxy() {
    _initNeServuceProxy();
  }
  
  public NeServuceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNeServuceProxy();
  }
  
  private void _initNeServuceProxy() {
    try {
      neServuce = (new service.NeServuceServiceLocator()).getNeServucePort();
      if (neServuce != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)neServuce)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)neServuce)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (neServuce != null)
      ((javax.xml.rpc.Stub)neServuce)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.NeServuce getNeServuce() {
    if (neServuce == null)
      _initNeServuceProxy();
    return neServuce;
  }
  
  public service.NouveauNe chercher(java.lang.String arg0) throws java.rmi.RemoteException{
    if (neServuce == null)
      _initNeServuceProxy();
    return neServuce.chercher(arg0);
  }
  
  
}