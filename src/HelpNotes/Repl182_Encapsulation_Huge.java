package HelpNotes;

public class Repl182_Encapsulation_Huge {

        private  String firstname;
        private String lastname;
        private int birthmonth;
        private int birthday;
        private int birthyear;
        private String ssn;

        public Repl182_Encapsulation_Huge(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn ){
            setFirstname(firstname);
            setLastname(lastname);
            setBirthmonth(birthmonth);
            setBirthday(birthday);
            setBirthyear(birthyear);
            setSsn(ssn);

        }
        public String getFirstname(){
            return firstname;
        }
        public void setFirstname(String firstname){
            this.firstname=firstname;
        }

        public String getLastname(){
            return lastname;
        }
        public void setLastname(String lastname){
            this.lastname=lastname;
        }

        public int getBirthmonth(){
            return birthmonth;
        }
        public void setBirthmonth(int birthmonth){
            this.birthmonth=birthmonth;
        }

        public int getBirthday(){
            return birthday;
        }
        public void setBirthday(int birthday){
            this.birthday=birthday;
        }

        public int getBirthyear(){
            return birthyear;
        }
        public void setBirthyear(int birthyear){
            this.birthyear=birthyear;
        }

        public String getSsn(){
            return ssn;
        }
        public void setSsn(String ssn){
            this.ssn=ssn;
        }
        public String formatBirthday( ){
            String bday=birthmonth+"/"+birthday+"/"+birthyear;
            System.out.println(bday);
            return bday;
        }
    }
