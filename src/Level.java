public enum Level {
    low(1,"l") {
        @Override
        public String aslowercase(){
            return this.toString().toLowerCase();
        }
    },

    high(2,"m") {
        @Override
        public String aslowercase() {
            return this.toString().toLowerCase();
        }
    },
    medium(3,"h") {
        @Override
        public String aslowercase() {
            return this.toString().toLowerCase();
        }
    };

    @Override
    public String toString() {
        return "Level{" +
                "code=" + code +
                ", keyword='" + keyword + '\'' +
                '}';
    }

    public final int code;
    public final String keyword;

    Level(int code, String keyword){
        this.code=code;
        this.keyword=keyword;
    }

    public abstract String aslowercase();

}
