DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS equipments;
DROP TABLE IF EXISTS categories;

CREATE TABLE categories
(
    id          UUID        NOT NULL,
    name        VARCHAR(50) NOT NULL,
    created_at  TIMESTAMP   NOT NULL,
    updated_at  TIMESTAMP,
    PRIMARY KEY (id)
);

CREATE TABLE equipments
(
    id               UUID         NOT NULL,
    name             VARCHAR(50)  NOT NULL,
    description      VARCHAR(150),
    brand            VARCHAR(50),
    model            VARCHAR(50),
    serial_number    VARCHAR(100),
    quantity         INTEGER      NOT NULL,
    acquisition_date TIMESTAMP,
    condition        VARCHAR(50)  NOT NULL,
    status           VARCHAR(50)  NOT NULL,
    storage_location VARCHAR(255) NOT NULL,
    replacement_cost DECIMAL(19, 2),
    notes            VARCHAR(255),
    created_at       TIMESTAMP    NOT NULL,
    updated_at       TIMESTAMP,
    category_id      UUID         NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_equipment_category FOREIGN KEY (category_id) REFERENCES categories (id)
);

CREATE TABLE users
(
    id           UUID         NOT NULL,
    full_name    VARCHAR(150) NOT NULL,
    email        VARCHAR(255) NOT NULL,
    phone_number VARCHAR(50)  NOT NULL,
    status       VARCHAR(50)  NOT NULL,
    created_at   TIMESTAMP    NOT NULL,
    updated_at   TIMESTAMP,
    PRIMARY KEY (id),
    CONSTRAINT uk_user_email UNIQUE (email)
);

INSERT INTO categories (id, name, created_at)
VALUES (RANDOM_UUID(), 'Centro de Controle/ Switching', NOW()),
       (RANDOM_UUID(), 'Câmeras e Acessórios', NOW()),
       (RANDOM_UUID(), 'Transmissão e Sinal', NOW()),
       (RANDOM_UUID(), 'Comunicação e Direção', NOW()),
       (RANDOM_UUID(), 'Monitoramento/ Saídas', NOW()),
       (RANDOM_UUID(), 'Infraestrutura e Suporte', NOW()),
       (RANDOM_UUID(), 'Telão e Multimídia', NOW()),
       (RANDOM_UUID(), 'Paineis de Led', NOW()),
       (RANDOM_UUID(), 'Sistema de Sonorização', NOW()),
       (RANDOM_UUID(), 'Sistema de Iluminação', NOW());

INSERT INTO users (id, full_name, email, phone_number, status, created_at)
VALUES (RANDOM_UUID(), 'Thiago Soares', 'thiagosoares@igrejared.com', '+55 11 98236-1864', 'ACTIVE', NOW()),
       (RANDOM_UUID(), 'Rafaela Terto', 'rafinhaterto@gmail.com', '+55 11 96594-5522', 'ACTIVE', NOW());