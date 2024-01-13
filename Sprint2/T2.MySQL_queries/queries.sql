/*    ----------      TIENDA -----------------*/

-- 1.Llista el nom de tots els productes que hi ha en la taula producto.
SELECT nombre FROM producto;

-- 2.Llista els noms i els preus de tots els productes de la taula producto.
SELECT nombre, precio FROM producto;

-- 3.Llista totes les columnes de la taula producto.
SELECT * FROM producto;

--4.Llista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD).
SELECT nombre, precio ,ROUND(precio * 1.07,3) AS precio_dolares FROM producto; 

-- 5.Llista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD). Utilitza els següents àlies per a les columnes: nom de producto, euros, dòlars.
SELECT nombre AS nombre_producto, precio AS euros, ROUND(precio * 1.07,3) AS precio_dolares FROM producto;

-- 6.Llista els noms i els preus de tots els productes de la taula producto, convertint els noms a majúscula.
SELECT UPPER(nombre) FROM producto; 

-- 7.Llista els noms i els preus de tots els productes de la taula producto, convertint els noms a minúscula.
SELECT lower(nombre ), precio FROM producto;

-- 8.Llista el nom de tots els fabricants en una columna, i en una altra columna obtingui en majúscules els dos primers caràcters del nom del fabricant.
SELECT nombre, UPPER(substring(nombre,1,2)) AS iniciales  FROM  fabricante ;

-- 9.Llista els noms i els preus de tots els productes de la taula producto, arrodonint el valor del preu.
SELECT nombre, ROUND(precio) FROM producto;

-- 10.Llista els noms i els preus de tots els productes de la taula producto, truncant el valor del preu per a mostrar-lo sense cap xifra decimal.
SELECT nombre, TRUNCATE(precio,0) FROM producto;

-- 11. Llista el codi dels fabricants que tenen productes en la taula producto.
SELECT codigo_fabricante FROM producto;

-- 12.Llista el codi dels fabricants que tenen productes en la taula producto, eliminant els codis que apareixen repetits.
SELECT  distinct codigo_fabricante FROM producto;

-- 13.Llista els noms dels fabricants ordenats de manera ascendent.
SELECT nombre FROM fabricante ORDER BY nombre ASC;

-- 14.Llista els noms dels fabricants ordenats de manera descendent.
SELECT nombre FROM fabricante ORDER BY nombre DESC;

-- 15.Llista els noms dels productes ordenats, en primer lloc, pel nom de manera ascendent i, en segon lloc, pel preu de manera descendent.
SELECT nombre, precio FROM producto ORDER BY nombre ASC, nombre DESC;

-- 16.Retorna una llista amb les 5 primeres files de la taula fabricante.
SELECT * FROM fabricante LIMIT 5;

-- 17.Retorna una llista amb 2 files a partir de la quarta fila de la taula fabricante. La quarta fila també s'ha d'incloure en la resposta.
SELECT * FROM fabricante LIMIT 3,2;

-- 18.Llista el nom i el preu del producte més barat. (Utilitza solament les clàusules ORDER BY i LIMIT). NOTA: Aquí no podria usar MIN(preu), necessitaria GROUP BY.
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;

-- 19.Llista el nom i el preu del producte més car. (Utilitza solament les clàusules ORDER BY i LIMIT). NOTA: Aquí no podria usar MAX(preu), necessitaria GROUP BY.
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1 ;

-- 20.Llista el nom de tots els productes del fabricant el codi de fabricant del qual és igual a 2.
SELECT nombre FROM fabricante WHERE codigo = 2;

-- 21.Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades.
SELECT p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante FROM producto AS P LEFT JOIN fabricante AS f ON p.codigo_fabricante = f.codigo;

-- 22.Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades. Ordena el resultat pel nom del fabricant, per ordre alfabètic.
SELECT p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante FROM producto AS P LEFT JOIN fabricante AS f ON p.codigo_fabricante = f.codigo ORDER BY P.nombre ;

-- 23.Retorna una llista amb el codi del producte, nom del producte, codi del fabricador i nom del fabricador, de tots els productes de la base de dades.
SELECT p.codigo, p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante FROM producto AS p LEFT JOIN  fabricante AS f ON p.codigo_fabricante = f.codigo;

-- 24.Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més barat.
SELECT p.nombre AS producto_nombre, p.precio, f.nombre AS nombre_fabricante FROM producto AS P LEFT JOIN fabricante AS f ON  p.codigo_fabricante = f.codigo ORDER BY precio ASC LIMIT 1;

-- 25.Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més car.
SELECT p.nombre AS producto_nombre, p.precio, f.nombre AS nombre_fabricante FROM producto AS P LEFT JOIN fabricante AS f ON  p.codigo_fabricante = f.codigo ORDER BY precio DESC LIMIT 1;

-- 26.Retorna una llista de tots els productes del fabricant Lenovo.
SELECT p.* FROM producto AS p JOIN fabricante ON p.codigo_fabricante =  fabricante.codigo WHERE fabricante.nombre = "Lenovo"; 

-- 27.Retorna una llista de tots els productes del fabricant Crucial que tinguin un preu major que 200 €.
SELECT p.* FROM producto AS p JOIN fabricante ON p.codigo_fabricante =  fabricante.codigo WHERE fabricante.nombre = "Crucial" AND p.precio > 200; 

-- 28.Retorna un llistat amb tots els productes dels fabricants Asus, Hewlett-Packardy Seagate. Sense utilitzar l'operador IN.
SELECT p.* FROM producto AS p JOIN fabricante AS f ON p.codigo_fabricante =  f.codigo WHERE f.nombre = "Asus" OR f.nombre = "Hewlett-Packard" OR f.nombre = "Seagate";

-- 29.Retorna un llistat amb tots els productes dels fabricants Asus, Hewlett-Packardy Seagate. Fent servir l'operador IN.
SELECT p.* FROM producto AS p JOIN fabricante AS f ON p.codigo_fabricante =  f.codigo WHERE f.nombre IN ("Asus", "Hewlett-Packard" ,"Seagate");

-- 30.Retorna un llistat amb el nom i el preu de tots els productes dels fabricants el nom dels quals acabi per la vocal e.
SELECT p.nombre, p.precio FROM producto p JOIN fabricante f ON  p.codigo_fabricante =  f.codigo WHERE f.nombre LIKE "%e";

-- 31.Retorna un llistat amb el nom i el preu de tots els productes el nom de fabricant dels quals contingui el caràcter w en el seu nom.
SELECT p.nombre, p.precio FROM producto p JOIN fabricante f ON  p.codigo_fabricante =  f.codigo WHERE f.nombre LIKE "%w%";

-- 32.Retorna un llistat amb el nom de producte, preu i nom de fabricant, de tots els productes que tinguin un preu major o igual a 180 €. Ordena el resultat, en primer lloc, pel preu (en ordre descendent) i, en segon lloc, pel nom (en ordre ascendent).
SELECT p.nombre AS nombre_producto , p.precio, f.nombre AS nombre_fabricante  FROM producto p JOIN fabricante f ON  p.codigo_fabricante =  f.codigo WHERE p.precio >=180 ORDER BY p.precio DESC, p.nombre ASC;

-- 33.Retorna un llistat amb el codi i el nom de fabricant, solament d'aquells fabricants que tenen productes associats en la base de dades.
SELECT DISTINCT f.codigo, f.nombre AS nombre_fabricante  FROM fabricante f JOIN producto p  ON  p.codigo_fabricante =  f.codigo; 

-- 34.Retorna un llistat de tots els fabricants que existeixen en la base de dades, juntament amb els productes que té cadascun d'ells. El llistat haurà de mostrar també aquells fabricants que no tenen productes associats.
SELECT f.nombre AS nombre_del_fabricante, p.nombre AS nombre_del_producto FROM fabricante f LEFT JOIN producto p ON  p.codigo_fabricante =  p.codigo; 


-- 35.Retorna un llistat on només apareguin aquells fabricants que no tenen cap producte associat.
SELECT f.nombre AS nombre_del_fabricante, p.nombre AS nombre_del_producto FROM fabricante f LEFT JOIN producto p ON  p.codigo_fabricante =  f.codigo WHERE p.nombre is Null;

-- 36.Retorna tots els productes del fabricador Lenovo. (Sense utilitzar INNER JOIN).
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo");

-- 37.Retorna totes les dades dels productes que tenen el mateix preu que el producte més car del fabricant Lenovo. (Sense usar INNER JOIN).
SELECT * FROM producto WHERE precio = (SELECT max(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo"));

-- 38.Llista el nom del producte més car del fabricant Lenovo.
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo") ORDER BY precio DESC LIMIT 1;

-- 39.Llista el nom del producte més barat del fabricant Hewlett-Packard.
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo") ORDER BY precio ASC LIMIT 1;

-- 40.Retorna tots els productes de la base de dades que tenen un preu major o igual al producte més car del fabricant Lenovo.
SELECT * FROM producto WHERE precio >= (SELECT max(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo"));

-- 41.Llesta tots els productes del fabricant Asus que tenen un preu superior al preu mitjà de tots els seus productes.
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus" )AND precio >=(SELECT avg(precio)  from producto where codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus")); 



--               ----------UNIVERSIDAD  ------------

-- 1.Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els/les alumnes. El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
SELECT p.apellido1, p.apellido2, p.nombre, p.tipo FROM persona p where p.tipo = 'alumno' ORDER BY p.apellido1 asc;

-- 2.Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
SELECT p.apellido1, p.apellido2, p.nombre FROM persona p where p.tipo = 'alumno' and p.telefono is NULL;

-- 3.Retorna el llistat dels alumnes que van néixer en 1999.
SELECT * FROM persona p where p.tipo = 'alumno' and YEAR(fecha_nacimiento) = 1999;

-- 4.Retorna el llistat de professors/es que no han donat d'alta el seu número de telèfon en la base de dades i a més el seu NIF acaba en K.
SELECT * FROM persona p where p.tipo = 'profesor' and p.telefono is NULL and p.nif like '%k';

-- 5.Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
SELECT nombre from asignatura where cuatrimestre = 1 and curso = 3 and id_grado = 7 ;

-- 6.Retorna un llistat dels professors/es juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
select p.apellido1, p.apellido2,p.nombre, d.nombre from profesor pro join persona p on pro.id_profesor = p.id join departamento d on  d.id = pro.id_departamento ORDER BY p.apellido1 asc,p.apellido2 ASC, p.nombre ASC;

-- 7.Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne/a amb NIF 26902806M.
SELECT a.nombre as Nombre_asignaturas, ce.anyo_inicio, ce.anyo_fin FROM asignatura a join alumno_se_matricula_asignatura asma on a.id = asma.id_asignatura join curso_escolar ce ON asma.id_curso_escolar = ce.id join persona p ON asma.id_alumno = p.id where p.nif = '26902806M';

-- 8.Retorna un llistat amb el nom de tots els departaments que tenen professors/es que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
SELECT  DISTINCT d.nombre AS departamento  FROM departamento d JOIN profesor pr  ON d.id = pr.id_departamento JOIN asignatura a ON pr.id_profesor = a.id_profesor JOIN grado gr ON a.id_grado = gr.id where gr.nombre =  'Grado en Ingeniería Informática (Plan 2015)';

 -- 9.Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019.
SELECT distinct p.nombre, p.apellido1, p.apellido2  FROM persona p JOIN alumno_se_matricula_asignatura asma ON p.id = asma.id_alumno JOIN curso_escolar ce ON asma.id_curso_escolar = ce.id where ce.anyo_inicio = '2018' AND ce.anyo_fin = '2019';

/*Resol les 6 següents consultes utilitzant les clàusules LEFT JOIN i RIGHT JOIN.*/


-- 1.Retorna un llistat amb els noms de tots els professors/es i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors/es que no tenen cap departament associat. El llistat ha de retornar quatre columnes, nom del departament, primer cognom, segon cognom i nom del professor/a. El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
SELECT  d.nombre AS Nombre_departamento, p.apellido1, p.apellido2, p.nombre FROM persona p right JOIN profesor pro ON p.id = pro.id_profesor LEFT JOIN departamento d ON d.id = pro.id_departamento ORDER BY d.nombre ASC, p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;

-- 2.Retorna un llistat amb els professors/es que no estan associats a un departament.
SELECT p.* FROM persona p right JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN departamento d ON pr.id_departamento = d.id WHERE pr.id_departamento IS NULL;

 -- 3.Retorna un llistat amb els departaments que no tenen professors/es associats.
SELECT  d.id, d.nombre AS Nombre_departamento FROM persona p right JOIN profesor pro ON p.id = pro.id_profesor right JOIN departamento d ON d.id = pro.id_departamento where id_departamento is null;

-- 4.Retorna un llistat amb els professors/es que no imparteixen cap assignatur
SELECT distinct p.id, p.nombre, p.apellido1, p.apellido2 FROM  profesor pr left JOIN persona p ON p.id = pr.id_profesor left JOIN asignatura asig ON pr.id_profesor = asig.id_profesor where asig.id_profesor is NULL;

-- 5.Retorna un llistat amb les assignatures que no tenen un professor/a assignat.
SELECT asig.nombre as Nombre_asignatura from asignatura asig Left JOIN profesor pro ON asig.id_profesor = pro.id_profesor where asig.id_profesor  is NULL;

 -- 6. Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
SELECT distinct d.id, d.nombre as nombre_departamento FROM departamento d LEFT JOIN profesor pro ON d.id = pro.id_departamento LEFT JOIN asignatura asig ON pro.id_profesor = asig.id_profesor WHERE asig.id IS NULL;


/*  consultes resum */

-- 1.Retorna el nombre total d'alumnes que hi ha.
SELECT  count(nombre) as numero_alumnos FROM persona where tipo = 'alumno';

-- 2.Calcula quants alumnes van néixer en 1999.
SELECT count(nombre) as nombre_alumno from persona where YEAR(fecha_nacimiento) ='1999';

-- 3.Calcula quants professors/es hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors/es que hi ha en aquest departament. El resultat només ha d'incloure els departaments que tenen professors/es associats i haurà d'estar ordenat de major a menor pel nombre de professors/es.
SELECT d.nombre, COUNT(pro.id_profesor) AS num_profesores FROM departamento d JOIN profesor pro ON d.id = pro.id_departamento GROUP BY d.id ORDER BY num_profesores DESC;

-- 4.Retorna un llistat amb tots els departaments i el nombre de professors/es que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors/es associats. Aquests departaments també han d'aparèixer en el llistat.
SELECT d.nombre, COUNT(pro.id_profesor) AS num_profesores FROM departamento d LEFT JOIN profesor pro ON d.id = pro.id_departamento GROUP BY d.id ORDER BY num_profesores DESC;

-- 5.Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingues en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat. El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
SELECT g.nombre, COUNT(asig.id) AS num_asignaturas FROM grado g LEFT JOIN asignatura asig ON g.id = asig.id_grado GROUP BY g.id ORDER BY num_asignaturas DESC;

-- 6.Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
SELECT g.nombre, COUNT(a.id) AS num_assignatures FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.id HAVING num_assignatures > 40 ORDER BY num_assignatures DESC;

-- 7.Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura. El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
SELECT g.nombre, a.tipo, SUM(a.creditos) AS total_creditos FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.id, a.tipo;

-- 10.Retorna totes les dades de l'alumne/a més jove.
SELECT * FROM persona WHERE tipo = 'alumno' ORDER BY fecha_nacimiento DESC LIMIT 1;







