package co.com.deceval.tecnologia.auditoria.util.auditoria;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria.AuditoriaType;
import co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria.ResultadoAuditoriaType;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 *
 */
@WebService(name = "AuditoriaPortType", targetNamespace = "http://www.deceval.com.co/tecnologia/auditoria/util/Auditoria")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria.ObjectFactory.class,
    com.deceval.comunes.modelos.xsd.encabezados.ObjectFactory.class,
    com.deceval.comunes.modelos.xsd.errores.ObjectFactory.class
})
public interface AuditoriaPortType {

    /**
     *
     * @param auditoria
     * @return returns
     * co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria.ResultadoAuditoriaType
     * @throws MensajeError
     */
    @WebMethod(operationName = "Auditar", action = "Auditar")
    @WebResult(name = "ResultadoAuditoria", targetNamespace = "http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria", partName = "ResultadoAuditoria")
    public ResultadoAuditoriaType auditar(
            @WebParam(name = "Auditoria", targetNamespace = "http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria", partName = "Auditoria") AuditoriaType auditoria)
            throws MensajeError;
}
