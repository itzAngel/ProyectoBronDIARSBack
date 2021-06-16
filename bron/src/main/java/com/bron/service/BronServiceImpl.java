package com.bron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bron.dao.AsignaProductoTiendaRepository;
import com.bron.dao.CategoriaRepository;
import com.bron.dao.ClienteRepository;
import com.bron.dao.ContactoRepository;
import com.bron.dao.DetalleProductoRepository;
import com.bron.dao.DetalleVentaRepository;
import com.bron.dao.ImagenRepository;
import com.bron.dao.ProductoRepository;
import com.bron.dao.QuejaRepository;
import com.bron.dao.TiendaRepository;
import com.bron.dao.UsuarioRepository;
import com.bron.dao.VentaRepository;
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
@Service
public class BronServiceImpl implements BronService{
	
	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private DetalleProductoRepository detalleProductoRepository;
	
	@Autowired
	private ImagenRepository imagenRepository;
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private DetalleVentaRepository detalleVentaRepository;
	
	@Autowired
	private TiendaRepository tiendaRepository;
	
	@Autowired
	private AsignaProductoTiendaRepository asignaProductoTiendaRepository;
	
	@Autowired
	private QuejaRepository quejaRepository;
	
	@Autowired
	private ContactoRepository contactoRepository;
	/* 
	 * 
	 * Cliente 
	 * 
	 * */
	
	@Override
	public List<Cliente> listarCliente() {
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente authCliente(String username, String password) {
		List<Cliente> lista = clienteRepository.findAll();
		for(Cliente u: lista) {
			if(u.getDni_cliente().equals(username)) {
				if(u.getContrasena().equals(password)) {
					return u;
				}
			}
		}
		return null;
	}

	@Override
	public Cliente listarIdCliente(int id) {
		return clienteRepository.findById(id);
	}

	@Override
	public Cliente addCliente(Cliente u) {
		return clienteRepository.save(u);
	}

	@Override
	public Cliente editCliente(Cliente u) {
		return clienteRepository.save(u);
	}

	@Override
	public Cliente deleteCliente(int id) {
		Cliente agente = listarIdCliente(id);
		clienteRepository.delete(agente);
		return agente;
	}
	
	
	/* 
	 * 
	 * Usuario 
	 * 
	 * */
	
	@Override
	public List<Usuario> listarUsuario() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario listarIdUsuario(int id) {
		return usuarioRepository.findById(id);
	}
	
	@Override
	public Usuario auth(String username, String password) {
		List<Usuario> lista = usuarioRepository.findAll();
		for(Usuario u: lista) {
			if(u.getDni_usuario().equals(username)) {
				if(u.getContrasena().equals(password)) {
					return u;
				}
			}
		}
		return null;
	}

	@Override
	public Usuario addUsuario(Usuario u) {
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario editUsuario(Usuario u) {
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario deleteUsuario(int id) {
		Usuario agente = listarIdUsuario(id);
		usuarioRepository.delete(agente);
		return agente;
	}
	
	
	
	/* 
	 * 
	 * Categoria 
	 * 
	 * */
	
	@Override
	public List<Categoria> listarCategoria() {
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria listarIdCategoria(int id) {
		return categoriaRepository.findById(id);
	}

	@Override
	public Categoria addCategoria(Categoria u) {
		return categoriaRepository.save(u);
	}

	@Override
	public Categoria editCategoria(Categoria u) {
		return categoriaRepository.save(u);
	}

	@Override
	public Categoria deleteCategoria(int id) {
		Categoria agente = listarIdCategoria(id);
		categoriaRepository.delete(agente);
		return agente;
	}
	
	
	
	/* 
	 * 
	 * Producto 
	 * 
	 * */
	
	@Override
	public List<Producto> listarProducto() {
		return productoRepository.findAll();
	}
	
	@Override
	public List<Producto> listarProductoxModelo(String modelo){
		return productoRepository.findByModeloContaining(modelo);
	}
	
	@Override
	public List<Producto> listarProductoxCategoria(Categoria categoria){
		return productoRepository.findByCategoria(categoria);
	}
	
	@Override
	public Producto listarIdProducto(int id) {
		return productoRepository.findById(id);
	}
	
	@Override
	public Producto addProducto(Producto u) {
		return productoRepository.save(u);
	}

	@Override
	public Producto editProducto(Producto u) {
		return productoRepository.save(u);
	}

	@Override
	public Producto deleteProducto(int id) {
		Producto agente = listarIdProducto(id);
		productoRepository.delete(agente);
		return agente;
	}
	
	
	
	
	
	/* 
	 * 
	 * DetalleProducto 
	 * 
	 * */
	
	
	@Override
	public List<DetalleProducto> listarDetalleProducto() {
		return detalleProductoRepository.findAll();
	}
	
	@Override
	public List<DetalleProducto> getListaporIdProducto(int id) {
		List<DetalleProducto> lista = detalleProductoRepository.findAll();
		List<DetalleProducto> resultado = new ArrayList<DetalleProducto>();
		for(DetalleProducto v : lista) {
			if(v.getProducto().getId_producto() == id) {
				resultado.add(v);
			}
		}
		return resultado;
	}
	
	@Override
	public DetalleProducto listarIdDetalleProducto(int id) {
		return detalleProductoRepository.findById(id);
	}
	
	@Override
	public DetalleProducto addDetalleProducto(DetalleProducto u) {
		return detalleProductoRepository.save(u);
	}

	@Override
	public DetalleProducto editDetalleProducto(DetalleProducto u) {
		return detalleProductoRepository.save(u);
	}

	@Override
	public DetalleProducto deleteDetalleProducto(int id) {
		DetalleProducto a = listarIdDetalleProducto(id);
		detalleProductoRepository.delete(a);
		return a;
	}
	
	
	
	
	
	/* 
	 * 
	 * Imagen 
	 * 
	 * */
	
	
	@Override
	public List<Imagen> listarImagen() {
		return imagenRepository.findAll();
	}
	
	@Override
	public List<Imagen> getListaImagenporIdProducto(int id) {
		List<Imagen> lista = imagenRepository.findAll();
		List<Imagen> resultado = new ArrayList<Imagen>();
		for(Imagen v : lista) {
			if(v.getProducto().getId_producto() == id) {
				resultado.add(v);
			}
		}
		return resultado;
	}
	
	@Override
	public Imagen listarIdImagen(int id) {
		return imagenRepository.findById(id);
	}
	
	@Override
	public Imagen addImagen(Imagen u) {
		return imagenRepository.save(u);
	}


	@Override
	public Imagen deleteImagen(int id) {
		Imagen a = listarIdImagen(id);
		imagenRepository.delete(a);
		return a;
	}
	
	
	/* 
	 * 
	 * Venta 
	 * 
	 * */
	
	
	@Override
	public List<Venta> listarVenta() {
		return ventaRepository.findAll();
	}
	
	@Override
	public Venta listarIdVenta(int id) {
		return ventaRepository.findById(id);
	}
	
	@Override
	public Venta addVenta(Venta u) {
		return ventaRepository.save(u);
	}

	@Override
	public Venta editVenta(Venta u) {
		return ventaRepository.save(u);
	}
	
	@Override
	public Venta deleteVenta(int id) {
		Venta a = listarIdVenta(id);
		ventaRepository.delete(a);
		return a;
	}
	
	
	/* 
	 * 
	 * DetalleVenta 
	 * 
	 * */
	
	
	@Override
	public List<DetalleVenta> listarDetalleVenta() {
		return detalleVentaRepository.findAll();
	}
	
	@Override
	public List<DetalleVenta> getListaporIdVenta(int id) {
		List<DetalleVenta> lista = detalleVentaRepository.findAll();
		List<DetalleVenta> resultado = new ArrayList<DetalleVenta>();
		for(DetalleVenta v : lista) {
			if(v.getVenta().getId_venta() == id) {
				resultado.add(v);
			}
		}
		return resultado;
	}
	
	@Override
	public DetalleVenta listarIdDetalleVenta(int id) {
		return detalleVentaRepository.findById(id);
	}
	
	@Override
	public DetalleVenta addDetalleVenta(DetalleVenta u) {
		if(u.getAsignaProductoTienda().getCantidad() >= u.getCantidad()) {//cuando el stock es mayor que la compra que se hace
			u.getAsignaProductoTienda().setCantidad(u.getAsignaProductoTienda().getCantidad() - u.getCantidad());//resto la compra del stock
			editAsignaProductoTienda(u.getAsignaProductoTienda());//actualizo el stock
			return detalleVentaRepository.save(u);//creo el detalle de venta
		}else{//cuando el stock es mayor que la compra que se hace
			
		}
		return null;
	}
	
	@Override
	public DetalleVenta editDetalleVenta(DetalleVenta u) {
		return detalleVentaRepository.save(u);
	}

	@Override
	public DetalleVenta deleteDetalleVenta(int id) {
		DetalleVenta a = listarIdDetalleVenta(id);
		a.getAsignaProductoTienda().setCantidad(a.getAsignaProductoTienda().getCantidad() + a.getCantidad()); //devuelvo la cantidad comprada al stock cuando se elimina una compra
		editAsignaProductoTienda(a.getAsignaProductoTienda());//actualizo el 
		detalleVentaRepository.delete(a);
		return a;
	}
	
	
	
	/* 
	 * 
	 * Tienda 
	 * 
	 * */
	
	
	@Override
	public List<Tienda> listarTienda() {
		return tiendaRepository.findAll();
	}
	
	@Override
	public Tienda listarIdTienda(int id) {
		return tiendaRepository.findById(id);
	}
	
	@Override
	public Tienda addTienda(Tienda u) {
		return tiendaRepository.save(u);
	}
	
	@Override
	public Tienda editTienda(Tienda u) {
		return tiendaRepository.save(u);
	}

	@Override
	public Tienda deleteTienda(int id) {
		Tienda a = listarIdTienda(id);
		tiendaRepository.delete(a);
		return a;
	}
	
	
	/* 
	 * 
	 * AsignaProductoTienda 
	 * 
	 * */
	
	
	@Override
	public List<AsignaProductoTienda> listarAsignaProductoTienda() {
		return asignaProductoTiendaRepository.findAll();
	}
	
	@Override
	public List<AsignaProductoTienda> getListaporIdTienda(int id) {
		List<AsignaProductoTienda> lista = asignaProductoTiendaRepository.findAll();
		List<AsignaProductoTienda> resultado = new ArrayList<AsignaProductoTienda>();
		for(AsignaProductoTienda v : lista) {
			if(v.getTienda().getId_tienda() == id) {
				resultado.add(v);
			}
		}
		return resultado;
	}
	
	@Override
	public List<AsignaProductoTienda> getListaAsignaporIdDetalleProducto(int id) {
		List<AsignaProductoTienda> lista = asignaProductoTiendaRepository.findAll();
		List<AsignaProductoTienda> resultado = new ArrayList<AsignaProductoTienda>();
		for(AsignaProductoTienda v : lista) {
			if(v.getDetalleProducto().getId_detalle_producto() == id) {
				resultado.add(v);
			}
		}
		return resultado;
	}
	
	@Override
	public AsignaProductoTienda listarIdAsignaProductoTienda(int id) {
		return asignaProductoTiendaRepository.findById(id);
	}
	
	@Override
	public AsignaProductoTienda addAsignaProductoTienda(AsignaProductoTienda u) {
		return asignaProductoTiendaRepository.save(u);
	}
	
	@Override
	public AsignaProductoTienda editAsignaProductoTienda(AsignaProductoTienda u) {
		return asignaProductoTiendaRepository.save(u);
	}

	@Override
	public AsignaProductoTienda deleteAsignaProductoTienda(int id) {
		AsignaProductoTienda a = listarIdAsignaProductoTienda(id);
		asignaProductoTiendaRepository.delete(a);
		return a;
	}
	
	
	/* 
	 * 
	 * Queja 
	 * 
	 * */
	
	
	@Override
	public List<Queja> listarQueja() {
		return quejaRepository.findAll();
	}
	
	@Override
	public Queja listarIdQueja(int id) {
		return quejaRepository.findById(id);
	}
	
	@Override
	public Queja addQueja(Queja u) {
		return quejaRepository.save(u);
	}
	
	@Override
	public Queja editQueja(Queja u) {
		return quejaRepository.save(u);
	}

	@Override
	public Queja deleteQueja(int id) {
		Queja a = listarIdQueja(id);
		quejaRepository.delete(a);
		return a;
	}
	
	
	/* 
	 * 
	 * Contacto 
	 * 
	 * */
	
	
	@Override
	public List<Contacto> listarContacto() {
		return contactoRepository.findAll();
	}
	
	@Override
	public Contacto listarIdContacto(int id) {
		return contactoRepository.findById(id);
	}
	
	@Override
	public Contacto addContacto(Contacto u) {
		return contactoRepository.save(u);
	}
	
	@Override
	public Contacto editContacto(Contacto u) {
		return contactoRepository.save(u);
	}

	@Override
	public Contacto deleteContacto(int id) {
		Contacto a = listarIdContacto(id);
		contactoRepository.delete(a);
		return a;
	}
}
