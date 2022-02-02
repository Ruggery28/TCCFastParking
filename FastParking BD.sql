DROP DATABASE fastparking;
CREATE DATABASE fastparking;

USE fastparking;

CREATE TABLE usuario(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,  
	nome VARCHAR(64) NOT NULL,
	cpf CHAR(11) NOT NULL UNIQUE,
	nascimento VARCHAR(10),
	email VARCHAR(64) NOT NULL UNIQUE,
	senha VARCHAR(64) NOT NULL,
	saldo REAL NOT NULL DEFAULT 0.00
);

CREATE TABLE veiculo( 
	id_carro INTEGER AUTO_INCREMENT,
	id_usuario INTEGER NOT NULL,
	renavam VARCHAR(32),
	placa VARCHAR(32) NOT NULL UNIQUE,
	fabricacao INTEGER,
	modelo INTEGER,
	CONSTRAINT PRIMARY KEY (id_carro),
	CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuario(id)

);

CREATE TABLE estacionamento( 
	id_veiculo INTEGER NOT NULL,
	id_usuario INTEGER NOT NULL,
	lagradouro VARCHAR(32) NOT NULL,
	esquina1 VARCHAR(32),
	esquina2 VARCHAR(32),
	data_dia DATE,
	horario TIME,
	CONSTRAINT PRIMARY KEY (id_veiculo, id_usuario),
	CONSTRAINT FOREIGN KEY (id_veiculo) REFERENCES veiculo(id_carro),
	CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuario(id)

);

CREATE TABLE aquisicao_credito(
	id INTEGER AUTO_INCREMENT PRIMARY KEY, 
	id_usuario INTEGER NOT NULL,
	qt_creditos REAL NOT NULL,
	data_dia DATE,
	horario TIME,
	CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuario (id)
);

CREATE TABLE rotativo(
	id INTEGER AUTO_INCREMENT PRIMARY KEY, 
	id_usuario INTEGER NOT NULL,
	id_veiculo INTEGER NOT NULL,
	vl_pago REAL NOT NULL,
	data_dia DATE,
	horario TIME,
	CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuario (id),
	CONSTRAINT FOREIGN KEY (id_veiculo) REFERENCES veiculo(id_carro)
);



SELECT * FROM usuario;
SELECT * FROM veiculo; 
SELECT * FROM aquisicao_credito;
SELECT * FROM rotativo;

INSERT INTO usuario(nome,cpf,nascimento,email,senha) 
VALUES('Ruggery', '3232', '28101998', 'ruggery@gmail.com', '123456');




