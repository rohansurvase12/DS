
package com.myservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myservice package. 
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

    private final static QName _MtoK_QNAME = new QName("http://MyService.com/", "MtoK");
    private final static QName _MtoKResponse_QNAME = new QName("http://MyService.com/", "MtoKResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MtoK }
     * 
     */
    public MtoK createMtoK() {
        return new MtoK();
    }

    /**
     * Create an instance of {@link MtoKResponse }
     * 
     */
    public MtoKResponse createMtoKResponse() {
        return new MtoKResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtoK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyService.com/", name = "MtoK")
    public JAXBElement<MtoK> createMtoK(MtoK value) {
        return new JAXBElement<MtoK>(_MtoK_QNAME, MtoK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtoKResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyService.com/", name = "MtoKResponse")
    public JAXBElement<MtoKResponse> createMtoKResponse(MtoKResponse value) {
        return new JAXBElement<MtoKResponse>(_MtoKResponse_QNAME, MtoKResponse.class, null, value);
    }

}
