# Sanchez_Aday_Perez_JuanFelipe_UT6_ACTEv_Personajes

##  Nombre del Proyecto:

*Sistema de personajes de videojuego*

**AUTORES**
- Aday Sanchez
- Juan Felipe Perez

## Descripcion

Proyecto de la Unidad 6 de simulacion de sistema de Personajes en un RPG

## Objetivos

- Sismular un Sistema de Personajes de un RPG con caracteristicas Individuales
o Generales con la Ayuda del Polimorfismo, Herencias y interfaces

## Competencias Desarrolladas
- Git, Github
- Polimorfismo
- Herencias
- Interfaces
- Abstraccion
- Trabajo en Equipo

## Descripcion
El Proyecto cuenta con una clase Abstracta Padre [Personaje] esta clase cuenta
con las clases intermedias de [CombateFisico] y [CombateMagico] que son lo que
interactuan principalmente con las demas clases concretas que seran nuestros personajes

Nuestro Proyecto cuenta con mas de una Interfaz para acciones particulares de 
los personajes por ejemplo [ICurar] esta asociado directamente con [Asesino] y [Mago]
aunque los dos tienen una manera de interactuar con la curacion completamente diferente

Tambien contramos con @Override para atributos de la clase Object (ToString, Equals y HashCode)

Para Finalizar tenemos una carpeta Juego que es lo que interactua direcamente con el Main Usando
el IntanceOf para interactuar con cada clase concreta en especifico

## Recomendaciones de Ejecucion

Recomendamos Exportar el repositorio en Visual Studio Code o IntelliJ
para no tener Problemas con el Indexado

