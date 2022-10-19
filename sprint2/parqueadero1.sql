-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`cliente` ;

CREATE TABLE IF NOT EXISTS `mydb`.`cliente` (
  `Id_cliente` INT NOT NULL AUTO_INCREMENT,
  `Nombre_cliente` VARCHAR(45) NOT NULL,
  `Cedula_cliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id_cliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`vehiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`vehiculo` ;

CREATE TABLE IF NOT EXISTS `mydb`.`vehiculo` (
  `Id_vehiculo` INT NOT NULL AUTO_INCREMENT,
  `Placa_vehiculo` VARCHAR(6) NOT NULL,
  `Tipo_vehiculo` VARCHAR(6) NOT NULL,
  `Hora_entrada_vehiculo` DATETIME NOT NULL,
  `Hora_salida_vehiculo` DATETIME NOT NULL,
  PRIMARY KEY (`Id_vehiculo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cliente_vehiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Cliente_vehiculo` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Cliente_vehiculo` (
  `vehiculo_Id_vehiculo` INT NOT NULL,
  `cliente_Id_cliente` INT NOT NULL,
  PRIMARY KEY (`vehiculo_Id_vehiculo`, `cliente_Id_cliente`),
  INDEX `fk_vehiculo_has_cliente_cliente1_idx` (`cliente_Id_cliente` ASC),
  INDEX `fk_vehiculo_has_cliente_vehiculo_idx` (`vehiculo_Id_vehiculo` ASC),
  CONSTRAINT `fk_vehiculo_has_cliente_vehiculo`
    FOREIGN KEY (`vehiculo_Id_vehiculo`)
    REFERENCES `mydb`.`vehiculo` (`Id_vehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vehiculo_has_cliente_cliente1`
    FOREIGN KEY (`cliente_Id_cliente`)
    REFERENCES `mydb`.`cliente` (`Id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
