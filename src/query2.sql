-- En caso de que ya hayas insertado algun dato en tu bd, ejecuta este comando para que se actualice el id
BEGIN;

TRUNCATE TABLE comentarios RESTART IDENTITY CASCADE;
TRUNCATE TABLE etiquetas_posts RESTART IDENTITY CASCADE;
TRUNCATE TABLE posts RESTART IDENTITY CASCADE;
TRUNCATE TABLE usuarios RESTART IDENTITY CASCADE;
TRUNCATE TABLE etiquetas RESTART IDENTITY CASCADE;
TRUNCATE TABLE categorias RESTART IDENTITY CASCADE;

COMMIT;

-- Ejecutar al inicio para reiniciar el contador de id
ALTER SEQUENCE usuarios_usuario_id_seq RESTART WITH 1;
ALTER SEQUENCE comentarios_comentario_id_seq RESTART WITH 1;
ALTER SEQUENCE etiquetas_etiqueta_id_seq RESTART WITH 1;
ALTER SEQUENCE etiquetas_posts_etiqueta_post_id_seq RESTART WITH 1;
ALTER SEQUENCE posts_post_id_seq RESTART WITH 1;
ALTER SEQUENCE categorias_categoria_id_seq RESTART WITH 1;

-- Modificamos la tabla, posts y usuarios
alter table usuarios alter column email type varchar(60);
alter table posts alter column contenido type text;
alter table etiquetas drop column descripcion;
alter table usuarios add constraint unique_email unique(email);
alter table categorias add constraint unique_name unique(nombre);
alter table posts add constraint unique_title unique(titulo);
-- Insertamos un usuario
insert into usuarios(nombre, email, passworduser)
values ('George', 'email@gmail.com', 'password123');

-- Insercion masiva de usuarios

insert into usuarios (nombre, email, passworduser) values ('Merv', 'mroutley0@opensource.org', 'lJ0_)Hxho');
insert into usuarios (nombre, email, passworduser) values ('Lani', 'lrannigan1@ftc.gov', 'zV2@lH<4IOGW');
insert into usuarios (nombre, email, passworduser) values ('Morgan', 'mmackain2@nytimes.com', 'rN7+M1Cf.vZr');
insert into usuarios (nombre, email, passworduser) values ('Davin', 'druter3@accuweather.com', 'mC6$O2ph!iP`');
insert into usuarios (nombre, email, passworduser) values ('Lu', 'lstreeten4@altervista.org', 'eH7}a>pi5U"');
insert into usuarios (nombre, email, passworduser) values ('Barbey', 'bjurasek5@time.com', 'yX6$tlLLP''o!GOse');
insert into usuarios (nombre, email, passworduser) values ('Venus', 'vrockey6@liveinternet.ru', 'lA9+T&JkxlfZ');
insert into usuarios (nombre, email, passworduser) values ('Ekaterina', 'eballance7@sun.com', 'hD7)m5uW~nTA1');
insert into usuarios (nombre, email, passworduser) values ('Bryna', 'bkarpf8@baidu.com', 'zE2+2kZA>mjWBM@');
insert into usuarios (nombre, email, passworduser) values ('Abran', 'abrunicke9@skyrock.com', 'dG5`&``_|=c.?');
insert into usuarios (nombre, email, passworduser) values ('Editha', 'edymotta@theglobeandmail.com', 'sZ8$UcvnUiGQMZ5');
insert into usuarios (nombre, email, passworduser) values ('Sybille', 'shannentb@loc.gov', 'xX5{CFDj5|h');
insert into usuarios (nombre, email, passworduser) values ('Bronnie', 'bdelafoyc@europa.eu', 'eY3{"o!x6p4sZ');
insert into usuarios (nombre, email, passworduser) values ('Lyndsey', 'loventond@booking.com', 'uZ9*)`3eS@?0lh');
insert into usuarios (nombre, email, passworduser) values ('Ag', 'ageraldoe@nhs.uk', 'dR4#\yL$5)');
insert into usuarios (nombre, email, passworduser) values ('Matti', 'mhuckef@dell.com', 'lK2\bH@elNh+_');
insert into usuarios (nombre, email, passworduser) values ('Di', 'dastupenasg@sfgate.com', 'hO4?(cl+em+\U');
insert into usuarios (nombre, email, passworduser) values ('Moira', 'mjerschh@over-blog.com', 'kW4*@mOG74m');
insert into usuarios (nombre, email, passworduser) values ('Turner', 'tloudeni@ustream.tv', 'mQ3'')F#nwq3');
insert into usuarios (nombre, email, passworduser) values ('Laurena', 'lbouttonj@who.int', 'lF5#4+K|/C8JMfV+');
insert into usuarios (nombre, email, passworduser) values ('Panchito', 'pstanderingk@webs.com', 'uS1{P6RV9{\`t$..');
insert into usuarios (nombre, email, passworduser) values ('Elke', 'eboumphreyl@npr.org', 'gN6|mC7&KZ');
insert into usuarios (nombre, email, passworduser) values ('Ty', 'tpillifantm@miibeian.gov.cn', 'rX7{`~8ozT');
insert into usuarios (nombre, email, passworduser) values ('Leon', 'lbenedekn@google.com', 'zP5}L)4l@h(5@#');
insert into usuarios (nombre, email, passworduser) values ('Gwen', 'gdurbano@dailymotion.com', 'mT0=<F@BhMD!G');
insert into usuarios (nombre, email, passworduser) values ('Crystal', 'cklishinp@ezinearticles.com', 'xF3~$nU)F70H_q');
insert into usuarios (nombre, email, passworduser) values ('Jens', 'jaldersq@vimeo.com', 'tA8(E`iKW');
insert into usuarios (nombre, email, passworduser) values ('Dani', 'dwickersleyr@bloglines.com', 'hX0@Lu%"|c6!jM');
insert into usuarios (nombre, email, passworduser) values ('Dominica', 'dprazers@goo.gl', 'fS7~8QGS$VofP');
insert into usuarios (nombre, email, passworduser) values ('Marleah', 'mharriest@icio.us', 'jC0_!%qt>');
insert into usuarios (nombre, email, passworduser) values ('Shea', 'sgrishenkovu@imgur.com', 'hP8&ZiNG&TC*q');
insert into usuarios (nombre, email, passworduser) values ('Herve', 'hoyleyv@geocities.jp', 'fT1=X1|03/~f');
insert into usuarios (nombre, email, passworduser) values ('Nyssa', 'nmoutonw@topsy.com', 'sQ6?''l?<$''j');
insert into usuarios (nombre, email, passworduser) values ('Janela', 'jofiellyx@fda.gov', 'jR4??kOt{JVvN7S');
insert into usuarios (nombre, email, passworduser) values ('Roldan', 'rslockety@deliciousdays.com', 'pU4/|mj4hF');
insert into usuarios (nombre, email, passworduser) values ('Page', 'pgainsburyz@mapquest.com', 'gX1+5VD8YNiA_uW');
insert into usuarios (nombre, email, passworduser) values ('Aldrich', 'apalia10@xing.com', 'qX8}%V=zUUWCq%');
insert into usuarios (nombre, email, passworduser) values ('Martainn', 'mconeau11@jimdo.com', 'qW8&N}|i2''izaki');
insert into usuarios (nombre, email, passworduser) values ('Carolyne', 'cmcorkill12@google.com.br', 'sY2.sI/Y');
insert into usuarios (nombre, email, passworduser) values ('Dolly', 'dfacher13@wsj.com', 'iR3\yy@O''L');
insert into usuarios (nombre, email, passworduser) values ('Liam', 'locodihie14@topsy.com', 'iF7,)*565>GkAP');
insert into usuarios (nombre, email, passworduser) values ('Lynette', 'leccleshall15@time.com', 'hY9{ZY}g4jQ}c=');
insert into usuarios (nombre, email, passworduser) values ('Jilly', 'jhartridge16@mayoclinic.com', 'lC9=mlCHeFVz}');
insert into usuarios (nombre, email, passworduser) values ('Elizabeth', 'etiner17@latimes.com', 'iV5)pH3Tb');
insert into usuarios (nombre, email, passworduser) values ('Viv', 'vlamperd18@unesco.org', 'oS6|,4PP5u1ar');
insert into usuarios (nombre, email, passworduser) values ('Clemmie', 'ctimby19@nytimes.com', 'sZ4~.JC%SvLA+\A');
insert into usuarios (nombre, email, passworduser) values ('Morlee', 'mtejero1a@blogs.com', 'yM7<+adQ%3jx(');
insert into usuarios (nombre, email, passworduser) values ('Susan', 'scollet1b@spiegel.de', 'jY0{)i/?9}z7>=?');
insert into usuarios (nombre, email, passworduser) values ('Cornelia', 'cdeeves1c@nifty.com', 'dB2@wip#Mg%m');
insert into usuarios (nombre, email, passworduser) values ('Bertie', 'bcasero1d@sohu.com', 'zY3`''fxJOP');
insert into usuarios (nombre, email, passworduser) values ('Reynard', 'rginity1e@princeton.edu', 'qE7@FspsKcrrV');
insert into usuarios (nombre, email, passworduser) values ('Harvey', 'hhadny1f@joomla.org', 'zV8!rZdb1f7A,m/D');
insert into usuarios (nombre, email, passworduser) values ('Cristy', 'cjenik1g@goo.gl', 'cY3="<g,8Eb');
insert into usuarios (nombre, email, passworduser) values ('Pepillo', 'pbonnick1h@booking.com', 'nK5''h1N4q)"O');
insert into usuarios (nombre, email, passworduser) values ('Dasya', 'dwynrahame1i@miibeian.gov.cn', 'wL3<A_qO_w~F4');
insert into usuarios (nombre, email, passworduser) values ('Eugenius', 'efildes1j@hao123.com', 'qE2(i/,bA');
insert into usuarios (nombre, email, passworduser) values ('Karissa', 'kprettyjohns1k@webs.com', 'qL3,/`7vB');
insert into usuarios (nombre, email, passworduser) values ('Damara', 'ddunston1l@reference.com', 'iZ7$R7h8yTuvnC');
insert into usuarios (nombre, email, passworduser) values ('Maye', 'mcantwell1m@bbc.co.uk', 'dW8>H0PF');
insert into usuarios (nombre, email, passworduser) values ('Granville', 'gsara1n@slideshare.net', 'rV1(c*q#ek59V');
insert into usuarios (nombre, email, passworduser) values ('Randell', 'rmcguinley1o@foxnews.com', 'kN0.}?}Nglvm8''');
insert into usuarios (nombre, email, passworduser) values ('Valli', 'vkeirle1p@dion.ne.jp', 'rH4<@!Qao(');
insert into usuarios (nombre, email, passworduser) values ('Mirabella', 'mallaway1q@google.co.uk', 'qE2/A|vz');
insert into usuarios (nombre, email, passworduser) values ('Xenia', 'xomara1r@examiner.com', 'yX2|h3~tj');
insert into usuarios (nombre, email, passworduser) values ('Frederik', 'fjendricke1s@a8.net', 'rT9(=3_0LN');
insert into usuarios (nombre, email, passworduser) values ('Giraldo', 'gdenore1t@telegraph.co.uk', 'qG8(V~AIV');
insert into usuarios (nombre, email, passworduser) values ('Abel', 'adunne1u@mtv.com', 'kB6_C\C*x6(*');
insert into usuarios (nombre, email, passworduser) values ('Vidovic', 'vfinnis1v@mail.ru', 'qR8=JOT+?QE%');
insert into usuarios (nombre, email, passworduser) values ('Kelsey', 'kjacob1w@acquirethisname.com', 'aP3\DM,ly');
insert into usuarios (nombre, email, passworduser) values ('Gino', 'gcheccucci1x@techcrunch.com', 'iG2>UTxmrA!"o');
insert into usuarios (nombre, email, passworduser) values ('Rogerio', 'rrobert1y@statcounter.com', 'fC0_#F.aZj');
insert into usuarios (nombre, email, passworduser) values ('Jemie', 'jarnaudot1z@youtu.be', 'iR6>XHIQUw&76t');
insert into usuarios (nombre, email, passworduser) values ('Mamie', 'mgaule20@ibm.com', 'dA5/FOSU65(H');
insert into usuarios (nombre, email, passworduser) values ('Maire', 'megglestone21@senate.gov', 'pC2=?yrJ&Li.');
insert into usuarios (nombre, email, passworduser) values ('Harri', 'hdorling22@sourceforge.net', 'uK6`j~`KfPt@L1');
insert into usuarios (nombre, email, passworduser) values ('Aylmar', 'amew23@yale.edu', 'fZ1*ecv=rbk}U');
insert into usuarios (nombre, email, passworduser) values ('Doro', 'desplin24@vk.com', 'oD7{b2rVJ,y$*Y');
insert into usuarios (nombre, email, passworduser) values ('Joycelin', 'jwinspurr25@mysql.com', 'lV5<L~ticEe=c');
insert into usuarios (nombre, email, passworduser) values ('Berni', 'blownie26@so-net.ne.jp', 'aP1<"Ayk0');
insert into usuarios (nombre, email, passworduser) values ('Fay', 'fpesik27@webmd.com', 'iW8_>6I=j%t0$v');
insert into usuarios (nombre, email, passworduser) values ('Addy', 'aivimey28@networkadvertising.org', 'iB3''+<Q*DtbP');
insert into usuarios (nombre, email, passworduser) values ('Selestina', 'srosewell29@google.fr', 'qA2(Sz>T''b4G<');
insert into usuarios (nombre, email, passworduser) values ('Neda', 'ngrog2a@flickr.com', 'eS1|VBZgx<');
insert into usuarios (nombre, email, passworduser) values ('Gelya', 'gmenendes2b@webmd.com', 'sC4|P)G{y@@');
insert into usuarios (nombre, email, passworduser) values ('Aylmer', 'atorr2c@w3.org', 'rL2%#W(v/1@u');
insert into usuarios (nombre, email, passworduser) values ('Winslow', 'wenocksson2d@unblog.fr', 'oH3%m3C+l');
insert into usuarios (nombre, email, passworduser) values ('Ardyce', 'abazek2e@dmoz.org', 'zK2,|qT2sY');
insert into usuarios (nombre, email, passworduser) values ('Malinde', 'mbocke2f@t.co', 'uL4!r\{5tf');
insert into usuarios (nombre, email, passworduser) values ('Carolin', 'channing2g@fastcompany.com', 'eK0''ny))');
insert into usuarios (nombre, email, passworduser) values ('Cecelia', 'ctrittam2h@google.com', 'vG6|`rHP');
insert into usuarios (nombre, email, passworduser) values ('Phil', 'pdybell2i@huffingtonpost.com', 'fW8/K3c>D_83O');
insert into usuarios (nombre, email, passworduser) values ('Hervey', 'hmccrisken2j@scribd.com', 'nE5*I?(4waq');
insert into usuarios (nombre, email, passworduser) values ('Doreen', 'dswindon2k@kickstarter.com', 'hG8$}d,(h');
insert into usuarios (nombre, email, passworduser) values ('Jason', 'jcoolahan2l@ovh.net', 'oF8_D/W~+unw=jW');
insert into usuarios (nombre, email, passworduser) values ('Milissent', 'mserrurier2m@irs.gov', 'eR5>O3<k');
insert into usuarios (nombre, email, passworduser) values ('Rex', 'rmaccleay2n@howstuffworks.com', 'cX3>J~kFz');
insert into usuarios (nombre, email, passworduser) values ('Raffaello', 'rescot2o@noaa.gov', 'bH0"@i{*myf');
insert into usuarios (nombre, email, passworduser) values ('Rockwell', 'rshane2p@hexun.com', 'mE2.Qn9p');
insert into usuarios (nombre, email, passworduser) values ('Torrin', 'tcraggs2q@newsvine.com', 'oC5|Y<=u!P7');
insert into usuarios (nombre, email, passworduser) values ('Vale', 'vkey2r@google.co.jp', 'mP1"XP~WA?2!2');

-- Eliminamos la columna descripcion de la tabla etiquetas
alter table etiquetas drop column descripcion;

-- insertamos una etiqueta
insert into etiquetas (nombre) values ('etiqueta1');