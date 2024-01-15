package org.example.simulator.network.connection;

public interface Connection extends BaseConnection{
    void sendPacket(String sourceId, String destinationId, String data);
    String receivePacket(String destinationId);
    String getSource();
    String getDestination();
}
