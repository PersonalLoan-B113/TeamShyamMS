package com.webcore.app.ms.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class City
{
	@Id
	private int cityId;
	private String cityName;
	private int cityCode;
	@ManyToOne(cascade = CascadeType.ALL)
	private State state;
	
	public int getCityId()
	{
		return cityId;
	}
	public void setCityId(int cityId)
	{
		this.cityId = cityId;
	}
	public String getCityName()
	{
		return cityName;
	}
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
	public int getCityCode()
	{
		return cityCode;
	}
	public void setCityCode(int cityCode)
	{
		this.cityCode = cityCode;
	}
	public State getState()
	{
		return state;
	}
	public void setState(State state)
	{
		this.state = state;
	}
}
