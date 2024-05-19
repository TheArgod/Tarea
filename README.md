# Tarea

## Endpoints

### GET /libros
Devuelve una lista de todos los libros.

### GET /libros/{id_libro}
Devuelve un libro por el ID.

### POST /libros
Crea un nuevo libro. Ejemplo de JSON:
```json
{
    "id": 3,
    "titulo": "El Principito",
    "autor": "Antoine de Saint-Exupéry",
    "editorial": "Reynal & Hitchcock",
    "anioPublicacion": 1943
}
