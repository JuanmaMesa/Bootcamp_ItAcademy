-- MySQL Script generated by MySQL Workbench
-- mié 15 nov 2023 17:41:15
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Pizzeria` ;

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pizzeria` ;
USE `Pizzeria` ;

-- -----------------------------------------------------
-- Table `Pizzeria`.`Province`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Province` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Province` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`city`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`city` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `idProvince` INT NOT NULL,
  `postCode` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_city_1_idx` (`idProvince` ASC) VISIBLE,
  CONSTRAINT `fk_city_1`
    FOREIGN KEY (`idProvince`)
    REFERENCES `Pizzeria`.`Province` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Customer` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `Surname` VARCHAR(100) NOT NULL,
  `address` VARCHAR(300) NOT NULL,
  `postCode` VARCHAR(15) NOT NULL,
  `idCity` INT NULL,
  `idprovince` INT NULL,
  `phone` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Customer_1_idx` (`idCity` ASC) VISIBLE,
  INDEX `fk_Customer_2_idx` (`idprovince` ASC) VISIBLE,
  CONSTRAINT `fk_Customer_1`
    FOREIGN KEY (`idCity`)
    REFERENCES `Pizzeria`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_2`
    FOREIGN KEY (`idprovince`)
    REFERENCES `Pizzeria`.`Province` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Store`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Store` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Store` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(300) NULL,
  `postCode` VARCHAR(15) NULL,
  `idCity` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Store_1_idx` (`idCity` ASC) VISIBLE,
  CONSTRAINT `fk_Store_1`
    FOREIGN KEY (`idCity`)
    REFERENCES `Pizzeria`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Employee` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `surname` VARCHAR(100) NOT NULL,
  `NIF` VARCHAR(10) NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  `role` ENUM("cook", "delivery") NOT NULL,
  `idStore` INT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Employee_1`
    FOREIGN KEY (`idStore`)
    REFERENCES `Pizzeria`.`Store` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Order` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dateTime` DATETIME NOT NULL,
  `type` ENUM("delivery", "pickup") NOT NULL,
  `idCustomer` INT NOT NULL,
  `idStore` INT NOT NULL,
  `totalPrice` FLOAT NOT NULL,
  `idDeliveryEmployee` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Order_1_idx` (`idCustomer` ASC) VISIBLE,
  INDEX `fk_Order_2_idx` (`idDeliveryEmployee` ASC) VISIBLE,
  INDEX `fk_Order_3_idx` (`idStore` ASC) VISIBLE,
  CONSTRAINT `fk_Order_1`
    FOREIGN KEY (`idCustomer`)
    REFERENCES `Pizzeria`.`Customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Order_2`
    FOREIGN KEY (`idDeliveryEmployee`)
    REFERENCES `Pizzeria`.`Employee` (`id`)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Order_3`
    FOREIGN KEY (`idStore`)
    REFERENCES `Pizzeria`.`Store` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Product_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Product_type` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Product_type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Category` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Pizza`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Pizza` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Pizza` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(300) NULL,
  `image` VARCHAR(300) NULL,
  `price` FLOAT NOT NULL,
  `id_category` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_category_idx` (`id_category` ASC) VISIBLE,
  CONSTRAINT `fk_category`
    FOREIGN KEY (`id_category`)
    REFERENCES `Pizzeria`.`Category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Product`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Product` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(300) NULL,
  `image` VARCHAR(300) NULL,
  `price` FLOAT NOT NULL,
  `idType` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Product_1_idx` (`idType` ASC) VISIBLE,
  CONSTRAINT `fk_Product_1`
    FOREIGN KEY (`idType`)
    REFERENCES `Pizzeria`.`Product_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Product_2`
    FOREIGN KEY (`idType`)
    REFERENCES `Pizzeria`.`Pizza` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Order_detail`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pizzeria`.`Order_detail` ;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`Order_detail` (
  `idOrder` INT NOT NULL,
  `idProduct` INT NOT NULL,
  `quantity` INT NOT NULL,
  INDEX `fk_Order_detail_1_idx` (`idOrder` ASC) VISIBLE,
  INDEX `fk_Product_idx` (`idProduct` ASC) VISIBLE,
  CONSTRAINT `fk_Order_detail_1`
    FOREIGN KEY (`idOrder`)
    REFERENCES `Pizzeria`.`Order` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Product`
    FOREIGN KEY (`idProduct`)
    REFERENCES `Pizzeria`.`Product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
