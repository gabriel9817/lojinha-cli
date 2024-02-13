(ns loja.core)

(defn menu_inicial

  []
  (println "Escolha uma opçao: ")
  (println "1- Login")
  (println "2- Cadastro")
  (println "3- Sair")

  )
(defn menu_login
  []
  (println "Digite seu login: ")
  ;;(verifica_login)
  (println "Digite sua senha: ")
  ;;(verifica_senha)
  )
(defn menu_loja
  []
  (println "1- Mostrar Catalogo: ")
  ;;catalogo
  (println "2- Meu perfil:")
  ;;(menu_perfil)
  (println "3- Sair")
  ;;(menu_inicial)
  )

(defn menu_perfil
  []
  (println "1- Mostrar meu perfil: ")
  (println "2- Alterar meus dados: ")
  (println "3- Apagar conta: ")
  (println "4- Voltar ao menu:")
  )

(defn menu_admin
  []
  (println "1- Inserir produto: ")
  (println "2- Mostrar catalogo: ")
  (println "3- Alterar dados do produto: ")
  (println "4- Apagar produto: ")
  (println "5- Criar conta: ")
  (println "6- Alterar dados da conta:")
  (println "7- Mostrar lista de contas:")
  (println "8- Apagar conta: ")
  )

(defn cadastre_pf
  []
  (println "Digite seu nome: ")
  ;;amarzena nome
  (println "Digite seu cpf:")
  ;;(verifica_cpf)
  (println "Digite seu telefone:")
  ;;(verifica_telefone)
  (println "Digite seu login: ")
  ;;(verifica_login)
  (println "Digite sua senha: ")
  ;;(verifica_senha)
  )

(defn cadastre_pj
  []
  (println "Digite sua razao social: ")
  ;;amarzena nome
  (println "Digite seu cnpj:")
  ;;(verifica_cnpj)
  (println "Digite seu telefone:")
  ;;(verifica_telefone)
  (println "Digite seu login: ")
  ;;(verifica_login)
  (println "Digite sua senha: ")
  ;;(verifica_senha)
   )


