package dominio;
public static class Habitante{ 
    
        //Objetos iniciales
        private String nombreHabitante;
        private String apellido1Habitante;
        private String apellido2Habitante;
        
        //El constructor; por norma general, siempre al principio, tras la declaración de las variables
        
          public Habitante (String nombre, String apellido1, String apellido2){
            this.nombreHabitante = nombre;
            this.apellido1Habitante = apellido1;
            this.apellido2Habitante = apellido2;
        }
        
        //Métodos setters
        
          public void setNombre(String nombreHabitante){
            this.nombreHabitante = nombreHabitante;
        }
          public void setApellido1(String apellido1Habitante){
            this.apellido1Habitante = apellido1Habitante;
        }
          public void setApellido2(String apellido2Habitante){
            this.apellido2Habitante = apellido2Habitante;
        }
                
        //Añadimos los getters
        
          public String getNombre(){
            return nombreHabitante;
        }
          public String getApellido1(){
            return apellido1Habitante;
        }
          public String getApellido2(){
            return apellido2Habitante;
        }
        
        
        //Con esto le estoy dando valores a los nombres; además, a partir de "main" se ejecuta el código. Arriba no me hace falta porque solo lee
        //En un método estático, el valor siempre va a ser el mismo, dando igual a qué objeto te refieras 
          public static void main (String [] args){
            Habitante habitante1 = new Habitante("Default1", "Default2", "Default3");
            
            habitante1.setNombre("Pablo");
            habitante1.setApellido1("Molina");
            habitante1.setApellido2("García");
            //Aquí no hemos creado ningún objeto del tipo comprobación. Al ser estático, el programa sabe que puede ejecutarse sin crear ninguna clase
            Comprobacion.realizarComprobacion();
            
            System.out.println("Los datos son: "+ habitante1.nombreHabitante +" "+ habitante1.apellido1Habitante +" "+ habitante1.apellido2Habitante);


	public String getNombre(){
		return nombre;
		}

	public void setNombre(String nombre_){
		nombre=nombre_;
		}

	public String toString(){
		return "Nombre: " + nombre + " " + apellido1 + " " + apellido2;
		}

}

        }
    }
