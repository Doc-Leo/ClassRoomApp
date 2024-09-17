 class LibraryAdapter implements System {
    private  LibrarySystem lbs;

    LibraryAdapter(LibrarySystem lbs){
        this.lbs = lbs;
    }


     @Override
     public void integratedSystem() {
        lbs.managesBooks();
     }
 }
