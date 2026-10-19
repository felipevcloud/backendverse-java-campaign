DROP TABLE IF EXISTS public.credenciais_arena;

CREATE TABLE public.credenciais_arena (
    codigo VARCHAR(12),
    titular VARCHAR(80),
    apelido VARCHAR(30),
    tentativas INTEGER,
    data_expiracao DATE
);

ALTER TABLE public.credenciais_arena ADD CONSTRAINT pk_credenciais_arena PRIMARY KEY (codigo);

ALTER TABLE public.credenciais_arena ALTER COLUMN titular SET NOT NULL;

ALTER TABLE public.credenciais_arena ADD CONSTRAINT uq_credenciais_arena UNIQUE (apelido);

ALTER TABLE public.credenciais_arena ALTER COLUMN tentativas SET NOT NULL;

ALTER TABLE public.credenciais_arena ADD CONSTRAINT ck_credenciais_arena_tentativas CHECK ( tentativas >= 0 );

ALTER TABLE public.credenciais_arena ALTER COLUMN tentativas SET DEFAULT 3;
