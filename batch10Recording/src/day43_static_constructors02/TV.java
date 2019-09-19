package day43_static_constructors02;

public class TV {
private int channel = 1;
private int volumeLevel = 1;
private boolean on = false;
private String brand = "";


public TV(int channel, int volumeLevel, boolean on, String brand) {
	super();
	this.channel = channel;
	this.volumeLevel = volumeLevel;
	this.on = on;
	this.brand = brand;
}
public int getChannel() {
	return channel;
}
public void setChannel(int channel) {
	this.channel = channel;
}
public int getVolumeLevel() {
	return volumeLevel;
}
public void setVolumeLevel(int volumeLevel) {
	this.volumeLevel = volumeLevel;
}
public boolean isOn() {
	return on;
}
public void setOn(boolean on) {
	this.on = on;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}



}


