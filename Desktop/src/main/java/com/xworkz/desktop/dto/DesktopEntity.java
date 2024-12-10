package com.xworkz.desktop.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="desktop_table")
@NamedQuery(name="updateByEmailAndNumber", query="UPDATE DesktopEntity et SET et.email= :getEmail,et.desktopNumber= :getNumber")
@NamedQuery(name="findNameAndEmailById", query="SElECT et.name,et.email from  DesktopEntity et where et.id= :getId")
@NamedQuery(name="getAll", query="select em from DesktopEntity em")
@NamedQuery(name="getCountByEmailAndDate", query="SElECT count(et) from  DesktopEntity et where et.email= :getEmail AND et.date= :getDate")
@NamedQuery(name="getCountByWhereNumber576856475", query="SElECT count(et) from  DesktopEntity et where et.desktopNumber= :getNumber")
@NamedQuery(name="getCountByWhereId", query="SElECT count(et) from  DesktopEntity et where et.id>5")
@NamedQuery(name="getNameAndEmailAndNumberAndPriceAndCharValueById", query="SElECT et.name,et.email,et.desktopNumber, et.price,et.charValue  from  DesktopEntity et where et.id= :getId")
@NamedQuery(name="getAllByEmailAndNumber", query="SElECT et from  DesktopEntity et where et.email= :getEmail AND et.desktopNumber= :getNumber")
@NamedQuery(name="getAllDatatypesByNameAndDate", query="SElECT et.email,et.name,et.isActive,et.price,et.desktopNumber,et.shortValue,et.byteValue,et.charValue,et.floatValue from  DesktopEntity et where et.name= :getName AND et.date= :getDate")
@NamedQuery(name="deleteRow", query="Delete from  DesktopEntity et where et.name= :getName AND et.desktopNumber= :getNumber")
@NamedQuery(name="updateByNumberAndActiveOrNot", query="UPDATE DesktopEntity et SET et.desktopNumber= :getNumber,et.isActive= :getActive WHERE et.id= :getId")
@NamedQuery(name="updateByNameAndEamil", query="UPDATE DesktopEntity et SET et.name= :getName,et.email= :getEmail WHERE et.id= :getId")
public class DesktopEntity {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private boolean isActive;
    private LocalDate date;
    private LocalDateTime dateTime;
    private double price;
    private long desktopNumber;
    private short shortValue;
    private byte byteValue;
    private char charValue;
    private float floatValue;
    
    public DesktopEntity() {
    
    }
	public DesktopEntity(String name, String email, boolean isActive, LocalDate date, LocalDateTime dateTime,
			double price, long desktopNumber, short shortValue, byte byteValue, char charValue, float floatValue) {
		super();
		this.name = name;
		this.email = email;
		this.isActive = isActive;
		this.date = date;
		this.dateTime = dateTime;
		this.price = price;
		this.desktopNumber = desktopNumber;
		this.shortValue = shortValue;
		this.byteValue = byteValue;
		this.charValue = charValue;
		this.floatValue = floatValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getDesktopNumber() {
		return desktopNumber;
	}
	public void setDesktopNumber(long desktopNumber) {
		this.desktopNumber = desktopNumber;
	}
	public short getShortValue() {
		return shortValue;
	}
	public void setShortValue(short shortValue) {
		this.shortValue = shortValue;
	}
	public byte getByteValue() {
		return byteValue;
	}
	public void setByteValue(byte byteValue) {
		this.byteValue = byteValue;
	}
	public char getCharValue() {
		return charValue;
	}
	public void setCharValue(char charValue) {
		this.charValue = charValue;
	}
	public float getFloatValue() {
		return floatValue;
	}
	public void setFloatValue(float floatValue) {
		this.floatValue = floatValue;
	}
	@Override
	public String toString() {
		return "DesktopEntity [id=" + id + ", name=" + name + ", email=" + email + ", isActive=" + isActive + ", date="
				+ date + ", dateTime=" + dateTime + ", price=" + price + ", desktopNumber=" + desktopNumber
				+ ", shortValue=" + shortValue + ", byteValue=" + byteValue + ", charValue=" + charValue
				+ ", floatValue=" + floatValue + "]";
	}
    
}
	