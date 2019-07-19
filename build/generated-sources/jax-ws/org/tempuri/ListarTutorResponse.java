
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfTutor;


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
 *         &lt;element name="listarTutorResult" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}ArrayOfTutor" minOccurs="0"/&gt;
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
    "listarTutorResult"
})
@XmlRootElement(name = "listarTutorResponse")
public class ListarTutorResponse {

    @XmlElementRef(name = "listarTutorResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTutor> listarTutorResult;

    /**
     * Obtiene el valor de la propiedad listarTutorResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTutor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTutor> getListarTutorResult() {
        return listarTutorResult;
    }

    /**
     * Define el valor de la propiedad listarTutorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTutor }{@code >}
     *     
     */
    public void setListarTutorResult(JAXBElement<ArrayOfTutor> value) {
        this.listarTutorResult = value;
    }

}
