# Introduction

self-learning project about Monitoring Tools using Prometheus and Grafana.

# Tech Stack

I used these tech stack for create this project with:
* Java 17
* Spring Boot 2
* Grafana
* Prometheus
* Node Exporter

# Architecture

<div align='center'>

![Cooperation Architecture](docs/architecture.png)

</div>

# Api Documentation

You can read the documentation on : http://localhost:8000/swagger-ui/

# Implemented Features

This tables shows which features that has been implemented by this repository.

:white_check_mark: : ready

:heavy_exclamation_mark: : in progress

:x: : not yet implemented

| Features                          | Status                              |
| --------------------------------- | ----------------------------------- |
| Monitoring UI using Grafana       |:white_check_mark:                  |
| Basic Authentication              | :white_check_mark:                  |
| Hide Confidential Data            | :x:                  |
| Implement OAuth2 Prometheus       | :x:                  |

# Build and Run

```
1. Clone the Project
   $ git clone git@github.com:rizkyjayusman/prometheus.git
   $ cd prometheus

2. Build Project
   $ docker-compose build
   $ docker-compose up -d
```