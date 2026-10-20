-- Infraestrutura do experimento.
-- Reconstrói somente a tabela catalogo_busca.

DROP TABLE IF EXISTS public.catalogo_busca;

CREATE TABLE public.catalogo_busca (
                                       codigo INTEGER NOT NULL,
                                       regiao VARCHAR(20) NOT NULL,
                                       recompensa INTEGER NOT NULL
);

INSERT INTO public.catalogo_busca
(codigo, regiao, recompensa)
SELECT
    n,
    CASE
        WHEN n % 10 = 0 THEN 'Oeste'
        ELSE 'Norte'
        END,
    100 + (n % 901)
FROM generate_series(1, 100000) AS serie(n);

-- Coleta estatísticas para o planejador.
ANALYZE public.catalogo_busca;

-- Confirma a quantidade de registros.
SELECT COUNT(*) AS quantidade
FROM public.catalogo_busca;