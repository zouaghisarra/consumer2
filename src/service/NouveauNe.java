/**
 * NouveauNe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class NouveauNe  implements java.io.Serializable {
    private java.lang.String cinpere;

    private java.lang.String datenaissance;

    private java.lang.String idne;

    private java.lang.String nompere;

    private java.lang.String prenomne;

    private java.lang.String prenompere;

    public NouveauNe() {
    }

    public NouveauNe(
           java.lang.String cinpere,
           java.lang.String datenaissance,
           java.lang.String idne,
           java.lang.String nompere,
           java.lang.String prenomne,
           java.lang.String prenompere) {
           this.cinpere = cinpere;
           this.datenaissance = datenaissance;
           this.idne = idne;
           this.nompere = nompere;
           this.prenomne = prenomne;
           this.prenompere = prenompere;
    }


    /**
     * Gets the cinpere value for this NouveauNe.
     * 
     * @return cinpere
     */
    public java.lang.String getCinpere() {
        return cinpere;
    }


    /**
     * Sets the cinpere value for this NouveauNe.
     * 
     * @param cinpere
     */
    public void setCinpere(java.lang.String cinpere) {
        this.cinpere = cinpere;
    }


    /**
     * Gets the datenaissance value for this NouveauNe.
     * 
     * @return datenaissance
     */
    public java.lang.String getDatenaissance() {
        return datenaissance;
    }


    /**
     * Sets the datenaissance value for this NouveauNe.
     * 
     * @param datenaissance
     */
    public void setDatenaissance(java.lang.String datenaissance) {
        this.datenaissance = datenaissance;
    }


    /**
     * Gets the idne value for this NouveauNe.
     * 
     * @return idne
     */
    public java.lang.String getIdne() {
        return idne;
    }


    /**
     * Sets the idne value for this NouveauNe.
     * 
     * @param idne
     */
    public void setIdne(java.lang.String idne) {
        this.idne = idne;
    }


    /**
     * Gets the nompere value for this NouveauNe.
     * 
     * @return nompere
     */
    public java.lang.String getNompere() {
        return nompere;
    }


    /**
     * Sets the nompere value for this NouveauNe.
     * 
     * @param nompere
     */
    public void setNompere(java.lang.String nompere) {
        this.nompere = nompere;
    }


    /**
     * Gets the prenomne value for this NouveauNe.
     * 
     * @return prenomne
     */
    public java.lang.String getPrenomne() {
        return prenomne;
    }


    /**
     * Sets the prenomne value for this NouveauNe.
     * 
     * @param prenomne
     */
    public void setPrenomne(java.lang.String prenomne) {
        this.prenomne = prenomne;
    }


    /**
     * Gets the prenompere value for this NouveauNe.
     * 
     * @return prenompere
     */
    public java.lang.String getPrenompere() {
        return prenompere;
    }


    /**
     * Sets the prenompere value for this NouveauNe.
     * 
     * @param prenompere
     */
    public void setPrenompere(java.lang.String prenompere) {
        this.prenompere = prenompere;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NouveauNe)) return false;
        NouveauNe other = (NouveauNe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cinpere==null && other.getCinpere()==null) || 
             (this.cinpere!=null &&
              this.cinpere.equals(other.getCinpere()))) &&
            ((this.datenaissance==null && other.getDatenaissance()==null) || 
             (this.datenaissance!=null &&
              this.datenaissance.equals(other.getDatenaissance()))) &&
            ((this.idne==null && other.getIdne()==null) || 
             (this.idne!=null &&
              this.idne.equals(other.getIdne()))) &&
            ((this.nompere==null && other.getNompere()==null) || 
             (this.nompere!=null &&
              this.nompere.equals(other.getNompere()))) &&
            ((this.prenomne==null && other.getPrenomne()==null) || 
             (this.prenomne!=null &&
              this.prenomne.equals(other.getPrenomne()))) &&
            ((this.prenompere==null && other.getPrenompere()==null) || 
             (this.prenompere!=null &&
              this.prenompere.equals(other.getPrenompere())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCinpere() != null) {
            _hashCode += getCinpere().hashCode();
        }
        if (getDatenaissance() != null) {
            _hashCode += getDatenaissance().hashCode();
        }
        if (getIdne() != null) {
            _hashCode += getIdne().hashCode();
        }
        if (getNompere() != null) {
            _hashCode += getNompere().hashCode();
        }
        if (getPrenomne() != null) {
            _hashCode += getPrenomne().hashCode();
        }
        if (getPrenompere() != null) {
            _hashCode += getPrenompere().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NouveauNe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "nouveauNe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cinpere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cinpere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datenaissance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datenaissance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nompere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nompere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenomne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prenomne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenompere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prenompere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
