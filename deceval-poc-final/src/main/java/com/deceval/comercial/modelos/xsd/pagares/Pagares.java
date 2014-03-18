
package com.deceval.comercial.modelos.xsd.pagares;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pagare" type="{http://www.deceval.com/comercial/modelos/xsd/Pagares}PagareType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pagare"
})
@XmlRootElement(name = "Pagares")
public class Pagares {

    @XmlElement(name = "Pagare", required = true)
    protected List<PagareType> pagare;

    /**
     * Gets the value of the pagare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagareType }
     * 
     * 
     */
    public List<PagareType> getPagare() {
        if (pagare == null) {
            pagare = new ArrayList<PagareType>();
        }
        return this.pagare;
    }

}
