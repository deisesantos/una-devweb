create table contato (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(256) NOT NULL,
  cpf VARCHAR(256) NOT NULL,
  sexo varchar(255)NOT NULL,  
  data_nasc VARCHAR(256) NOT NULL,
  endereco VARCHAR(256) NOT NULL,
  numero varchar (5) not null,
  complemento VARCHAR(256),
  cidade VARCHAR(256) NOT NULL,
  uf VARCHAR(256) NOT NULL,
  cep VARCHAR(256) NOT NULL,
  email VARCHAR(256) NOT NULL,
  tel VARCHAR(256) NOT NULL,
  camiseta boolean not null,
  PRIMARY KEY (id));



    