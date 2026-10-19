-- Reconstruir o laboratório
-- Executar a partir da raiz do repositório
\i 'Saga07_O_Reino_Dos_Dados/Episode19_As_Tabelas_Da_Verdade/schema.sql'

-- Casos válidos

-- Sem apelido e sem tentativas informadas
INSERT INTO public.credenciais_arena (codigo, titular)
VALUES ('AR001', 'Mira');

-- Borda: zero tentativas, sem apelido
INSERT INTO public.credenciais_arena
(codigo, titular, tentativas, data_expiracao)
VALUES ('AR002', 'Taro', 0, '2026-12-31');

-- Com apelido e quantidade explícita
INSERT INTO public.credenciais_arena
(codigo, titular, apelido, tentativas)
VALUES ('AR003', 'Luna', 'Fenix', 2);


-- Casos inválidos intencionais

-- Código duplicado
INSERT INTO public.credenciais_arena (codigo, titular)
VALUES ('AR001', 'Nilo');

-- Apelido duplicado
INSERT INTO public.credenciais_arena
(codigo, titular, apelido)
VALUES ('AR004', 'Sia', 'Fenix');

-- Tentativas negativas
INSERT INTO public.credenciais_arena
(codigo, titular, tentativas)
VALUES ('AR005', 'Vex', -1);

-- Titular nulo
INSERT INTO public.credenciais_arena (codigo, titular)
VALUES ('AR006', NULL);

-- NULL explícito nas tentativas
INSERT INTO public.credenciais_arena
(codigo, titular, tentativas)
VALUES ('AR007', 'Sol', NULL);


-- Inspeção dos registros aceitos
SELECT * FROM public.credenciais_arena;

-- Verificação da ausência de valores
SELECT
    codigo,
    apelido IS NULL AS sem_apelido,
    data_expiracao IS NULL AS sem_expiracao
FROM public.credenciais_arena;