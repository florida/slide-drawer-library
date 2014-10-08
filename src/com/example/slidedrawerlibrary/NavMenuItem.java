package com.example.slidedrawerlibrary;

import android.content.Context;

public class NavMenuItem implements NavDrawerItem {
	// NavMenuItem Type is classified as 1
	public static final int ITEM_TYPE = 1;
	private int id;
	private String label;
	private int icon;
	private boolean updateActionBarTitle;
	
	private NavMenuItem(){
	}
	
	public static NavMenuItem create(int id, String label, String icon, boolean updateActionBarTitle, Context context) {
		NavMenuItem item = new NavMenuItem();
		item.setId(id);
		item.setLabel(label);
		item.setIcon(context.getResources().getIdentifier(icon, "drawable", context.getPackageName()));
		item.setUpdateActionBarTitle(updateActionBarTitle);
		return item;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getLabel() {
		return this.label;
	}

	@Override
	public int getType() {
		return ITEM_TYPE;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean updateActionBarTitle() {
		return this.updateActionBarTitle;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setLabel(String label) {
		this.label = label;

	}
	
	public void setIcon(int icon) {
		this.icon = icon;
	}
	
	public int getIcon() {
		return this.icon;
	}
	
	public void setUpdateActionBarTitle(boolean updateActionBarTitle) {
		this.updateActionBarTitle = updateActionBarTitle;
	}

}
