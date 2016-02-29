package com.sohail.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{
   public String sayHi(String name) throws RemoteException;
}
