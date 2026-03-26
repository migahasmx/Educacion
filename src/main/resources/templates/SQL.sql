create schema if not exists miguel;

CREATE TABLE miguel.escuela
(
    id_escuela uuid NOT NULL,
    nombre_escuela character varying(255), 
    direccion_escuela varchar(255), 
    CONSTRAINT escuela_pkey PRIMARY KEY (id_escuela)
);

CREATE TABLE miguel.taller
(
    id_taller uuid NOT NULL,
    nombre_taller varchar(255),
    division_taller varchar(255),
    CONSTRAINT taller_pkey PRIMARY KEY (id_taller)
);

CREATE TABLE IF NOT EXISTS miguel.curso
(
    id_curso uuid NOT NULL,
    nombre_curso character varying(255),
    division_curso varchar(255),
    CONSTRAINT curso_pkey PRIMARY KEY (id_curso)
   
);

CREATE TABLE IF NOT EXISTS miguel.materia
(
    id_materia uuid NOT NULL,
    nombre_materia character varying(255),
    creditos_materia integer,
    CONSTRAINT materia_pkey PRIMARY KEY (id_materia)
);

CREATE TABLE IF NOT EXISTS miguel.carrera
(
    id_carrera uuid NOT NULL,
    id_escuela uuid NOT NULL,
    nombre_carrera character varying(255),
    CONSTRAINT carrera_pkey PRIMARY KEY (id_carrera, id_escuela),
    CONSTRAINT fk_escuela FOREIGN KEY (id_escuela)
        REFERENCES miguel.escuela (id_escuela)
);

CREATE TABLE IF NOT EXISTS miguel.datos_personales
(
    id_datos_personales uuid NOT NULL,
    curp character varying(255), 
    nombre character varying(255),  
    apellidos character varying(255),
    edad integer,
    grupo_sanguineo character varying(255),
    CONSTRAINT datos_personales_pkey PRIMARY KEY (id_datos_personales)
);

CREATE TABLE IF NOT EXISTS miguel.profesor
(
    id_profesor uuid NOT NULL,
    especialidad character varying(255),
    id_datos_personales uuid,
    CONSTRAINT profesor_pkey PRIMARY KEY (id_profesor),
    CONSTRAINT id_datos_personales_fk FOREIGN KEY (id_datos_personales)
        REFERENCES miguel.datos_personales (id_datos_personales)
);

CREATE TABLE IF NOT EXISTS miguel.curso_profesor
(
    id_curso uuid NOT NULL,
    id_profesor uuid NOT NULL,
    CONSTRAINT id_curso_fk FOREIGN KEY (id_curso)
        REFERENCES miguel.curso (id_curso),
    CONSTRAINT id_profesor_fk FOREIGN KEY (id_profesor)
        REFERENCES miguel.profesor (id_profesor)
);

CREATE TABLE IF NOT EXISTS miguel.alumno
(
    id_alumno uuid NOT NULL,
    matricula character varying(255),
    id_datos_personales uuid NOT NULL,
    CONSTRAINT alumno_pkey PRIMARY KEY (id_alumno),
    CONSTRAINT id_datos_personales_fk FOREIGN KEY (id_datos_personales)
        REFERENCES miguel.datos_personales (id_datos_personales)
);

CREATE TABLE IF NOT EXISTS miguel.alumno_taller
(
    id_taller uuid NOT NULL,
    id_alumno uuid NOT NULL,
    CONSTRAINT id_taller_fk FOREIGN KEY (id_taller)
        REFERENCES miguel.taller (id_taller),
    CONSTRAINT id_alumno_fk FOREIGN KEY (id_alumno)
        REFERENCES miguel.alumno (id_alumno) 
);

CREATE TABLE IF NOT EXISTS miguel.sistemas_escolares (
    id_sistemaescolar uuid PRIMARY KEY,
    id_alumno          uuid NOT NULL,
    id_profesor         uuid NOT NULL,
    id_carrera         uuid NOT NULL,
    id_escuela         uuid NOT NULL,
    id_materia         uuid NOT NULL,
    calificacion       NUMERIC(4,1) NOT NULL,
    CONSTRAINT fk_sistema_alumno
        FOREIGN KEY (id_alumno) 
        REFERENCES miguel.alumno (id_alumno),
    CONSTRAINT fk_sistema_profesor
        FOREIGN KEY (id_profesor) 
        REFERENCES miguel.profesor (id_profesor),
    CONSTRAINT fk_sistema_carrera
        FOREIGN KEY (id_carrera, id_escuela)
        REFERENCES miguel.carrera (id_carrera, id_escuela),
    CONSTRAINT fk_sistema_materia
        FOREIGN KEY (id_materia) 
        REFERENCES miguel.materia (id_materia)
);
