# Taschenrechner als JSP-Webanwendung

Übungsprojekt aus der Lehrveranstaltung *Business-Webanwendungen* (Hochschule Ludwigshafen): ein Taschenrechner, der als JSP-Seite im Servlet-Container läuft, plus JDBC-Zugriffsklassen für PostgreSQL.

## Aufbau

```
WebContent/jsp/   Taschenrechner-Oberfläche (JSP)
src/.../jdbc/     JDBCAccess, PostgreSQLAccess, NoConnectionException
```

## Datenbankzugang

Verbindungsdaten kommen aus Umgebungsvariablen und stehen nicht im Code:

| Variable | Bedeutung | Standard |
|---|---|---|
| `DB_URL` | JDBC-URL | `jdbc:postgresql://localhost:5432/postgres` |
| `DB_USER` | Benutzer | `postgres` |
| `DB_PASSWORD` | Passwort | leer |
| `DB_SCHEMA` | Schema | `public` |

## Hinweise

- Lernprojekt, keine Produktionsanwendung.
- Aus dem Repository entfernt: kompilierte Klassen, ein Foto sowie Zugangsdaten. Frühere Commits können noch alte Stände enthalten.
