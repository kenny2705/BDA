Create database Ticketwizard;
--	tabla evento
CREATE TABLE `ticketwizard`.`evento` (
  `id_Evento` INT NOT NULL AUTO_INCREMENT,
  `venue` VARCHAR(50) NULL,
  `fecha` DATETIME NULL,
  `nombre` VARCHAR(45) NULL,
  `ciudad` VARCHAR(45) NULL,
  `estado` VARCHAR(45) NULL,
  `descripcion` VARCHAR(250) NULL,
  PRIMARY KEY (`id_Evento`));
  
  -- tabla perfil
  CREATE TABLE `ticketwizard`.`perfil` (
  `id_Perfil` INT NOT NULL AUTO_INCREMENT,
  `nombre_completo` VARCHAR(100) NULL,
  `contraseña` INT NOT NULL,
  `correo` VARCHAR(45) NULL,
  `domicilio` VARCHAR(100) NULL,
  `fecha_nacimiento` DATE NULL,
  `edad` DATE NULL,
  `saldo` FLOAT NULL,
  PRIMARY KEY (`id_Perfil`));
  --	tabla boleto
CREATE TABLE `ticketwizard`.`boleto`(
`id_boleto` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`num_serie` VARCHAR(8),
`fila` VARCHAR(10),
`asiento` VARCHAR(10),
`precio_original` FLOAT NOT NULL,
`precio_reventa` FLOAT,
`estado_venta` BOOLEAN NOT NULL,
`id_evento` INT NOT NULL,
`id_perfil` INT NOT NULL,
 CONSTRAINT fk_id_Evento FOREIGN KEY (id_Evento) REFERENCES Evento(id_Evento),
 CONSTRAINT fk_id_perfil FOREIGN KEY (id_perfil) REFERENCES Perfil(id_perfil)
);
  -- tabla transaccion
  CREATE TABLE `ticketwizard`.`transaccion` (
  `id_Transaccion` INT NOT NULL AUTO_INCREMENT,
  `fecha_adquisicion` DATETIME NULL,
  `tipo_transaccion` VARCHAR(45) NULL,
  `total` FLOAT NULL,
  `id_perfil_comprador` INT NOT NULL,
  `id_perfil_vendedor` INT,
  `id_boleto` INT NOT NULL,
  PRIMARY KEY (`id_Transaccion`),
    CONSTRAINT fk_id_perfil_comprador FOREIGN KEY (id_perfil_comprador) REFERENCES Perfil(id_perfil),
    CONSTRAINT fk_id_perfil_vendedor FOREIGN KEY (id_perfil_vendedor) REFERENCES Perfil(id_perfil),
    CONSTRAINT fk_id_boleto FOREIGN KEY (id_boleto) REFERENCES Boleto(id_boleto)
  );

