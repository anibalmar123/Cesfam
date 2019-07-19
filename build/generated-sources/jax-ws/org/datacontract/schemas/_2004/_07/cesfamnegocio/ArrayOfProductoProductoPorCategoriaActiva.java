
package org.datacontract.schemas._2004._07.cesfamnegocio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfProducto.ProductoPorCategoriaActiva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProducto.ProductoPorCategoriaActiva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Producto.ProductoPorCategoriaActiva" type="{http://schemas.datacontract.org/2004/07/CesfamNegocio}Producto.ProductoPorCategoriaActiva" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProducto.ProductoPorCategoriaActiva", propOrder = {
    "productoProductoPorCategoriaActiva"
})
public class ArrayOfProductoProductoPorCategoriaActiva {

    @XmlElement(name = "Producto.ProductoPorCategoriaActiva", nillable = true)
    protected List<ProductoProductoPorCategoriaActiva> productoProductoPorCategoriaActiva;

    /**
     * Gets the value of the productoProductoPorCategoriaActiva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productoProductoPorCategoriaActiva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductoProductoPorCategoriaActiva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoProductoPorCategoriaActiva }
     * 
     * 
     */
    public List<ProductoProductoPorCategoriaActiva> getProductoProductoPorCategoriaActiva() {
        if (productoProductoPorCategoriaActiva == null) {
            productoProductoPorCategoriaActiva = new ArrayList<ProductoProductoPorCategoriaActiva>();
        }
        return this.productoProductoPorCategoriaActiva;
    }

}
