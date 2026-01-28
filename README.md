# DOSW_Lab1_BJJ

## ACUERDOS DE LABORATORIO
1. Habrá un grupo en WhatsApp.
2. Las reuniones serán en Teams.
3. Hacer los laboratorios de forma grupal sin necesidad de dividirlos.
4. Se usarán herramientas de coworking como GitHub.
5. Las reuniones se realizarán los lunes en horas de la tarde.

---

# Maratón Git 2026-1

## Integrantes
- Brayan Loaiza Leal
- Juan Sebastian Guayazan Clavijo
- Juan Esteban Cruz

---

## Retos completados

### Reto 1: Configuración y creación de rama
**Evidencia:**

![alt text](image.png)

Se realizó una configuración previa para la creación de los repositorios, luego se clonó el repositorio y se crearon las ramas `develop`. Posteriormente se crearon las diferentes ramas de los miembros del grupo y, por último, las carpetas correspondientes a los retos.

---

## Parte 3

### Reto 1: La Bienvenida

<img width="937" height="489" alt="image" src="https://github.com/user-attachments/assets/4a3d9b1e-43a2-47af-85a4-f4018b81a577" />

Se creó la rama correspondiente al reto y se desarrolló el código solicitado.

<img width="940" height="346" alt="image" src="https://github.com/user-attachments/assets/02899a82-a3a5-42cd-9254-ce4e98c3564e" />

Finalmente, se realizó el proceso necesario para subir los cambios a GitHub.

---

### Reto 2: Carrera en Paralelo

1. Se realizó el cambio de nombre de la rama.

<img width="950" height="393" alt="image" src="https://github.com/user-attachments/assets/99374ffa-3281-4c27-8544-b847a02c415d" />

2. Se crearon las ramas de los carriles correspondientes a cada estudiante.

<img width="1550" height="335" alt="image" src="https://github.com/user-attachments/assets/1314637e-74f3-42ae-9d3f-33d90fe1c8d1" />

<img width="952" height="44" alt="image" src="https://github.com/user-attachments/assets/695b0438-2849-491b-901c-c274546ace97" />

3. Se solucionaron los conflictos generados durante los merges.

<img width="995" height="453" alt="image" src="https://github.com/user-attachments/assets/85335323-7ee6-4091-9e04-98a49786e5c7" />

4. Se realizaron los cambios en ambos carriles y posteriormente se hizo el merge final para combinar el trabajo.

<img width="1358" height="756" alt="image" src="https://github.com/user-attachments/assets/851ed27e-2937-4cc5-a703-94ee38e323aa" />

---

### Reto 3: EcoMisterioso

<img width="556" height="134" alt="image" src="https://github.com/user-attachments/assets/11b81257-0e6d-4d3e-b445-38481f9db3b0" />

Primero se creó la rama correspondiente al reto número 3 y posteriormente las dos subramas solicitadas para el desarrollo del reto.

Luego, cada integrante realizó la implementación de los métodos que le correspondían.

Después, cada uno realizó su respectivo commit.

<img width="960" height="281" alt="image" src="https://github.com/user-attachments/assets/839cdd21-85e8-485e-829e-2ad34ed8ce7c" />

<img width="801" height="616" alt="image" src="https://github.com/user-attachments/assets/4967b5f8-067b-4ddd-b60e-3310e9c240a0" />

Posteriormente, cada integrante realizó el merge de sus subramas hacia la rama principal del reto. Durante este proceso se generaron conflictos, los cuales fueron solucionados mediante el cambio de nombre de los métodos.

<img width="954" height="352" alt="image" src="https://github.com/user-attachments/assets/7a47f93e-bb38-4efd-845a-6e6b00565213" />

En esta imagen se puede apreciar la solución de los conflictos.


## cuestionario

1. ¿Cuál es la diferencia entre git merge y git rebase?
git merge une dos ramas creando un commit de merge y conserva el historial tal como ocurrio.
git rebase reorganiza los commits de una rama sobre otra dejando un historial más lineal y mas limpio.
2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
Git genera un conflicto, se detiene el merge y te pide resolver manualmente cual cambio conservar o cómo combinarlos.
3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
git log --oneline --graph --all
4. Explica la diferencia entre un commit y un push.
commit guarda cambios localmente en tu repositorio.
push esos commits al repositorio remoto.
5. ¿Para qué sirven git stash y git pop?
git stash guarda cambios temporales sin hacer commit.
git pop recupera esos cambios guardados.
6. ¿Qué diferencia hay entre HashMap y Hashtable?
HashMap no es sincronizado, es más rápido y permite null.
Hashtable es sincronizado (thread-safe), más antiguo y no permite null.

7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional?
Código más limpio y corto
Estilo funcional
Menos errores y mejor legibilidad

8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Es una operación intermedia de transformación, porque convierte cada elemento en otro tipo.

9. ¿Qué hace el método stream().filter() y qué retorna?
Filtra elementos según una condición y retorna un Stream, no una lista.

10. Paso a paso para crear una rama desde develop para una funcionalidad nueva:
Cambia a develop: git checkout develop
Actualizar develop: git pull
Crear la nueva rama:git checkout -b feature/nueva_funcionalidad

11. ¿Diferencia entre git branch y git checkout -b?
git branch nombre solo crea la rama.
git checkout -b nombre crea y se cambia a la rama.

12. ¿Por qué usar ramas feature/ y no trabajar directo en main?
Evita errores en producción
Permite trabajar en paralelo
Facilita pruebas y revisiones
Mantiene main estable


