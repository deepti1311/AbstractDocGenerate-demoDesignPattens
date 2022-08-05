package DesignPatterns.CreationalPattern.FactoryMethodPatten;

public class AbstractDocGenerate {

    protected  static  Doc createDoc(String DocType){
        switch (DocType){
            case "Zip":
                return  new Zip();
            case "Rar":
                return  new Rar();



        }
        return  null;
    }

    public  static Doc generateDoc(String DocType){
        return createDoc(DocType);
    }
}
