
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createAuthors complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createAuthors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autore" type="{http://alfasoft.it/authors}autore" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAuthors", propOrder = {
    "autore"
})
public class CreateAuthors {

    protected Autore autore;

    /**
     * Recupera il valore della proprietà autore.
     * 
     * @return
     *     possible object is
     *     {@link Autore }
     *     
     */
    public Autore getAutore() {
        return autore;
    }

    /**
     * Imposta il valore della proprietà autore.
     * 
     * @param value
     *     allowed object is
     *     {@link Autore }
     *     
     */
    public void setAutore(Autore value) {
        this.autore = value;
    }

}
