/**
 * Estacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api.docs;

public class Estacion  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String direccion;

    private int numeroAnclajes;

    private java.lang.String[] anclajes;

    public Estacion() {
    }

    public Estacion(
           java.lang.String id,
           java.lang.String direccion,
           int numeroAnclajes,
           java.lang.String[] anclajes) {
           this.id = id;
           this.direccion = direccion;
           this.numeroAnclajes = numeroAnclajes;
           this.anclajes = anclajes;
    }


    /**
     * Gets the id value for this Estacion.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Estacion.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the direccion value for this Estacion.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this Estacion.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the numeroAnclajes value for this Estacion.
     * 
     * @return numeroAnclajes
     */
    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }


    /**
     * Sets the numeroAnclajes value for this Estacion.
     * 
     * @param numeroAnclajes
     */
    public void setNumeroAnclajes(int numeroAnclajes) {
        this.numeroAnclajes = numeroAnclajes;
    }


    /**
     * Gets the anclajes value for this Estacion.
     * 
     * @return anclajes
     */
    public java.lang.String[] getAnclajes() {
        return anclajes;
    }


    /**
     * Sets the anclajes value for this Estacion.
     * 
     * @param anclajes
     */
    public void setAnclajes(java.lang.String[] anclajes) {
        this.anclajes = anclajes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Estacion)) return false;
        Estacion other = (Estacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            this.numeroAnclajes == other.getNumeroAnclajes() &&
            ((this.anclajes==null && other.getAnclajes()==null) || 
             (this.anclajes!=null &&
              java.util.Arrays.equals(this.anclajes, other.getAnclajes())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        _hashCode += getNumeroAnclajes();
        if (getAnclajes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnclajes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnclajes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Estacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "Estacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAnclajes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "numeroAnclajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anclajes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "anclajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "Bicicleta"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "bicicleta"));
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
