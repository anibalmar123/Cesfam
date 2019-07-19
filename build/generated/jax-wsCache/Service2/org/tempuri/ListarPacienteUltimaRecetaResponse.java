
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPacientePacienteUltimaReceta;


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
 *         &lt;element name="listarPacienteUltimaRecetaResult" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}ArrayOfPaciente.PacienteUltimaReceta" minOccurs="0"/&gt;
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
    "listarPacienteUltimaRecetaResult"
})
@XmlRootElement(name = "listarPacienteUltimaRecetaResponse")
public class ListarPacienteUltimaRecetaResponse {

    @XmlElementRef(name = "listarPacienteUltimaRecetaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPacientePacienteUltimaReceta> listarPacienteUltimaRecetaResult;

    /**
     * Obtiene el valor de la propiedad listarPacienteUltimaRecetaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPacientePacienteUltimaReceta }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPacientePacienteUltimaReceta> getListarPacienteUltimaRecetaResult() {
        return listarPacienteUltimaRecetaResult;
    }

    /**
     * Define el valor de la propiedad listarPacienteUltimaRecetaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPacientePacienteUltimaReceta }{@code >}
     *     
     */
    public void setListarPacienteUltimaRecetaResult(JAXBElement<ArrayOfPacientePacienteUltimaReceta> value) {
        this.listarPacienteUltimaRecetaResult = value;
    }

}
