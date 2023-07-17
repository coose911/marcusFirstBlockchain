Created file <MyBlockchain>

Set up Back End
-Set up classes
 -Block
 -Blockchain
 -Transactions

-Set up new packages for database and connection
 -Models
 -Controllers
 -Repositories

Set up Front End (React App)
Install Node.js and npm: Before you start, make sure you have Node.js and npm installed on your system. If not, download and install Node.js from the official website (npm is included as a part of Node.js).

Install create-react-app: Although not required (because npx, which comes with npm 5.2+ can be used), you can install create-react-app globally on your system using npm with this command:

npm install -g create-react-app
But in most cases, you don't need to install it and can skip this step.

Create a new React app: Use the following command to create a new React application. Replace my-app with the name you want for your application:

npx create-react-app my-app
The npx command will run create-react-app without requiring you to install it globally. It will create a new directory with the name you specified (my-app in this case), and set up a new React application in that directory.

Start the development server: Once the installation is complete, navigate into  project's directory and start the development server:

cd my-app
npm start
This will start the development server, and you can open your new React application by going to http://localhost:3000 in your web browser.


<<<<<<<<<<<<<<<APP IS SET UP >>>>>>>>>>>>>>>

Set up a database (i used postico) and called it blockchain

Copy the following into application.properties to connect to the PostgreSQL database.
Remember to replace *your username here* with your own username

------------------------------

spring.datasource.url=jdbc:postgresql://localhost:5432/blockchain
spring.datasource.username=*your username here*
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true

-----------------------------

run the following command (./mvnw spring-boot:run) in the terminal with the directory that has pom.xml in it

<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>
