SELECT codigo,
       titulo AS sinal,
       origem,
       custo
FROM public.sinais_torre
WHERE titulo LIKE '%a%'
  AND origem IN ('Norte', 'Sul')
  AND custo BETWEEN 250 AND 450
  AND analista IS NOT NULL;

SELECT codigo,
       titulo AS sinal,
       prioridade,
       custo
FROM public.sinais_torre
WHERE origem IN ('Norte', 'Leste') AND prioridade >= 6
ORDER BY custo DESC, codigo ASC
LIMIT 3;

SELECT COUNT (*) AS quantidade,
       SUM (custo) AS soma_custo,
       AVG (custo) AS media_custo,
       MIN (custo) AS min_custo,
       MAX (custo) AS max_custo
FROM public.sinais_torre
WHERE origem IN ('Sul', 'Oeste') AND analista IS NOT NULL;

SELECT codigo,
       titulo AS sinal,
       prioridade
FROM public.sinais_torre
WHERE analista IS NULL AND prioridade >= 10;

SELECT protocolo,
       origem,
       impacto
FROM public.protocolos_torre
WHERE protocolo = 87654;

EXPLAIN
SELECT protocolo,
       origem,
       impacto
FROM public.protocolos_torre
WHERE protocolo = 87654;

CREATE INDEX indice_protocolo
ON public.protocolos_torre (protocolo);

SELECT protocolo,
       origem,
       impacto
FROM public.protocolos_torre
WHERE protocolo = 87654;

EXPLAIN
SELECT protocolo,
       origem,
       impacto
FROM public.protocolos_torre
WHERE protocolo = 87654;
