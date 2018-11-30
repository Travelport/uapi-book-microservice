package com.travelport.refimpl.air.book.models;

import java.util.ArrayList;

public class ItinerariesModel extends ArrayList<ItineraryModel>{
	private static final long serialVersionUID = 1L;
	public ItinerariesModel()
	{
		super();
	}

	public ItinerariesModel(ArrayList<ItineraryModel> itins) {
		this.addAll(itins);
	}
}
