
package org.datacontract.schemas._2004._07.cesfamnegocio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RelPaciente.PacienteTutor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelPaciente.PacienteTutor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombrePaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreTutor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rutPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelPaciente.PacienteTutor", propOrder = {
    "nombrePaciente",
    "nombreTutor",
    "rutPaciente"
})
public class RelPacientePacienteTutor {

    @XmlElementRef(name = "nombrePaciente", namespace = "http://schemas.datacontract.org/2004/07/CesfamNegocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePaciente;
    @XmlElementRef(name = "nombreTutor", namespace = "http://schemas.datacontract.org/2004/07/CesfamNegocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreTutor;
    @XmlElementRef(name = "rutPaciente", namespace = "http://schemas.datacontract.org/2004/07/CesfamNegocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rutPaciente;

    /**
     * Obtiene el valor de la propiedad nombrePaciente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * Define el valor de la propiedad nombrePaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePaciente(JAXBElement<String> value) {
        this.nombrePaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTutor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreTutor() {
        return nombreTutor;
    }

    /**
     * Define el valor de la propiedad nombreTutor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreTutor(JAXBElement<String> value) {
        this.nombreTutor = value;
    }

    /**
     * Obtiene el valor de la propiedad rutPaciente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRutPaciente() {
        return rutPaciente;
    }

    /**
     * Define el valor de la propiedad rutPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRutPaciente(JAXBElement<String> value) {
        this.rutPaciente = value;
    }

}
