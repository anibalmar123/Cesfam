
package org.datacontract.schemas._2004._07.cesfamnegocio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRelPaciente.PacienteTutor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRelPaciente.PacienteTutor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelPaciente.PacienteTutor" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}RelPaciente.PacienteTutor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRelPaciente.PacienteTutor", propOrder = {
    "relPacientePacienteTutor"
})
public class ArrayOfRelPacientePacienteTutor {

    @XmlElement(name = "RelPaciente.PacienteTutor", nillable = true)
    protected List<RelPacientePacienteTutor> relPacientePacienteTutor;

    /**
     * Gets the value of the relPacientePacienteTutor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relPacientePacienteTutor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelPacientePacienteTutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelPacientePacienteTutor }
     * 
     * 
     */
    public List<RelPacientePacienteTutor> getRelPacientePacienteTutor() {
        if (relPacientePacienteTutor == null) {
            relPacientePacienteTutor = new ArrayList<RelPacientePacienteTutor>();
        }
        return this.relPacientePacienteTutor;
    }

}
