class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class SqlDb {
    public void save(Employee employee) {
        System.out.println(
            "Saving employee " + employee.name + " into SQL database"
        );
    }
}

class MongoDb {
    public void save(Employee employee) {
        System.out.println(
            "Saving employee " + employee.name + " into Mongo database"
        );
    }
}


// ---------------------- with dependency inversion

interface EmployeeRepository {
    void create(Employee employee);
}

class SqlDbV2 implements EmployeeRepository {
    @Override
    public void create(Employee employee) {
        System.out.println("Saving " + employee.name + " into SQL DB");
        // String sql = "INSERT INTO employee (id, name) VALUES (?, ?)";
        
        // PreparedStatement stmt = connection.prepareStatement(sql);
        // stmt.setInt(1, employee.id);
        // stmt.setString(2, employee.name);
        
        // stmt.executeUpdate();
        
        // System.out.println("Employee saved in SQL DB");
    }
}
class MongoDbV2 implements EmployeeRepository {
    
    @Override
    public void create(Employee employee) {
        System.out.println("Saving " + employee.name + " into Mongo DB");
        // database.getCollection("employee").insertOne(...)
    }
}

class DataAccessLayer {

    private EmployeeRepository generalDb;

    DataAccessLayer(EmployeeRepository anyDB) {
        this.generalDb = anyDB;
    }

    // private SqlDb sqlDb = new SqlDb();  // HARD dependency
    // private MongoDb mongoDb = new MongoDb();  // HARD dependency

    public void addEmployee(Employee employee) {
        generalDb.create(employee);
    }
}

public class DepInversion {
    public static void main(String[] args) {
        EmployeeRepository mongodb = new MongoDbV2();
        EmployeeRepository sqldb = new SqlDbV2();
        
        DataAccessLayer dal = new DataAccessLayer(sqldb);
        Employee emp = new Employee(1, "Rahul");
        
        dal.addEmployee(emp);
    }
}