package DesignPatterns.CreationalPattern.FactoryMethodPatten;

public class Client {

    public  static  void  main(String[] args){
      Doc doc =AbstractDocGenerate.createDoc("Zip");
        assert doc != null;
        doc.generateDoc();
    }
}
