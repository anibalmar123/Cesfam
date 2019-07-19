
package org.datacontract.schemas._2004._07.cesfamnegocio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPaciente.PacienteUltimaReceta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaciente.PacienteUltimaReceta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paciente.PacienteUltimaReceta" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}Paciente.PacienteUltimaReceta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaciente.PacienteUltimaReceta", propOrder = {
    "pacientePacienteUltimaReceta"
})
public class ArrayOfPacientePacienteUltimaReceta {

    @XmlElement(name = "Paciente.PacienteUltimaReceta", nillable = true)
    protected List<PacientePacienteUltimaReceta> pacientePacienteUltimaReceta;

    /**
     * Gets the value of the pacientePacienteUltimaReceta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pacientePacienteUltimaReceta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacientePacienteUltimaReceta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacientePacienteUltimaReceta }
     * 
     * 
     */
    public List<PacientePacienteUltimaReceta> getPacientePacienteUltimaReceta() {
        if (pacientePacienteUltimaReceta == null) {
            pacientePacienteUltimaReceta = new ArrayList<PacientePacienteUltimaReceta>();
        }
        return this.pacientePacienteUltimaReceta;
    }

}
