SET ROLE postgres;

CREATE TABLE appointment (
    id                  BIGSERIAL           PRIMARY KEY,
    last_name           TEXT                NOT NULL DEFAULT '',
    first_name          TEXT                NOT NULL DEFAULT '',
    dob                 DATE                DEFAULT NULL,
    mrn                 TEXT                NOT NULL DEFAULT '',
    date                TIMESTAMP           DEFAULT NULL,
    clinician           TEXT                NOT NULL DEFAULT '',
    last_saved          TIMESTAMP           DEFAULT NULL
);

CREATE TABLE medication (
    id                          BIGSERIAL         PRIMARY KEY,
    appointment_id              BIGSERIAL,
    name                        TEXT              NOT NULL DEFAULT '',
    first_fill                  DATE              DEFAULT NULL,
    copay                       DECIMAL           NOT NULL DEFAULT 0,
    days_supply                 INTEGER           NOT NULL DEFAULT 0,
    FOREIGN KEY(appointment_id) REFERENCES appointment(id)
);