Feature: Validar página do Google

  Scenario: Acessar Google e validar o título

    Given que o usuário acessa o Google
    Then o título da página deve ser "Google"