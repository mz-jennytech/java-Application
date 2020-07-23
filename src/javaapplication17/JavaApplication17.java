
package javaapplication17;

/**
 *
 * @author jennifer.okosisi
 */
public class JavaApplication17 {

  
    public static void main(String[] args) {
        // TODO code application logic here
   int[] stateCode = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,
       3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4
   };
   String[] lgaName ={"Gwagwalada","Kuje","Abaji","Abuja Municipal","Bwari","Kwali","Aba North","Aba South",
       "Arochukwu","Bende","Ikwuano","Isiala-Ngwa North","Isiala-Ngwa South","Isuikwato","Obi Nwa","Ohafia",
       "Osisioma","Ngwa","Ugwunagbo","Ukwa East",
       "Ukwa West","Umuahia North","Umuahia South","Umu-Neochi","Demsa",
       "Fufore","Ganaye","Gireri","Gombi","Guyuk",
       "Hong","Jada","Lamurde","Madagali","Maiha","Mayo-Belwa",
       "Michika","Mubi North","Mubi South","Numan","Shelleng","Song","Toungo","Yola North","Yola South","Abak","Eastern Obolo","Eket","Esit","Eket","Essien Udim","Etim Ekpo","Etinan 4 Akwa Ibom","Ibeno","Ibesikpo Asutan","Ibiono","Ika","Ikono",
       "Ikot Abasi","Ikot Ekpene","Ini","Itu","Mbo","Mkpat Enin","Nsit Atai","Nsit Ibom","Nsit Ubium",
       "Obot Akara","Okobo","Onna","Oron","Oruk Anam","Udung Uko","Ukanafun","Uruan",
       "Urue-Offong/Oruko","Uyo"
   };   
    
String[] stateName = {"Federal Capital Territory","Federal Capital Territory","Federal Capital Territory"
        
,"Federal Capital Territory","Federal Capital Territory","Federal Capital Territory","Abia","Abia","Abia",
"Abia","Abia","Abia","Abia","Abia","Abia","Abia","Abia","Abia","Abia","Abia","Abia","Abia"
        ,"Abia","Abia","Abia","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa","Adamawa",
       "Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom","Akwa Ibom",
       "Akwa Ibom","Akwa Ibom","Akwa Ibom"
};
 int TotalstateCode = stateCode.length;
  int TotallgaName = stateCode.length;
  System.out.println("[");
  int i;
          
 for(i=0;i<=TotallgaName; i++)
 {
     int j=i+1;
    System.out.println("{\"stateCode\":\""+stateCode[i]+"\",\"stateName\":\""+stateName[i]+"\",\"lgaCode\":"+j+"\",\"lgaName\":\""+lgaName[i]+"\"}");
     System.out.println("]");
 }
    }
}


        
