# Small webforJ project

This repository now contains a minimal **webforJ** app with:

- `Application` as the app entry configuration.
- `HelloWorldView` at route `/`.
- A text field + button that shows a toast greeting.

## Run locally

```bash
mvn jetty:run
```

Then open the URL printed by Jetty.

## Project layout

- `src/main/java/org/example/Application.java`
- `src/main/java/org/example/HelloWorldView.java`
- `src/main/resources/static/app.css`
