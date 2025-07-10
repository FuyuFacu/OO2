## Mi respuesta


```java
abstract class EmailFilter {
	private Emailinbox emailInbox;

	public EmailFilter(EmailInbox emailInbox) {
		this.emailInbox = emailInbox;
	}

	public fitlerEmail(Email anEmail) {
		if (this.isEmailAlloweed(anEmail)) {
			this.addEmail(anEmail);
		}
	}

	public abstract Boolean isEmailAlloweed(Email anEmail);
	public abstract void addEmail(Email anEmail);

}
```

1. El comportamiento variable del framework se encuentra implementado mediante herencia: La clase EmailFilter es abstracta y define los metodos abstractos (isEmailAllowed y addEmail) que las subclases van a implementar, por lo tanto las subclases extienden el comportamiento base adaptandolo dependiendo del contexto en el que esten. 
   Si hubiera sido composicion, entonces el filtro deberia tener algun atributo que implemente cierta interfaz y entonces delegaria dicho comportamiento a ese objeto en lugar de definir metodos abstractos para que las subclases lo extiendan.
   
2. La inversion de control se encuentra en filterEmail(), lineas 8 a 12
   Justificacion:
   En este metodos, el framework es aquel que controla el flujo y llama a los metodos abstractos isEmailAllowed y addEmail(), los cuale van a ser implementados por las subclases. Esto se refiere a que el framework es quien decide como y cuando se ejecuta la logica que el usuario define.
   
3. El metodo isEmailAllowed es un hotspot ya que el framework en si deja que pueda ser extendido dicho metodo
   El metodo mencionado con anterioridad actua como un hook method, entonces puedo extender una subclase y poner mi propia implementacion sin modificar la base del framework.
