/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceData extends AbstractModel {

    /**
    * <p>Device ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>Device code (for national standard devices, it is the 20-digit National Standard Encoding we generated for the device; for rtmp devices, it is the 10-digit device code)</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>Device name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Device access protocol. 1: RTMP, 2: GB, 3: GW</p>
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * <p>Device type. 1: IPC. 2: NVR.</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Device access service node id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Device access service node name</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Device streaming protocol. 1: UDP; 2: TCP</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>Device password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Device description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>sip service ID</p>
    */
    @SerializedName("SipId")
    @Expose
    private String SipId;

    /**
    * <p>sip Service Domain</p>
    */
    @SerializedName("SipDomain")
    @Expose
    private String SipDomain;

    /**
    * <p>sip service IP address</p>
    */
    @SerializedName("SipIp")
    @Expose
    private String SipIp;

    /**
    * <p>sip server port</p>
    */
    @SerializedName("SipPort")
    @Expose
    private Long SipPort;

    /**
    * <p>Rtmp device streaming address (valid only for Rtmp devices)</p>
    */
    @SerializedName("PushStreamUrl")
    @Expose
    private String PushStreamUrl;

    /**
    * <p>Device status. 0: unregistered, 1: online, 2: offline, 3: disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Organization ID of the device</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>Device gateway ID, obtained from the query gateway list API (required for gateway access only)</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>Gateway name of the device ownership</p>
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * <p>Device gateway protocol name</p>
    */
    @SerializedName("ProtocolTypeName")
    @Expose
    private String ProtocolTypeName;

    /**
    * <p>Gateway access protocol type. 1. Hikvision SDK, 2. Dahua SDK, 3. Uniview SDK, 4. Onvif (required for gateway access only)</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * <p>Device connectivity IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Device Port</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Device username</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Device region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Device vendor</p>
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * <p>Audio on/off (0: off; 1: on). Audio is dropped when turned off.</p>
    */
    @SerializedName("AudioSwitch")
    @Expose
    private Long AudioSwitch;

    /**
    * <p>Subscription switch (0: off; 1: on), enabled by default. When enabled, it subscribes to device channel adjustments. Valid only for national standard NVR devices</p>
    */
    @SerializedName("SubscribeSwitch")
    @Expose
    private Long SubscribeSwitch;

    /**
    * <p>Custom appName for RTMP publishing address</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Custom streamName for RTMP publishing address</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * <p>Whether to enable silent frames (0: disabled; 1: enabled)</p>
    */
    @SerializedName("SilentFrameSwitch")
    @Expose
    private Long SilentFrameSwitch;

    /**
    * <p>Rtmp device secure authentication streaming address (valid only for Rtmp devices)</p>
    */
    @SerializedName("PushStreamSecureUrl")
    @Expose
    private String PushStreamSecureUrl;

    /**
     * Get <p>Device ID</p> 
     * @return DeviceId <p>Device ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>Device ID</p>
     * @param DeviceId <p>Device ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>Device code (for national standard devices, it is the 20-digit National Standard Encoding we generated for the device; for rtmp devices, it is the 10-digit device code)</p> 
     * @return Code <p>Device code (for national standard devices, it is the 20-digit National Standard Encoding we generated for the device; for rtmp devices, it is the 10-digit device code)</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>Device code (for national standard devices, it is the 20-digit National Standard Encoding we generated for the device; for rtmp devices, it is the 10-digit device code)</p>
     * @param Code <p>Device code (for national standard devices, it is the 20-digit National Standard Encoding we generated for the device; for rtmp devices, it is the 10-digit device code)</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>Device name</p> 
     * @return Name <p>Device name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Device name</p>
     * @param Name <p>Device name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Device access protocol. 1: RTMP, 2: GB, 3: GW</p> 
     * @return AccessProtocol <p>Device access protocol. 1: RTMP, 2: GB, 3: GW</p>
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set <p>Device access protocol. 1: RTMP, 2: GB, 3: GW</p>
     * @param AccessProtocol <p>Device access protocol. 1: RTMP, 2: GB, 3: GW</p>
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get <p>Device type. 1: IPC. 2: NVR.</p> 
     * @return Type <p>Device type. 1: IPC. 2: NVR.</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Device type. 1: IPC. 2: NVR.</p>
     * @param Type <p>Device type. 1: IPC. 2: NVR.</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Device access service node id</p> 
     * @return ClusterId <p>Device access service node id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Device access service node id</p>
     * @param ClusterId <p>Device access service node id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Device access service node name</p> 
     * @return ClusterName <p>Device access service node name</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Device access service node name</p>
     * @param ClusterName <p>Device access service node name</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Device streaming protocol. 1: UDP; 2: TCP</p> 
     * @return TransportProtocol <p>Device streaming protocol. 1: UDP; 2: TCP</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>Device streaming protocol. 1: UDP; 2: TCP</p>
     * @param TransportProtocol <p>Device streaming protocol. 1: UDP; 2: TCP</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>Device password</p> 
     * @return Password <p>Device password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Device password</p>
     * @param Password <p>Device password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Device description</p> 
     * @return Description <p>Device description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Device description</p>
     * @param Description <p>Device description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>sip service ID</p> 
     * @return SipId <p>sip service ID</p>
     */
    public String getSipId() {
        return this.SipId;
    }

    /**
     * Set <p>sip service ID</p>
     * @param SipId <p>sip service ID</p>
     */
    public void setSipId(String SipId) {
        this.SipId = SipId;
    }

    /**
     * Get <p>sip Service Domain</p> 
     * @return SipDomain <p>sip Service Domain</p>
     */
    public String getSipDomain() {
        return this.SipDomain;
    }

    /**
     * Set <p>sip Service Domain</p>
     * @param SipDomain <p>sip Service Domain</p>
     */
    public void setSipDomain(String SipDomain) {
        this.SipDomain = SipDomain;
    }

    /**
     * Get <p>sip service IP address</p> 
     * @return SipIp <p>sip service IP address</p>
     */
    public String getSipIp() {
        return this.SipIp;
    }

    /**
     * Set <p>sip service IP address</p>
     * @param SipIp <p>sip service IP address</p>
     */
    public void setSipIp(String SipIp) {
        this.SipIp = SipIp;
    }

    /**
     * Get <p>sip server port</p> 
     * @return SipPort <p>sip server port</p>
     */
    public Long getSipPort() {
        return this.SipPort;
    }

    /**
     * Set <p>sip server port</p>
     * @param SipPort <p>sip server port</p>
     */
    public void setSipPort(Long SipPort) {
        this.SipPort = SipPort;
    }

    /**
     * Get <p>Rtmp device streaming address (valid only for Rtmp devices)</p> 
     * @return PushStreamUrl <p>Rtmp device streaming address (valid only for Rtmp devices)</p>
     */
    public String getPushStreamUrl() {
        return this.PushStreamUrl;
    }

    /**
     * Set <p>Rtmp device streaming address (valid only for Rtmp devices)</p>
     * @param PushStreamUrl <p>Rtmp device streaming address (valid only for Rtmp devices)</p>
     */
    public void setPushStreamUrl(String PushStreamUrl) {
        this.PushStreamUrl = PushStreamUrl;
    }

    /**
     * Get <p>Device status. 0: unregistered, 1: online, 2: offline, 3: disabled</p> 
     * @return Status <p>Device status. 0: unregistered, 1: online, 2: offline, 3: disabled</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Device status. 0: unregistered, 1: online, 2: offline, 3: disabled</p>
     * @param Status <p>Device status. 0: unregistered, 1: online, 2: offline, 3: disabled</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Organization ID of the device</p> 
     * @return OrganizationId <p>Organization ID of the device</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>Organization ID of the device</p>
     * @param OrganizationId <p>Organization ID of the device</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>Device gateway ID, obtained from the query gateway list API (required for gateway access only)</p> 
     * @return GatewayId <p>Device gateway ID, obtained from the query gateway list API (required for gateway access only)</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>Device gateway ID, obtained from the query gateway list API (required for gateway access only)</p>
     * @param GatewayId <p>Device gateway ID, obtained from the query gateway list API (required for gateway access only)</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>Gateway name of the device ownership</p> 
     * @return GatewayName <p>Gateway name of the device ownership</p>
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set <p>Gateway name of the device ownership</p>
     * @param GatewayName <p>Gateway name of the device ownership</p>
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get <p>Device gateway protocol name</p> 
     * @return ProtocolTypeName <p>Device gateway protocol name</p>
     */
    public String getProtocolTypeName() {
        return this.ProtocolTypeName;
    }

    /**
     * Set <p>Device gateway protocol name</p>
     * @param ProtocolTypeName <p>Device gateway protocol name</p>
     */
    public void setProtocolTypeName(String ProtocolTypeName) {
        this.ProtocolTypeName = ProtocolTypeName;
    }

    /**
     * Get <p>Gateway access protocol type. 1. Hikvision SDK, 2. Dahua SDK, 3. Uniview SDK, 4. Onvif (required for gateway access only)</p> 
     * @return ProtocolType <p>Gateway access protocol type. 1. Hikvision SDK, 2. Dahua SDK, 3. Uniview SDK, 4. Onvif (required for gateway access only)</p>
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>Gateway access protocol type. 1. Hikvision SDK, 2. Dahua SDK, 3. Uniview SDK, 4. Onvif (required for gateway access only)</p>
     * @param ProtocolType <p>Gateway access protocol type. 1. Hikvision SDK, 2. Dahua SDK, 3. Uniview SDK, 4. Onvif (required for gateway access only)</p>
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>Device connectivity IP</p> 
     * @return Ip <p>Device connectivity IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Device connectivity IP</p>
     * @param Ip <p>Device connectivity IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Device Port</p> 
     * @return Port <p>Device Port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Device Port</p>
     * @param Port <p>Device Port</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Device username</p> 
     * @return Username <p>Device username</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Device username</p>
     * @param Username <p>Device username</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Device region</p> 
     * @return Region <p>Device region</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Device region</p>
     * @param Region <p>Device region</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Device vendor</p> 
     * @return Manufacturer <p>Device vendor</p>
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set <p>Device vendor</p>
     * @param Manufacturer <p>Device vendor</p>
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get <p>Audio on/off (0: off; 1: on). Audio is dropped when turned off.</p> 
     * @return AudioSwitch <p>Audio on/off (0: off; 1: on). Audio is dropped when turned off.</p>
     */
    public Long getAudioSwitch() {
        return this.AudioSwitch;
    }

    /**
     * Set <p>Audio on/off (0: off; 1: on). Audio is dropped when turned off.</p>
     * @param AudioSwitch <p>Audio on/off (0: off; 1: on). Audio is dropped when turned off.</p>
     */
    public void setAudioSwitch(Long AudioSwitch) {
        this.AudioSwitch = AudioSwitch;
    }

    /**
     * Get <p>Subscription switch (0: off; 1: on), enabled by default. When enabled, it subscribes to device channel adjustments. Valid only for national standard NVR devices</p> 
     * @return SubscribeSwitch <p>Subscription switch (0: off; 1: on), enabled by default. When enabled, it subscribes to device channel adjustments. Valid only for national standard NVR devices</p>
     */
    public Long getSubscribeSwitch() {
        return this.SubscribeSwitch;
    }

    /**
     * Set <p>Subscription switch (0: off; 1: on), enabled by default. When enabled, it subscribes to device channel adjustments. Valid only for national standard NVR devices</p>
     * @param SubscribeSwitch <p>Subscription switch (0: off; 1: on), enabled by default. When enabled, it subscribes to device channel adjustments. Valid only for national standard NVR devices</p>
     */
    public void setSubscribeSwitch(Long SubscribeSwitch) {
        this.SubscribeSwitch = SubscribeSwitch;
    }

    /**
     * Get <p>Custom appName for RTMP publishing address</p> 
     * @return AppName <p>Custom appName for RTMP publishing address</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>Custom appName for RTMP publishing address</p>
     * @param AppName <p>Custom appName for RTMP publishing address</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Custom streamName for RTMP publishing address</p> 
     * @return StreamName <p>Custom streamName for RTMP publishing address</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>Custom streamName for RTMP publishing address</p>
     * @param StreamName <p>Custom streamName for RTMP publishing address</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get <p>Whether to enable silent frames (0: disabled; 1: enabled)</p> 
     * @return SilentFrameSwitch <p>Whether to enable silent frames (0: disabled; 1: enabled)</p>
     */
    public Long getSilentFrameSwitch() {
        return this.SilentFrameSwitch;
    }

    /**
     * Set <p>Whether to enable silent frames (0: disabled; 1: enabled)</p>
     * @param SilentFrameSwitch <p>Whether to enable silent frames (0: disabled; 1: enabled)</p>
     */
    public void setSilentFrameSwitch(Long SilentFrameSwitch) {
        this.SilentFrameSwitch = SilentFrameSwitch;
    }

    /**
     * Get <p>Rtmp device secure authentication streaming address (valid only for Rtmp devices)</p> 
     * @return PushStreamSecureUrl <p>Rtmp device secure authentication streaming address (valid only for Rtmp devices)</p>
     */
    public String getPushStreamSecureUrl() {
        return this.PushStreamSecureUrl;
    }

    /**
     * Set <p>Rtmp device secure authentication streaming address (valid only for Rtmp devices)</p>
     * @param PushStreamSecureUrl <p>Rtmp device secure authentication streaming address (valid only for Rtmp devices)</p>
     */
    public void setPushStreamSecureUrl(String PushStreamSecureUrl) {
        this.PushStreamSecureUrl = PushStreamSecureUrl;
    }

    public DescribeDeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceData(DescribeDeviceData source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccessProtocol != null) {
            this.AccessProtocol = new Long(source.AccessProtocol);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TransportProtocol != null) {
            this.TransportProtocol = new Long(source.TransportProtocol);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SipId != null) {
            this.SipId = new String(source.SipId);
        }
        if (source.SipDomain != null) {
            this.SipDomain = new String(source.SipDomain);
        }
        if (source.SipIp != null) {
            this.SipIp = new String(source.SipIp);
        }
        if (source.SipPort != null) {
            this.SipPort = new Long(source.SipPort);
        }
        if (source.PushStreamUrl != null) {
            this.PushStreamUrl = new String(source.PushStreamUrl);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.ProtocolTypeName != null) {
            this.ProtocolTypeName = new String(source.ProtocolTypeName);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new Long(source.ProtocolType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.AudioSwitch != null) {
            this.AudioSwitch = new Long(source.AudioSwitch);
        }
        if (source.SubscribeSwitch != null) {
            this.SubscribeSwitch = new Long(source.SubscribeSwitch);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.SilentFrameSwitch != null) {
            this.SilentFrameSwitch = new Long(source.SilentFrameSwitch);
        }
        if (source.PushStreamSecureUrl != null) {
            this.PushStreamSecureUrl = new String(source.PushStreamSecureUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccessProtocol", this.AccessProtocol);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SipId", this.SipId);
        this.setParamSimple(map, prefix + "SipDomain", this.SipDomain);
        this.setParamSimple(map, prefix + "SipIp", this.SipIp);
        this.setParamSimple(map, prefix + "SipPort", this.SipPort);
        this.setParamSimple(map, prefix + "PushStreamUrl", this.PushStreamUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "ProtocolTypeName", this.ProtocolTypeName);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "AudioSwitch", this.AudioSwitch);
        this.setParamSimple(map, prefix + "SubscribeSwitch", this.SubscribeSwitch);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "SilentFrameSwitch", this.SilentFrameSwitch);
        this.setParamSimple(map, prefix + "PushStreamSecureUrl", this.PushStreamSecureUrl);

    }
}

