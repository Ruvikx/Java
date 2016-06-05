/**
 * EstadoEstacionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api.docs;

public class EstadoEstacionResponse  implements java.io.Serializable {
    private mobi.mobipalma.api.docs.Estacion estacion;

    public EstadoEstacionResponse() {
    }

    public EstadoEstacionResponse(
           mobi.mobipalma.api.docs.Estacion estacion) {
           this.estacion = estacion;
    }


    /**
     * Gets the estacion value for this EstadoEstacionResponse.
     * 
     * @return estacion
     */
    public mobi.mobipalma.api.docs.Estacion getEstacion() {
        return estacion;
    }


    /**
     * Sets the estacion value for this EstadoEstacionResponse.
     * 
     * @param estacion
     */
    public void setEstacion(mobi.mobipalma.api.docs.Estacion estacion) {
        this.estacion = estacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstadoEstacionResponse)) return false;
        EstadoEstacionResponse other = (EstadoEstacionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estacion==null && other.getEstacion()==null) || 
             (this.estacion!=null &&
              this.estacion.equals(other.getEstacion())));
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
        if (getEstacion() != null) {
            _hashCode += getEstacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstadoEstacionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", ">estadoEstacionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "Estacion"));
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
