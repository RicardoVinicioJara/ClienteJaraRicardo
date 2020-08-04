
package ec.edu.ups.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.exm.services package. 
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

    private final static QName _Producto_QNAME = new QName("http://services.exm.ups.edu.ec/", "producto");
    private final static QName _MiCarrito_QNAME = new QName("http://services.exm.ups.edu.ec/", "miCarrito");
    private final static QName _LlenarCarritoResponse_QNAME = new QName("http://services.exm.ups.edu.ec/", "llenarCarritoResponse");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://services.exm.ups.edu.ec/", "crearProductoResponse");
    private final static QName _MiCarritoResponse_QNAME = new QName("http://services.exm.ups.edu.ec/", "miCarritoResponse");
    private final static QName _CrearProducto_QNAME = new QName("http://services.exm.ups.edu.ec/", "crearProducto");
    private final static QName _ListaProductosResponse_QNAME = new QName("http://services.exm.ups.edu.ec/", "listaProductosResponse");
    private final static QName _Carro_QNAME = new QName("http://services.exm.ups.edu.ec/", "carro");
    private final static QName _ListaProductos_QNAME = new QName("http://services.exm.ups.edu.ec/", "listaProductos");
    private final static QName _LlenarCarrito_QNAME = new QName("http://services.exm.ups.edu.ec/", "llenarCarrito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.exm.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carro }
     * 
     */
    public Carro createCarro() {
        return new Carro();
    }

    /**
     * Create an instance of {@link ListaProductos }
     * 
     */
    public ListaProductos createListaProductos() {
        return new ListaProductos();
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link ListaProductosResponse }
     * 
     */
    public ListaProductosResponse createListaProductosResponse() {
        return new ListaProductosResponse();
    }

    /**
     * Create an instance of {@link LlenarCarrito }
     * 
     */
    public LlenarCarrito createLlenarCarrito() {
        return new LlenarCarrito();
    }

    /**
     * Create an instance of {@link MiCarrito }
     * 
     */
    public MiCarrito createMiCarrito() {
        return new MiCarrito();
    }

    /**
     * Create an instance of {@link LlenarCarritoResponse }
     * 
     */
    public LlenarCarritoResponse createLlenarCarritoResponse() {
        return new LlenarCarritoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link MiCarritoResponse }
     * 
     */
    public MiCarritoResponse createMiCarritoResponse() {
        return new MiCarritoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "miCarrito")
    public JAXBElement<MiCarrito> createMiCarrito(MiCarrito value) {
        return new JAXBElement<MiCarrito>(_MiCarrito_QNAME, MiCarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LlenarCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "llenarCarritoResponse")
    public JAXBElement<LlenarCarritoResponse> createLlenarCarritoResponse(LlenarCarritoResponse value) {
        return new JAXBElement<LlenarCarritoResponse>(_LlenarCarritoResponse_QNAME, LlenarCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "crearProductoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "miCarritoResponse")
    public JAXBElement<MiCarritoResponse> createMiCarritoResponse(MiCarritoResponse value) {
        return new JAXBElement<MiCarritoResponse>(_MiCarritoResponse_QNAME, MiCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "crearProducto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "listaProductosResponse")
    public JAXBElement<ListaProductosResponse> createListaProductosResponse(ListaProductosResponse value) {
        return new JAXBElement<ListaProductosResponse>(_ListaProductosResponse_QNAME, ListaProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Carro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "carro")
    public JAXBElement<Carro> createCarro(Carro value) {
        return new JAXBElement<Carro>(_Carro_QNAME, Carro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "listaProductos")
    public JAXBElement<ListaProductos> createListaProductos(ListaProductos value) {
        return new JAXBElement<ListaProductos>(_ListaProductos_QNAME, ListaProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LlenarCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.exm.ups.edu.ec/", name = "llenarCarrito")
    public JAXBElement<LlenarCarrito> createLlenarCarrito(LlenarCarrito value) {
        return new JAXBElement<LlenarCarrito>(_LlenarCarrito_QNAME, LlenarCarrito.class, null, value);
    }

}
