4. ¿Que cambios harías si querés agregar monitores y periféricos?
Para incorporar monitores y periféricos:

No haria falta modificar Presupuesto ni Componente.

Solo tendria que agregar los nuevos productos en el Catalogo.
En el DirectorComponente, simplemente busco los nuevos componentes (por ejemplo, buscarComponente("Monitor 24 pulgadas")) y los agrego usando agregarComponente(...etcetc) si el PresupuestoBuilder tiene este método genérico.

3. ¿Qué deberías listar como cambios si agregás nuevas configuraciones?

Para agregar nuevas configuraciones:
Simplemente creo un nuevo metodo en DirectorComponente (por ejemplo construirPcOficina(), construirPcServidor()) que use el PresupuestoBuilder.

Si el PresupuestoBuilder tiene un metodo agregarComponente(Componente), no es necesario agregar nuevos métodos específicos.
El catálogo ya soporta nuevos componentes de manera dinamica (Catalogo.getComponente(String)).

No es necesario modificar Presupuesto, Componente ni Catalogo. * carita fachera *
