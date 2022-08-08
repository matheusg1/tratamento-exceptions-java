# Tratamento de exceções - Java
Exercício do curso "**Java COMPLETO Programação Orientada a Objetos + Projetos**" pela Udemy, com o professor **Nélio Alves**:

> Fazer um programa para ler os dados de uma conta bancária e depois
> realizar um saque nesta conta bancária, mostrando o novo saldo. Um
> saque não pode ocorrer ou se não houver saldo na conta, ou se o valor
> do saque for superior ao limite de saque da conta.

### Resultado esperado:
    Enter account data  
    Number: 8021   
    Holder: Bob Brown  
    Initial balance: 500.00   
    Withdraw limit: 300.00   
    Enter amount for withdraw: 100.00 
    New balance: 400.00
    
    Enter account data 
    Number: 8021 
    Holder: Bob Brown 
    Initial balance: 500.00 
    Withdraw limit: 300.00 
    Enter amount for withdraw: 400.00 
    Withdraw error: The amount exceeds withdraw limit
---

### Código usado para tratamendo de exceções:

	if(balance <=  0){
		throw new DomainException("Account balance is not enough");
	}
	if(balance < amount){
		throw new DomainException("Amount required is higher than the balance");
	}
	if(amount > withdrawLimit){
		throw new DomainException("Amount required is higher than the withdraw limit");
	}
---
### Resultado obtido usando os exemplos de entrada citados acima:


    Enter account data
	Number: 8021
	Holder: Bob Brown
	Initial balance: 500
	Withdraw limit: 300
	Enter amount for withdraw: 100
	New balance: 400,00
	End of program
    

	Enter account data
	Number: 8021
	Holder: Bob Brown
	Initial balance: 500
	Withdraw limit: 300
	Enter amount for withdraw: 400
	ERROR, Amount required is higher than the withdraw limit
	End of program
---
Ferramentas utilizadas: 
<p align="left">
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> 
 <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> 