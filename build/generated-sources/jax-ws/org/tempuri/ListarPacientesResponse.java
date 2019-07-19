
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPaciente;


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
 *         &lt;element name="listarPacientesResult" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}ArrayOfPaciente" minOccurs="0"/&gt;
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
    "listarPacientesResult"
})
@XmlRootElement(name = "listarPacientesResponse")
public class ListarPacientesResponse {

    @XmlElementRef(name = "listarPacientesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaciente> listarPacientesResult;

    /**
     * Obtiene el valor de la propiedad listarPacientesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaciente> getListarPacientesResult() {
        return listarPacientesResult;
    }

    /**
     * Define el valor de la propiedad listarPacientesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}
     *     
     */
    public void setListarPacientesResult(JAXBElement<ArrayOfPaciente> value) {
        this.listarPacientesResult = value;
    }

}
