#!/usr/bin/env groovy

file = new File(args[0])
lines = file.text.split("\n")
lines[10] = "database.url=jdbc\\:mysql\\://localhost\\:3306/${args[1]}".toString()
file.text = lines.join("\n")
