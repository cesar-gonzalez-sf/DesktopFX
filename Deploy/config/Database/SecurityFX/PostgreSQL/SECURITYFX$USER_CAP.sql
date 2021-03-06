CREATE OR REPLACE FUNCTION securityfx$user_cap (
    _wss_user_code      IN  VARCHAR,
    _wss_profile_code   IN  INTEGER,
    _wss_station_code   IN  VARCHAR,
    --------------------------------
    _user_code          IN  VARCHAR,
    _capacity_code      IN  VARCHAR,
    _capacity_value     IN  VARCHAR,
    _capacity_state     IN  VARCHAR
) RETURNS void
AS $BODY$
--------------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
--------------------------------------------------------------------------------
BEGIN
    -- Add, modify or remove the user capacity
    IF (_capacity_state = 'A') THEN
        INSERT INTO ecuaccc2u (codigo_adi, cap_codigo, cap_valor) 
        VALUES (_user_code, _capacity_code, _capacity_value);
    ELSIF (_capacity_state = 'M') THEN
        UPDATE ecuaccc2u
        SET    cap_valor = _capacity_value
        WHERE  codigo_adi = _user_code
        AND    cap_codigo = _capacity_code;
    ELSIF (_capacity_state = 'R') THEN
        DELETE FROM ecuaccc2u
        WHERE  codigo_adi = _user_code
        AND    cap_codigo = _capacity_code;
    ELSE
        RAISE EXCEPTION 'Capacidad en estado inválido: %s', _capacity_state;
    END IF;
END;
$BODY$ LANGUAGE plpgsql;
