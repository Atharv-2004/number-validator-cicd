# Number Validator API

A simple REST API that checks if a number is even or odd.

## What this API does:
- Send it a number
- Get back whether it's "even" or "odd"
- That's it!

## Example:
- Send: `5`
- Get back: `{"number": 5, "result": "odd"}`

## How to run locally:
```bash
# Build the project
./mvnw clean package

# Run the application
java -jar target/number-validator-0.0.1-SNAPSHOT.jar
```

## Test the API:
```bash
curl http://localhost:8080/validate/5
```

## GitHub Secrets needed:
- `DOCKERHUB_USERNAME`: atharv123455
- `DOCKERHUB_TOKEN`: Your DockerHub access token (dckr_pat_...)