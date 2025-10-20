/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleciones;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Coleciones {
    public static void main(String[] args) {
        System.out.println("=== demo sistema de stock ===");
        runstockdemo();
        System.out.println("\n=== demo biblioteca ===");
        runbibliotecademo();
        System.out.println("\n=== demo universidad ===");
        rununiversidaddemo();
    }

    public static void runstockdemo() {
        inventario inventario = new inventario();
        producto p1 = new producto("P001", "arroz 1kg", 850.0, 30, categoriaproducto.alimentos);
        producto p2 = new producto("P002", "auriculares bt", 2500.0, 12, categoriaproducto.electronica);
        producto p3 = new producto("P003", "remera lisa", 1200.0, 40, categoriaproducto.ropa);
        producto p4 = new producto("P004", "set de ollas", 4500.0, 5, categoriaproducto.hogar);
        producto p5 = new producto("P005", "fideo 500g", 480.0, 60, categoriaproducto.alimentos);
        inventario.agregarproducto(p1);
        inventario.agregarproducto(p2);
        inventario.agregarproducto(p3);
        inventario.agregarproducto(p4);
        inventario.agregarproducto(p5);
        System.out.println("-- listado completo de productos --");
        inventario.listarproductos();
        System.out.println("\n-- buscar producto por id p003 --");
        producto buscado = inventario.buscarproductoporid("P003");
        if (buscado != null) buscado.mostrarinfo();
        System.out.println("\n-- filtrar por categoria alimentos --");
        List<producto> alimentos = inventario.filtrarporcategoria(categoriaproducto.alimentos);
        alimentos.forEach(producto::mostrarinfo);
        System.out.println("\n-- eliminar producto p002 --");
        inventario.eliminarproducto("P002");
        inventario.listarproductos();
        System.out.println("\n-- actualizar stock de p001 a 50 --");
        inventario.actualizarstock("P001", 50);
        System.out.println(inventario.buscarproductoporid("P001"));
        System.out.println("\n-- total de stock disponible --");
        System.out.println(inventario.obtenertotalstock());
        System.out.println("\n-- producto con mayor stock --");
        producto mayor = inventario.obtenerproductoconmayorstock();
        if (mayor != null) mayor.mostrarinfo();
        System.out.println("\n-- filtrar productos entre $1000 y $3000 --");
        List<producto> rangoprecio = inventario.filtrarproductosporprecio(1000.0, 3000.0);
        rangoprecio.forEach(producto::mostrarinfo);
        System.out.println("\n-- categorias disponibles --");
        inventario.mostrarcategoriasdisponibles();
    }

    static class producto {
        private String id;
        private String nombre;
        private double precio;
        private int cantidad;
        private categoriaproducto categoria;
        public producto(String id, String nombre, double precio, int cantidad, categoriaproducto categoria) {
            this.id = id; this.nombre = nombre; this.precio = precio; this.cantidad = cantidad; this.categoria = categoria;
        }
        public String getId() { return id; }
        public double getprecio() { return precio; }
        public int getcantidad() { return cantidad; }
        public categoriaproducto getcategoria() { return categoria; }
        public void setcantidad(int cantidad) { this.cantidad = cantidad; }
        public void mostrarinfo() { System.out.println(this); }
        public String toString() {
            return String.format("producto[id=%s nombre=%s precio=%.2f cantidad=%d categoria=%s]",
                        id, nombre, precio, cantidad, categoria);
        }
    }

    public enum categoriaproducto {
        alimentos("productos comestibles"), electronica("dispositivos electronicos"),
        ropa("prendas de vestir"), hogar("articulos para el hogar");
        private final String descripcion;
        categoriaproducto(String descripcion) { this.descripcion = descripcion; }
        public String getdescripcion() { return descripcion; }
    }

    static class inventario {
        private ArrayList<producto> productos = new ArrayList<>();
        public void agregarproducto(producto p) { if (buscarproductoporid(p.getId()) == null) productos.add(p); }
        public void listarproductos() { productos.forEach(producto::mostrarinfo); }
        public producto buscarproductoporid(String id) {
            for (producto p : productos) if (p.getId().equals(id)) return p;
            return null;
        }
        public boolean eliminarproducto(String id) {
            producto p = buscarproductoporid(id);
            if (p != null) return productos.remove(p);
            return false;
        }
        public boolean actualizarstock(String id, int nuevacantidad) {
            producto p = buscarproductoporid(id);
            if (p != null) { p.setcantidad(nuevacantidad); return true; }
            return false;
        }
        public List<producto> filtrarporcategoria(categoriaproducto c) {
            return productos.stream().filter(p -> p.getcategoria() == c).collect(Collectors.toList());
        }
        public int obtenertotalstock() { return productos.stream().mapToInt(producto::getcantidad).sum(); }
        public producto obtenerproductoconmayorstock() {
            Optional<producto> max = productos.stream().max(Comparator.comparingInt(producto::getcantidad));
            return max.orElse(null);
        }
        public List<producto> filtrarproductosporprecio(double min, double max) {
            return productos.stream().filter(p -> p.getprecio() >= min && p.getprecio() <= max)
                        .collect(Collectors.toList());
        }
        public void mostrarcategoriasdisponibles() {
            for (categoriaproducto c : categoriaproducto.values())
                System.out.printf("%s - %s%n", c.name(), c.getdescripcion());
        }
    }

    public static void runbibliotecademo() {
        biblioteca biblio = new biblioteca("biblioteca central");
        autor a1 = new autor("A001", "gabriel garcia marquez", "colombiana");
        autor a2 = new autor("A002", "jorge luis borges", "argentina");
        autor a3 = new autor("A003", "isabel allende", "chilena");
        biblio.agregarlibro("ISBN001", "cien anos de soledad", 1967, a1);
        biblio.agregarlibro("ISBN002", "el aleph", 1949, a2);
        biblio.agregarlibro("ISBN003", "la casa de los espiritus", 1982, a3);
        biblio.agregarlibro("ISBN004", "del amor y otros demonios", 1994, a1);
        biblio.agregarlibro("ISBN005", "ficciones", 1944, a2);
        System.out.println("-- listado de libros --");
        biblio.listarlibros();
        System.out.println("\n-- buscar libro por isbn 'ISBN003' --");
        libro encontrado = biblio.buscarlibroporisbn("ISBN003");
        if (encontrado != null) encontrado.mostrarinfo();
        System.out.println("\n-- filtrar libros publicados en 1949 --");
        List<libro> anio1949 = biblio.filtrarlibrosporanio(1949);
        anio1949.forEach(libro::mostrarinfo);
        System.out.println("\n-- eliminar libro isbn004 --");
        biblio.eliminarlibro("ISBN004");
        biblio.listarlibros();
        System.out.println("\n-- cantidad total de libros --");
        System.out.println(biblio.obtenercantidadlibros());
        System.out.println("\n-- autores disponibles --");
        biblio.mostrarautoresdisponibles();
    }

    static class autor {
        private String id, nombre, nacionalidad;
        public autor(String id, String nombre, String nacionalidad) {
            this.id = id; this.nombre = nombre; this.nacionalidad = nacionalidad;
        }
        public String getId() { return id; }
        public String getnombre() { return nombre; }
        public void mostrarinfo() { System.out.println(this); }
        public String toString() { return String.format("autor[id=%s nombre=%s nacionalidad=%s]", id, nombre, nacionalidad); }
        public boolean equals(Object o) { return o instanceof autor && id.equals(((autor) o).id); }
        public int hashCode() { return id.hashCode(); }
    }

    static class libro {
        private String isbn, titulo; private int aniopublicacion; private autor autor;
        public libro(String isbn, String titulo, int anio, autor autor) {
            this.isbn = isbn; this.titulo = titulo; this.aniopublicacion = anio; this.autor = autor;
        }
        public String getisbn() { return isbn; }
        public int getaniopublicacion() { return aniopublicacion; }
        public autor getautor() { return autor; }
        public void mostrarinfo() {
            System.out.printf("libro[isbn=%s titulo=%s anio=%d autor=%s]%n",
                        isbn, titulo, aniopublicacion, autor.getnombre());
        }
    }

    static class biblioteca {
        private String nombre; private List<libro> libros = new ArrayList<>();
        public biblioteca(String nombre) { this.nombre = nombre; }
        public void agregarlibro(String isbn, String titulo, int anio, autor autor) {
            if (buscarlibroporisbn(isbn) == null) libros.add(new libro(isbn, titulo, anio, autor));
        }
        public void listarlibros() { libros.forEach(libro::mostrarinfo); }
        public libro buscarlibroporisbn(String isbn) {
            for (libro l : libros) if (l.getisbn().equals(isbn)) return l; return null;
        }
        public boolean eliminarlibro(String isbn) {
            libro l = buscarlibroporisbn(isbn); if (l != null) return libros.remove(l); return false;
        }
        public int obtenercantidadlibros() { return libros.size(); }
        public List<libro> filtrarlibrosporanio(int anio) {
            return libros.stream().filter(l -> l.getaniopublicacion() == anio).collect(Collectors.toList());
        }
        public void mostrarautoresdisponibles() {
            libros.stream().map(libro::getautor).distinct().forEach(autor::mostrarinfo);
        }
    }

    public static void rununiversidaddemo() {
        universidad uni = new universidad("universidad nacional");
        profesor p1 = new profesor("PR01", "ana lopez", "matematica");
        profesor p2 = new profesor("PR02", "carlos ruiz", "programacion");
        profesor p3 = new profesor("PR03", "maria gomez", "fisica");
        curso c1 = new curso("C101", "algebra i");
        curso c2 = new curso("C102", "programacion i");
        curso c3 = new curso("C103", "fisica i");
        curso c4 = new curso("C104", "estructuras de datos");
        curso c5 = new curso("C105", "calculo i");
        uni.agregarprofesor(p1); uni.agregarprofesor(p2); uni.agregarprofesor(p3);
        uni.agregarcurso(c1); uni.agregarcurso(c2); uni.agregarcurso(c3); uni.agregarcurso(c4); uni.agregarcurso(c5);
        uni.asignarprofesoracurso("C101", "PR01");
        uni.asignarprofesoracurso("C102", "PR02");
        uni.asignarprofesoracurso("C103", "PR03");
        uni.asignarprofesoracurso("C104", "PR02");
        uni.listarcursos();
        uni.listarprofesores();
        uni.asignarprofesoracurso("C101", "PR02");
        uni.eliminarcurso("C104");
        uni.eliminarprofesor("PR03");
        uni.reportecantidadcursosporprofesor();
    }

    static class profesor {
        private String id, nombre, especialidad; private List<curso> cursos = new ArrayList<>();
        public profesor(String id, String nombre, String especialidad) {
            this.id = id; this.nombre = nombre; this.especialidad = especialidad;
        }
        public String getId() { return id; }
        public String getnombre() { return nombre; }
        public void agregarcurso(curso c) {
            if (!cursos.contains(c)) { cursos.add(c); if (c.getprofesor() != this) c.setprofesor(this); }
        }
        public void eliminarcurso(curso c) {
            if (cursos.remove(c) && c.getprofesor() == this) c.setprofesor(null);
        }
        public void listarcursos() { cursos.forEach(c -> System.out.println(c.getcodigo() + " - " + c.getnombre())); }
        public void mostrarinfo() { System.out.printf("%s (%s): %d cursos%n", nombre, id, cursos.size()); }
    }

    static class curso {
        private String codigo, nombre; private profesor profesor;
        public curso(String codigo, String nombre) { this.codigo = codigo; this.nombre = nombre; }
        public String getcodigo() { return codigo; }
        public String getnombre() { return nombre; }
        public profesor getprofesor() { return profesor; }
        public void setprofesor(profesor p) {
            if (this.profesor == p) return;
            if (this.profesor != null) { profesor prev = this.profesor; this.profesor = null; prev.eliminarcurso(this); }
            this.profesor = p;
            if (p != null && !p.cursos.contains(this)) p.cursos.add(this);
        }
        public void mostrarinfo() {
            String n = (profesor == null) ? "sin profesor" : profesor.getnombre();
            System.out.printf("curso[%s - %s - %s]%n", codigo, nombre, n);
        }
    }

    static class universidad {
        private String nombre; private List<profesor> profesores = new ArrayList<>(); private List<curso> cursos = new ArrayList<>();
        public universidad(String nombre) { this.nombre = nombre; }
        public void agregarprofesor(profesor p) { if (buscarprofesorporid(p.getId()) == null) profesores.add(p); }
        public void agregarcurso(curso c) { if (buscarcursoporcodigo(c.getcodigo()) == null) cursos.add(c); }
        public void asignarprofesoracurso(String codigo, String id) {
            curso c = buscarcursoporcodigo(codigo); profesor p = buscarprofesorporid(id);
            if (c != null && p != null) c.setprofesor(p);
        }
        public void listarprofesores() { profesores.forEach(profesor::mostrarinfo); }
        public void listarcursos() { cursos.forEach(curso::mostrarinfo); }
        public profesor buscarprofesorporid(String id) {
            for (profesor p : profesores) if (p.getId().equals(id)) return p; return null;
        }
        public curso buscarcursoporcodigo(String cod) {
            for (curso c : cursos) if (c.getcodigo().equals(cod)) return c; return null;
        }
        public void eliminarcurso(String cod) {
            curso c = buscarcursoporcodigo(cod);
            if (c != null) { if (c.getprofesor() != null) c.setprofesor(null); cursos.remove(c); }
        }
        public void eliminarprofesor(String id) {
            profesor p = buscarprofesorporid(id);
            if (p != null) { List<curso> copia = new ArrayList<>(p.cursos); for (curso c : copia) p.eliminarcurso(c); profesores.remove(p); }
        }
        public void reportecantidadcursosporprofesor() { profesores.forEach(p -> p.mostrarinfo()); }
    }
}