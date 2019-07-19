
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfProductoProductoPorCategoriaActiva;


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
 *         &lt;element name="listarProductosPorCategoriaActivaResult" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}ArrayOfProducto.ProductoPorCategoriaActiva" minOccurs="0"/&gt;
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
    "listarProductosPorCategoriaActivaResult"
})
@XmlRootElement(name = "listarProductosPorCategoriaActivaResponse")
public class ListarProductosPorCategoriaActivaResponse {

    @XmlElementRef(name = "listarProductosPorCategoriaActivaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductoProductoPorCategoriaActiva> listarProductosPorCategoriaActivaResult;

    /**
     * Obtiene el valor de la propiedad listarProductosPorCategoriaActivaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductoProductoPorCategoriaActiva }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductoProductoPorCategoriaActiva> getListarProductosPorCategoriaActivaResult() {
        return listarProductosPorCategoriaActivaResult;
    }

    /**
     * Define el valor de la propiedad listarProductosPorCategoriaActivaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductoProductoPorCategoriaActiva }{@code >}
     *     
     */
    public void setListarProductosPorCategoriaActivaResult(JAXBElement<ArrayOfProductoProductoPorCategoriaActiva> value) {
        this.listarProductosPorCategoriaActivaResult = value;
    }

}
