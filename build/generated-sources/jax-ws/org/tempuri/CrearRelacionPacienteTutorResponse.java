
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="crearRelacionPacienteTutorResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "crearRelacionPacienteTutorResult"
})
@XmlRootElement(name = "crearRelacionPacienteTutorResponse")
public class CrearRelacionPacienteTutorResponse {

    protected Boolean crearRelacionPacienteTutorResult;

    /**
     * Obtiene el valor de la propiedad crearRelacionPacienteTutorResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrearRelacionPacienteTutorResult() {
        return crearRelacionPacienteTutorResult;
    }

    /**
     * Define el valor de la propiedad crearRelacionPacienteTutorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrearRelacionPacienteTutorResult(Boolean value) {
        this.crearRelacionPacienteTutorResult = value;
    }

}
