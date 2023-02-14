package it.betacom.model;

public abstract class Computer {
	private Double cpuClockSpeed;
	private Integer memoryCapacity;
	private Integer storageCapacity;

	public Computer (Double cpuClockSpeed, Integer memoryCapacity, Integer storageCapacity) {
		this.cpuClockSpeed = cpuClockSpeed;
		this.memoryCapacity = memoryCapacity;
		this.storageCapacity = storageCapacity;
	}
	
	public void getSpecifications() {
		System.out.print("Computer class: " + this.getClass().getSimpleName() + " | ");			
		System.out.print("CPU clock speed: " + getCpuClockSpeed() + "Ghz | ");			
		System.out.print("RAM: " + getMemoryCapacity() + "GB | ");			
		System.out.println("Storage: " + getStorageCapacity() + "GB");			
	}
	
	public Double getCpuClockSpeed() {
		return cpuClockSpeed;
	}

	public void setCpuClockSpeed(Double cpuClockSpeed) {
		this.cpuClockSpeed = cpuClockSpeed;
	}

	public Integer getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(Integer memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

}
