para hacer pruebas en Postman:

**ESTUDIANTES:**
- Listar Estudiantes: http://localhost:8080/api/estudiantes
 metodo: GET 
  
- Crear Estudiante: http://localhost:8080/api/estudiantes
  metodo: POST

- Body raw json:
  
{
    "nombre": "Juan Pérez",
    "correo": "juan.perez@universidad.edu",
    "codigo": "EST-2024-001"
}

-----------------------------------------------------------------
**PROFESOR:**
- Listar Profesores: http://localhost:8080/api/profesores
metodo: GET 
- Crear Profesor: http://localhost:8080/api/profesores
  metodo: POST
- Body raw json:
- 
{
   "nombre": "Dr. Carlos Ruiz",
   "correo": "carlos.ruiz@universidad.edu",
   "especialidad": "Arquitectura de Software"
}

-----------------------------------------------------------------
**ADMINISTRATIVOS:**
- Listar Profesores: http://localhost:8080/api/administrativos
metodo: GET 
- Crear Profesor: http://localhost:8080/api/administrativos
  metodo: POST
- Body raw json:
- 
{
    "nombre": "Ana García",
    "correo": "ana.garcia@universidad.edu",
    "area": "Registro Académico"
}
