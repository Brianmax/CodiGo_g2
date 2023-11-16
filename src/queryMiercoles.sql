insert into usuarios(nombre, email, passworduser)
values('George', 'email@gmail.com','234');

select * from usuarios;

select usuario_id, nombre, email from usuarios;

-- aniadiendo un constraint a categorias

alter table categorias add constraint unique_nombre unique(nombre);


-- insertando una categoria

insert into categorias(nombre, descripcion)
values ('Matematicas', 'Una categoria para los matematicos');

-- error, ya existe la categoria con el mismo nombre
insert into categorias(nombre, descripcion)
values ('Matematicas', 'Una categoria para los matematicos');

select nombre from categorias;

-- insertamos una etiqueta

alter table etiquetas drop column descripcion;

insert into etiquetas(nombre, usuario)
values('js', 1);

insert into etiquetas(nombre, usuario)
values('java', 1);

select * from etiquetas;
