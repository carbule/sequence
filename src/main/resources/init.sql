-- 建表
CREATE TABLE sequence
(
    id BIGINT NOT NULL,
    PRIMARY KEY (id)
);

-- 最小值初始化
INSERT INTO sequence
VALUES (10000000);