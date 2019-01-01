
package org.librarypro.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservationDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idreservation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ouvrageDTO" type="{model.webapp.librarypro.org}ouvrageDTO" minOccurs="0"/>
 *         &lt;element name="reservationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="utilisateurDTO" type="{model.webapp.librarypro.org}utilisateurDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationDTO", propOrder = {
    "idreservation",
    "ouvrageDTO",
    "reservationdate",
    "utilisateurDTO"
})
public class ReservationDTO {

    protected int idreservation;
    protected OuvrageDTO ouvrageDTO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationdate;
    protected UtilisateurDTO utilisateurDTO;

    /**
     * Obtient la valeur de la propriété idreservation.
     * 
     */
    public int getIdreservation() {
        return idreservation;
    }

    /**
     * Définit la valeur de la propriété idreservation.
     * 
     */
    public void setIdreservation(int value) {
        this.idreservation = value;
    }

    /**
     * Obtient la valeur de la propriété ouvrageDTO.
     * 
     * @return
     *     possible object is
     *     {@link OuvrageDTO }
     *     
     */
    public OuvrageDTO getOuvrageDTO() {
        return ouvrageDTO;
    }

    /**
     * Définit la valeur de la propriété ouvrageDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link OuvrageDTO }
     *     
     */
    public void setOuvrageDTO(OuvrageDTO value) {
        this.ouvrageDTO = value;
    }

    /**
     * Obtient la valeur de la propriété reservationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationdate() {
        return reservationdate;
    }

    /**
     * Définit la valeur de la propriété reservationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationdate(XMLGregorianCalendar value) {
        this.reservationdate = value;
    }

    /**
     * Obtient la valeur de la propriété utilisateurDTO.
     * 
     * @return
     *     possible object is
     *     {@link UtilisateurDTO }
     *     
     */
    public UtilisateurDTO getUtilisateurDTO() {
        return utilisateurDTO;
    }

    /**
     * Définit la valeur de la propriété utilisateurDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilisateurDTO }
     *     
     */
    public void setUtilisateurDTO(UtilisateurDTO value) {
        this.utilisateurDTO = value;
    }

}
