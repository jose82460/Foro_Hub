
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(100) not null unique,
    fechaCreacion datetime not null,
    status varchar(100) not null,
    autor varchar(100) not null,
    curso varchar(100),
    respuetas varchar(100),

    primary key(id)

);
