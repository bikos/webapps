
import java.util.HashSet;
import java.util.Set;

/**
 * City generated by hbm2java
 */
public class City implements java.io.Serializable {

	private Integer empCityId;
	private String cityName;
	private int cityZip;
	private Set employees = new HashSet(0);

	public City() {
	}

	public City(String cityName, int cityZip) {
		this.cityName = cityName;
		this.cityZip = cityZip;
	}

	public City(String cityName, int cityZip, Set employees) {
		this.cityName = cityName;
		this.cityZip = cityZip;
		this.employees = employees;
	}

	public Integer getEmpCityId() {
		return this.empCityId;
	}

	public void setEmpCityId(Integer empCityId) {
		this.empCityId = empCityId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityZip() {
		return this.cityZip;
	}

	public void setCityZip(int cityZip) {
		this.cityZip = cityZip;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}
