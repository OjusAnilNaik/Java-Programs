class pdfProcessor extends Thread {
    int key;

    public pdfProcessor(int key) {
        this.key = key;
    }

    public void run() {
        System.out.println("The process is started");

        if (key == 1) {
            System.out.println("The PDF file is processed");
        } else {
            System.out.println("Invalid file");
        }
    }
}

class imageFile extends Thread {
    int key;

    public imageFile(int key) {
        this.key = key;
    }

    public void run() {
        System.out.println("The process is started");

        if (key == 2) {
            System.out.println("The Image file is processed");
        } else {
            System.out.println("Invalid file");
        }
    }
}

class excelProcess extends Thread {
    int key;

    public excelProcess(int key) {
        this.key = key;
    }

    public void run() {
        System.out.println("The process is started");

        if (key == 3) {
            System.out.println("The Excel file is processed");
        } else {
            System.out.println("Invalid file");
        }
    }
}

public class threads {
    public static void main(String[] args) {

        pdfProcessor p = new pdfProcessor(1);
        imageFile i = new imageFile(2);
        excelProcess e = new excelProcess(3);

        p.start();
        i.start();
        e.start();
    }
}