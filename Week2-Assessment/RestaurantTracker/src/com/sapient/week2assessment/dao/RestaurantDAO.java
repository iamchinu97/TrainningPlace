package com.sapient.week2assessment.dao;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;
import org.json.JSONObject;

import com.sapient.week2.assessment.bean.RestaurantBean;

public class RestaurantDAO {
	public static String apikey="af42ccfe0f9086b8188ab9d28b8f12b6";
	public static Map<String, RestaurantBean> resList;
	public List<RestaurantBean> getRestaurantsByCity(String entity_id) throws Exception
	{
		String query="search?entity_id="+entity_id+"&entity_type=city";
		ClientConfig config = new ClientConfig();  
	    Client client = ClientBuilder.newClient(config);  
	    WebTarget target = client.target(getBaseUri()+query);
	    String result=target.request().header("user-key", apikey).accept(MediaType.APPLICATION_JSON).get(String.class);
	    JSONObject jsonResult= new JSONObject(result);
	    JSONArray jsonResultArray=(JSONArray) jsonResult.get("restaurants");
	    resList= new TreeMap<String, RestaurantBean>();
	    int i=0;
	    while(i<jsonResultArray.length())
	    {
	    	JSONObject re=(JSONObject) jsonResultArray.get(i);
	    	JSONObject restaurant=(JSONObject) re.get("restaurant");
	    	String id=restaurant.getString("id");
	    	String name=restaurant.getString("name");
	    	JSONObject jsonlocation=(JSONObject) restaurant.get("location");
	    	String location= jsonlocation.getString("address");
	    	String timing=restaurant.getString("timings");
	    	String cuisines=restaurant.getString("cuisines");
	    	String price_range=String.valueOf(restaurant.getInt("price_range"));
	    	JSONObject user_rating= (JSONObject)restaurant.get("user_rating");
	    	String rating= user_rating.getString("aggregate_rating");
	    	RestaurantBean rb= new RestaurantBean(id, name, location, timing, cuisines, price_range,rating);
	    	resList.put(id, rb);
	    	i++;
	    }
	    List<RestaurantBean> restaurants = new ArrayList<>();
	    restaurants.addAll(resList.values());
	    return restaurants;
	    
	}
	private static URI getBaseUri() {
		// TODO Auto-generated method stub
		 return UriBuilder.fromUri("https://developers.zomato.com/api/v2.1/").build();
		
	}
}
