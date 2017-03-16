
-- -----------------------------------------------------
-- Schema sistemaAlunos
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sistemaAlunos` ;

-- -----------------------------------------------------
-- Schema sistemaAlunos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistemaAlunos` DEFAULT CHARACTER SET utf8 ;
USE `sistemaAlunos` ;

-- -----------------------------------------------------
-- Table `sistemaAlunos`.`Enderco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemaAlunos`.`Enderco` (
  `idEnderco` INT NOT NULL AUTO_INCREMENT,
  `Rua` VARCHAR(45) NOT NULL,
  `Numero` INT NOT NULL,
  `Bairro` VARCHAR(45) NOT NULL,
  `Complemento` VARCHAR(45),
  `Cidade` VARCHAR(45) NOT NULL,
  `Estado` VARCHAR(45) NOT NULL,
  `cep` INT NOT NULL,
  PRIMARY KEY (`idEnderco`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistemaAlunos`.`Aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemaAlunos`.`Aluno` (
  `idAluno` INT NOT NULL AUTO_INCREMENT,
  `nomeAluno` VARCHAR(45) NOT NULL,
  `cpfAluno` INT NOT NULL,
  `raAluno` VARCHAR(45) NOT NULL,
  `telefoneAluno` INT NOT NULL,
  `Enderco_idEnderco` INT NOT NULL,
  PRIMARY KEY (`idAluno`),
  FOREIGN KEY (Enderco_idEnderco) references Enderco(idEnderco))
ENGINE = InnoDB;

