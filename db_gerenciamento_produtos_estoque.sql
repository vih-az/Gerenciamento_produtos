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

insert into produtos (codigo, nome, descricao, preco_unit, qtd_estoque, categoria, fornecedor) values
();


create table cliente (
    id_cliente int primary key not null auto_increment,
    nome varchar(100),
    cpf bigint not null,
    telefone bigint
);

insert into cliente (nome, cpf, telefone) values
();


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

insert into vendas (codigo_venda, cliente_id, produto_id, qtd_produtos) values
();