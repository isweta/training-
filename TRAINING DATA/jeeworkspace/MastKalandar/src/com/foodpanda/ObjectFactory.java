
package com.foodpanda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.foodpanda package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcDiscount_QNAME = new QName("http://foodpanda.com/", "calcDiscount");
    private final static QName _CalcDiscountResponse_QNAME = new QName("http://foodpanda.com/", "calcDiscountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.foodpanda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcDiscountResponse }
     * 
     */
    public CalcDiscountResponse createCalcDiscountResponse() {
        return new CalcDiscountResponse();
    }

    /**
     * Create an instance of {@link CalcDiscount }
     * 
     */
    public CalcDiscount createCalcDiscount() {
        return new CalcDiscount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://foodpanda.com/", name = "calcDiscount")
    public JAXBElement<CalcDiscount> createCalcDiscount(CalcDiscount value) {
        return new JAXBElement<CalcDiscount>(_CalcDiscount_QNAME, CalcDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcDiscountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://foodpanda.com/", name = "calcDiscountResponse")
    public JAXBElement<CalcDiscountResponse> createCalcDiscountResponse(CalcDiscountResponse value) {
        return new JAXBElement<CalcDiscountResponse>(_CalcDiscountResponse_QNAME, CalcDiscountResponse.class, null, value);
    }

}
