DELIMITER $$

CREATE PROCEDURE delete_user_by_id(IN id int)

BEGIN

    DELETE FROM users 
    WHERE
    users.id = id;

    END$$

DELIMITER ;