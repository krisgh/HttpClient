package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HttpClient {

	public static final String SUBMIT_METHOD_POST = "POST";
	public static final String SUBMIT_METHOD_GET = "GET";
	private static Map<String, String> params = new HashMap<String, String>();
	private static Map<String, String> props = new HashMap<String, String>();
	private static HttpURLConnection connection = null;

	public static void setParams(String key, String value) {
		params.put(key, value);
	}

	public static void setProps(String key, String value) {
		params.put(key, value);
	}

	/**
	 * 
	 * @param urlString
	 * @param param
	 * @param method
	 * @return JASON String
	 */
	public static String pub(String urlString, String method) {
		URL url = null;
		StringBuffer sb = new StringBuffer();

		try {
			url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(method);
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);

			// 设置请求头信息
			setHeader();

			OutputStream os = connection.getOutputStream();
			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				os.write(param().getBytes("utf-8"));
			// 获取返回数据
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line = "";
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
				reader.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
		System.out.println("response:" + sb.toString());
		return sb.toString();
	}

	private static String param() {
		String p = "";
		Set<String> keys = params.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String param = it.next();
			p += "&" + param + "=" + params.get(param);
		}
		System.out.println(p);
		return p.substring(1);
	}

	private static void setHeader() {
		Set<String> keys = props.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String prop = (String) it.next();
			connection.setRequestProperty(prop, props.get(prop));
		}
	}
}
