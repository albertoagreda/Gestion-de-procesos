
# Práctica 2 – Programación de Servicios y Procesos (PSP)

Este proyecto implementa tres aplicaciones en Java para practicar el uso de entrada/salida estándar, el filtrado de información y la comunicación entre procesos mediante tuberías.

## Requisitos
- JDK 17 o superior
- Maven para compilar y empaquetar
- Un IDE como IntelliJ, Eclipse o NetBeans
- Consola con soporte para tuberías (Linux, macOS, Windows PowerShell)

## Aplicaciones desarrolladas

### 1. lectorTexto
- Lee el contenido de `entrada.txt` y lo muestra por consola línea a línea.
- Si el archivo no existe, muestra un mensaje de error.

### 2. filtraLineas
- Recibe texto por la entrada estándar y muestra solo las líneas con más de 20 caracteres.
- Permite ser usado encadenado en una tubería.

### 3. contadorPalabras
- Recibe texto por la entrada estándar y devuelve el número total de palabras.
- Define palabra como cualquier secuencia separada por espacios.

## Ejecución

### Independiente
```bash
java -jar LectorTexto-1.0-SNAPSHOT.jar
java -jar FiltrarLineas-1.0-SNAPSHOT.jar
java -jar ContadorPalabras-1.0-SNAPSHOT.jar
```

### Encadenada con tuberías
```bash
java -jar LectorTexto-1.0-SNAPSHOT.jar | java -jar FiltrarLineas-1.0-SNAPSHOT.jar | java -jar ContadorPalabras-1.0-SNAPSHOT.jar
```

En este caso:
1. **lectorTexto** lee el archivo `entrada.txt`
2. **filtraLineas** elimina las líneas cortas
3. **contadorPalabras** cuenta las palabras resultantes

## Ejemplo

Archivo `entrada.txt`:
```
Hoy me levanté temprano.

Tomé café y pensé en mis metas.

La mañana estaba tranquila.

Escribí unas ideas en mi cuaderno.

Respiré profundo.

Seguí con mi día motivado.

```

Salida esperada (ejemplo):
```
Total de palabras encontradas: XX
```

## Cómo se hizo

1. Se configuró el proyecto con Maven en IntelliJ.
2. Se creó la clase `lectorTexto` que abre el archivo `entrada.txt` y lo imprime.
3. Se desarrolló `filtraLineas` que procesa la entrada estándar y filtra por longitud de línea.
4. Se implementó `contadorPalabras` que cuenta las palabras de la entrada.
5. Se probaron las aplicaciones de forma independiente.
6. Se integraron mediante tuberías para procesar un flujo completo de información.

## Conclusiones
Este proyecto permitió aprender a trabajar con entrada/salida estándar, capturar errores, y entender cómo los procesos pueden conectarse entre sí para resolver problemas más complejos mediante composición.
