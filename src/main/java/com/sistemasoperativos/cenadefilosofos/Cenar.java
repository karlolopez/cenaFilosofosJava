/*                                                                                                               
┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
│   *****             **** ******                  ****** ****                  ****  ┌────────────────────────┐  │
│   ******           *****   ******              *******  ******             *******  │                        │  │
│   ******           *****    ******           ********   ********          ********  │    +-+-+-+-+-+-+-+-+   │  │
│   ******           *****      ** **         *******     **********      **********  │    |S|I|S|T|E|M|A|S|   │  │
│   ******           *****       *****       **** **      ******** **** ************  │    +-+-+-+-+-+-+-+-+   │  │
│   ******           *****         *****    *******       *****  ************  *****  │  +-+-+-+-+-+-+-+-+-+-+ │  │
│   ******           *****          ******  *****         *****   **********   *****  │  |O|P|E|R|A|T|I|V|O|S| │  │
│   *******         ******           ***********          *****     ******     *****  │  +-+-+-+-+-+-+-+-+-+-+ │  │
│   **********************            ********            *****      ****      *****  │                        │  │
│     ******************               ******             *****                *****  └────────────────────────┘  │
│       **************                 *****              *****                *****                              │
│                                                                                                                 │
│    ┌───────────────────────────────────────────────────────────────────────────────────────────────────────┐    │
│    │                                                                                                       │    │
│    │                                    Profesor: Sergio González Oliva                                    │    │
│    │                                                                                                       │    │
│    │                                           Alumnos @authors:                                           │    │
│    │                                        David Galindo Hernández                                        │    │
│    │                                        Sergio Jonathan Cabrera                                        │    │
│    │                                         Karlo Alejandro López                                         │    │
│    │                                                                                                       │    │
│    └───────────────────────────────────────────────────────────────────────────────────────────────────────┘    │
└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘
┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
│          , __                                        _                                                          │
│         /|/  \                                      | |                                   |                     │
│          |___/ ,_    __         _   __ _|_  __      | | _  _  _|_  _   __,  ,_    __,   __|   __   ,_           │
│          |    /  |  /  \_|   | |/  /    |  /  \_  _ |/ / |/ |  |  |/  /  | /  |  /  |  /  |  /  \_/  |          │
│          |       |_/\__/  \_/|/|__/\___/|_/\__/   \_/\/  |  |_/|_/|__/\_/|/   |_/\_/|_/\_/|_/\__/    |_/        │
│                             /|                                          /|                                      │
│                             \|                                          \|                                      │
│      ___                        ,            _             ___                                  _               │
│     / (_)                      /|         \_|_)           / (_)                       |        | |              │
│     \__ _|_  __,    _   __,     |           |     __,    |      _   _  _    __,     __|   _    | |  __   ,      │
│     /    |  /  |  |/ \_/  |     |  -----   _|    /  |    |     |/  / |/ |  /  |    /  |  |/    |/  /  \_/ \_    │
│     \___/|_/\_/|_/|__/ \_/|_/   |         (/\___/\_/|_/   \___/|__/  |  |_/\_/|_/  \_/|_/|__/  |__/\__/  \/     │
│                  /|                                                                                             │
│                  \|                                                                                             │
│                ______    _                 _                                 ___, _        ___,                 │
│               (_) |  o  | |               | |                           /\  /   |(_|   |_//   |                 │
│                  _|_    | |  __   ,   __  | |  __   ,     _   _  _     |  ||    |  |   | |    |                 │
│                 / | ||  |/  /  \_/ \_/  \_|/  /  \_/ \_  |/  / |/ |    |  ||    |  |   | |    |                 │
│                (_/   |_/|__/\__/  \/ \__/ |__/\__/  \/   |__/  |  |_/   \_|/\__/\_/ \_/   \__/\_/               │
│                                           |\                             /|                                     │
│                                           |/                             \|                                     │
│                                                                                                                 │
└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘ 
 */

//Nombre de nuestro paquete en java (Ecosistema del proyecto)
package com.sistemasoperativos.cenadefilosofos;


/*
    ┌────────────────────────┐                                                                                         
    │   Clase CENAR [MAIN]   │                                                                                         
    └────────────────────────┘                                                                                                               

    Es la clase principal o MAIN, acomoda y CREA instancias para los tenedores disponibles 
    iniciales, el número de rondas de comida y el número de filósofos.

 */

public class Cenar {

    public static void main(String[] args) {

        //Número de rondas de comida.
        int rondas = 10;
        Log.imprimir(String.valueOf(rondas));

        //Arreglo de tenedores, hay 5 filósofos, por lo tanto 1 tenedor para c/u.
        Tenedor[] tenedores = new Tenedor[5];

        //Iniciamos los tenedores, habrá 5 de inicio para 5 filósofos.
        for (int i = 0; i < tenedores.length; i++) {
            tenedores[i] = new Tenedor("C: " + i);
        }
        
        //Arreglo de los 5 filósofos.
        Philosopher[] philosophers = new Philosopher[5];
        
        
        /*
            Se instancían cada uno de los filósofos, no se hace en el mismo loop donde los
            arrancamos por que tienen referencias a tenedores entre ellos entonces primero
            instaciamos y después arrancamos el proceso.
        
            Es importante asignar los tenedores correctamente.
        */
        philosophers[0] = new Philosopher("F1 JONATHAN - ", tenedores[0], tenedores[1], rondas);
        philosophers[1] = new Philosopher("F2 KARLO - ", tenedores[1], tenedores[2], rondas);
        philosophers[2] = new Philosopher("F3 DAVID - ", tenedores[2], tenedores[3], rondas);
        philosophers[3] = new Philosopher("F4 SERGIO - ", tenedores[3], tenedores[4], rondas);
        philosophers[4] = new Philosopher("F5 ANDRÉS - ", tenedores[0], tenedores[4], rondas);

        //Iniciamos cada uno de los procesos de filósofos. Comienza la función.
        for (int i = 0; i < philosophers.length; i++) {
            Log.imprimir("Hilo " + i + " ha comenzado.");
            Thread t = new Thread(philosophers[i]);
            t.start();
        }
    }
}

/*
┌─────────────────────────────────────┐
│              Clase LOG              │
│                                     │
│Ayuda a reutilizar funciones para la │
│        impresión en consola.        │
│                                     │
└─────────────────────────────────────┘
*/

class Log {

    public static void imprimir(String msg) {
        System.out.println(msg);
    }

    /*
        Herramienta para pausar/dormir la impresión, simulando un tiempo de espera o
        de acción.
    */
    public static void Delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
        }
    }
}

/*
┌─────────────────────────────────────┐
│           Clase FILÓSOFO            │
│                                     │
│              Estados:               │
│             2 => Comer              │
│             1 => Pensar             │
└─────────────────────────────────────┘
*/

class Philosopher extends Thread {

    //Cada filósofo tendra opcionalmente un tenedor a la izquierda o derecha, estos van variando.
    private Tenedor _tenedorIzquierdo;
    private Tenedor _tenedorDerecho;

    /*
        Propiedades del filósofo:
        - Nombre
        - Estado actual
        - # de Rondas de comida
    */
    private String _nombre;
    private int _estado;
    private int _rondas;

    //Constructor del filósofo
    public Philosopher(String nombre, Tenedor izq, Tenedor der, int rondas) {
        this._estado = 1;
        this._nombre = nombre;
        _tenedorIzquierdo = izq;
        _tenedorDerecho = der;
        _rondas = rondas;
    }

    //Método del filósofo comiendo. Tardara 1 segundo en hacerlo.
    public void comer() {
        //Verificamos que los tenedores izquierdo/derecho no estén en uso.
        if (!_tenedorIzquierdo.estaEnUso) {
            if (!_tenedorDerecho.estaEnUso) {
                
                //Ambos tenedores están en uso, podemos proceder a COMER.
                _tenedorIzquierdo.tomar();
                _tenedorDerecho.tomar();

                Log.imprimir(_nombre + " : Esta comiendo. Provecho.");

                //Tarda 1 segundo en comer el filósofo.
                Log.Delay(1000);

                //Deja los tenedores libres, otro filósofo puede tomarlos.
                _tenedorDerecho.dejar();
                _tenedorIzquierdo.dejar();
            }
        }
        
        /*
            En este momento una de dos:
            
            - No estuvieron los dos tenedores disponibles
            - Terminó de comer el filósofo.
        */
        pensar();
    }

    /*
        El filósofo piensa, cambiamos de estado y le damos 1 segundo para volver
        a intentar comer mientras los otros filósofos comen.
    */
    public void pensar() {
        this._estado = 1;
        Log.imprimir(_nombre + " : Esta pensando.*.*.*.*.....");
        Log.Delay(1000);
    }

    /*
        Método de ejecución del hilo, por cada una de
        las rondas haremos un intento de comer.
    */
    public void run() {
        for (int i = 0; i <= _rondas; i++) {
            comer();
        }
    }
}

/*
┌─────────────────────────────────────┐
│            Clase TENEDOR            │
│                                     │
│Nos ayuda a determinar si un tenedor │
│          esta o no en uso.          │
│                                     │
└─────────────────────────────────────┘
*/

class Tenedor {

    public boolean estaEnUso;
    public String _nombre;

    public Tenedor(String _name) {
        this._nombre = _name;
    }

    /*
        Con la etiqueta SYNCHRONIZED le decimos al compilador que
        solo un hilo puede ejecutar este método a la vez
    */
    public synchronized void tomar() {
        Log.imprimir("Usando tenedor: " + _nombre);
        this.estaEnUso = true;
    }
    
    /*
        Con la etiqueta SYNCHRONIZED le decimos al compilador que
        solo un hilo puede ejecutar este método a la vez
    */
    public synchronized void dejar() {
        Log.imprimir("Tenedor desocupado: " + _nombre);
        this.estaEnUso = false;
    }
}
