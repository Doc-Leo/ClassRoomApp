 class GradingSystemAdapter implements System{
    private GradingSystem gss;
    GradingSystemAdapter(GradingSystem gss){
        this.gss = gss;
    }

     @Override
     public void integratedSystem() {
     gss.recordGrades();
     }
 }
