-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema college
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema college
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `college` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `college` ;

-- -----------------------------------------------------
-- Table `college`.`Department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `college`.`Department` (
  `department_code` INT NOT NULL AUTO_INCREMENT,
  `department_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`department_code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `college`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `college`.`Student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `student_name` VARCHAR(45) NOT NULL,
  `student_height` DECIMAL(5) NULL,
  `department_code` INT NOT NULL,
  PRIMARY KEY (`student_id`),
  INDEX `fk_Student_Department_idx` (`department_code` ASC) VISIBLE,
  CONSTRAINT `fk_Student_Department`
    FOREIGN KEY (`department_code`)
    REFERENCES `college`.`Department` (`department_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `college`.`Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `college`.`Professor` (
  `professor_code` INT NOT NULL AUTO_INCREMENT,
  `professor_name` VARCHAR(45) NOT NULL,
  `department_code` INT NOT NULL,
  PRIMARY KEY (`professor_code`),
  INDEX `fk_Professor_Department1_idx` (`department_code` ASC) VISIBLE,
  CONSTRAINT `fk_Professor_Department1`
    FOREIGN KEY (`department_code`)
    REFERENCES `college`.`Department` (`department_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `college`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `college`.`Course` (
  `course_code` INT NOT NULL AUTO_INCREMENT,
  `course_name` VARCHAR(45) NOT NULL,
  `start_date` DATETIME NOT NULL,
  `end_date` DATETIME NOT NULL,
  `professor_code` INT NOT NULL,
  PRIMARY KEY (`course_code`),
  INDEX `fk_Course_Professor1_idx` (`professor_code` ASC) VISIBLE,
  CONSTRAINT `fk_Course_Professor1`
    FOREIGN KEY (`professor_code`)
    REFERENCES `college`.`Professor` (`professor_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `college`.`Student_Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `college`.`Student_Course` (
  `id` INT NOT NULL,
  `enrolment_date` DATETIME NULL DEFAULT now(),
  `student_id` INT NOT NULL,
  `course_code` INT NOT NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_Student_Course_Student1_idx` (`student_id` ASC) VISIBLE,
  INDEX `fk_Student_Course_Course1_idx` (`course_code` ASC) VISIBLE,
  PRIMARY KEY (`student_id`, `course_code`),
  CONSTRAINT `fk_Student_Course_Student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `college`.`Student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Student_Course_Course1`
    FOREIGN KEY (`course_code`)
    REFERENCES `college`.`Course` (`course_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
