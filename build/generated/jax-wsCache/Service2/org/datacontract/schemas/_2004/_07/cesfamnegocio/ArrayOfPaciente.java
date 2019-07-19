
package org.datacontract.schemas._2004._07.cesfamnegocio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPaciente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaciente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paciente" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}Paciente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaciente", propOrder = {
    "paciente"
})
public class ArrayOfPaciente {

    @XmlElement(name = "Paciente", nillable = true)
    protected List<Paciente> paciente;

    /**
     * Gets the value of the paciente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paciente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaciente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paciente }
     * 
     * 
     */
    public List<Paciente> getPaciente() {
        if (paciente == null) {
            paciente = new ArrayList<Paciente>();
        }
        return this.paciente;
    }

}
