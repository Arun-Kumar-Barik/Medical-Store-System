import java.util.*;
public class MedicalStoreSystem1 {

    private static List<Medicine> medicineList = new ArrayList<>();
    static List<RequestedMedicine> requestList = new ArrayList<>();
    static List<Customers> customerList = new ArrayList<>();
 
    static{
        Medicine medicine1 = new Medicine("Aspirin",500,10,"16.12.2023");
        medicineList.add(medicine1);
        Medicine medicine2 = new Medicine("Paracetamol",500,10,"16.12.2023");
        medicineList.add(medicine2);
        Medicine medicine3 = new Medicine("Ibuprofen",500,10,"16.12.2023");
        medicineList.add(medicine3);
        Medicine medicine4 = new Medicine("Naproxen",500,10,"16.12.2023");
        medicineList.add(medicine4);
        Medicine medicine5 = new Medicine("Antacid",500,10,"16.12.2023");
        medicineList.add(medicine5);
        Medicine medicine6 = new Medicine("Omeprazole",500,10,"16.12.2023");
        medicineList.add(medicine6);
        Medicine medicine7 = new Medicine("Ranitidine",500,10,"16.12.2023");
        medicineList.add(medicine7);
        Medicine medicine8 = new Medicine("Simethicone",500,10,"16.12.2023");
        medicineList.add(medicine8);
        Medicine medicine9 = new Medicine("Antihistamine",500,10,"16.12.2023");
        medicineList.add(medicine9);
        Medicine medicine10 = new Medicine("Loratadine",500,10,"16.12.2023");
        medicineList.add(medicine10);
        Medicine medicine11 = new Medicine("Diphenhydramine",500,10,"16.12.2023");
        medicineList.add(medicine11);
        Medicine medicine12 = new Medicine("Cetirizine",500,10,"16.12.2023");
        medicineList.add(medicine12);
        Medicine medicine13 = new Medicine("Decongestant",500,10,"16.12.2023");
        medicineList.add(medicine13);
        Medicine medicine14 = new Medicine("Pseudoephedrine",500,10,"16.12.2023");
        medicineList.add(medicine14);
        Medicine medicine15 = new Medicine("Phenylephrine",500,10,"16.12.2023");
        medicineList.add(medicine15);
        Medicine medicine16 = new Medicine("Cough_syrup",500,10,"16.12.2023");
        medicineList.add(medicine16);
        Medicine medicine17 = new Medicine("Guaifenesin",500,10,"16.12.2023");
        medicineList.add(medicine17);
        Medicine medicine18 = new Medicine("Dextromethorphan",500,10,"16.12.2023");
        medicineList.add(medicine18);
        Medicine medicine19 = new Medicine("Expectorant",500,10,"16.12.2023");
        medicineList.add(medicine19);
        Medicine medicine20 = new Medicine("Saline_nasal_spray",500,10,"16.12.2023");
        medicineList.add(medicine20);
        Medicine medicine21 = new Medicine("Hydrocortisone_cream",500,10,"16.12.2023");
        medicineList.add(medicine21);
        Medicine medicine22 = new Medicine("Antifungal_cream",500,10,"16.12.2023");
        medicineList.add(medicine22);
        Medicine medicine23 = new Medicine("Antibiotic_ointment",500,10,"16.12.2023");
        medicineList.add(medicine23);
        Medicine medicine24 = new Medicine("Antiseptic_solution",500,10,"16.12.2023");
        medicineList.add(medicine24);
        Medicine medicine25 = new Medicine("Benzoyl_peroxide_cream",500,10,"16.12.2023");
        medicineList.add(medicine25);
        Medicine medicine26 = new Medicine("Antidiarrheal_medication",500,10,"16.12.2023");
        medicineList.add(medicine26);
        Medicine medicine27 = new Medicine("Loperamide",500,10,"16.12.2023");
        medicineList.add(medicine27);
        Medicine medicine28 = new Medicine("Probiotics",500,10,"16.12.2023");
        medicineList.add(medicine28);
        Medicine medicine29 = new Medicine("Oral_rehydration_salts",500,10,"16.12.2023");
        medicineList.add(medicine29);
        Medicine medicine30 = new Medicine("Fiber_supplement",500,10,"16.12.2023");
        medicineList.add(medicine30);
        Medicine medicine31 = new Medicine("Antacid",500,10,"16.12.2023");
        medicineList.add(medicine31);
        Medicine medicine32 = new Medicine("Laxative",500,10,"16.12.2023");
        medicineList.add(medicine32);
        Medicine medicine33 = new Medicine("Antiemetic",500,10,"16.12.2023");
        medicineList.add(medicine33);
        Medicine medicine34 = new Medicine("Meclizine",500,10,"16.12.2023");
        medicineList.add(medicine34);
        Medicine medicine35 = new Medicine("Ondansetron",500,10,"16.12.2023");
        medicineList.add(medicine35);
        Medicine medicine36 = new Medicine("Antinausea_medication",500,10,"16.12.2023");
        medicineList.add(medicine36);
        Medicine medicine37 = new Medicine("Antispasmodic",500,10,"16.12.2023");
        medicineList.add(medicine37);
        Medicine medicine38 = new Medicine("Antidiabetic_medication",500,10,"16.12.2023");
        medicineList.add(medicine38);
        Medicine medicine39 = new Medicine("Insulin",500,10,"16.12.2023");
        medicineList.add(medicine39);
        Medicine medicine40 = new Medicine("Metformin",500,10,"16.12.2023");
        medicineList.add(medicine40);
        Medicine medicine41 = new Medicine("Pain_relief_patch",500,10,"16.12.2023");
        medicineList.add(medicine41);
        Medicine medicine42 = new Medicine("Lidocaine_patch",500,10,"16.12.2023");
        medicineList.add(medicine42);
        Medicine medicine43 = new Medicine("Antihemorrhoidal_cream",500,10,"16.12.2023");
        medicineList.add(medicine43);
        Medicine medicine44 = new Medicine("Antacid_chewable_tablets",500,10,"16.12.2023");
        medicineList.add(medicine44);
        Medicine medicine45 = new Medicine("Multivitamin",500,10,"16.12.2023");
        medicineList.add(medicine45);
        Medicine medicine46 = new Medicine("Calcium_supplement",500,10,"16.12.2023");
        medicineList.add(medicine46);
        Medicine medicine47 = new Medicine("Iron_supplement",500,10,"16.12.2023");
        medicineList.add(medicine47);
        Medicine medicine48 = new Medicine("Vitamin_D_supplement",500,10,"16.12.2023");
        medicineList.add(medicine48);
        Medicine medicine49 = new Medicine("Electrolyte_solution",500,10,"16.12.2023");
        medicineList.add(medicine49);
        Medicine medicine50 = new Medicine("Topical_analgesic_cream",500,10,"16.12.2023");
        medicineList.add(medicine50);


        Customers c1 = new Customers("Arun    ", 20,9337553407l);
        customerList.add(c1);
        Customers c2 = new Customers("Satya   ", 18,9596543456l);
        customerList.add(c2);
        Customers c3 = new Customers("Rajnish ", 22,9245251557l);
        customerList.add(c3);
        Customers c4 = new Customers("Pratik  ", 24,6378895112l);
        customerList.add(c4);
        Customers c5 = new Customers("Subhajit", 20,9784687510l);
        customerList.add(c5);
        Customers c6 = new Customers("Dibya   ", 24,9987658471l);
        customerList.add(c6);

        RequestedMedicine r1 = new RequestedMedicine("angiotensin", 20);
        requestList.add(r1);

    }

    public static void main(String[] args)throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("ENTER YOUR PASSWORD");
        String pass = sc.nextLine().toLowerCase();

     if(! pass.equalsIgnoreCase("ShopkeeperPass") && (pass.contains("buy medicine") || pass.contains("i don't have the password") ))//For Naive Users
        {
            
        do {
            System.out.println("Welcome To Our Newly Built Medical Store System , Below is the menu");
            System.out.println("        =========================       ");
            System.out.println("***** | Medical Store System Menu | *****");
            System.out.println("        =========================       ");
            System.out.println("1. Search Medicine");
            System.out.println("2. Buy Medicine");
            System.out.println("3.Request For any medicine Not available");
            System.out.println("4. Exit");
            System.out.println("5.Enter Shopkeeper Mode");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    searchMedicine(sc);
                    break;
                case 2:
                    BuyMedicine(sc);
                    break;
                case 3:
                    reqMedicine(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using Medical Store System!");
                    break;

                // case 5:
                // System.out.println("You need to prove your Identity\nEnter Your Password");
                // sc.nextLine();
                // String shopPass = sc.nextLine().toLowerCase();
                // if(shopPass.equalsIgnoreCase(("shopkeeperpass")))
                // {
                //     break second;
                // }

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 4);

    }

    else if(pass.equalsIgnoreCase("ShopkeeperPass"))
        {
            
        do {
            // System.out.println("Welcome To Our Newly Built Medical Store System");
            System.out.println("        =========================       ");
            System.out.println("***** | Medical Store System Menu | *****");
            System.out.println("        =========================       ");
            System.out.println("1. Add Medicine");
            System.out.println("2. Search Medicine");
            System.out.println("3. Sell Medicine");
            System.out.println("4. Customers List");
            System.out.println("5.Requested medicines list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addMedicine(sc);
                    break;
                case 2:
                    searchMedicine(sc);
                    break;
                case 3:
                    sellMedicine(sc);
                    break;
                case 4:
                System.out.println("NAME               POINTS");

                    for(Customers c : customerList)
                    {
                        System.out.println(c.getName()+"            "+c.getPoints());
                    }
                    break;
                case 5:
                System.out.println("NAME               Quantity needed by the customers");
                    for(RequestedMedicine m : requestList)
                    {
                        System.out.println(m.getName()+"                "+m.getQuantity());
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Medical Store System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 6);

    }
        sc.close();
    }

    private static void addMedicine(Scanner scanner) {
        System.out.println("***** Add Medicine *****");
        System.out.print("Enter medicine name: ");
        String name = scanner.next();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter The Expiry Date in DD-MM-YYYY FORM");
        String expiryDate = scanner.next();

        Medicine medicine = new Medicine(name, quantity, price,expiryDate);
        medicineList.add(medicine);

        System.out.println("Medicine added successfully!");
    }

    private static void reqMedicine(Scanner scanner) {
        System.out.println("***** Request The Medicine *****");
        System.out.print("Enter medicine name: ");
        String name = scanner.next();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        RequestedMedicine medicine = new RequestedMedicine(name, quantity);
        requestList.add(medicine);

        System.out.println("We will get those Medicines for you in 1-2 working days!");
    }

    private static void searchMedicine(Scanner scanner) {
        System.out.println("***** Search Medicine *****");
        System.out.print("Enter medicine name: ");
        String name = scanner.next();

        for (Medicine medicine : medicineList) {
            if (medicine.getName().equalsIgnoreCase(name)) {
                System.out.println("Medicine found:");
                System.out.println("Name: " + medicine.getName());
                System.out.println("Quantity: " + medicine.getQuantity());
                System.out.println("Price: " + medicine.getPrice());
                System.out.println("Expiry Date : "+medicine.getExpDate());
                return;
            }
        }

        System.out.println("Medicine not found!");
    }

    private static void sellMedicine(Scanner scanner) {
        System.out.println("***** Sell Medicine *****");
        System.out.print("Enter medicine name: ");
        String name = scanner.next();

        for (Medicine medicine : medicineList) {
            if (medicine.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter quantity to sell: ");
                int sellQuantity = scanner.nextInt();

                if (sellQuantity > medicine.getQuantity()) {

                    System.out.println("Insufficient stock!");
                    System.out.println("Remaining Stock : "+ (sellQuantity-medicine.getQuantity()));
                    return;
                }
                scanner.nextLine();
                double totalCost = sellQuantity * medicine.getPrice();
                System.out.println("Enter The Name Of Customer");
                String n=scanner.nextLine();
                System.out.println("Enter The Phone Number Of Customer");
                long num = scanner.nextLong();
                for(Customers c : customerList)//For Existing Customers
                {
                    if(c.getName().trim().equalsIgnoreCase(n))
                    {
                        c.points+=(int)totalCost/10;
                        System.out.println("You earned : "+(int)totalCost/10+" points");
                        System.out.println("Do You Wanna Use Your Points?");
                        System.out.println("Press Y for Yes And N for No");
                        char ch = scanner.next().charAt(0);
                        if(ch=='Y')
                        {
                        totalCost-=c.points;
                        System.out.println("Total cost : " + totalCost);
                        System.out.println("Remaining Points : "+c.points);
                        }
                        else{
                            System.out.println("Total cost : " + totalCost);
                            System.out.println("Remaining Points : "+c.points);

                        }
                        return;
                    }
                }
               
                System.out.println("Total cost: " + totalCost);
                int points = (int)totalCost/10;
                System.out.println("You earned : "+points+" points");
                Customers c = new Customers(n, points,num);
                customerList.add(c);
                medicine.quantity -= sellQuantity;
                System.out.println("Medicine sold successfully!");
                return;
            }
        }

        System.out.println("Medicine not found!");
    }

    private static void BuyMedicine(Scanner scanner)throws InterruptedException {//for Customer
        System.out.println("***** Buy Medicine *****");
        System.out.print("Enter medicine name: ");
        String name = scanner.next();

        for (Medicine medicine : medicineList) {
            if (medicine.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter quantity You Wanna Buy: ");
                int buyQuantity = scanner.nextInt();

                if (buyQuantity > medicine.getQuantity()) {

                    System.out.println("Insufficient stock!");
                    System.out.println("Remaining Stock : "+ (buyQuantity-medicine.getQuantity()));
                    return;
                }
                scanner.nextLine();

                double totalCost = buyQuantity * medicine.getPrice();

                System.out.println("Please Enter Your Name Sir");
                String n=scanner.nextLine();
                System.out.println("Enter The Phone Number Of Customer");
                long num = scanner.nextLong();
                for(Customers c : customerList)
                {
                    if(c.getName().trim().equalsIgnoreCase(n))
                    {
                        c.points+=(int)totalCost/10;
                        System.out.println("You earned : "+(int)totalCost/10+" points");
                        System.out.println("Do You Wanna Use Your Points?");
                        System.out.println("Press Y for Yes And N for No");
                        char ch = scanner.next().charAt(0);
                        if(ch=='Y')
                        {
                        totalCost-=c.points;
                        System.out.println("Total cost : " + totalCost);
                        System.out.println("Remaining Points : "+c.points);
                        }
                        else{
                            System.out.println("Total cost : " + totalCost);
                            System.out.println("Remaining Points : "+c.points);

                        }
                        return;
                    }
                }
                Customers c = new Customers(n,(int)totalCost/10,num);
                customerList.add(c);
                System.out.println("You earned : "+(int)totalCost/10+" points");
                System.out.println("Do You Wanna Use Your Points?");
                        System.out.println("Press Y for Yes And N for No");
                        char ch = scanner.next().charAt(0);
                        if(ch=='Y')
                        {
                        totalCost-=c.points;
                        System.out.println("Total cost : " + totalCost);
                        System.out.println("Remaining Points : "+c.points);
                        }
                else{

                System.out.println("Total cost: " + totalCost);
                System.out.println("Complete The Payment And take your Receipt and after that you can take the medicine by providing your receipt");
                System.out.println("Do You Want To Proceed? Y for yes | N for no");
                char x=scanner.next().charAt(0);
                if(x=='Y')
                {
                System.out.print("Completing Transaction..");

                for(int i =1;i<=3;i++)
                {
                    Thread.sleep(1000);
                    System.out.print(".");
                }

                System.out.println("\nTransaction Complete");
                Thread.sleep(1000);
                }
                else 
                return;
            }
                medicine.quantity -= buyQuantity;
                System.out.println("You can Take your medicines now by providing your receipt from the nearby counter!");
                System.out.println("Thank You");
                Thread.sleep(1000);
                return;
            }
        }

        System.out.println("Medicine not found!");
    }
}

/*
Cars.add("BMW")
Cars.remove(0)
Cars.get(0)
Cars.size()
Cars.contains("BMW")
Cars.set("1","VOLVO")
Cars.

for(String i : Cars)
System.out.println(i)
*/