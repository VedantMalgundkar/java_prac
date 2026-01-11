class Student {
    public String name;
    public int age;

    Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }
}

class SqlDb {
    public void insert(Student student) {
        System.out.println("Insrting student in sql DB "+ student.name + " with age " + student.age);
    }
}

class MongoDb {
    public void insertMongo(Student student) {
        System.out.println("Insrting student in Mongo DB "+ student.name + " with age " + student.age);
    }
}

class DataAccess {
    // private SqlDb db = new SqlDb();
    private MongoDb mDb = new MongoDb();

    public void AddStudent(Student student) {
        // this.db.insert(student);
        this.mDb.insertMongo(student);
    }
}

// both low level code and high level code should depend on the abstraction to avoid tight coupling.
interface IgeneralDb {
    public void insertStudent(Student student);
}

class SqlDbV2 implements IgeneralDb {
    public void insertStudent(Student student) {
        System.out.println("Inserting student in sql DB "+ student.name + " with age " + student.age);
    }
}

class MongoDbV2 implements IgeneralDb {
    public void insertStudent(Student student) {
        System.out.println("Inserting student in Mongo DB "+ student.name + " with age " + student.age);
    }
}

class DataAccessV2 {
    private IgeneralDb genDb;

    DataAccessV2(IgeneralDb genDb) {
        this.genDb = genDb;
    }

    public void AddStudent(Student student) {
        this.genDb.insertStudent(student);
    }
}

public class DepInversion {
    public static void main(String[] args) {

        Student stud = new Student("Vedant", 23);
        
        DataAccess daLayer = new DataAccess();
        DataAccessV2 daLayerV2 = new DataAccessV2(new MongoDbV2());
        DataAccessV2 daLayerV3 = new DataAccessV2(new SqlDbV2());

        daLayer.AddStudent(stud);
        daLayerV2.AddStudent(stud);
        daLayerV3.AddStudent(stud);
    }
}