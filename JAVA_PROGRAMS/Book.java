
    public class Book {
        public String title;
        
        public Book(String title) {
            this.title = title;
        }
    
        // your code (optional ~ you can avoid it. Depends on your implementation in Instructor)
        
        public void setTitle(String title) {
            this.title = title;
        }
        
        public String getTitle() {
            return title;
        }
        public BackupObject createBackup(){
            return new BackupObject(title);
        }

        public class BackupObject{
            private String backupData;

            public BackupObject(String title){
                this.backupData = title;
            }

            public String getBackupData(){
                return backupData;
            }
        }
    }

