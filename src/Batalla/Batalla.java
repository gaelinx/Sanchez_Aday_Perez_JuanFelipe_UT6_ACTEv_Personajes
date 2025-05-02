package Batalla;
import java.util.Scanner;
import Modelos.*;


public class Batalla {
    Scanner scanner = new Scanner(System.in);
    private Personaje personaje1;
    private Personaje personaje2;

    public Batalla(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }
    
    public void iniciarBatalla(){
        System.out.println("¡La batalla comienza entre " + personaje1.getNombre() + " y " + personaje2.getNombre() + "!");
        int turno = 1;
        
        
        for (int i = 0; i < 999; i++) {
            mostrarEstado(personaje1, personaje2);
            if (personaje1.getSalud()<=0 || personaje2.getSalud()<=0) {
                break;
                
            } else {
                if (turno % 2 == 0) {
                    int opcion = 0;
                    
                    mostrarMenu(personaje1);
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getCargar() == true){
                                personaje1.atacar();
                                System.out.println(personaje1.getNombre() + " ataca a " + personaje2.getNombre() + ". El ataque está cargado.");
                                if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getEscudo() == true) {
                                    System.out.println(personaje2.getNombre() + " usa su escudo, no recibe daño.");
                                    ((Guerrero) personaje2).setEscudo(false);
                                } else if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getDefender() == true) {
                                    System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje2.setSalud(personaje2.getSalud() - 9);
                                    ((Guerrero) personaje2).setDefender(false);
                                    
                                }
                                if (personaje2 instanceof Arquero&&((Arquero) personaje2).getVolar() == true) {
                                    System.out.println(personaje2.getNombre() + " vuela, recibe la mitad del daño.");
                                    personaje2.setSalud(personaje2.getSalud() - 9);
                                    ((Arquero) personaje2).setVolar(false);
                                    
                                } else if (personaje2 instanceof Hechicero&&((Hechicero) personaje2).getDefender() == true) {
                                    System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje2.setSalud(personaje2.getSalud() - 9);
                                    ((Hechicero) personaje2).setDefender(false);
                                    
                                } else {
                                personaje2.setSalud(personaje2.getSalud() - 18);
                            }
                                ((Guerrero) personaje1).setCargar(false);
                            }
                            personaje1.atacar();
                            System.out.println(personaje1.getNombre() + " ataca a " + personaje2.getNombre() + ".");
                            if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getEscudo() == true) {
                                System.out.println(personaje2.getNombre() + " usa su escudo, no recibe daño.");
                                ((Guerrero) personaje2).setEscudo(false);
                            } else if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getDefender() == true) {
                                System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                personaje2.setSalud(personaje2.getSalud() - 4);
                                ((Guerrero) personaje2).setDefender(false);
                                
                            }
                            if (personaje2 instanceof Arquero&&((Arquero) personaje2).getVolar() == true) {
                                System.out.println(personaje2.getNombre() + " vuela, recibe la mitad del daño.");
                                personaje2.setSalud(personaje2.getSalud() - 4);
                                ((Arquero) personaje2).setVolar(false);
                                
                            } else if (personaje2 instanceof Hechicero&&((Hechicero) personaje2).getDefender() == true) {
                                System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                personaje2.setSalud(personaje2.getSalud() - 4);
                                ((Hechicero) personaje2).setDefender(false);
                                
                            } else {
                            personaje2.setSalud(personaje2.getSalud() - 8);
                        }
                           
                            break;
                    
                        case 2:
                            if (personaje1 instanceof Arquero) {
                                
                                
                                if (((Arquero) personaje1).getFlechas() > 0) {
                                    
                                    ((Arquero) personaje1).dispararFlecha();
                                    if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getEscudo() == true) {
                                        System.out.println(personaje2.getNombre() + " usa su escudo, no recibe daño.");
                                        ((Guerrero) personaje2).setEscudo(false);
                                    } else if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getDefender() == true) {
                                        System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 6);
                                        ((Guerrero) personaje2).setDefender(false);
                                        
                                    }
                                    if (personaje2 instanceof Arquero&&((Arquero) personaje2).getVolar() == true) {
                                        System.out.println(personaje2.getNombre() + " vuela, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 6);
                                        ((Arquero) personaje2).setVolar(false);
                                        
                                    } else if (personaje2 instanceof Hechicero&&((Hechicero) personaje2).getDefender() == true) {
                                        System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 6);
                                        ((Hechicero) personaje2).setDefender(false);
                                        
                                    } else {
                                    
                                    personaje2.setSalud(personaje2.getSalud() - 12);
                                }
                                } else {
                                    System.out.println(personaje1.getNombre() + " no tiene flechas para disparar.");
                                    
                                }
                            } else if (personaje1 instanceof Guerrero) {
                                ((Guerrero) personaje1).defender();
                            } else if (personaje1 instanceof Hechicero) {
                                ((Hechicero) personaje1).defender();
                            } else if (personaje1 instanceof Asesino) {
                                ((Asesino) personaje1).ocultar();
                            } else if (personaje1 instanceof Mago) {
                                ((Mago) personaje1).lanzarHechizo();
                                if (((Mago) personaje1).getMana()>2) {
                                    System.out.println(personaje1.getNombre() + " lanza un hechizo a " + personaje2.getNombre() + ".");
                                    if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getEscudo() == true) {
                                        System.out.println(personaje2.getNombre() + " usa su escudo, no recibe daño.");
                                        ((Guerrero) personaje2).setEscudo(false);
                                    } else if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getDefender() == true) {
                                        System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 6);
                                        ((Guerrero) personaje2).setDefender(false);
                                        
                                    }
                                    if (personaje2 instanceof Arquero&&((Arquero) personaje2).getVolar() == true) {
                                        System.out.println(personaje2.getNombre() + " vuela, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 6);
                                        ((Arquero) personaje2).setVolar(false);
                                        
                                    } else if (personaje2 instanceof Hechicero&&((Hechicero) personaje2).getDefender() == true) {
                                        System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 6);
                                        ((Hechicero) personaje2).setDefender(false);
                                        
                                    } else {
                                    personaje2.setSalud(personaje2.getSalud() - 12);
                                    }
                                } else {
                                    System.out.println(personaje1.getNombre() + " no tiene suficiente maná para lanzar un hechizo.");
                                }
                                
                            }
                            
                            break;
                        
                        case 3:
                            if (personaje1 instanceof Arquero) {
                                ((Arquero) personaje1).reabastecerFlechas();
                            } else if (personaje1 instanceof Guerrero) {
                                ((Guerrero) personaje1).cargarAtaque();
                            } else if (personaje1 instanceof Hechicero) {
                                ((Hechicero) personaje1).invocarEntidad();
                                if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getEscudo() == true) {
                                    System.out.println(personaje2.getNombre() + " usa su escudo, no recibe daño.");
                                    ((Guerrero) personaje2).setEscudo(false);
                                } else if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getDefender() == true) {
                                    System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje2.setSalud(personaje2.getSalud() - 10);
                                    ((Guerrero) personaje2).setDefender(false);
                                    
                                }
                                if (personaje2 instanceof Arquero&&((Arquero) personaje2).getVolar() == true) {
                                    System.out.println(personaje2.getNombre() + " vuela, recibe la mitad del daño.");
                                    personaje2.setSalud(personaje2.getSalud() - 10);
                                    ((Arquero) personaje2).setVolar(false);
                                    
                                } else if (personaje2 instanceof Hechicero&&((Hechicero) personaje2).getDefender() == true) {
                                    System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje2.setSalud(personaje2.getSalud() - 10);
                                    ((Hechicero) personaje2).setDefender(false);
                                    
                                }else {
                                personaje2.setSalud(personaje2.getSalud() - 20);
                                }
                            } else if (personaje1 instanceof Asesino) {
                                ((Asesino) personaje1).atacarPorlaEspalda();
                                if (((Asesino) personaje1).getOculto() == true) {
                                    if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getEscudo() == true) {
                                        System.out.println(personaje2.getNombre() + " usa su escudo, no recibe daño.");
                                        ((Guerrero) personaje2).setEscudo(false);
                                    } else if (personaje2 instanceof Guerrero&&((Guerrero) personaje2).getDefender() == true) {
                                        System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 8);
                                        ((Guerrero) personaje2).setDefender(false);
                                        
                                    }
                                    if (personaje2 instanceof Arquero&&((Arquero) personaje2).getVolar() == true) {
                                        System.out.println(personaje2.getNombre() + " vuela, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 8);
                                        ((Arquero) personaje2).setVolar(false);
                                        
                                    } else if (personaje2 instanceof Hechicero&&((Hechicero) personaje2).getDefender() == true) {
                                        System.out.println(personaje2.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje2.setSalud(personaje2.getSalud() - 8);
                                        ((Hechicero) personaje2).setDefender(false);
                                        
                                    }
                                    else {
                                    personaje2.setSalud(personaje2.getSalud() - 17);
                                    }
                                    ((Asesino) personaje1).setOculto(false);
                                    System.out.println(personaje1.getNombre()+" ya no está oculto.");
                                } 
                            } else if (personaje1 instanceof Mago) {
                                ((Mago) personaje1).curar();
                            }
                           
                            break;

                            case 4:
                            if (personaje1 instanceof Arquero) {
                                ((Arquero) personaje1).volar();
                            } else if (personaje1 instanceof Guerrero) {
                                ((Guerrero) personaje1).usarEscudo();
                            } else if (personaje1 instanceof Hechicero) {
                            } else if (personaje1 instanceof Asesino) {
                                ((Asesino) personaje1).curar();
                            } else if (personaje1 instanceof Mago) {
                                ((Mago) personaje1).regenerarMana();
                            }
                            


                            break;

                        default:
                            System.out.println("Opción no válida. Intenta de nuevo.");
                            break;
                            
                    }
                } else {
                    int opcion = 0;
                    mostrarMenu(personaje2);
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            if (personaje2 instanceof Guerrero && ((Guerrero) personaje2).getCargar() == true){
                                personaje2.atacar();
                                System.out.println(personaje2.getNombre() + " ataca a " + personaje1.getNombre() + ". El ataque está cargado.");
                                if (personaje1 instanceof Guerrero && ((Guerrero) personaje1).getEscudo() == true) {
                                    System.out.println(personaje1.getNombre() + " usa su escudo, no recibe daño.");
                                    ((Guerrero) personaje1).setEscudo(false);
                                } else if (personaje1 instanceof Guerrero &&((Guerrero) personaje1).getDefender() == true) {
                                    System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje1.setSalud(personaje1.getSalud() - 9);
                                    ((Guerrero) personaje1).setDefender(false);
                                    
                                }
                                if (personaje1 instanceof Arquero &&((Arquero) personaje1).getVolar() == true) {
                                    System.out.println(personaje1.getNombre() + " vuela, recibe la mitad del daño.");
                                    personaje1.setSalud(personaje1.getSalud() - 9);
                                    ((Arquero) personaje1).setVolar(false);
                                    
                                } else if (personaje1 instanceof Hechicero&&((Hechicero) personaje1).getDefender() == true) {
                                    System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje1.setSalud(personaje1.getSalud() - 9);
                                    ((Hechicero) personaje1).setDefender(false);
                                    
                                }else {
                                personaje1.setSalud(personaje1.getSalud() - 18);
                                }
                              
                                    ((Guerrero) personaje2).setCargar(false);
                                
                            }
                            personaje2.atacar();
                            System.out.println(personaje2.getNombre() + " ataca a " + personaje1.getNombre() + ".");
                            if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getEscudo() == true) {
                                System.out.println(personaje1.getNombre() + " usa su escudo, no recibe daño.");
                                ((Guerrero) personaje1).setEscudo(false);
                            } else if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getDefender() == true) {
                                System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                personaje1.setSalud(personaje1.getSalud() - 4);
                                ((Guerrero) personaje1).setDefender(false);
                                
                            }
                            if (personaje1 instanceof Arquero&&((Arquero) personaje1).getVolar() == true) {
                                System.out.println(personaje1.getNombre() + " vuela, recibe la mitad del daño.");
                                personaje1.setSalud(personaje1.getSalud() - 4);
                                ((Arquero) personaje1).setVolar(false);
                                
                            } else if (personaje1 instanceof Hechicero&&((Hechicero) personaje1).getDefender() == true) {
                                System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                personaje1.setSalud(personaje1.getSalud() - 4);
                                ((Hechicero) personaje1).setDefender(false);
                                
                            }else {
                            personaje1.setSalud(personaje1.getSalud() - 8);
                            }
                            
                            break;
                    
                        case 2:
                            if (personaje2 instanceof Arquero) {
                                
                                
                                if (personaje2 instanceof Arquero&&((Arquero) personaje2).getFlechas() > 0) {
                                    
                                    ((Arquero) personaje2).dispararFlecha();
                                    if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getEscudo() == true) {
                                        System.out.println(personaje1.getNombre() + " usa su escudo, no recibe daño.");
                                        ((Guerrero) personaje1).setEscudo(false);
                                    } else if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getDefender() == true) {
                                        System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 6);
                                        ((Guerrero) personaje1).setDefender(false);
                                        
                                    }
                                    if (personaje1 instanceof Arquero&&((Arquero) personaje1).getVolar() == true) {
                                        System.out.println(personaje1.getNombre() + " vuela, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 6);
                                        ((Arquero) personaje1).setVolar(false);
                                        
                                    } else if (personaje1 instanceof Hechicero&&((Hechicero) personaje1).getDefender() == true) {
                                        System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 6);
                                        ((Hechicero) personaje1).setDefender(false);
                                        
                                    }else {
                                    personaje1.setSalud(personaje1.getSalud() - 12);
                                    }
                                } else {
                                    System.out.println(personaje2.getNombre() + " no tiene flechas para disparar.");
                                    
                                }
                            } else if (personaje2 instanceof Guerrero) {
                                ((Guerrero) personaje2).defender();
                            } else if (personaje2 instanceof Hechicero) {
                                ((Hechicero) personaje2).defender();
                            } else if (personaje2 instanceof Asesino) {
                                ((Asesino) personaje2).ocultar();
                            } else if (personaje2 instanceof Mago) {
                                ((Mago) personaje2).lanzarHechizo();
                                if (((Mago) personaje2).getMana()>2) {
                                    System.out.println(personaje2.getNombre() + " lanza un hechizo a " + personaje1.getNombre() + ".");
                                    if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getEscudo() == true) {
                                        System.out.println(personaje1.getNombre() + " usa su escudo, no recibe daño.");
                                        ((Guerrero) personaje1).setEscudo(false);
                                    } else if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getDefender() == true) {
                                        System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 6);
                                        ((Guerrero) personaje1).setDefender(false);
                                        
                                    }
                                    if (personaje1 instanceof Arquero&&((Arquero) personaje1).getVolar() == true) {
                                        System.out.println(personaje1.getNombre() + " vuela, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 6);
                                        ((Arquero) personaje1).setVolar(false);
                                        
                                    } else if (personaje1 instanceof Hechicero&&((Hechicero) personaje1).getDefender() == true) {
                                        System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 6);
                                        ((Hechicero) personaje1).setDefender(false);
                                        
                                    }else {
                                    personaje1.setSalud(personaje1.getSalud() - 12);
                                    }
                                } else {
                                    System.out.println(personaje2.getNombre() + " no tiene suficiente maná para lanzar un hechizo.");
                                }
                                
                            }
                            
                            break;
                        
                        case 3:
                            if (personaje2 instanceof Arquero) {
                                ((Arquero) personaje2).reabastecerFlechas();
                            } else if (personaje2 instanceof Guerrero) {
                                ((Guerrero) personaje2).cargarAtaque();
                            } else if (personaje2 instanceof Hechicero) {
                                ((Hechicero) personaje2).invocarEntidad();
                                if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getEscudo() == true) {
                                    System.out.println(personaje1.getNombre() + " usa su escudo, no recibe daño.");
                                    ((Guerrero) personaje1).setEscudo(false);
                                } else if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getDefender() == true) {
                                    System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje1.setSalud(personaje1.getSalud() - 10);
                                    ((Guerrero) personaje1).setDefender(false);
                                    
                                }
                                if (personaje1 instanceof Arquero&&((Arquero) personaje1).getVolar() == true) {
                                    System.out.println(personaje1.getNombre() + " vuela, recibe la mitad del daño.");
                                    personaje1.setSalud(personaje1.getSalud() - 10);
                                    ((Arquero) personaje1).setVolar(false);
                                    
                                } else if (personaje1 instanceof Hechicero&&((Hechicero) personaje1).getDefender() == true) {
                                    System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                    personaje1.setSalud(personaje1.getSalud() - 10);
                                    ((Hechicero) personaje1).setDefender(false);
                                    
                                }else {
                                personaje1.setSalud(personaje1.getSalud() - 20);
                                }
                            } else if (personaje2 instanceof Asesino) {
                                ((Asesino) personaje2).atacarPorlaEspalda();
                                if (((Asesino) personaje2).getOculto() == true) {
                                    if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getEscudo() == true) {
                                        System.out.println(personaje1.getNombre() + " usa su escudo, no recibe daño.");
                                        ((Guerrero) personaje1).setEscudo(false);
                                    } else if (personaje1 instanceof Guerrero&&((Guerrero) personaje1).getDefender() == true) {
                                        System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 8);
                                        ((Guerrero) personaje1).setDefender(false);
                                        
                                    }
                                    if (personaje1 instanceof Arquero&&((Arquero) personaje1).getVolar() == true) {
                                        System.out.println(personaje1.getNombre() + " vuela, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 8);
                                        ((Arquero) personaje1).setVolar(false);
                                        
                                    } else if (personaje1 instanceof Hechicero&&((Hechicero) personaje1).getDefender() == true) {
                                        System.out.println(personaje1.getNombre() + " se defiende, recibe la mitad del daño.");
                                        personaje1.setSalud(personaje1.getSalud() - 8);
                                        ((Hechicero) personaje1).setDefender(false);
                                        
                                    }
                                    else {
                                    personaje1.setSalud(personaje1.getSalud() - 17);
                                    }
                                    ((Asesino) personaje2).setOculto(false);
                                    System.out.println(personaje2.getNombre()+" ya no está oculto.");
                                } 
                            } else if (personaje2 instanceof Mago) {
                                ((Mago) personaje2).curar();
                            }
                           
                            break;

                            case 4:
                            if (personaje2 instanceof Arquero) {
                                ((Arquero) personaje2).volar();
                            } else if (personaje2 instanceof Guerrero) {
                                ((Guerrero) personaje2).usarEscudo();
                            } else if (personaje2 instanceof Hechicero) {
                            } else if (personaje2 instanceof Asesino) {
                                ((Asesino) personaje2).curar();
                            } else if (personaje2 instanceof Mago) {
                                ((Mago) personaje2).regenerarMana();
                            }

                            
                            break;

                        default:
                            System.out.println("Opción no válida. Intenta de nuevo.");
                            break;
                    }
                }
            }
            turno++;
        }


    }

    private void mostrarMenu(Personaje personaje){
        System.out.println("\nTurno de " + personaje.getNombre() + ":");
        System.out.println("1. Atacar");
        if (personaje instanceof Arquero) {
            System.out.println("2. Disparar flecha. Flechas restantes: " + ((Arquero) personaje).getFlechas());
            System.out.println("3. Reabastecer flechas.");
            System.out.println("4. Volar.");
        } else if (personaje instanceof Asesino) {
            System.out.println("2. Ocultar.");
            System.out.println("3. Atacar por la espalda. (Requiere estar oculto, estado actual: " + ((Asesino) personaje).getOculto() + ")");
            System.out.println("4. Curar.");
        }
        else if (personaje instanceof Guerrero) {
            System.out.println("2. Defenderse.");
            System.out.println("3. Cargar ataque.");
            if (((Guerrero) personaje).getUsado() == false) {
                System.out.println("4. Usar escudo.");
            } else {
                System.out.println("4. Escudo usado, no se puede usar de nuevo.");
                
            }
            
            
        } else if (personaje instanceof Mago) {
            System.out.println("2. Lanzar hechizo.");
            System.out.println("3. Curar.");
            System.out.println("4. Regenerar mana.");
        } else if (personaje instanceof Hechicero) {
            System.out.println("2. Defenderse.");
            System.out.println("3. Invocar Entidad.");
        } 
    }

    private void mostrarEstado(Personaje personaje1, Personaje personaje2) {
        System.out.println("\nEstado de los personajes:");
        System.out.println(personaje1.getNombre() + " - Salud: " + personaje1.getSalud());
        System.out.println(personaje2.getNombre() + " - Salud: " + personaje2.getSalud());
    }

}
