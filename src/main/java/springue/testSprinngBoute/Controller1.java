package springue.testSprinngBoute;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Controller1 {

	@Value("${service.message}")
	private String message;

	public Controller1() {}

	@RequestMapping(value = "/bite", method = RequestMethod.GET)
	public void bite(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, IOException {
		response.getOutputStream().write("toto".getBytes("UTF-8"));
		response.getOutputStream().write("\n".getBytes("UTF-8"));
		response.getOutputStream().write(message.getBytes("UTF-8"));
		response.getOutputStream().flush();
		response.getOutputStream().close();
	}

}
