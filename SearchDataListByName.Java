1. Search Name (Employee) => string

1. Front end
	- html
		<input type="text" id="search" placeholder="search" />
		<input type="submit" id="btn-search" />
		
	- js :
		- event listener
			$('#btn-search').on('click', function(){
				var search = $('#search').val();
				var employee = {
					name : search
				}
				
				//ajax
				$.ajax({
					url: 'employee/search',
					type: 'POST',
					contentType: 'application/json',
					data: JSON.stringify(employee),
					success: function(data){
						console.log(data);
					}
				});
			});
			
2. Server (Spring Controller)

	@Controller
	@RequestMapping('/employee')
	public class EmployeeController{
		
		@Autowired
		EmployeeService employeeServie;
		
		@RequestMapping(value="/search", method=RequestMethod.POST)
		public List<Employee> searchByName
						(@RequestBody Employee employee){
			String searchName = employee.getName();
			List<Employee> employees = employeeService.getByName(searchName);
				
			return employees;
		}
		
	}

3. Service 
		
		@Autowired
		EmployeeDao employeeDao;
		
		public List<Employee> getByName(String name){
			List<Employee> employees = employeeDao.getByName(name);
			return employees;
		}
	
4. DAO

	@Repository
	public class EmployeeDaoImpl implement EmployeeDao{
		
		@Autowired
		SessionFactory sessionFactory;
		
		public List<Employee> getByName(String name){
			Session session = sessionFactory.getCurrentSesssion();
			String hql = "from Employee emp where emp.name = :srcName ";
			List<Employee> employees = session.createQuery(hql).setParameter('srcName',name).list();
			
			if(employees.isEmpty()){
				return null;
			}
					
			return employees;
		}
	}
