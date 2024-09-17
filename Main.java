//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        AttendanceSystem att = new AttendanceSystem();
        System attAdapter = new AttendanceAdapter(att);

        GradingSystem gs = new GradingSystem();
        System grdAdapter = new GradingSystemAdapter(gs);

        LibrarySystem lb = new LibrarySystem();
        System lbAdapter = new LibraryAdapter(lb);

        attAdapter.integratedSystem();
        grdAdapter.integratedSystem();
        lbAdapter.integratedSystem();



    }
}