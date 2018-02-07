package com.example.controller;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Booking;
import com.example.model.BookingStatus;
import com.example.model.Custromer;
import com.example.model.Manufacturer;
import com.example.model.Model;
import com.example.model.Vehicle;
import com.example.model.VehicleCategory;
import com.example.repository.IBookingRepository;
import com.example.repository.IBookingStatusRepository;
import com.example.repository.ICustomerRepository;
import com.example.repository.IManufacturerRepository;
import com.example.repository.IModelRepository;
import com.example.repository.IVehicleCategoryRepository;
import com.example.repository.IVehicleRepository;

@Component
public class MyController implements CommandLineRunner {
	private static final Logger log = LogManager.getLogger(MyController.class);
	@Autowired
	private IManufacturerRepository manufactureRepository;
	
	@Autowired
	private IModelRepository modelRepository;
	
	@Autowired
	private IVehicleCategoryRepository vehiclecategoryRepository;
	@Autowired
	private IVehicleRepository vehicleRepository;
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IBookingRepository bookingRepository;
	
	@Autowired
	private IBookingStatusRepository bookingStatusRepository;
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		boolean check =true;
		int luachon;
//		do {
//			switch (luachon) {
//			case 1:
//				log.info("____________________Lớp Manufacturer___________________________");
//				break;
//			case 1:
//				log.info("____________________Lớp ___________________________");
//				break;
//			case 1:
//				log.info("____________________Lớp Manufacturer___________________________");
//				break;
//			case 1:
//				log.info("____________________Lớp Manufacturer___________________________");
//				break;
//			case 1:
//				log.info("____________________Lớp Manufacturer___________________________");
//				break;
//			case 1:
//				log.info("____________________Lớp Manufacturer___________________________");
//				break;
//			case 1:
//				log.info("____________________Lớp Manufacturer___________________________");
//				break;
//			default:
//				break;
//			}
//			
//		} while (true);
		log.info("_______________________________Lớp Model__________________________________");
		Manufacturer m1 = new Manufacturer("Japan","Sản xuất tại Nhật Bản @.@");
		Model model = new Model("30chiec/tuan","Toyota 4 chỗ",m1);
		modelRepository.save(model);
		manufactureRepository.save(m1);
		
		if(modelRepository.findOne(1)!= null) {
		modelRepository.delete(1);
		}else {
			log.debug("Error not exists!!!!");
		}
	
		Manufacturer m0 = new Manufacturer("Japan","Sản xuất tại Nhật Bản @.@");
		//if(modelRepository.findOne(1))
		modelRepository.flush();
		
		log.info("_______________________________Lớp Vehicle__________________________________");
//		VehicleCategory vc1 = new VehicleCategory("Xe Toyota 4 chỗ laf loại xe hangj sang");
//		
//		SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");		
//		Vehicle v1 = new Vehicle("200km",date.parse("20/10/2017"),"20 xe/ngày",model,vc1);
//		vehiclecategoryRepository.save(vc1);
//		vehicleRepository.save(v1);
		
		log.info("_______________________________Lớp Booking__________________________________");
//		Custromer c1 = new Custromer("104 Kim Mã, Hà Nội","12 ba Vì, hà nội","34 hưng yên","Việt Nam","Hưng Yên","Khach hàng tiềm năng","Nguyễn Như Lương","luong@gmail.com","male","0663434","Yên Lãng");
//		BookingStatus bs1 = new BookingStatus("Lịch đặt đầu tiên");
//
//		Booking b1 = new Booking("Yes",date.parse("03/01/2018"),date.parse("11/01/2018"),"phòng 402, Kim Mã, Hà Nội",v1,c1,bs1);
//		customerRepository.save(c1);
//		bookingRepository.save(b1);
				
		log.info("_______________________________Lớp manufacturer__________________________________");
		//Thêm 1 manufactures
//		Manufacturer manu1 = new Manufacturer("Japan","Sản xuất tại Nhật Bản @.@");
//		manufactureRepository.save(manu1);
//		manu1.toString();
//		Manufacturer manu2 = new Manufacturer("Korea", "Sản xuất tại Hàn Quốc ^.^");
//		manufactureRepository.save(manu2);
//		manu2.toString();
//		Manufacturer manu3 = new Manufacturer("American", "Sản xuất tại Mĩ ^.^");
//		manufactureRepository.save(manu3);
//		manu3.toString();
//		log.info("Thêm thành công");
//		
//		Model m9 = new Model("30chiec/tuan","Toyota 4 chỗ",manu1);
//		modelRepository.save(m9);
//		log.info("In ra thành công! ");
		
		//Update 1 manufacture
//		Manufacturer manu4 = new Manufacturer("French", "Sản xuất tại Pháp");
//		manufactureRepository.getOne(1);
//		manufactureRepository.save(manu4);
//		manufactureRepository.flush();
//		manu4.toString();
//		
		// Delete 1 manufacture;
//		manufactureRepository.delete(1);
		
		// Hiển thi tất cả manufacturer
		for(Manufacturer manufacture: manufactureRepository.findAll()) {
			log.info(" "+ manufacture.getManufacturerCode()+ " , "+ manufacture.getManufacturerName()+" , "+ manufacture.getManufacurerDetails());
		}
		
		//Tìm kiếm theo tên
//		String name = null;
//		Set<Manufacturer> manu = (Set<Manufacturer>) manufactureRepository.getManufacturerByName(name);
//		for(Manufacturer m: manu) {
//			if((m.getManufacturerName()).equals(name)) {
//				
//			}
		}
		

		
	}
	
	
	
