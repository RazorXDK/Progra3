-- Table: public.ArbolBinario

-- DROP TABLE IF EXISTS public."ArbolBinario";

CREATE TABLE IF NOT EXISTS public."ArbolBinario"
(
    "Estado" integer NOT NULL,
    "Dato" "char",
    "ID" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    CONSTRAINT "ArbolBinario_pkey" PRIMARY KEY ("Estado")
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."ArbolBinario"
    OWNER to postgres;