CREATE TABLE Departamentos (
    ID_Departamento SERIAL PRIMARY KEY,
    Nombre_Departamento varchar(255)
);
CREATE TABLE Empleados (
    ID_Empleado SERIAL PRIMARY KEY,
    Nombre varchar(255),
    ID_Departamento int,
    FOREIGN KEY (ID_Departamento) REFERENCES Departamentos(ID_Departamento)
);
CREATE TABLE Proyectos (
    ID_Proyecto SERIAL PRIMARY KEY,
    Nombre_Proyecto varchar(255) unique,
    ID_Encargado int,
    FOREIGN KEY (ID_Encargado) REFERENCES Empleados(ID_Empleado)
);


insert into departamentos (nombre_departamento) values ('Research and Development');
insert into departamentos (nombre_departamento) values ('Accounting');
insert into departamentos (nombre_departamento) values ('Marketing');
insert into departamentos (nombre_departamento) values ('Human Resources');
insert into departamentos (nombre_departamento) values ('Product Management');
insert into departamentos (nombre_departamento) values ('Business Development');
insert into departamentos (nombre_departamento) values ('Services');


insert into empleados (nombre, id_departamento) values ('Robbie', 4);
insert into empleados (nombre, id_departamento) values ('Hort', null);
insert into empleados (nombre, id_departamento) values ('Nellie', 3);
insert into empleados (nombre, id_departamento) values ('Stan', 6);
insert into empleados (nombre, id_departamento) values ('Lida', 3);
insert into empleados (nombre, id_departamento) values ('Amelie', 4);
insert into empleados (nombre, id_departamento) values ('Saunders', 3);
insert into empleados (nombre, id_departamento) values ('Dana', null);
insert into empleados (nombre, id_departamento) values ('Tonie', 3);
insert into empleados (nombre, id_departamento) values ('Alexandra', 7);
insert into empleados (nombre, id_departamento) values ('Mei', null);
insert into empleados (nombre, id_departamento) values ('Chas', 1);
insert into empleados (nombre, id_departamento) values ('Wittie', 2);
insert into empleados (nombre, id_departamento) values ('Giana', null);
insert into empleados (nombre, id_departamento) values ('Kelby', 1);
insert into empleados (nombre, id_departamento) values ('Maurie', 1);
insert into empleados (nombre, id_departamento) values ('Ashla', null);
insert into empleados (nombre, id_departamento) values ('Lucio', 4);
insert into empleados (nombre, id_departamento) values ('Tilly', 3);
insert into empleados (nombre, id_departamento) values ('Nicolais', 7);


insert into proyectos (nombre_proyecto, id_encargado) values ('Huck White Towels', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Bread - Raisin Walnut Oval', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Tea Leaves - Oolong', 18);
insert into proyectos (nombre_proyecto, id_encargado) values ('Sobe - Green Tea', 4);
insert into proyectos (nombre_proyecto, id_encargado) values ('Pasta - Elbows, Macaroni, Dry', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Hummus - Spread', 2);
insert into proyectos (nombre_proyecto, id_encargado) values ('Bar Mix - Pina Colada, 355 Ml', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Chocolate Bar - Smarties', 3);
insert into proyectos (nombre_proyecto, id_encargado) values ('Mousse - Passion Fruit', 8);
insert into proyectos (nombre_proyecto, id_encargado) values ('Danishes - Mini Raspberry', 2);
insert into proyectos (nombre_proyecto, id_encargado) values ('Cabbage - Savoy', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Wine - White, Riesling, Henry Of', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Pasta - Penne, Rigate, Dry', 8);
insert into proyectos (nombre_proyecto, id_encargado) values ('Cookies - Englishbay Chochip', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Longos - Assorted Sandwich', 9);
insert into proyectos (nombre_proyecto, id_encargado) values ('Muskox - French Rack', 5);
insert into proyectos (nombre_proyecto, id_encargado) values ('Wine - George Duboeuf Rose', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Rice - Long Grain', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Limes', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Scallop - St. Jaques', 9);
insert into proyectos (nombre_proyecto, id_encargado) values ('Wine - Prosecco Valdobiaddene', 13);
insert into proyectos (nombre_proyecto, id_encargado) values ('Pie Shell - 9', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Potatoes - Instant, Mashed', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Muffin Batt - Carrot Spice', 17);
insert into proyectos (nombre_proyecto, id_encargado) values ('Cheese - Blue', 6);
insert into proyectos (nombre_proyecto, id_encargado) values ('Beer - Sleemans Cream Ale', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Sauce - White, Mix', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Chocolate - Liqueur Cups With Foil', 6);
insert into proyectos (nombre_proyecto, id_encargado) values ('Bread - Roll, Whole Wheat', 15);
insert into proyectos (nombre_proyecto, id_encargado) values ('Sobe - Berry Energy', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Potatoes - Mini White 3 Oz', 20);
insert into proyectos (nombre_proyecto, id_encargado) values ('Pasta - Fettuccine, Egg, Fresh', 18);
insert into proyectos (nombre_proyecto, id_encargado) values ('Carbonated Water - White Grape', 9);
insert into proyectos (nombre_proyecto, id_encargado) values ('Muffin Orange Individual', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Pepper - Pablano', 2);
insert into proyectos (nombre_proyecto, id_encargado) values ('Veal - Shank, Pieces', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Turnip - White', null);
insert into proyectos (nombre_proyecto, id_encargado) values ('Pastrami', 16);
insert into proyectos (nombre_proyecto, id_encargado) values ('Foil Wrap', 9);
insert into proyectos (nombre_proyecto, id_encargado) values ('Versatainer Nc - 888', 12);
