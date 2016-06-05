/**
 * BicipalmaSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api.docs;

import java.util.ArrayList;

/**
     *  BicipalmaSkeleton java skeleton for the axisService
     */
    //public class BicipalmaSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param estadoEstacionRequest 
             * @return estadoEstacionResponse 
         */
        
                 /*public mobi.mobipalma.api.docs.EstadoEstacionResponse estadoEstacion
                  (
                  mobi.mobipalma.api.docs.EstadoEstacionRequest estadoEstacionRequest
                  )
            {*/
                
                     //TODO : fill this with the necessary business logic
                     // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#estadoEstacion");
                     	 
                     	 
                     	 
                     	 /*ArrayList<Estacion> estaciones = new ArrayList<>();
                     	                     	 
                     	 Estacion estacion01 = new Estacion();
                     	 estacion01.setId("1");
                     	 estacion01.setDireccion("Manacor 50");
                     	 estacion01.setNumeroAnclajes(5);
                     	 estaciones.add(estacion01);
                     	 
                     	 Estacion estacion02 = new Estacion();
                     	 estacion02.setId("2");
                    	 estacion02.setDireccion("Jacint Verdaguer");
                    	 estacion02.setNumeroAnclajes(10);
                    	 estaciones.add(estacion02);         	 
                     	 
                     	 Estacion estacion03 = new Estacion();
                     	 estacion03.setId("3");
                     	 estacion03.setDireccion("Plaza España");
                   	     estacion03.setNumeroAnclajes(20);
                   	     estaciones.add(estacion03);
                     	 
                     	 // Anclajes es un array de objetos bicicleta
                     	 
                     	 // El objeto bicicleta contiene una propiedad de clase String
                     	 
                     	 String[] bicicletas = {"250", "null", "270", "null", "290"};   
                     	 
                     	 for(Estacion estacion: estaciones ){
                     		 	 Anclajes anclaje = new Anclajes();
		                     	 for( String bicicleta: bicicletas ){
		                     		 Bicicleta bici = new Bicicleta();
		                     		 bici.setBicicleta(bicicleta);
		                     		 anclaje.addBicicleta(bici);              		 
		                     	 }
		                     	 estacion.setAnclajes(anclaje);
                     	 }
                     	 
                     	 EstadoEstacionResponse respuesta = new EstadoEstacionResponse();
                     	 
                     	 String idEstacion = estadoEstacionRequest.getIdEstacion();
                     	 
                     	 for(int i = 0; i < estaciones.size(); i++){
                     		 if( idEstacion.contentEquals( estaciones.get(i).getId() ) ){
                     			respuesta.setEstacion(estaciones.get(i));
                     			break;
                     		 }                   		 
                     	 }
                     	 
                     	 return respuesta;
        }
     
    }*/

public class BicipalmaSOAPSkeleton implements mobi.mobipalma.api.docs.Bicipalma_PortType, org.apache.axis.wsdl.Skeleton {
    private mobi.mobipalma.api.docs.Bicipalma_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estadoEstacionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", ">estadoEstacionRequest"), mobi.mobipalma.api.docs.EstadoEstacionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("estadoEstacion", _params, new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estadoEstacionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", ">estadoEstacionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "estadoEstacion"));
        _oper.setSoapAction("https://api.mobipalma.mobi/docs/estadoEstacion");
        _myOperationsList.add(_oper);
        if (_myOperations.get("estadoEstacion") == null) {
            _myOperations.put("estadoEstacion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("estadoEstacion")).add(_oper);
    }

    public BicipalmaSOAPSkeleton() {
        this.impl = new mobi.mobipalma.api.docs.BicipalmaSOAPImpl();
    }

    public BicipalmaSOAPSkeleton(mobi.mobipalma.api.docs.Bicipalma_PortType impl) {
        this.impl = impl;
    }
    /*public mobi.mobipalma.api.docs.EstadoEstacionResponse estadoEstacion(mobi.mobipalma.api.docs.EstadoEstacionRequest parameters) throws java.rmi.RemoteException
    {
        mobi.mobipalma.api.docs.EstadoEstacionResponse ret = impl.estadoEstacion(parameters);
        return ret;
    }*/
    
    public mobi.mobipalma.api.docs.EstadoEstacionResponse estadoEstacion
    (
    mobi.mobipalma.api.docs.EstadoEstacionRequest estadoEstacionRequest
    )
{
    ArrayList<Estacion> estaciones = new ArrayList<>();
 	 
	 Estacion estacion01 = new Estacion();
	 estacion01.setId("1");
	 estacion01.setDireccion("Manacor 50");
	 estacion01.setNumeroAnclajes(5);
	 estaciones.add(estacion01);
	 
	 Estacion estacion02 = new Estacion();
	 estacion02.setId("2");
	 estacion02.setDireccion("Jacint Verdaguer");
	 estacion02.setNumeroAnclajes(10);
	 estaciones.add(estacion02);         	 
	 
	 Estacion estacion03 = new Estacion();
	 estacion03.setId("3");
	 estacion03.setDireccion("Plaza España");
	 estacion03.setNumeroAnclajes(20);
	 estaciones.add(estacion03);
	 
	 // Anclajes es un array de objetos bicicleta
	 
	 // El objeto bicicleta contiene una propiedad de clase String
	 
	 String[] bicicletas = {"250", "null", "270", "null", "290"};   
	 
	 for(Estacion estacion: estaciones ){
		 	 Anclajes anclaje = new Anclajes();
        	 for( String bicicleta: bicicletas ){
        		 Bicicleta bici = new Bicicleta();
        		 bici.setBicicleta(bicicleta);
        		 anclaje.addBicicleta(bici);              		 
        	 }
        	 estacion.setAnclajes(estacion.getAnclajes());
	 }
	 
	 EstadoEstacionResponse respuesta = new EstadoEstacionResponse();
	 
	 String idEstacion = estadoEstacionRequest.getIdEstacion();
	 
	 for(int i = 0; i < estaciones.size(); i++){
		 if( idEstacion.contentEquals( estaciones.get(i).getId() ) ){
			respuesta.setEstacion(estaciones.get(i));
			break;
		 }                   		 
	 }
	 
	 return respuesta;
	}
}
