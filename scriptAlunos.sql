-- MySQL Script generated by MySQL Workbench
-- Thu Mar 16 21:41:08 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sistemaalunos
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sistemaalunos` ;

-- -----------------------------------------------------
-- Schema sistemaalunos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistemaalunos` DEFAULT CHARACTER SET utf8 ;
USE `sistemaalunos` ;

-- -----------------------------------------------------
-- Table `sistemaalunos`.`Alunos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemaalunos`.`Alunos` (
  `idAlunos` INT NOT NULL AUTO_INCREMENT,
  `AlunoNome` VARCHAR(45) NOT NULL,
  `RaAluno` INT NOT NULL,
  `CpfAluno` INT NOT NULL,
  `RgAluno` VARCHAR(45) NOT NULL,
  `TelefoneAluno` INT NOT NULL,
  `EndRua` VARCHAR(45) NOT NULL,
  `EndNumero` INT NOT NULL,
  `EndComplemento` VARCHAR(45) NULL,
  `EndBairro` VARCHAR(45) NOT NULL,
  `EndCidade` VARCHAR(45) NOT NULL,
  `EndEstado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAlunos`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
