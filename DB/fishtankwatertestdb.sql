-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema fishtankwatertestdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `fishtankwatertestdb` ;

-- -----------------------------------------------------
-- Schema fishtankwatertestdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `fishtankwatertestdb` DEFAULT CHARACTER SET utf8 ;
USE `fishtankwatertestdb` ;

-- -----------------------------------------------------
-- Table `watertestresult`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `watertestresult` ;

CREATE TABLE IF NOT EXISTS `watertestresult` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nitrites` DECIMAL(4,2) NULL,
  `datetested` DATETIME NULL,
  `ammonia` DECIMAL(4,2) NULL,
  `nitrates` DECIMAL(4,2) NULL,
  `PH` DECIMAL(4,2) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS user1;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'user1';

SET SQL_MODE = '';
DROP USER IF EXISTS fishtankuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'fishtankuser'@'localhost' IDENTIFIED BY 'fishtankuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'fishtankuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `watertestresult`
-- -----------------------------------------------------
START TRANSACTION;
USE `fishtankwatertestdb`;
INSERT INTO `watertestresult` (`id`, `nitrites`, `datetested`, `ammonia`, `nitrates`, `PH`) VALUES (1, NULL, NULL, NULL, NULL, NULL);

COMMIT;

