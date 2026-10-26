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

public class AddDeviceData extends AbstractModel {

    /**
    * <p>Device iD</p>
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
    * <p>Device name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Device access protocol. 1: RTMP; 2: GB.</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul>
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * <p>Device type. 1: IPC. 2: NVR</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Device access service node ID</p>
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
    * <p>Device streaming protocol. 1: UDP, 2: TCP</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>Device password.</p>
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
    * <p>Device status. 0: unregistered, 1: online, 2: offline, 3: disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Affiliated organization ID of the device</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private Long OrganizationId;

    /**
    * <p>Device access gateway ID (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>Gateway access protocol type (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>User ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get <p>Device iD</p> 
     * @return DeviceId <p>Device iD</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>Device iD</p>
     * @param DeviceId <p>Device iD</p>
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
     * Get <p>Device name.</p> 
     * @return Name <p>Device name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Device name.</p>
     * @param Name <p>Device name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Device access protocol. 1: RTMP; 2: GB.</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul> 
     * @return AccessProtocol <p>Device access protocol. 1: RTMP; 2: GB.</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul>
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set <p>Device access protocol. 1: RTMP; 2: GB.</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul>
     * @param AccessProtocol <p>Device access protocol. 1: RTMP; 2: GB.</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul>
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get <p>Device type. 1: IPC. 2: NVR</p> 
     * @return Type <p>Device type. 1: IPC. 2: NVR</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Device type. 1: IPC. 2: NVR</p>
     * @param Type <p>Device type. 1: IPC. 2: NVR</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Device access service node ID</p> 
     * @return ClusterId <p>Device access service node ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Device access service node ID</p>
     * @param ClusterId <p>Device access service node ID</p>
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
     * Get <p>Device streaming protocol. 1: UDP, 2: TCP</p> 
     * @return TransportProtocol <p>Device streaming protocol. 1: UDP, 2: TCP</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>Device streaming protocol. 1: UDP, 2: TCP</p>
     * @param TransportProtocol <p>Device streaming protocol. 1: UDP, 2: TCP</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>Device password.</p> 
     * @return Password <p>Device password.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Device password.</p>
     * @param Password <p>Device password.</p>
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
     * Get <p>Affiliated organization ID of the device</p> 
     * @return OrganizationId <p>Affiliated organization ID of the device</p>
     */
    public Long getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>Affiliated organization ID of the device</p>
     * @param OrganizationId <p>Affiliated organization ID of the device</p>
     */
    public void setOrganizationId(Long OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>Device access gateway ID (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return GatewayId <p>Device access gateway ID (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>Device access gateway ID (deprecated, reserved for compatibility, can be ignored)</p>
     * @param GatewayId <p>Device access gateway ID (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>Gateway access protocol type (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return ProtocolType <p>Gateway access protocol type (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>Gateway access protocol type (deprecated, reserved for compatibility, can be ignored)</p>
     * @param ProtocolType <p>Gateway access protocol type (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return Ip <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
     * @param Ip <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return Port <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
     * @param Port <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Device username (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return Username <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
     * @param Username <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>User ID</p> 
     * @return AppId <p>User ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User ID</p>
     * @param AppId <p>User ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public AddDeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDeviceData(AddDeviceData source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new Long(source.OrganizationId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
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
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

