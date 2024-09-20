
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per autore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="autore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cognomeAutore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idAutore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nomeAutore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autore", propOrder = {
    "cognomeAutore",
    "idAutore",
    "nomeAutore"
})
public class Autore {

    protected String cognomeAutore;
    protected Integer idAutore;
    protected String nomeAutore;

    /**
     * Recupera il valore della proprietà cognomeAutore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognomeAutore() {
        return cognomeAutore;
    }

    /**
     * Imposta il valore della proprietà cognomeAutore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognomeAutore(String value) {
        this.cognomeAutore = value;
    }

    /**
     * Recupera il valore della proprietà idAutore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAutore() {
        return idAutore;
    }

    /**
     * Imposta il valore della proprietà idAutore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAutore(Integer value) {
        this.idAutore = value;
    }

    /**
     * Recupera il valore della proprietà nomeAutore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAutore() {
        return nomeAutore;
    }

    /**
     * Imposta il valore della proprietà nomeAutore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAutore(String value) {
        this.nomeAutore = value;
    }

}
