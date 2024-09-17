 class AttendanceAdapter implements System {

    private AttendanceSystem attm;

    AttendanceAdapter(AttendanceSystem attm){

        this.attm = attm;
    }



     @Override
     public void integratedSystem() {
            attm.markAttendance();
     }
 }
