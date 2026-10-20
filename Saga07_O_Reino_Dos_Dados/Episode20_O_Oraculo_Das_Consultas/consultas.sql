SELECT id,
       titulo AS missao,
       recompensa
FROM public.missoes_oraculo
WHERE regiao = 'Norte';

SELECT m.id,
       m.titulo AS missao,
       m.recompensa
FROM public.missoes_oraculo AS m
WHERE recompensa > 300;

SELECT minNivel.id,
       minNivel.titulo AS missao,
       minNivel.regiao AS territorio,
       minNivel.nivel_minimo
FROM public.missoes_oraculo AS minNivel
WHERE nivel_minimo > 5;

SELECT id,
       titulo AS missao,
       regiao,
       nivel_minimo,
       recompensa
FROM public.missoes_oraculo
WHERE (regiao = 'Norte' AND nivel_minimo >= 3) OR (regiao = 'Sul' AND recompensa >= 300);

SELECT id,
       titulo AS missao,
       regiao,
       recompensa
FROM public.missoes_oraculo
WHERE titulo LIKE '%o%' AND regiao IN ('Norte', 'Sul') AND recompensa BETWEEN 180 AND 400;

SELECT id,
       titulo AS missao,
       regiao,
       responsavel
FROM public.missoes_oraculo
WHERE regiao IN ('Norte', 'Sul') AND responsavel IS NULL;

SELECT id,
       titulo AS missao,
       nivel_minimo,
       responsavel
FROM public.missoes_oraculo
WHERE responsavel IS NULL AND nivel_minimo >= 6;

SELECT id,
       titulo AS missao,
       nivel_minimo
FROM public.missoes_oraculo
ORDER BY nivel_minimo DESC, id ASC
LIMIT 5;

SELECT COUNT (*) AS quantidade,
       SUM(recompensa) AS total_recompensas,
       AVG(recompensa) AS media_recompensas,
       MIN(recompensa) AS menor_recompensa,
       MAX(recompensa) AS maior_recompensa
FROM public.missoes_oraculo
WHERE nivel_minimo >= 5 AND responsavel IS NOT NULL;

SELECT id,
       titulo AS missao,
       regiao,
       recompensa
FROM public.missoes_oraculo
WHERE (regiao = 'Norte' OR regiao = 'Sul') AND recompensa >= 200
ORDER BY recompensa DESC, id ASC
LIMIT 3;

SELECT id,
       titulo AS missao,
       recompensa
FROM public.missoes_oraculo
WHERE regiao = 'Oeste' AND recompensa >= 100;

EXPLAIN
SELECT id,
       titulo AS missao,
       recompensa
FROM public.missoes_oraculo
WHERE regiao = 'Oeste' AND recompensa >= 100;
