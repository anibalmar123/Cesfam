
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cesfamnegocio.Usuario;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enviarDatosUsuarioResult" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}Usuario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enviarDatosUsuarioResult"
})
@XmlRootElement(name = "enviarDatosUsuarioResponse")
public class EnviarDatosUsuarioResponse {

    @XmlElementRef(name = "enviarDatosUsuarioResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Usuario> enviarDatosUsuarioResult;

    /**
     * Obtiene el valor de la propiedad enviarDatosUsuarioResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     *     
     */
    public JAXBElement<Usuario> getEnviarDatosUsuarioResult() {
        return enviarDatosUsuarioResult;
    }

    /**
     * Define el valor de la propiedad enviarDatosUsuarioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     *     
     */
    public void setEnviarDatosUsuarioResult(JAXBElement<Usuario> value) {
        this.enviarDatosUsuarioResult = value;
    }

}
