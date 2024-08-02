
public class Patient {
    private int id;
    private String name;
    private int age;
    private String address;
    private String contactNumber;
    private String gender;

    // Constructors, getters, and setters
    public Patient(int id, String name, int age, String address, String contactNumber, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }

    // Getters and setters
    // ...
}

public class PatientManager {
    private Map<Integer, Patient> patients = new HashMap<>();

    public void registerPatient(Patient patient) {
        patients.put(patient.getId(), patient);
        System.out.println("Patient registered successfully.");
    }

    public Patient searchPatientById(int id) {
        return patients.get(id);
    }

    public void updatePatientInfo(int id, String address, String contactNumber) {
        Patient patient = patients.get(id);
        if (patient != null) {
            patient.setAddress(address);
            patient.setContactNumber(contactNumber);
            System.out.println("Patient information updated.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    // Other methods for patient management
}




import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private LocalDateTime appointmentDate;

    // Constructors, getters, and setters
    public Appointment(int appointmentId, int patientId, int doctorId, LocalDateTime appointmentDate) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
    }

    // Getters and setters
    // ...
}

public class AppointmentManager {
    private Map<Integer, Appointment> appointments = new HashMap<>();

    public void scheduleAppointment(Appointment appointment) {
        appointments.put(appointment.getAppointmentId(), appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void cancelAppointment(int appointmentId) {
        appointments.remove(appointmentId);
        System.out.println("Appointment canceled.");
    }

    public Appointment getAppointmentDetails(int appointmentId) {
        return appointments.get(appointmentId);
    }

    // Other methods for appointment management
}

import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private LocalDateTime appointmentDate;

    // Constructors, getters, and setters
    public Appointment(int appointmentId, int patientId, int doctorId, LocalDateTime appointmentDate) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
    }

    // Getters and setters
    // ...
}

public class AppointmentManager {
    private Map<Integer, Appointment> appointments = new HashMap<>();

    public void scheduleAppointment(Appointment appointment) {
        appointments.put(appointment.getAppointmentId(), appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void cancelAppointment(int appointmentId) {
        appointments.remove(appointmentId);
        System.out.println("Appointment canceled.");
    }

    public Appointment getAppointmentDetails(int appointmentId) {
        return appointments.get(appointmentId);
    }

    // Other methods for appointment management
}

public class MedicalRecord {
    private int recordId;
    private int patientId;
    private String diagnosis;
    private String treatment;
    private LocalDateTime recordDate;

    // Constructors, getters, and setters
    public MedicalRecord(int recordId, int patientId, String diagnosis, String treatment, LocalDateTime recordDate) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.recordDate = recordDate;
    }

    // Getters and setters
    // ...
}

public class EHRManager {
    private Map<Integer, List<MedicalRecord>> medicalRecords = new HashMap<>();

    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.computeIfAbsent(record.getPatientId(), k -> new ArrayList<>()).add(record);
        System.out.println("Medical record added.");
    }

    public List<MedicalRecord> public class Invoice {
    private int invoiceId;
    private int patientId;
    private double amount;
    private String status; // PAID or UNPAID
    private LocalDateTime invoiceDate;

    // Constructors, getters, and setters
    public Invoice(int invoiceId, int patientId, double amount, String status, LocalDateTime invoiceDate) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
        this.status = status;
        this.invoiceDate = invoiceDate;
    }

    // Getters and setters
    // ...
}

public class BillingManager {
    private Map<Integer, Invoice> invoices = new HashMap<>();

    public void generateInvoice(Invoice invoice) {
        invoices.put(invoice.getInvoiceId(), invoice);
        System.out.println("Invoice generated.");
    }

    public Invoice getInvoice(int invoiceId) {
        return invoices.get(invoiceId);
    }

    public void markInvoiceAsPaid(int invoiceId) {
        Invoice invoice = invoices.get(invoiceId);
        if (invoice != null) {
            invoice.setStatus("PAID");
            System.out.println("Invoice marked as paid.");
        }
    }

    // Other methods for billing management
}
getMedicalRecords(int patientId) {
        return medicalRecords.getOrDefault(patientId, Collections.emptyList());
    }

    // Other methods for EHR management
}


public class MedicalSupply {
    private int supplyId;
    private String name;
    private int quantity;

    // Constructors, getters, and setters
    public MedicalSupply(int supplyId, String name, int quantity) {
        this.supplyId = supplyId;
        this.name = name;
        this.quantity = quantity;
    }

    // Getters and setters
    // ...
}

public class InventoryManager {
    private Map<Integer, MedicalSupply> supplies = new HashMap<>();

    public void addSupply(MedicalSupply supply) {
        supplies.put(supply.getSupplyId(), supply);
        System.out.println("Supply added to inventory.");
    }

    public void updateSupplyQuantity(int supplyId, int quantity) {
        MedicalSupply supply = supplies.get(supplyId);
        if (supply != null) {
            supply.setQuantity(quantity);
            System.out.println("Supply quantity updated.");
        }
    }

    public MedicalSupply getSupply(int supplyId) {
        return supplies.get(supplyId);
    }

    // Other methods for inventory management
}

public class Staff {
    private int staffId;
    private String name;
    private String role; // Doctor, Nurse, Admin, etc.
    private String contactNumber;
    private String department;

    // Constructors, getters, and setters
    public Staff(int staffId, String name, String role, String contactNumber, String department) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.contactNumber = contactNumber;
        this.department = department;
    }

    // Getters and setters
    // ...
}

public class StaffManager {
    private Map<Integer, Staff> staffMembers = new HashMap<>();

    public void addStaffMember(Staff staff) {
        staffMembers.put(staff.getStaffId(), staff);
        System.out.println("Staff member added.");
    }

    public Staff getStaffMember(int staffId) {
        return staffMembers.get(staffId);
    }

    public void updateStaffContact(int staffId, String contactNumber) {
        Staff staff = staffMembers.get(staffId);
        if



          
