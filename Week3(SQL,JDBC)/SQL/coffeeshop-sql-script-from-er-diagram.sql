-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema coffeeshop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema coffeeshop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `coffeeshop` DEFAULT CHARACTER SET utf8 ;
USE `coffeeshop` ;

-- -----------------------------------------------------
-- Table `coffeeshop`.`drink_size`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `coffeeshop`.`drink_size` (
  `sz_id` INT NOT NULL AUTO_INCREMENT,
  `sz_name` VARCHAR(45) NULL,
  PRIMARY KEY (`sz_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `coffeeshop`.`menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `coffeeshop`.`menu` (
  `me_id` INT NOT NULL AUTO_INCREMENT,
  `me_name` VARCHAR(45) NULL,
  `me_price` DECIMAL(5,2) NULL,
  `me_sz_id` INT NULL,
  PRIMARY KEY (`me_id`),
  INDEX `fk_size_idx` (`me_sz_id` ASC) VISIBLE,
  CONSTRAINT `fk_size`
    FOREIGN KEY (`me_sz_id`)
    REFERENCES `coffeeshop`.`drink_size` (`sz_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
