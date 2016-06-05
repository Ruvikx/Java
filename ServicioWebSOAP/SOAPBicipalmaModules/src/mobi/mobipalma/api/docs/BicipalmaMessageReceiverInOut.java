package mobi.mobipalma.api.docs;

/**
 *  BicipalmaMessageReceiverInOut message receiver
 */

 public class BicipalmaMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


 public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
 throws org.apache.axis2.AxisFault{

 try {

 // get the implementation class for the Web Service
 Object obj = getTheImplementationObject(msgContext);

 BicipalmaSOAPSkeleton skel = (BicipalmaSOAPSkeleton)obj;
 //Out Envelop
 org.apache.axiom.soap.SOAPEnvelope envelope = null;
 //Find the axisOperation that has been set by the Dispatch phase.
 org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
 if (op == null) {
 throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
 }

 java.lang.String methodName;
 if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


 

     if("estadoEstacion".equals(methodName)){
         
         mobi.mobipalma.api.docs.EstadoEstacionResponse estadoEstacionResponse5 = null;
                     mobi.mobipalma.api.docs.EstadoEstacionRequest wrappedParam =
                                                      (mobi.mobipalma.api.docs.EstadoEstacionRequest)fromOM(
                             msgContext.getEnvelope().getBody().getFirstElement(),
                             mobi.mobipalma.api.docs.EstadoEstacionRequest.class);
                                         
                                        estadoEstacionResponse5 =
                                            
                                            
                                                  skel.estadoEstacion(wrappedParam)
                                             ;
                                     
                                 envelope = toEnvelope(getSOAPFactory(msgContext), estadoEstacionResponse5, false,
                                             new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estadoEstacionResponse"));
                             
     } else {
       throw new java.lang.RuntimeException("method not found");
     }
 

 newMsgContext.setEnvelope(envelope);
 }
 }
 catch (java.lang.Exception e) {
 throw org.apache.axis2.AxisFault.makeFault(e);
 }
 }
 
 //
     private  org.apache.axiom.om.OMElement  toOM(mobi.mobipalma.api.docs.Bicicleta param, boolean optimizeContent)
     throws org.apache.axis2.AxisFault {

     
                 try{
                      return param.getOMElement(mobi.mobipalma.api.docs.Bicicleta.MY_QNAME,
                                   org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                 } catch(org.apache.axis2.databinding.ADBException e){
                     throw org.apache.axis2.AxisFault.makeFault(e);
                 }
             

     }
 
    /* private  org.apache.axiom.om.OMElement  toOM(mobi.mobipalma.api.docs.Bicicleta param, boolean optimizeContent)
     throws org.apache.axis2.AxisFault {
	
     
                 try{
                      return param.getOMElement(mobi.mobipalma.api.docs.Bicicleta.MY_QNAME,
                                   org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                 } catch(org.apache.axis2.databinding.ADBException e){
                     throw org.apache.axis2.AxisFault.makeFault(e);
                 }
             

     }*/
 
             private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, mobi.mobipalma.api.docs.Bicicleta param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                 throws org.apache.axis2.AxisFault{
               try{
                   org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                    
                             emptyEnvelope.getBody().addChild(param.getOMElement(mobi.mobipalma.api.docs.Bicicleta.MY_QNAME,factory));
                         

                  return emptyEnvelope;
             } catch(org.apache.axis2.databinding.ADBException e){
                 throw org.apache.axis2.AxisFault.makeFault(e);
             }
             }
             
                  private mobi.mobipalma.api.docs.EstadoEstacionResponse wrapestadoEstacion(){
                         mobi.mobipalma.api.docs.EstadoEstacionResponse wrappedElement = new mobi.mobipalma.api.docs.EstadoEstacionResponse();
                         return wrappedElement;
                  }
             


 /**
 *  get the default envelope
 */
 private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
 return factory.getDefaultEnvelope();
 }


 private  java.lang.Object fromOM(
 org.apache.axiom.om.OMElement param,
 java.lang.Class type) throws org.apache.axis2.AxisFault{

 try {
 
         if (mobi.mobipalma.api.docs.EstadoEstacionRequest.class.equals(type)){
         
                 return mobi.mobipalma.api.docs.Anclajes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
             

         }
     
         if (mobi.mobipalma.api.docs.EstadoEstacionResponse.class.equals(type)){
         
                 return mobi.mobipalma.api.docs.Anclajes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
             

         }
     
 } catch (java.lang.Exception e) {
 throw org.apache.axis2.AxisFault.makeFault(e);
 }
    return null;
 }





 private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
 org.apache.axis2.AxisFault f;
 Throwable cause = e.getCause();
 if (cause != null) {
     f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
 } else {
     f = new org.apache.axis2.AxisFault(e.getMessage());
 }

 return f;
}

 }//end of class
