-- TRIGGERS
USE  ticketwizard;
-- Habilitar log_bin_trust_function_creators
SET GLOBAL log_bin_trust_function_creators = 1;

-- FUNCION CALCULAR EDAD
DELIMITER $$

CREATE FUNCTION calcular_edad(fecha_nacimiento DATE) RETURNS INT
BEGIN
    DECLARE edad INT;
    SET edad = TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE());
    RETURN edad;
END $$

DELIMITER ;

-- TRIGGER PARA CALCULAR LA EDAD AL INSERTAR
DELIMITER $$

CREATE TRIGGER calcular_edad_antes_insert BEFORE INSERT ON perfil
FOR EACH ROW
BEGIN
    SET NEW.edad = calcular_edad(NEW.fecha_nacimiento);
END $$

DELIMITER ;

-- TRIGGER PARA ACTUALIZAR LA EDAD AL MODIFICAR
DELIMITER $$

CREATE TRIGGER calcular_edad_antes_update BEFORE UPDATE ON perfil
FOR EACH ROW
BEGIN
    SET NEW.edad = calcular_edad(NEW.fecha_nacimiento);
END $$

DELIMITER ;

-- TRIGGER PARA ESTABLECER EL ROL EN USUARIO
DELIMITER $$

CREATE TRIGGER inicializar_rol_antes_insert BEFORE INSERT ON perfil
FOR EACH ROW
BEGIN
    SET NEW.rol = 'user'; -- Asigna el rol 'user' por defecto
END $$

DELIMITER ;