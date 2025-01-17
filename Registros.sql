PGDMP     %                
    {        	   Registros    15.4    15.4 !    &           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            '           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            (           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            )           1262    16417 	   Registros    DATABASE     �   CREATE DATABASE "Registros" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Paraguay.1252';
    DROP DATABASE "Registros";
                postgres    false            �            1259    16570    ciudad_id_seq    SEQUENCE     v   CREATE SEQUENCE public.ciudad_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.ciudad_id_seq;
       public          postgres    false            �            1259    16418    ciudad    TABLE     �   CREATE TABLE public.ciudad (
    id integer DEFAULT nextval('public.ciudad_id_seq'::regclass) NOT NULL,
    ciudad character varying(30),
    departamento character varying(30),
    postal integer
);
    DROP TABLE public.ciudad;
       public         heap    postgres    false    219            �            1259    16576    clientes_idcliente_seq    SEQUENCE        CREATE SEQUENCE public.clientes_idcliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.clientes_idcliente_seq;
       public          postgres    false            �            1259    16430    clientes    TABLE     �   CREATE TABLE public.clientes (
    idcliente integer DEFAULT nextval('public.clientes_idcliente_seq'::regclass) NOT NULL,
    idpersona integer,
    fechaingreso date,
    calificacion character varying(30),
    estado character varying(20)
);
    DROP TABLE public.clientes;
       public         heap    postgres    false    220            �            1259    16578    cuentas_idcuenta_seq    SEQUENCE     }   CREATE SEQUENCE public.cuentas_idcuenta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.cuentas_idcuenta_seq;
       public          postgres    false            �            1259    16435    cuentas    TABLE     �  CREATE TABLE public.cuentas (
    idcuenta integer DEFAULT nextval('public.cuentas_idcuenta_seq'::regclass) NOT NULL,
    idclientes integer NOT NULL,
    nrocuenta character varying(30),
    fechaalta date,
    tipocuenta character varying(30),
    estado character varying(30),
    saldo real,
    nrocontrato character varying(30),
    costomantenimiento real,
    promedioacreditacion character varying(30),
    moneda character varying(30)
);
    DROP TABLE public.cuentas;
       public         heap    postgres    false    221            �            1259    16580    movimientos_idmovimiento_seq    SEQUENCE     �   CREATE SEQUENCE public.movimientos_idmovimiento_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.movimientos_idmovimiento_seq;
       public          postgres    false            �            1259    16442    movimientos    TABLE     i  CREATE TABLE public.movimientos (
    idmovimiento integer DEFAULT nextval('public.movimientos_idmovimiento_seq'::regclass) NOT NULL,
    idcuenta integer,
    fechamovimiento date,
    tipomovimiento character varying(30),
    saldoanterior real,
    saldoactual real,
    montomovimiento real,
    cuentaorigen real,
    cuentadestino real,
    canal real
);
    DROP TABLE public.movimientos;
       public         heap    postgres    false    222            �            1259    16582    personas_idpersona_seq    SEQUENCE        CREATE SEQUENCE public.personas_idpersona_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.personas_idpersona_seq;
       public          postgres    false            �            1259    16425    personas    TABLE     �  CREATE TABLE public.personas (
    idpersona integer DEFAULT nextval('public.personas_idpersona_seq'::regclass) NOT NULL,
    idciudad integer,
    nombre character varying(20),
    apellido character varying(20),
    tipodocumento character varying(30),
    numerodocumento character varying(30),
    direccion character varying(50),
    celular character varying(20),
    email character varying(30),
    estado character varying(20)
);
    DROP TABLE public.personas;
       public         heap    postgres    false    223                      0    16418    ciudad 
   TABLE DATA           B   COPY public.ciudad (id, ciudad, departamento, postal) FROM stdin;
    public          postgres    false    214   �(                 0    16430    clientes 
   TABLE DATA           \   COPY public.clientes (idcliente, idpersona, fechaingreso, calificacion, estado) FROM stdin;
    public          postgres    false    216   n)                 0    16435    cuentas 
   TABLE DATA           �   COPY public.cuentas (idcuenta, idclientes, nrocuenta, fechaalta, tipocuenta, estado, saldo, nrocontrato, costomantenimiento, promedioacreditacion, moneda) FROM stdin;
    public          postgres    false    217   �)                 0    16442    movimientos 
   TABLE DATA           �   COPY public.movimientos (idmovimiento, idcuenta, fechamovimiento, tipomovimiento, saldoanterior, saldoactual, montomovimiento, cuentaorigen, cuentadestino, canal) FROM stdin;
    public          postgres    false    218   w*                 0    16425    personas 
   TABLE DATA           �   COPY public.personas (idpersona, idciudad, nombre, apellido, tipodocumento, numerodocumento, direccion, celular, email, estado) FROM stdin;
    public          postgres    false    215   �*       *           0    0    ciudad_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.ciudad_id_seq', 8, true);
          public          postgres    false    219            +           0    0    clientes_idcliente_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.clientes_idcliente_seq', 1, false);
          public          postgres    false    220            ,           0    0    cuentas_idcuenta_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.cuentas_idcuenta_seq', 4, true);
          public          postgres    false    221            -           0    0    movimientos_idmovimiento_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.movimientos_idmovimiento_seq', 5, true);
          public          postgres    false    222            .           0    0    personas_idpersona_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.personas_idpersona_seq', 5, false);
          public          postgres    false    223                       2606    16424    ciudad Ciudad_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.ciudad
    ADD CONSTRAINT "Ciudad_pkey" PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.ciudad DROP CONSTRAINT "Ciudad_pkey";
       public            postgres    false    214            �           2606    16434    clientes Cliente_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY (idcliente);
 A   ALTER TABLE ONLY public.clientes DROP CONSTRAINT "Cliente_pkey";
       public            postgres    false    216            �           2606    16441    cuentas Cuentas_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.cuentas
    ADD CONSTRAINT "Cuentas_pkey" PRIMARY KEY (idcuenta);
 @   ALTER TABLE ONLY public.cuentas DROP CONSTRAINT "Cuentas_pkey";
       public            postgres    false    217            �           2606    16448    movimientos Movimientos_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.movimientos
    ADD CONSTRAINT "Movimientos_pkey" PRIMARY KEY (idmovimiento);
 H   ALTER TABLE ONLY public.movimientos DROP CONSTRAINT "Movimientos_pkey";
       public            postgres    false    218            �           2606    16429    personas Persona_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.personas
    ADD CONSTRAINT "Persona_pkey" PRIMARY KEY (idpersona);
 A   ALTER TABLE ONLY public.personas DROP CONSTRAINT "Persona_pkey";
       public            postgres    false    215            �           2606    16474    personas IdCiudad    FK CONSTRAINT     ~   ALTER TABLE ONLY public.personas
    ADD CONSTRAINT "IdCiudad" FOREIGN KEY (idciudad) REFERENCES public.ciudad(id) NOT VALID;
 =   ALTER TABLE ONLY public.personas DROP CONSTRAINT "IdCiudad";
       public          postgres    false    3199    214    215            �           2606    16459    cuentas IdCliente    FK CONSTRAINT     �   ALTER TABLE ONLY public.cuentas
    ADD CONSTRAINT "IdCliente" FOREIGN KEY (idclientes) REFERENCES public.clientes(idcliente) NOT VALID;
 =   ALTER TABLE ONLY public.cuentas DROP CONSTRAINT "IdCliente";
       public          postgres    false    3203    216    217            �           2606    16464    movimientos IdCuenta    FK CONSTRAINT     �   ALTER TABLE ONLY public.movimientos
    ADD CONSTRAINT "IdCuenta" FOREIGN KEY (idcuenta) REFERENCES public.cuentas(idcuenta) NOT VALID;
 @   ALTER TABLE ONLY public.movimientos DROP CONSTRAINT "IdCuenta";
       public          postgres    false    3205    217    218            �           2606    16469    clientes IdPersona    FK CONSTRAINT     �   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT "IdPersona" FOREIGN KEY (idpersona) REFERENCES public.personas(idpersona) NOT VALID;
 >   ALTER TABLE ONLY public.clientes DROP CONSTRAINT "IdPersona";
       public          postgres    false    216    215    3201               �   x�U�K�0���p��^کM� 'h	��Љ�pMnL����|�L�$�ʇ9�]h�����b�y�[hˊ�a�������]�V� �:���F����9��GⲧE��0��.���,9��֧~�㕦r�?mɎ�%�7��8;         S   x�3�4�4202�54�50��+���tL.�,��2�BC��D�3/"i�i�4�50�54B�g�i�i2�54D������ 3��         �   x�Mν�0���.A>'�0V�0#6�*ѥ�����I�S˹�6AP*�"%J�a^�q����v_�猝x�c-	��r>���b��E���v�hɥZU��ʘbe�����x�m}b��2#Ûj��T�vK?���/ϩk�F�m�uBx��6,         E   x�3���4202�5��5��)J�+NLN���K��4 BC �1 ���Iաg�eB�S2���qqq �.         �   x�e�AN�0E�?��	"{'�X!T�-�ijKN9�n��vʮ������c��qe{�Nm5�O�8��8@Z�H�`��2�}��8a7^�5V���:\r߅EԘV�8��R(�i{Ӕ������]�Rģ��埧�X�cp)Ex:rrB�D���F�K9�{���>��]�k\nHE��#v���y]���IS4���(j1����7�G]U�oY)     