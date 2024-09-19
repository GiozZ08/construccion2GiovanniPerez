package clubProyect.controller;
import clubProyect.controller.validator.PersonValidator;
import clubProyect.controller.validator.UserValidator;
import clubProyect.dto.UserDto;
import clubProyect.Service.Service;
import clubProyect.Service.interfaces.AdminService;
import clubProyect.Service.interfaces.ClubService;
import clubProyect.controller.validator.GuestValidator;
import clubProyect.controller.validator.PartnerValidator;
import clubProyect.dto.PartnerDto;
import java.time.LocalDateTime;


public class AdminController implements ControllerInterface {
	


    private PartnerValidator partnerValidator;
    private UserValidator userValidator;
    private GuestValidator guestValidator;
    private ClubService clubService;
    private AdminService adminService;
    private static final String MENU = "Ingrese la opción que desea \n" +
            "1. Para registrar un socio \n" +
            "2. Para registrar un invitado \n" +
            "3. Para cambiar el estado de un socio a VIP \n" +
            "4. Para cerrar sesión \n";

    public AdminController() {
        this.partnerValidator = new PartnerValidator();
        this.userValidator = new UserValidator();
        this.guestValidator = new GuestValidator();
        this.clubService = new Service();  // Asume que Service implementa ClubService
        this.adminService = new Service();  // Asume que Service implementa AdminService
    }

    @Override
    public void session() throws Exception {
        boolean session = true;
        while (session) {
            session = menu();
        }
    }

    private boolean menu() {
        try {
            System.out.println("Bienvenido " + Service.user.getUserName());
            System.out.print(MENU);
            String option = Utils.getReader().nextLine();
            return options(option);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    private boolean options(String option) throws Exception {
        switch (option) {
            case "1": {
                this.registerPartner();
                return true;
            }
            case "2": {
                this.registerGuest();
                return true;
            }
            case "3": {
                this.promoteToVIP();
                return true;
            }
            case "4": {
                System.out.println("Se ha cerrado sesión");
                return false;
            }
            default: {
                System.out.println("Ingrese una opción válida");
                return true;
            }
        }
    }

    private void registerPartner() throws Exception {
       System.out.println("Ingrese el ID del socio");
        long id = Long.parseLong(Utils.getReader().nextLine());

        System.out.println("Ingrese el ID del usuario");
        long userId = Long.parseLong(Utils.getReader().nextLine());
        UserDto userDto = new UserDto(); // Assume that UserDto has a method to set ID
        userDto.setId(userId);

        System.out.println("Ingrese el incremento de fondos");
        double increaseFunds = Double.parseDouble(Utils.getReader().nextLine());

        System.out.println("Ingrese el estado de suscripción (VIP o Regular)");
        String isVIP = Utils.getReader().nextLine();
        partnerValidator.validIsVIP(isVIP); // Validates if isVIP is either "VIP" or "Regular"

        LocalDateTime affiliationDate = LocalDateTime.now(); // Assuming the current date and time
        
    

        PartnerDto partnerDto = new PartnerDto();
        partnerDto.setUserId(userDto);
       
        partnerDto.setIncreaseFunds(50000.0);  // Fondo inicial
        partnerDto.setVIP("Regular");
        partnerDto.setAffiliationDate(LocalDateTime.now());

        this.clubService.createPartner(partnerDto);
        System.out.println("Se ha registrado el socio exitosamente");
    }

    private void registerGuest() throws Exception {
        System.out.println("Ingrese el nombre del invitado");
        String name = Utils.getReader().nextLine();
        guestValidator.validName(name);
        System.out.println("Ingrese la cédula del invitado");
        long document = guestValidator.validDocument(Utils.getReader().nextLine());
        System.out.println("Ingrese el número de celular del invitado");
        long phoneNumber = guestValidator.validPhoneNumber(Utils.getReader().nextLine());
        System.out.println("Ingrese el ID del socio que invita");
        long partnerId = guestValidator.validPartnerId(Utils.getReader().nextLine());
        System.out.println("Ingrese el estado de la invitación (active/inactive)");
        String statusActive = Utils.getReader().nextLine();
        guestValidator.validStatusActive(statusActive);

        UserDto userDto = new UserDto();
        userDto.setUserName(name); // Asumimos que el nombre de usuario es el nombre del invitado por simplicidad
        userDto.setPassword("default"); // Asumimos una contraseña por defecto para invitados
        userDto.setRole("guest");

        GuestDto guestDto = new GuestDto();
        guestDto.setUserId(userDto);
        guestDto.setPartnerId(new PartnerDto()); // Llenar con la instancia correcta
        guestDto.setStatusActive(statusActive);

        this.clubService.createGuest(guestDto);
        System.out.println("Se ha registrado el invitado exitosamente");
    }

    private void promoteToVIP() throws Exception {
        System.out.println("Ingrese el ID del socio a promover");
        long partnerId = Utils.getReader().nextLong();
        boolean result = this.adminService.promoteToVIP(partnerId);
        if (result) {
            System.out.println("El socio ha sido promovido a VIP exitosamente");
        } else {
            System.out.println("No se pudo promover al socio a VIP. Verifique que cumple con los requisitos.");
        }
    }
}
