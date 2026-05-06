git clone https://github.com/kthusheelgHere is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/applicationHere is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    Here is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` inHere is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` in the `<script>` tag points to your local backend (`http://localhost:8080/api`).

---

## 🔑 Test Credentials
*Here is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` in the `<script>` tag points to your local backend (`http://localhost:8080/api`).

---

## 🔑 Test Credentials
*   **Admin Username**: `admin_boss`Here is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` in the `<script>` tag points to your local backend (`http://localhost:8080/api`).

---

## 🔑 Test Credentials
*   **Admin Username**: `admin_boss`[cite: 2]
*   **Admin Password**: `password123`Here is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` in the `<script>` tag points to your local backend (`http://localhost:8080/api`).

---

## 🔑 Test Credentials
*   **Admin Username**: `admin_boss`[cite: 2]
*   **Admin Password**: `password123`[cite: 2]

---

**Developer:** Kagitha Thusheel Goud  
**Institution:** St. Peter's Engineering CollegeHere is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` in the `<script>` tag points to your local backend (`http://localhost:8080/api`).

---

## 🔑 Test Credentials
*   **Admin Username**: `admin_boss`[cite: 2]
*   **Admin Password**: `password123`[cite: 2]

---

**Developer:** Kagitha Thusheel Goud  
**Institution:** St. Peter's Engineering College

WouldHere is a comprehensive and professional `README.md` file tailored for your project. You can copy and paste this directly into a new file named `README.md` in your GitHub repository.

---

# 📝 Task Management System (Full-Stack)

A robust, full-stack task management application featuring **JWT-based authentication**, **role-based access control**, and a **persistent PostgreSQL database**[cite: 1, 2]. This project demonstrates a secure connection between a cloud-hosted Spring Boot REST API and a decoupled frontend[cite: 1, 2].

## 🚀 Live Demo
*   **Frontend (GitHub Pages):** [https://kthusheelgoud.github.io/task-manager-client/](https://kthusheelgoud.github.io/task-manager-client/)
*   **Backend API (Railway):** `https://task-manager-api-production-c950.up.railway.app/api`[cite: 1]

---

## 🛠️ Tech Stack

### Backend
*   **Java 21** with **Spring Boot 3.x**[cite: 2].
*   **Spring Security & JWT**: For stateless authentication and authorization[cite: 2].
*   **Spring Data JPA**: For Object-Relational Mapping[cite: 2].
*   **Lombok**: To reduce boilerplate code.

### Frontend
*   **Vanilla JavaScript (ES6+)**: Custom `fetchWithAuth` wrapper for handling JWT headers.
*   **HTML5 & CSS3**: Responsive UI with a clean, modern dashboard.

### Database & Deployment
*   **PostgreSQL**: Cloud-hosted relational database[cite: 1, 2].
*   **Railway**: Hosting for the Spring Boot API and Database[cite: 1].
*   **GitHub Pages**: Hosting for the static frontend client.

---

## 🏗️ System Architecture

The application follows a decoupled architecture where the frontend communicates with the backend via a RESTful API secured by JWT tokens[cite: 2].



1.  **Authentication**: Users sign up or log in via the `/api/auth` endpoints[cite: 2].
2.  **JWT Issue**: Upon successful login, the server returns a JWT token[cite: 2].
3.  **Authorized Requests**: The client stores the token in `localStorage` and includes it in the `Authorization: Bearer <token>` header for all protected requests[cite: 2].
4.  **Database Persistence**: All data is stored in a hosted PostgreSQL instance, ensuring persistence across server restarts[cite: 2].

---

## ✨ Key Features
*   **User Authentication**: Secure Login and Signup functionality[cite: 2].
*   **Role-Based Dashboards**: 
    *   **Admins**: Can create projects, assign tasks to specific users, and view system-wide stats[cite: 2].
    *   **Members**: Can view assigned tasks and update their progress[cite: 2].
*   **Live Statistics**: Real-time counting of TODO, In-Progress, and Completed tasks.
*   **CORS Security**: Configured to allow secure communication between GitHub Pages and Railway[cite: 2].

---

## 📋 API Endpoints

### Auth Endpoints (Permit All)
*   `POST /api/auth/signup` - Register a new user[cite: 2].
*   `POST /api/auth/signin` - Authenticate and receive a JWT[cite: 2].

### Task Endpoints (Protected)
*   `GET /api/tasks/dashboard` - Get task statistics for the dashboard[cite: 2].
*   `POST /api/tasks/project/{projId}/assign/{userId}` - Assign a new task (Admin Only)[cite: 2].
*   `PATCH /api/tasks/{taskId}/status` - Update task status (TODO/IN_PROGRESS/DONE)[cite: 2].

### Project Endpoints (Protected)
*   `GET /api/projects` - List all projects[cite: 2].
*   `POST /api/projects` - Create a new project (Admin Only)[cite: 2].

---

## ⚙️ Local Setup

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/kthusheelgoud/task-manager.git](https://github.com/kthusheelgoud/task-manager.git)
    ```
2.  **Backend Setup**:
    *   Navigate to the project folder and update `src/main/resources/application.properties` with your local PostgreSQL credentials.
    *   Run `./mvnw spring-boot:run`.
3.  **Frontend Setup**:
    *   Open `index.html` using a local server (e.g., Live Server in VS Code).
    *   Ensure the `API_URL` in the `<script>` tag points to your local backend (`http://localhost:8080/api`).

---

## 🔑 Test Credentials
*   **Admin Username**: `admin_boss`[cite: 2]
*   **Admin Password**: `password123`[cite: 2]

---

**Developer:** Kagitha Thusheel Goud  
**Institution:** St. Peter's Engineering College
