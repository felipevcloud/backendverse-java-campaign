SELECT codigo,
       regiao,
       recompensa
FROM public.catalogo_busca
WHERE codigo = 87543;

EXPLAIN
SELECT codigo,
       regiao,
       recompensa
FROM public.catalogo_busca
WHERE codigo = 87543;

CREATE INDEX indice_codigo
ON public.catalogo_busca (codigo);

SELECT codigo,
       regiao,
       recompensa
FROM public.catalogo_busca
WHERE codigo = 87543;

EXPLAIN
SELECT codigo,
       regiao,
       recompensa
FROM public.catalogo_busca
WHERE codigo = 87543;