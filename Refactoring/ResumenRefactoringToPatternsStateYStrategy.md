## Pasos refinados para el replace conditional with strategy method

1. Creo clase strategy
2. Creo metodo en clase strategy
3. Aplico move method
4. Creo v.i en contexto que referencie a Strategy
5. Cambio metodo de clase contexto para que delege su comportamiento a strategy
6. agregar setter para inyectar strategia en tiempo de ejecucion
7. Elimino setter anterior y v.i anterior
8. Reemplazo parametro anterior en constructor por instancia de Strategy
9. Aplico replace conditional with polymorfism a Strategy

---

## Pasos refinados para el replace conditional with state method

1. Replace Type-Code with Class -> tomar la v.i que representaba el estado y convertirla en una superclase `Estado`
2. Extract Subclass -> Crear subclase de `Estado` por cada valor estado que existia en el codigo original.
3. Move Method -> Para cada metodo en clase contexto que contenia condicionales que modificaban el estado, trasladar dicho metodo a superClase `Estado`
4. Push Down method -> En cada subclase de `Estado` extraer los metodos que solo aplican cuando el objeto está en ese estado, eliminando alli las comprobaciones condicionales ya obsoletas.
5. Definir metodos abstractos o por defecto en la superclase -> En superClase `Estado`, declarar abstractos los métodos que luego cada subclase implementará o va a sobreescribir
6. Actualizar la referencia al estado en la clase contexto -> Reemplazar las asignaciones a la v.i. primitiva por cambios de objeto estado

---

### Memotecnica para recordar los pasos de State:
**Rodrigo Estudia Mucho Para Dibujar Anime**

**Rodrigo** → Replace Type‑Code with Class

**Estudia** -> Extract Subclass (Haciendo referencia a la superclase Estado creada)

**Mucho** -> Move Method

**Para** -> Push Down Method

**Dibujar** -> Definir métodos abstractos/por defecto (clase Estado)

**Anime** -> Actualizar la referencia al estado en la clase contexto
