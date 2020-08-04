package ec.edu.ups.exm.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-08-03T22:41:04.996-05:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://services.exm.ups.edu.ec/", name = "ServicesSOAP")
@XmlSeeAlso({ObjectFactory.class})
public interface ServicesSOAP {

    @WebMethod
    @RequestWrapper(localName = "crearProducto", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.CrearProducto")
    @ResponseWrapper(localName = "crearProductoResponse", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.CrearProductoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String crearProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.exm.services.Producto arg0
    );

    @WebMethod
    @RequestWrapper(localName = "miCarrito", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.MiCarrito")
    @ResponseWrapper(localName = "miCarritoResponse", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.MiCarritoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ec.edu.ups.exm.services.Carro> miCarrito(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "listaProductos", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.ListaProductos")
    @ResponseWrapper(localName = "listaProductosResponse", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.ListaProductosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ec.edu.ups.exm.services.Producto> listaProductos();

    @WebMethod
    @RequestWrapper(localName = "addCarrito", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.AddCarrito")
    @ResponseWrapper(localName = "addCarritoResponse", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.AddCarritoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String addCarrito(
        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.exm.services.Carro arg0
    );

    @WebMethod
    @RequestWrapper(localName = "llenarCarrito", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.LlenarCarrito")
    @ResponseWrapper(localName = "llenarCarritoResponse", targetNamespace = "http://services.exm.ups.edu.ec/", className = "ec.edu.ups.exm.services.LlenarCarritoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String llenarCarrito(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<ec.edu.ups.exm.services.Carro> arg0
    );
}