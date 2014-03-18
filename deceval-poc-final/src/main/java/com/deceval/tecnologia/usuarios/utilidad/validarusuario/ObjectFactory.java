
package com.deceval.tecnologia.usuarios.utilidad.validarusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.deceval.tecnologia.usuarios.utilidad.validarusuario package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UsuarioValidar_QNAME = new QName("http://www.deceval.com/tecnologia/usuarios/utilidad/ValidarUsuario", "UsuarioValidar");
    private final static QName _UsuarioValidarResponse_QNAME = new QName("http://www.deceval.com/tecnologia/usuarios/utilidad/ValidarUsuario", "UsuarioValidarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.deceval.tecnologia.usuarios.utilidad.validarusuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsuarioValidarResponse }
     * 
     */
    public UsuarioValidarResponse createUsuarioValidarResponse() {
        return new UsuarioValidarResponse();
    }

    /**
     * Create an instance of {@link UsuarioValidar }
     * 
     */
    public UsuarioValidar createUsuarioValidar() {
        return new UsuarioValidar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioValidar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/tecnologia/usuarios/utilidad/ValidarUsuario", name = "UsuarioValidar")
    public JAXBElement<UsuarioValidar> createUsuarioValidar(UsuarioValidar value) {
        return new JAXBElement<UsuarioValidar>(_UsuarioValidar_QNAME, UsuarioValidar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioValidarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/tecnologia/usuarios/utilidad/ValidarUsuario", name = "UsuarioValidarResponse")
    public JAXBElement<UsuarioValidarResponse> createUsuarioValidarResponse(UsuarioValidarResponse value) {
        return new JAXBElement<UsuarioValidarResponse>(_UsuarioValidarResponse_QNAME, UsuarioValidarResponse.class, null, value);
    }

}
