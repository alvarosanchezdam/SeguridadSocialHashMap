public class Main {
    public static void main(String[] args) {
        SeguridadSocial seguridadSocial = new SeguridadSocial();

        Persona jose = new Persona("59425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona maria =  new Persona("89425654W", "83333333", "Maria", "Gallego", 55, 91300.20);
        Persona carlos = new Persona("19425355Q", "62222222", "Carlos", "Torres", 22, 83000.00);
        Persona anna = new Persona("29425987J", "044444444", "Anna", "Pina", 26, 17654.88);


        seguridadSocial.altaPersona(jose);
        seguridadSocial.altaPersona(maria);
        seguridadSocial.altaPersona(carlos);
        seguridadSocial.altaPersona(anna);

        System.out.println("Altas a la seguridad social: " + seguridadSocial.obtenerTodas());


        System.out.println("Baja a la seguridad    social: " + anna);
        seguridadSocial.bajaPersona(anna.getDni());


        System.out.println("Lista de afiliados a la S.S.: " + seguridadSocial.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocial.obtenerPersonaPorDNI(jose.getDni()));

        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocial.obtenerPersonaPorNumSS(maria.getNumSeguridadSocial()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocial.obtenerPersonasRangoSalarial(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocial.obtenerPersonasMayoresQue(25));
        System.out.println("obtenerPersonasOrdenadasPorEdad: " + seguridadSocial.ordenarEdad());
        System.out.println("obtenerPersonasOrdenadasPorSalario: " + seguridadSocial.ordenarSalario());
        System.out.println("obtenerPersonasOrdenadasPorDni: " + seguridadSocial.ordenarDni());
        System.out.println("obtenerPersonasOrdenadasPorSS: " + seguridadSocial.ordenarSS());



    }
}

