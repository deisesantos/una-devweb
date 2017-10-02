create table cliente(
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(256) NOT NULL,
  idade int,
  camiseta VARCHAR(2) NULL,
  opcao_laser VARCHAR(255) NOT NULL,
  sexo VARCHAR(10) NOT NULL,
  PRIMARY KEY (id));