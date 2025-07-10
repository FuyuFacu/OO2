Considere el siguiente extracto de codigo y diagrama de clases  UML de un framework para desarrollo de API Resis, en particular el modulo de autorizacion de acceso

[![250710-22h12m44s-screenshot.png](https://i.postimg.cc/cCxRJs9c/250710-22h12m44s-screenshot.png)](https://postimg.cc/TLsL7XXy)



Este framework provee una clase API, que define la logica invariante para 
- i. procesar un request HTTP, siempre verificando que se cumplan con todos los permisos de acceso, y 
- ii. Retornar el estado HTTP 200 OK para el caso en que se cumplan todos los permisos de acceso o retornar el estado HTTP 403 FORBIDDEN en caso de que alguno de los permisos no se cumpla.

Es responsabilidad de quienes utilizan el framework implementar la interfaz Permission para definir el comportamiento especifico para chequear los permisos de accesos (por ejemplo, para cualquier usuario registrado, solo para usuarios administradores, etc). Eso incluye tambien la logica para disparar AccessDeniedException o alguna subclase de esta.


```java
public class API {
	private List<Permission> permissions;
	public API(List<Permission> permissions) {
		super();
		this.permissions = permissions;
	}

	public Response processRequest (Request request) {
		...
		try {
			this.checkPermissions(request);
		} catch (AccessDeniedException e) {
			return new Response(HTTPStatus.403);
		}

		return new Response(HTTPStatus.200);
	}

	private void checkPermissions(Request request) throws AccessDeniedException {
		for (Premission permission: this.getPermissions()) {
			if (!permission.allowAccess(request)) {
				permission.throwException(request);
			}
		}
	}
}

public interface Permission {
	public boolean allowsAccess(Request request);
	public void throwException(Request request) throws AccessDeniedException;
}

```

### Tareas
Responda las siguientes preguntas, basandose en el subconjunto de clases y metodos del framework presentado anteriormente.

1. El comportamiento variable del framework (hotspots), esta implementado mediante herencia o composicion? Justifique su respuesta.
2. Observa hook methods? Cuales?
3. Que parte de lo que se dice anteriormente respecto al framework se corresponde con el frozenspot?
4. En lo que se describe y lo que se indica debe hacer quien utiliza el framework, observa inversion de control? donde?



## Respuesta:
1. El comportamiento variable es implementado mediante composicion, ya que la clase API posee una lista de tipo Permision, y dicha clase es aquella la cual es configurable, entonces con eso no modificas el comportamiento del framework. Y tambien otro indicio de que es por composicion es por que no posee ningun metodo abstracto el cual se pueda extender para crear subclases de la clase API.
   
2. Los hook methods que me encuentro son: allowAccess(request) y el throwException, el cual son hook methods que puedo implementar en mis subclases y configurarlos como desee el usuario.
   
3. Lo que se corresponde con el frozenspot seria el metodo proccessRequest, el cual maneja la respuesta a enviar en caso de que se reciba una excepcion de acceso denegado y en caso contrairo retorne HTTPStatus.200, lo que tambien se considerario frozen spot seria el constructor y el checkPermissions.
   
4. En donde observo inversion de control es en el metodo proccessRequest, por que es aquel que controla el flujo del framework y se encarga de procesar el request recibido pro parametro y aquel que se encarga de ejecutar los metodos que van a ejecutar los hook methods.
