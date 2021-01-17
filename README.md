# How to Run Simpan Pinjam Project

## Setup Back-End

Open project directory on compatible IDE (example: Intellij).

Configure the database that will used :

    spring.datasource.url=jdbc:postgresql://localhost:5432/{database-name}

    spring.datasource.username={username}

    spring.datasource.password={password}

Make sure that the server runs on http://localhost:8080

## Setup Front End

In the project directory, you can run:

### `yarn start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.