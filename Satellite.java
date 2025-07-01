class Satellite {

        static String satelliteName;
        static String country;
        static String organization;
		static String chairman;
        static String missionType;
        static String name;
        static double launchMassKg;
        static String launchDate;
        static String launchVehicle;
        static String application;
        static String missionLife;
        static String manufacturer;
        static String owner;
        static String email;
        static String coverageArea;
		static String missionStatus;
        static double frequencyBandGHz;
        static int antennaCount;
        static int signalLatencyMs;
        static String telemetrySystem;
		
    public static void main(String[] args) {

        System.out.println("Satellite Name:" +satelliteName);
        System.out.println("Country:" +country);
        System.out.println("Organization:" +organization);
		System.out.println("Chairman:" +chairman);
        System.out.println("Mission Type:" +missionType);
        System.out.println("Name: " +name);
        System.out.println("Launch Mass:" +launchMassKg);
        System.out.println("Launch Date:" +launchDate);
        System.out.println("Launch Vehicle:" +launchVehicle);
        System.out.println("Application:" +application);
        System.out.println("Mission Life:" +missionLife);
        System.out.println("Manufacturert:" +manufacturer);
        System.out.println("Owner:" +owner);
        System.out.println("E mail:" +email);
        System.out.println("Coverage Area:" +coverageArea);
		System.out.println("Mission Status:" +missionStatus);
		System.out.println("Frequency BandGHz:" +frequencyBandGHz);
		System.out.println("Antenna Count:" +antennaCount);
		System.out.println("Signal LatencyMs:" +signalLatencyMs);
		System.out.println("Telemetry System:" +telemetrySystem);
		
		//re init
		
		String satelliteName = "GSAT-30";
        String country = "India";
        String organization = "ISRO";
		String chairman = "Dr. V Narayan";
        String missionType = "Communication Satellite";
        String name = "GSAT-30(Geosynchronous Orbit)";
        double launchMassKg = 3357;
        String launchDate = "Jan 17, 2020";
        String launchVehicle = "Ariane-5 VA-251";
        String application = "Communication";
        String missionLife = "More than 15 years";
        String manufacturer = "ISRO";
        String owner = "ISRO";
        String email = "chairmanoffice@isro.gov.in";
        String coverageArea = "Indian Mainland & Islands";
		String missionStatus = "Active";
        double frequencyBandGHz = 12.0;
        int antennaCount = 2;
        int signalLatencyMs = 600;
        String telemetrySystem = "X-Band Telemetry";
		
		System.out.println("Satellite Name:" +satelliteName);
        System.out.println("Country:" +country);
        System.out.println("Organization:" +organization);
		System.out.println("Chairman:" +chairman);
        System.out.println("Mission Type:" +missionType);
        System.out.println("Name: " +name);
        System.out.println("Launch Mass:" +launchMassKg);
        System.out.println("Launch Date:" +launchDate);
        System.out.println("Launch Vehicle:" +launchVehicle);
        System.out.println("Application:" +application);
        System.out.println("Mission Life:" +missionLife);
        System.out.println("Manufacturert:" +manufacturer);
        System.out.println("Owner:" +owner);
        System.out.println("E mail:" +email);
        System.out.println("Coverage Area:" +coverageArea);
		System.out.println("Mission Status:" +missionStatus);
		System.out.println("Frequency BandGHz:" +frequencyBandGHz);
		System.out.println("Antenna Count:" +antennaCount);
		System.out.println("Signal LatencyMs:" +signalLatencyMs);
		System.out.println("Telemetry System:" +telemetrySystem);
    }
}
