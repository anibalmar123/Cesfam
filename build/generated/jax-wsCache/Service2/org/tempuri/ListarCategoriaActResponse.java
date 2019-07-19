
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfCategoria;


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
 *         &lt;element name="listarCategoriaActResult" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}ArrayOfCategoria" minOccurs="0"/&gt;
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
    "listarCategoriaActResult"
})
@XmlRootElement(name = "listarCategoriaActResponse")
public class ListarCategoriaActResponse {

    @XmlElementRef(name = "listarCategoriaActResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCategoria> listarCategoriaActResult;

    /**
     * Obtiene el valor de la propiedad listarCategoriaActResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoria }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCategoria> getListarCategoriaActResult() {
        return listarCategoriaActResult;
    }

    /**
     * Define el valor de la propiedad listarCategoriaActResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoria }{@code >}
     *     
     */
    public void setListarCategoriaActResult(JAXBElement<ArrayOfCategoria> value) {
        this.listarCategoriaActResult = value;
    }

}
