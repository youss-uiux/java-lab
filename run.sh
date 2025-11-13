#!/bin/bash
# Script pour exécuter l'application Java Lab

cd "$(dirname "$0")"

echo "🚀 Lancement de Java Lab..."
mvn exec:java -Dexec.mainClass="com.javalab.mainapp.MainApp" -pl mainapp

