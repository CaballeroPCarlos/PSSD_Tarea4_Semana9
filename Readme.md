# ☕ Proyecto: Comunicación Cliente-Servidor con Sockets en Java

Este proyecto tiene como objetivo emplear **sockets TCP** para realizar una operación sencilla: **sumar dos números enteros**.

---

## Formatos Markdown

A continuación, se presenta una guía básica para el uso del formato **Markdown**:

* Para escribir el símbolo: \`, utiliza la combinación: `Alt + 96`.
* Para escribir el símbolo: \\, utiliza la combinación: `Alt + 92`.
* Jerarquía de secciones:

  * `#` → Título principal
  * `##` → Subtítulo
  * `###` → Nivel 3

* **Negrita**: `**texto**`
* *Cursiva*: `*texto*`
* Tipos de listas:

  1. Con guiones: `- elemento`
  2. Numeradas: `1. elemento`
  3. Para evitar que dos líneas se unan, deja un espacio doble al final: `- elemento  ` o `1. elemento  `

* Bloque de código:

  ```java
  |```
  |System.out.println("Hola");
  |```
  ```

* Cita o nota: `> texto citado`
* Enlace: `[Texto](URL)`
* Separador: `---`

---

## Requisitos previos

Se utilizará [Visual Studio Code (VS Code)](https://code.visualstudio.com) con las siguientes extensiones:

* **Extension Pack for Java**  
  Permite compilar, ejecutar y depurar proyectos Java.
* **Debugger for Java**  
  Agrega soporte de depuración paso a paso.
* **Language Support for Java by Red Hat**  
  Ofrece resaltado de sintaxis, autocompletado y análisis del código Java.

Además, se requiere tener instalado el JDK en su versión más reciente, disponible en: [Java Downloads](https://www.oracle.com/java/technologies/downloads).

Para verificar la instalación, abre PowerShell haciendo `Shift + clic derecho` sobre cualquier carpeta y escribe:

```
java -version
javac -version
```

Si las versiones no aparecen correctamente en VS Code, realiza los siguientes pasos:

1. Dirígete a la carpeta donde descargaste el JDK y localiza la carpeta **bin**.
2. Abre **Inicio** y busca **Variables de entorno**.
3. Selecciona **Editar las variables de entorno del sistema**.
4. Haz clic en **Variables de entorno...**
5. Selecciona **PATH** → **Editar** → **Nuevo**.
6. Pega la ruta completa de la carpeta **bin**.
7. Guarda los cambios con **Aceptar**.

---

## Archivos principales

* `SockServer.java` → Abre un socket, espera la conexión, recibe dos números, los suma y devuelve el resultado.
* `SockClient.java` → Se conecta al servidor, envía los números y muestra la respuesta recibida.

> La ejecución se realiza en dos terminales diferentes.  
> Para abrir PowerShell en VS Code, usa la combinación: `Ctrl + Shift + Ñ`.

---

## Ejecución

Para ejecutar los programas, sigue los pasos:

* Compilar:

  ```
  javac Nombre.java
  ```
* Ejecutar:

  ```
  java Nombre
  ```

> Si modificas el código y recompilas, asegúrate de eliminar los archivos `.class` (generado durante la compilación).  
> Puedes eliminar todos los archivos `.class` desde PowerShell con el comando:
>
> ```
> del *.class
> ```

---
