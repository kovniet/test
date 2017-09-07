package springue.testSprinngBoute;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Controller2 {

	public Controller2() {}

	@RequestMapping(value = "/poil", method = RequestMethod.GET)
	public void bite(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, IOException {
		response.getOutputStream().write("poale".getBytes("UTF-8"));
		response.getOutputStream().flush();
		response.getOutputStream().close();
	}
}
