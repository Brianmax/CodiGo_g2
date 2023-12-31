create TABLE if not exists usuarios(
                                       usuario_id serial primary key,
                                       nombre varchar(30),
    email varchar(30),
    passworduser varchar(40),
    fechaCreacion date default current_date
    );
create table if not exists categorias(
                                         categoria_id serial primary key,
                                         nombre varchar(20),
    descripcion varchar(250)
    );
create table if not exists etiquetas(
                                        etiqueta_id serial primary key,
                                        nombre varchar(20),
    descripcion varchar(250),
    usuario integer,

    foreign key (usuario) references usuarios(usuario_id)
    );

create table if not exists posts(
                                    post_id serial primary key,
                                    titulo varchar(40),
    contenido varchar(200),
    fechaPublicacion date default current_date,
    usuario integer,
    categoria integer,

    foreign key(usuario) references usuarios(usuario_id),
    foreign key(categoria) references categorias(categoria_id)
    );

create table if not exists comentario(
                                         comentario_id serial primary key,
                                         contenido varchar(255),
    usuario integer,
    post integer,

    foreign key(usuario) references usuarios(usuario_id),
    foreign key(post) references posts(post_id)
    );

create table if not exists etiquetas_posts
(
    etiqueta_post_id serial primary key,
    post integer,
    etiqueta integer,

    foreign key(post) references posts(post_id),
    foreign key(etiqueta) references etiquetas(etiqueta_id)
    );