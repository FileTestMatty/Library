
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per find complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="find"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorsByObject" type="{http://alfasoft.it/authors}autore" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "find", propOrder = {
    "authorsByObject"
})
public class Find {

    protected Autore authorsByObject;

    /**
     * Recupera il valore della proprietà authorsByObject.
     * 
     * @return
     *     possible object is
     *     {@link Autore }
     *     
     */
    public Autore getAuthorsByObject() {
        return authorsByObject;
    }

    /**
     * Imposta il valore della proprietà authorsByObject.
     * 
     * @param value
     *     allowed object is
     *     {@link Autore }
     *     
     */
    public void setAuthorsByObject(Autore value) {
        this.authorsByObject = value;
    }

}
