CREATE TABLE `projeto`.`categoriaCampanha` (
  `idcateCamp` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NULL,
  `dtcad` DATETIME NULL,
  `idusu` INT NULL,
  `delet` VARCHAR(1) NULL DEFAULT ' ',
  PRIMARY KEY (`idcateCamp`),
  UNIQUE INDEX `idusu_UNIQUE` (`idusu` ASC) VISIBLE);
