[![Build Status](https://travis-ci.org/buraksarp/apache-traffic-server-exporter.svg?branch=master)](https://travis-ci.org/buraksarp/apache-traffic-server-exporter)

Fixes
=========================
Fixed metrics for ATS v8.0.x and above
Added new dashboard for Grafana

Apache Traffic Server Exporter for Prometheus TSDB.
=========================

This demo assumes you know how to run Docker.

Building Containers
---------------------

Nothing special if you already have Docker installed. 

    $ git clone https://github.com/git-albert/apache-traffic-server-exporter.git
    $ cd apache-traffic-server-exporter

Edit following file, set the public ip or address of your ATS Edge node;

    apache-traffic-server-exporter/src/main/resources/application.properties 
    > apache-traffic-server.stats.uri = http://<ats_edge_server_address>/_stats 

Build the docker images. 

    $ docker-compose build 

Running Containers with the docker-compose
---------------------
To run these containers:

    $ docker-compose up
    
To view Apache Traffic Server Dashboard on Grafana
---------------------

go to grafana UI: [http://localhost:3000](http://localhost:3000)

Default username & password : admin

Install grafana dashboard template for prometheus - [https://grafana.com/grafana/dashboards/12687](https://grafana.com/grafana/dashboards/12687)

### create data source


    Name   : ats-data (or your favourite data source name)
    Type   : prometheus    
    URL    : http://prometheus:9090
    Access : browser
    leave the other fields default, click on 'Save & Test'

![Alt text](docs/datasource-configuration.png?raw=true "New data source")

### import dashboard

Paste following dashboard url https://grafana.com/grafana/dashboards/12687 in, and the dashboard will automatically be imported. Then just select the datasource (edge-data) which has just been created in previous step. 

    Grafana.com Dashboard   : https://grafana.com/grafana/dashboards/12687
    prometheus              : ats-data (or the one you have created)
    click Import 

![Alt text](docs/import-dashboard.png?raw=true "Import dashboard")

![Alt text](docs/import-dashboard-2.png?raw=true "Import dashboard")
