
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getByIdResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getByIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorByID" type="{http://alfasoft.it/authors}autore" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByIdResponse", propOrder = {
    "authorByID"
})
public class GetByIdResponse {

    protected Autore authorByID;

    /**
     * Recupera il valore della proprietà authorByID.
     * 
     * @return
     *     possible object is
     *     {@link Autore }
     *     
     */
    public Autore getAuthorByID() {
        return authorByID;
    }

    /**
     * Imposta il valore della proprietà authorByID.
     * 
     * @param value
     *     allowed object is
     *     {@link Autore }
     *     
     */
    public void setAuthorByID(Autore value) {
        this.authorByID = value;
    }

}
