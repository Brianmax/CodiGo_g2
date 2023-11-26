# Ejercicio: Diseño e Implementación de Base de Datos para una Biblioteca

## Requerimientos

### Generalidades del Sistema
- Desarrollar un sistema de gestión para una biblioteca.
- El sistema debe manejar información sobre libros, usuarios y préstamos de libros.

### Funcionalidades Clave
- Registrar nuevos libros en la biblioteca.
- Permitir a los usuarios buscar libros disponibles.
- Gestionar los préstamos de libros a los usuarios.
- Registrar la devolución de libros.
- Mantener un historial de todos los préstamos realizados.

### Operaciones CRUD
- Implementar operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) para al menos una de las entidades del sistema.
- Es importante que la implementación del CRUD se realice mediante la interacción de Java con la base de datos.

### Base de Datos
- Utilizar PostgreSQL como sistema de gestión de base de datos.
- Diseñar e implementar las tablas necesarias para las entidades identificadas.

## Ejemplos de Código SQL para Operaciones CRUD

### Crear (Insertar)
```sql
INSERT INTO nombre_tabla (campo1, campo2, campo3) VALUES (valor1, valor2, valor3);
```

### Leer (Consultar)
```sql
SELECT * FROM nombre_tabla;
SELECT campo1, campo2 FROM nombre_tabla;
SELECT * FROM nombre_tabla WHERE campo1 = valor1;
SELECT * FROM nombre_tabla WHERE campo1 = valor1 AND campo2 = valor2;
```

### Actualizar
```sql
UPDATE nombre_tabla SET campo1 = valor1, campo2 = valor2 WHERE campo3 = valor3;
```

### Eliminar
```sql
DELETE FROM nombre_tabla WHERE campo1 = valor1;
```

## Entrega
- La entrega de la tarea se realizará mediante un repositorio de GitHub o un archivo comprimido (.zip) enviado por classroom.
- La entrega debe contener el codigo fuente del proyecto, un archivo SQL con el script de creación de la base de datos y la imagen del diagrama de la base de datos (ERD).