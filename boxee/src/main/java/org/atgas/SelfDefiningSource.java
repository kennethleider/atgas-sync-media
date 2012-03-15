package org.atgas;

public abstract class SelfDefiningSource extends Source {

   public SelfDefiningSource(SelfDefiningSource copy) {
      super(copy);
   }

   public SelfDefiningSource(String standardID) {
      super(standardID, (String)null);
   }
   
   @Override
   public String getSourceID() {
      return getID();
   }
}
