package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


interface Management{
	
	public void manage();
}

class Person
{
	private String firstname;
	private String lastname;
	private int sex;
	private LocalDate birth;
	
	public Person(String fn, String ln, int s, LocalDate bd) {
		System.out.println("Personインスタンス生成");
		firstname = fn;
		lastname = ln;
		sex = s;
		birth = bd;
	}
	
	public void SetAll(Person p) {
		firstname = p.firstname;
		lastname =p.lastname;
		sex = p.sex;
		birth = p.birth;
	}
	
	public void SetFirst(String fn) {
		firstname = fn;
	}
	
	public void SetLast(String ln) {
		lastname = ln;
	}
	
	public void SetSex(int s) {
		sex = s;
	}
	
	public void SetBirth(LocalDate bd) {
		birth = bd;
	}
	
	public void ShowPerson() {
		System.out.println(firstname + lastname + sex + birth);
	}
}

class Address
{
	private String post;
	private String pref;
	private String city;
	private String hnum;
	
	public Address(String ps, String pf, String ct, String hm) {
		System.out.println("Addressインスタンス生成");
		post = ps;
		pref = pf;
		city = ct;
		hnum = hm;
	}
	
	public void SetAll(Address a) {
		post = a.post;
		pref = a.pref;
		city = a.city;
		hnum = a.hnum;
	}
	
	public void SetPost(String ps){
		post = ps;
	}
	
	public void SetPref(String pf) {
		pref = pf;
	}
	
	public void SetCity(String ct) {
		city = ct;
	}
	
	public void SetHnum(String hm) {
		hnum = hm;
	}
	
	public void ShowAddress() {
		System.out.println(post + pref + city + hnum);
	}
}

class Employee
{
	private String epnum;
	private Person person;
	private Address address;
	private String tel;
	private String mail;
	
	public Employee(String en, Person p, Address a, String t, String m) {
		System.out.println("Employeeインスタンスを生成");
		epnum = en;
		person = p;
		address = a;
		tel =t;
		mail = m;
	}
	
	public void SetAll(Employee e) {
		epnum = e.epnum;
		person = e.person;
		address = e.address;
		tel = e.tel;
		mail = e.mail;
	}
	
	public void SetEpnum(String en) {
		epnum = en;
	}
	
	public void SetPerson(Person p) {
		person = p;
	}
	
	public void SetAddress(Address a) {
		address = a;
	}
	
	public void SetTel(String t) {
		tel =t;
	}
	
	public void Setmail(String m) {
		mail = m;
	}
	
	public void ShowData() {
		System.out.println("社員情報");
		System.out.println(epnum);
		person.ShowPerson();
		address.ShowAddress();
		System.out.println(tel);
		System.out.println(mail);
	}
}

class Manager extends Employee implements Management{
	
	public Manager(String en, Person p, Address a, String t, String m) {
		super(en, p, a, t, m);
	}
	
	public void manage() {
		ShowData();
	}
}

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("社員番号 > ");
		String num = br.readLine();
		System.out.print("姓 > ");
		String fn = br.readLine();
		System.out.print("名 > ");
		String ln = br.readLine();
		System.out.print("性別 > ");
		int s = Integer.parseInt( br.readLine() );
		System.out.print("生年月日 > ");
		LocalDate bd = LocalDate.parse(br.readLine(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.print("郵便番号 > ");
		String ps = br.readLine();
		System.out.print("都道府県 > ");
		String pf = br.readLine();
		System.out.print("市区町村> ");
		String ct = br.readLine();
		System.out.print("番地 > ");
		String hm = br.readLine();
		System.out.print("メールアドレス > ");
		String mail = br.readLine();
		System.out.print("電話番号 > ");
		String tel = br.readLine();
		
		Person p1 = new Person(fn, ln, s, bd);
		Address a1 = new Address(ps, pf, ct, hm);
		Employee e1 = new Employee(num, p1, a1, tel, mail);
		
		e1.ShowData();
		
		Management m = new Manager(num, p1, a1, tel, mail);
		m.manage();
		
	}
	    
}
