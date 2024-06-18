package com.spring.sInterceptor2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin(Model model) {
		System.out.println("이 곳은 memberController의 getLogin 메소드입니다.");

		model.addAttribute("data", "memberController의 getLogin 메소드에서 보냅니다.");
		return "member/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(String mid, String pwd, int level, HttpSession session, Model model) {
		if (mid.substring(0, 1).toLowerCase().equals("a")) {
			session.setAttribute("sMid", mid);
			session.setAttribute("sLevel", level);

			String strLevel = "";
			if (level == 0) {
				strLevel = "관리자";
			} else if (level == 1) {
				strLevel = "우수회원";
			} else if (level == 2) {
				strLevel = "정회원";
			} else if (level == 3) {
				strLevel = "준회원";
			}
			session.setAttribute("strLevel", strLevel);
			return "redirect:/message/loginOk?mid=" + mid;
		} else {
			return "redirect:message/loginNo";
		}
	}

//	@RequestMapping(value = "/loginOk", method = RequestMethod.GET)
//	public String getLoginOk(Locale locale, Model model) {
//		System.out.println("이 곳은 memberController의 getLoginOk 메소드입니다.");
//		
//		/* model.addAttribute("data", "memberController의 getLoginOk 메소드에서 보냅니다."); */
//		return "redirect:/message/loginOk?mid="+"admin";
//	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String getLogout(Model model, HttpSession session) {
		String mid = (String) session.getAttribute("sMid");
		session.invalidate();
		return "redirect:/message/logout?mid=" + mid;
	}

	@RequestMapping(value = "/idCheck", method = RequestMethod.GET)
	public String getIdCheck(Model model) {
		System.out.println("이 곳은 memberController의 getIdCheck 메소드입니다.");

		model.addAttribute("data", "memberController의 getIdCheck 메소드에서 보냅니다.");
		return "member/idCheck";
	}

	@RequestMapping(value = "/nickCheck", method = RequestMethod.GET)
	public String getnickCheck(Model model) {
		System.out.println("이 곳은 memberController의 getnickCheck 메소드입니다.");

		model.addAttribute("data", "memberController의 getnickCheck 메소드에서 보냅니다.");
		return "member/nickCheck";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String getjoin(Model model) {
		System.out.println("이 곳은 memberController의 getjoin 메소드입니다.");

		model.addAttribute("data", "memberController의 getjoin 메소드에서 보냅니다.");
		return "member/join";
	}

	@RequestMapping(value = "/joinOk", method = RequestMethod.GET)
	public String getjoinOk(Model model) {
		System.out.println("이 곳은 memberController의 getjoinOk 메소드입니다.");

		/* model.addAttribute("data", "memberController의 getjoinOk 메소드에서 보냅니다."); */
		return "redirect:/message/joinOk?mid=" + "admin";
	}

	@RequestMapping(value = "/memberMain", method = RequestMethod.GET)
	public String getMemberMain(Model model) {
		System.out.println("이 곳은 memberController의 getMemberMain 메소드입니다.");

		model.addAttribute("data", "memberController의 getMemberMain 메소드에서 보냅니다.");
		return "member/memberMain";
	}

	@RequestMapping(value = "/memberUpdate", method = RequestMethod.GET)
	public String getmemberUpdate(Model model) {
		System.out.println("이 곳은 memberController의 getmemberUpdate 메소드입니다.");

		model.addAttribute("data", "memberController의 getmemberUpdate 메소드에서 보냅니다.");
		return "member/memberUpdate";
	}

	@RequestMapping(value = "/memberUpdateOk", method = RequestMethod.GET)
	public String getMemberUpdateOk(Model model) {
		System.out.println("이 곳은 memberController의 getMemberUpdateOk 메소드입니다.");

//		model.addAttribute("data", "memberController의 getMemberUpdateOk 메소드에서 보냅니다.");
		return "redirect:/message/memberUpdateOk?mid=" + "admin";
	}

	@RequestMapping(value = "/memberDelete", method = RequestMethod.GET)
	public String getMemberDelete(Model model) {
		System.out.println("이 곳은 memberController의 getMemberDelete 메소드입니다.");

		model.addAttribute("data", "memberController의 getMemberDelete 메소드에서 보냅니다.");
		return "member/memberDelete";
	}

	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public String getmemberList(Model model) {
		System.out.println("이 곳은 memberController의 getmemberList 메소드입니다.");

		model.addAttribute("data", "memberController의 getmemberList 메소드에서 보냅니다.");
		return "member/memberList";
	}

	@RequestMapping(value = "/memberSearch", method = RequestMethod.GET)
	public String getmemberSearch(Model model) {
		System.out.println("이 곳은 memberController의 getmemberSearch 메소드입니다.");

		model.addAttribute("data", "memberController의 getmemberSearch 메소드에서 보냅니다.");
		return "member/memberSearch";
	}

	@RequestMapping(value = "/resources", method = RequestMethod.GET)
	public String getResources() {
		return "member/resources";
	}
}
