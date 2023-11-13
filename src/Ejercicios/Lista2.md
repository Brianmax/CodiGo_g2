# Ejercicio de Creación de Base de Datos para un Sistema de Blog

## Objetivo

Diseñar y crear una base de datos para un sistema de blog donde los usuarios puedan crear posts, comentar en ellos y utilizar funcionalidades adicionales.

## Entidades Principales

1. **Usuario**: Personas que pueden crear publicaciones y comentarios.
2. **Post**: Publicaciones realizadas por los usuarios.
3. **Comentario**: Comentarios realizados en los posts.
4. **Categoría**: Categorías para clasificar los posts (opcional).
5. **Etiqueta**: Etiquetas para una mejor clasificación de los posts (opcional).

## Atributos de las Entidades

- **Usuario**: ID, nombre, correo electrónico, contraseña, fecha de registro.
- **Post**: ID, título, contenido, fecha de publicación, ID del usuario, ID de categoría (opcional).
- **Comentario**: ID, contenido, fecha, ID del usuario, ID del post.
- **Categoría**: ID, nombre, descripción.
- **Etiqueta**: ID, nombre.

## Relaciones

- Un **Usuario** puede crear múltiples **Posts**.
- Un **Post** puede tener múltiples **Comentarios**.
- Un **Comentario** está asociado a un solo **Post** y **Usuario**.
- Un **Post** puede pertenecer a una **Categoría** y tener varias **Etiquetas**.

## Tareas

1. **Diagrama de Entidad-Relación**: Diseñar un diagrama que muestre todas las entidades, atributos y relaciones.
2. **Creación de Tablas en SQL**: Escribir las instrucciones SQL para crear las tablas basadas en el diagrama.
3. **Inserción y Consulta de Datos**: Insertar datos de ejemplo y escribir consultas SQL para obtener datos específicos.


# Ejercicio de Modelado de Base de Datos para una Tienda en Línea

## Objetivo

Desarrollar un modelo de base de datos para una tienda en línea, cubriendo las necesidades básicas de un sistema de comercio electrónico, incluyendo la gestión de clientes, productos, pedidos y reseñas.

## Entidades Principales

1. **Cliente**: Usuarios que realizan compras.
2. **Producto**: Artículos en venta.
3. **Pedido**: Órdenes de compra de los clientes.
4. **DetallePedido**: Detalles específicos de los pedidos.
5. **CategoríaProducto**: Clasificaciones para los productos.
6. **Reseña**: Opiniones de clientes sobre productos.

## Atributos de las Entidades

- **Cliente**: ID, nombre, dirección, correo electrónico, contraseña.
- **Producto**: ID, nombre, descripción, precio, stock, ID de categoría.
- **Pedido**: ID, fecha, ID del cliente, estado del pedido.
- **DetallePedido**: ID, ID del pedido, ID del producto, cantidad, precio.
- **CategoríaProducto**: ID, nombre, descripción.
- **Reseña**: ID, contenido, calificación, fecha, ID del cliente, ID del producto.

## Relaciones

- Un **Cliente** puede realizar varios **Pedidos**.
- Un **Pedido** incluye varios **DetallePedido**, cada uno con un **Producto**.
- Un **Producto** pertenece a una **CategoríaProducto** y puede tener varias **Reseñas**.
- Una **Reseña** está asociada a un **Producto** y a un **Cliente**.

## Tareas

1. **Diagrama de Entidad-Relación**: Diseñar un diagrama que muestre todas las entidades, atributos y relaciones.
2. **Creación de Tablas en SQL**: Escribir instrucciones SQL para crear las tablas con claves primarias y foráneas.
3. **Inserción y Consulta de Datos**: Insertar datos de ejemplo y realizar consultas SQL.
4. **Optimización y Seguridad**: Implementar índices y medidas de seguridad.