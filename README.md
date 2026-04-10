**DIAGRAMA DE CLASES POR CAPAS:**

<img width="1729" height="515" alt="diagramaCapas" src="https://github.com/user-attachments/assets/65bcfcda-5a0d-437e-ad5a-a2a7e4e25bcc" />

-----------------------------------------------------------------
**TABLAS BASE DE DATOS:**

<img width="531" height="689" alt="persona" src="https://github.com/user-attachments/assets/036c7507-5602-4738-a448-127d95485e3a" />

<img width="336" height="500" alt="profesor" src="https://github.com/user-attachments/assets/27b74f20-880b-4b81-b399-9ba5d96dce11" />

<img width="335" height="508" alt="estudiante" src="https://github.com/user-attachments/assets/9326afbc-b448-4f58-8e13-efa48ffb72be" />

<img width="360" height="482" alt="administrativos" src="https://github.com/user-attachments/assets/f3e6e108-cd8f-4477-a0cc-93b68335e11a" />

--------------------------------------------------------------
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
