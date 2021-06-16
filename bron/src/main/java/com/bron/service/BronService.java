package com.bron.service;

import java.util.List;

import com.bron.model.AsignaProductoTienda;
import com.bron.model.Categoria;
import com.bron.model.Cliente;
import com.bron.model.Contacto;
import com.bron.model.DetalleProducto;
import com.bron.model.DetalleVenta;
import com.bron.model.Imagen;
import com.bron.model.Producto;
import com.bron.model.Queja;
import com.bron.model.Tienda;
import com.bron.model.Usuario;
import com.bron.model.Venta;

public interface BronService {
	
	/* Cliente */
	List<Cliente> listarCliente();
	
	Cliente authCliente(String username, String password);

	Cliente listarIdCliente(int id);

	Cliente addCliente(Cliente u);

	Cliente editCliente(Cliente u);

	Cliente deleteCliente(int id);
	
	
	/* Usuario */
	List<Usuario> listarUsuario();
	
	Usuario auth(String username, String password);
	
	Usuario listarIdUsuario(int id);

	Usuario addUsuario(Usuario u);

	Usuario editUsuario(Usuario u);

	Usuario deleteUsuario(int id);
	
	
	/* Categoria */
	List<Categoria> listarCategoria();

	Categoria listarIdCategoria(int id);

	Categoria addCategoria(Categoria u);

	Categoria editCategoria(Categoria u);

	Categoria deleteCategoria(int id);
	
	
	/* Producto */
	List<Producto> listarProducto();
	
	List<Producto> listarProductoxModelo(String modelo);
	
	List<Producto> listarProductoxCategoria(Categoria categoria);

	Producto listarIdProducto(int id);

	Producto addProducto(Producto u);

	Producto editProducto(Producto u);

	Producto deleteProducto(int id);
	
	
	/* DetalleProducto */
	List<DetalleProducto> listarDetalleProducto();
	
	List<DetalleProducto> getListaporIdProducto(int id);

	DetalleProducto listarIdDetalleProducto(int id);

	DetalleProducto addDetalleProducto(DetalleProducto u);

	DetalleProducto editDetalleProducto(DetalleProducto u);

	DetalleProducto deleteDetalleProducto(int id);
	
	
	/* Imagen */
	List<Imagen> listarImagen();
	
	List<Imagen> getListaImagenporIdProducto(int id);

	Imagen listarIdImagen(int id);

	Imagen addImagen(Imagen u);

	Imagen deleteImagen(int id);
	
	
	/* Venta */
	List<Venta> listarVenta();

	Venta listarIdVenta(int id);

	Venta addVenta(Venta u);
	
	Venta editVenta(Venta u);

	Venta deleteVenta(int id);
	
	
	/* DetalleVenta */
	List<DetalleVenta> listarDetalleVenta();
	
	List<DetalleVenta> getListaporIdVenta(int id);

	DetalleVenta listarIdDetalleVenta(int id);

	DetalleVenta addDetalleVenta(DetalleVenta u);
	
	DetalleVenta editDetalleVenta(DetalleVenta u);

	DetalleVenta deleteDetalleVenta(int id);
	
	
	/* Tienda */
	List<Tienda> listarTienda();

	Tienda listarIdTienda(int id);

	Tienda addTienda(Tienda u);
	
	Tienda editTienda(Tienda u);

	Tienda deleteTienda(int id);
	
	
	/* AsignaProductoTienda */
	List<AsignaProductoTienda> listarAsignaProductoTienda();
	
	List<AsignaProductoTienda> getListaporIdTienda(int id);
	
	List<AsignaProductoTienda> getListaAsignaporIdDetalleProducto(int id);

	AsignaProductoTienda listarIdAsignaProductoTienda(int id);

	AsignaProductoTienda addAsignaProductoTienda(AsignaProductoTienda u);
	
	AsignaProductoTienda editAsignaProductoTienda(AsignaProductoTienda u);

	AsignaProductoTienda deleteAsignaProductoTienda(int id);
	
	
	
	/* Queja */
	List<Queja> listarQueja();

	Queja listarIdQueja(int id);

	Queja addQueja(Queja u);
	
	Queja editQueja(Queja u);

	Queja deleteQueja(int id);
	
	
	/* Contacto */
	List<Contacto> listarContacto();

	Contacto listarIdContacto(int id);

	Contacto addContacto(Contacto u);
	
	Contacto editContacto(Contacto u);

	Contacto deleteContacto(int id);
}
