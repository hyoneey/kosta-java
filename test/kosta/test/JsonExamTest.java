package kosta.test;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import kosta.json.JsonExam;
import net.sf.json.JSONException;

public class JsonExamTest {

	@Test
	public void test() {
		JsonExam js = new JsonExam();
		JSONObject obj = js.createJsonObject();
		assertEquals("ȫ�浿", obj.get("name"));
	}

}
