El objetivo de este ejercicio realizado en clase ha sido comprender el funcionamiento del Patrón Estructural Composite creando un sistema que represente la estructura de una universidad, incluyendo sus facultades, sus departamentos y sus profesores.

El ejercicio consta de las siguientes clases principales:

- NominaComponente: Esta clase es una interfaz que define el comportamiento básico de un componente de nómina. Puede representar cualquier entidad que participe en el cálculo de 
  una nómina, como una universidad, una facultad, un departamento o un profesor. Define métodos para calcular la nómina y para agregar y eliminar componentes de la nómina.
- UniversidadComposite: Esta clase representa una universidad y actúa como un componente compuesto en el patrón Composite. Puede contener una o más facultades y se encarga de   
  calcular la nómina total de la universidad, que incluye las nóminas de todas sus facultades.
- FacultadComposite: Esta clase representa una facultad dentro de una universidad y también actúa como un componente compuesto. Puede contener uno o más departamentos y se 
  encarga de calcular la nómina total de la facultad, que incluye las nóminas de todos sus departamentos.
- DepartamentoComposite: Esta clase representa un departamento dentro de una facultad y actúa como un componente compuesto. Puede contener uno o más profesores y se encarga de 
  calcular la nómina total del departamento, que incluye las nóminas de todos sus profesores.
- ProfesorComposite:  Esta clase representa a un profesor dentro de un departamento y actúa como una hoja en el patrón Composite. Calcula su propia nómina individual en función 
  de su salario y el número de horas trabajadas. No tiene subcomponentes ya que es una hoja en la estructura de composición.

Se han añadido Test unitarios para comprobar el correcto funcionamiento del programa.

Link al repositorio: https://github.com/Samuu10/MunozVallejoSamuelEjercicioNominasComposite.git
