
package org.librarypro.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idreservation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ouvrage" type="{model.webapp.librarypro.org}ouvrage" minOccurs="0"/>
 *         &lt;element name="reservationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="utilisateur" type="{model.webapp.librarypro.org}utilisateur" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "idreservation",
    "ouvrage",
    "reservationdate",
    "utilisateur"
})
public class Reservation {

    protected int idreservation;
    protected Ouvrage ouvrage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationdate;
    protected Utilisateur utilisateur;

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
     * Obtient la valeur de la propriété ouvrage.
     * 
     * @return
     *     possible object is
     *     {@link Ouvrage }
     *     
     */
    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    /**
     * Définit la valeur de la propriété ouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link Ouvrage }
     *     
     */
    public void setOuvrage(Ouvrage value) {
        this.ouvrage = value;
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
     * Obtient la valeur de la propriété utilisateur.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Définit la valeur de la propriété utilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setUtilisateur(Utilisateur value) {
        this.utilisateur = value;
    }

}
