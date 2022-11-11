package com.painthouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.painthouse.data_transfer_object.Dataa;
import com.painthouse.entity.Painter;
import com.painthouse.service.PainterService;
import com.painthouse.util.EmailService;

	
@Controller
public class PainterController {
	
	@Autowired
	private EmailService emailservice;
	
	@Autowired
	private PainterService paintser;

	@RequestMapping("/PainterDetails")
	public String viewNewPainter() {
		return "newpainter";
	}
	
	@RequestMapping(value="/SavePainter" , method = RequestMethod.POST)
	public String savePainter(@ModelAttribute("painter")Painter p,ModelMap model) {
		paintser.saveOnePainter(p);
		emailservice.sendSimpleMail(p.getEmail(), "connected", "your registration process is done!!");
		model.addAttribute("msg", "your record is saved!!");
		return "newpainter";
	}
//	
//	}
//	@RequestMapping(value="/SavePainter",method=RequestMethod.POST)
//	public String SavePainter(@RequestParam("namee")String aa,@RequestParam("agee")String bb,@RequestParam("cityy")String cc,@RequestParam("contactNoo")String dd,@RequestParam("commissionn")int ee) {
//		Painter pp =new Painter();
//		pp.setName(aa);
//		pp.setAge(bb);
//		pp.setCity(cc);
//		pp.setContactNo(dd);
//		pp.setCommission(ee);
//		paintser.saveOnePainter(pp);
//		return "newpainter";
//	}
	
//	@RequestMapping("/SavePainter")
//	public String savePainter(Dataa d) {
//		Painter qq =new Painter();
//		qq.setName(d.getName());
//		qq.setAge(d.getAge());
//		qq.setCity(d.getCity());
//		qq.setContactNo(d.getContactNo());
//		qq.setCommission(d.getCommission());
//		paintser.saveOnePainter(qq);
//		return "newpainter";
//	}

	@RequestMapping("/ListAllPainters")
	public String ListAllPainters(ModelMap model) {
		List<Painter> paint = paintser.listAllLeads();
		model.addAttribute("paints",paint);
		return "All_Painters";
	}

	@RequestMapping("/deletepainter")
	public String deletePainter(@RequestParam("ccc")long cid, ModelMap model) {
		paintser.deletePainter(cid);
		List<Painter> paint = paintser.listAllLeads();
		model.addAttribute("paints", paint);
		return "All_Painters";
	}
	@RequestMapping("/updatepainter")
	public String getById(@RequestParam ("ddd")long cid,ModelMap model) {
		Painter paint = paintser.getById(cid);
		model.addAttribute("paints",paint);
		return"Update_Painter";
	}
	@RequestMapping(value="/updatepainter",method = RequestMethod.POST)
	public String updatePainter(@ModelAttribute("Painter")Painter p, ModelMap model) {
		paintser.saveOnePainter(p);
		emailservice.sendSimpleMail(p.getEmail(), "connected", "your registration process is done!!");
		List<Painter> paint = paintser.listAllLeads();
		model.addAttribute("paints",paint);
		return "All_Painters";
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
