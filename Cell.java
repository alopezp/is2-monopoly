package edu.ncsu.monopoly;

@FunctionalInterface
public interface Cell {
	private boolean available = true;
	private String name;
	protected Player owner;

	String getName = () > return name;
	Player getOwner = ()> return owner;
	Int getPrice = () > return 0;
	boolean isAvailable = () > return available;
	playAction = () >;
	<boolean>setAvailable = (available) > this.available = available;
	<String>setName =(name) > this.name = name;
	<Player>setOwner=(owner) > this.owner = owner;
	toString = () > return name;
}
