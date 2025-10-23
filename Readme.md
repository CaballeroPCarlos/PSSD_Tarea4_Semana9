# ☕ Proyecto: Comunicación Cliente-Servidor con Sockets en Java

Este proyecto tiene como objetivo utilizar **sockets TCP** para realizar una operación simple: **sumar dos números enteros**.

## Formatos Markdown

Primero una base para los Markdown.

- Para escribir el símbolo: \`, usa la combinación: `Alt + 96`.
- Para escribir el símbolo: \\, usa la combinación: `Alt + 92`.
- Jerarquía de secciones: `# Título principal`, `## Subtítulo`, `### Nivel 3`
- **Negrita**: `**texto**`
- *Cursiva*: `*texto*`
- Tipo de Listas:
  1. Con guiones: `- elemento`
  2. Numerados: `1. elemento`
  3. Para evitar que dos líneas seguidas se junten, has espacio: `- elemento  ` o `1. elemento  `.
- Bloque de código:

  ```java
  System.out.println("Hola");
  ```

- Cita o nota: `> texto citado`
- [Enlace](#formatos-markdown): `[Texto](URL)`  
  Para abrir el enlace en otra ventana: `<a href="URL" target="_blank">Texto</a>`
- Separador: `---`

## Requisitos previos

Se utilizará <a href="https://code.visualstudio.com" target="_blank">Visual Studio Code (VS Code)</a>.

Con las siguientes extensiones:

- **Extension Pack for Java**  
Permite compilar, ejecutar y depurar proyectos Java.
- **Debugger for Java**  
  Agrega soporte de depuración paso a paso.
- **Language Support for Java by Red Hat**  
  Ofrece resaltado de sintaxis, autocompletado y análisis del código Java.

También se utilizara el JDK de la versión más reciente de <a href="https://www.oracle.com/java/technologies/downloads" target="_blank">Java</a>.

Para verificar si se descargo correctamente, abrir la PowerShell haciendo: `Shift + click derecho` en cualquier carpeta.

Ahora se escribe:

```
java -version
javac -version
```

Si esto no se visualiza en VS Code, realizar lo siguiente:

1. En la ruta donde descargaste el JDK, buscar la carpeta bin.
2. Ir a **Inicio**, y buscar **Variables de Entorno**.
3. Al buscar te saldrá una busqueda relacionada: **Editar las variables de entorno del sistema.**
4. Click en **Variables de Entorno...**
5. Seleccionar **PATH** -> editar -> nuevo...
6. Pegar la ruta de la carpeta bin.
7. Y guardar con **Aceptar**.

## Archivos principales

- `SockServer.java` → Abre un socket, espera la conexión, recibe dos números, los suma y responde.  
- `SockClient.java` → Se conecta al servidor, envía los números y muestra el resultado.

> La ejecución se realiza en dos terminales diferentes.  
> Para abrir la Powershell en VS Code se usa la combinación: `Shift + Ctrl + Ñ`.

## Ejecución

Para ejecutar los programas realiza lo siguiente:

- Para compilar: `javac Nombre.java`.
- Para ejecutar: `java Nombre`.

> Si actualizas el código y recompilas, asegurate de eliminar el archivo `.class` (el que se genera al compilar), cierra VS Code, vuelve a abrirlo y recompila el archivo.  
> También puedes eliminar todos los archivos .class por el Powershell: `del *.class`