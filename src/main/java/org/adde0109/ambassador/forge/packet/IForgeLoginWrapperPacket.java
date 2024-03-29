package org.adde0109.ambassador.forge.packet;

import com.velocitypowered.proxy.protocol.packet.LoginPluginResponsePacket;

public interface IForgeLoginWrapperPacket {
  public LoginPluginResponsePacket encode();
  public int getId();

  public boolean getSuccess();
}
