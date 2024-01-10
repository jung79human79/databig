-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema shopping
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `test` ;

-- -----------------------------------------------------
-- Table `test`.`t_cus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`t_cus` (
  `customer_num` INT NOT NULL,
  `customer_name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`customer_num`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `test`.`t_order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test`.`t_order` (
  `order_num` INT NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `quantity` INT NOT NULL,
  `price` INT NOT NULL,
  `customer_num` INT NOT NULL,
  PRIMARY KEY (`order_num`),
  INDEX `fk_t_order_t_cus_idx` (`customer_num` ASC) VISIBLE,
  CONSTRAINT `fk_t_order_t_cus`
    FOREIGN KEY (`customer_num`)
    REFERENCES `test`.`t_cus` (`customer_num`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

