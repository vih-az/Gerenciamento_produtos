create database loja_computadores;

use loja_computadores;

create table produtos 
(
	id_produto int primary key not null auto_increment,
    codigo int not null,
    nome varchar(50) not null,
    descricao varchar(100),
    qtd_estoque int,
    categoria varchar(20),
    preco_unit int,
    fornecedor varchar(30)
);

create table cliente (
    id_cliente int primary key not null auto_increment,
    nome varchar(100),
    cpf bigint not null,
    telefone bigint
);

create table vendas
(
	id_vendas int primary key not null,
    codigo_venda int,
    cliente_id int not null,
    produto_id int not null,
    qtd_produtos int,
    
    foreign key(cliente_id) references cliente(id_cliente),
    foreign key(produto_id) references produtos(id_produto)
);