# language: pt
# encoding: utf-8
Funcionalidade: Acesso ao site do Bugbank

  Cenario: Acesso bem-sucedido ao site
    Dado que o usuário acessa o bugbank
    Entao A página do bugbank é exibida

  Cenario: Cadastro bem-sucedido no site
    Dado que o usuário acessa o bugbank
    E clica em registrar
    E preenche as informações
    Quando clica em cadastrar
#    Entao valida a mensagem de sucesso