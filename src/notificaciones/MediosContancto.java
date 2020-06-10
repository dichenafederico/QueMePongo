package notificaciones;

public enum MediosContancto implements MedioComunicacion {

    public Email: {
        public void enviar(Notificacion notificacion) throws UnirestException{
            HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + "sandbox90c5e5f2e3094b3f91053e5c27cb9f2b.mailgun.org" + "/messages")
                    .basicAuth("api", "5e01b0b637dc95b98fd967d9a50b2176-9dda225e-aa5100df") //ApiKey
                    .queryString("from", "Que me pongo quemepongo@dds.com")
                    .queryString("to", notificacion.getEmail())
                    .queryString("subject", "Sugerencias disponibles para el evento")
                    .queryString("text", notificacion.getMensaje())
                    .asJson();

            System.out.println(request.toString());
            System.out.println(request.getStatusText());
        }

        public Whatsapp: {
            public void enviar(Notificacion notificacion){
                if(notificacion.getNivelPrioridad() == NivelPrioridadNotificacion.BAJA)
                    throw new InsuficientePrioridadExcepcion();

                String mensaje = "Enviando el mensaje: "
                        .concat(notificacion.getMensaje())
                        .concat(", al whatsapp: ")
                        .concat(notificacion.getNumeroTelefono());
                System.out.println(mensaje);
            }
        }

    }

}
