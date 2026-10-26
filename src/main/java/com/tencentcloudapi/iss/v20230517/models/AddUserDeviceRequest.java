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

public class AddUserDeviceRequest extends AbstractModel {

    /**
    * <p>Device name, only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters; (device name no need to be globally unique and can be duplicated)</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Device access protocol (1: RTMP, 2: GB, 6: ISUP)</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul><p>Default value: 2</p>
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * <p>Device type. 1: IPC; 2: NVR. (If the device access protocol is RTMP, only select IPC as the device type.)</p><p>Enumeration values:</p><ul><li>1: IPC</li><li>2: NVR</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>ID of the organization to which the device belongs. Obtain from the organization query api DescribeOrganization.</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>Device access service node ID (Value field obtained from the DescribeRegionDomain API for querying available service nodes of a device)</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Device streaming protocol. 1: UDP, 2: TCP. (Valid for national standard devices. UDP by default if not specified)</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>Device password (required for national standard devices, length of 1-64 characters)</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Device description, length not exceeding 128 characters</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * <p>Device port (deprecated, reserved for compatibility, can be ignored)</p><p>Value range: [1, 65535]</p><p>Unit: port</p>
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
    * <p>Device SN (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("SNCode")
    @Expose
    private String SNCode;

    /**
    * <p>Custom AppName for RTMP publishing address (required for RTMP only, support English, digits, _, -, ., length not exceeding 64 characters)</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Custom StreamName for RTMP publishing address (required for RTMP only, supports English, digits, _, -, ., length not exceeding 64 characters)</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get <p>Device name, only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters; (device name no need to be globally unique and can be duplicated)</p> 
     * @return Name <p>Device name, only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters; (device name no need to be globally unique and can be duplicated)</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Device name, only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters; (device name no need to be globally unique and can be duplicated)</p>
     * @param Name <p>Device name, only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters; (device name no need to be globally unique and can be duplicated)</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Device access protocol (1: RTMP, 2: GB, 6: ISUP)</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul><p>Default value: 2</p> 
     * @return AccessProtocol <p>Device access protocol (1: RTMP, 2: GB, 6: ISUP)</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul><p>Default value: 2</p>
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set <p>Device access protocol (1: RTMP, 2: GB, 6: ISUP)</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul><p>Default value: 2</p>
     * @param AccessProtocol <p>Device access protocol (1: RTMP, 2: GB, 6: ISUP)</p><p>Enumeration values:</p><ul><li>1: RTMP</li><li>2: GB</li><li>6: ISUP</li></ul><p>Default value: 2</p>
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get <p>Device type. 1: IPC; 2: NVR. (If the device access protocol is RTMP, only select IPC as the device type.)</p><p>Enumeration values:</p><ul><li>1: IPC</li><li>2: NVR</li></ul> 
     * @return Type <p>Device type. 1: IPC; 2: NVR. (If the device access protocol is RTMP, only select IPC as the device type.)</p><p>Enumeration values:</p><ul><li>1: IPC</li><li>2: NVR</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Device type. 1: IPC; 2: NVR. (If the device access protocol is RTMP, only select IPC as the device type.)</p><p>Enumeration values:</p><ul><li>1: IPC</li><li>2: NVR</li></ul>
     * @param Type <p>Device type. 1: IPC; 2: NVR. (If the device access protocol is RTMP, only select IPC as the device type.)</p><p>Enumeration values:</p><ul><li>1: IPC</li><li>2: NVR</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>ID of the organization to which the device belongs. Obtain from the organization query api DescribeOrganization.</p> 
     * @return OrganizationId <p>ID of the organization to which the device belongs. Obtain from the organization query api DescribeOrganization.</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>ID of the organization to which the device belongs. Obtain from the organization query api DescribeOrganization.</p>
     * @param OrganizationId <p>ID of the organization to which the device belongs. Obtain from the organization query api DescribeOrganization.</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>Device access service node ID (Value field obtained from the DescribeRegionDomain API for querying available service nodes of a device)</p> 
     * @return ClusterId <p>Device access service node ID (Value field obtained from the DescribeRegionDomain API for querying available service nodes of a device)</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Device access service node ID (Value field obtained from the DescribeRegionDomain API for querying available service nodes of a device)</p>
     * @param ClusterId <p>Device access service node ID (Value field obtained from the DescribeRegionDomain API for querying available service nodes of a device)</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Device streaming protocol. 1: UDP, 2: TCP. (Valid for national standard devices. UDP by default if not specified)</p> 
     * @return TransportProtocol <p>Device streaming protocol. 1: UDP, 2: TCP. (Valid for national standard devices. UDP by default if not specified)</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>Device streaming protocol. 1: UDP, 2: TCP. (Valid for national standard devices. UDP by default if not specified)</p>
     * @param TransportProtocol <p>Device streaming protocol. 1: UDP, 2: TCP. (Valid for national standard devices. UDP by default if not specified)</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>Device password (required for national standard devices, length of 1-64 characters)</p> 
     * @return Password <p>Device password (required for national standard devices, length of 1-64 characters)</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Device password (required for national standard devices, length of 1-64 characters)</p>
     * @param Password <p>Device password (required for national standard devices, length of 1-64 characters)</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Device description, length not exceeding 128 characters</p> 
     * @return Description <p>Device description, length not exceeding 128 characters</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Device description, length not exceeding 128 characters</p>
     * @param Description <p>Device description, length not exceeding 128 characters</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>Device port (deprecated, reserved for compatibility, can be ignored)</p><p>Value range: [1, 65535]</p><p>Unit: port</p> 
     * @return Port <p>Device port (deprecated, reserved for compatibility, can be ignored)</p><p>Value range: [1, 65535]</p><p>Unit: port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Device port (deprecated, reserved for compatibility, can be ignored)</p><p>Value range: [1, 65535]</p><p>Unit: port</p>
     * @param Port <p>Device port (deprecated, reserved for compatibility, can be ignored)</p><p>Value range: [1, 65535]</p><p>Unit: port</p>
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
     * Get <p>Device SN (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return SNCode <p>Device SN (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public String getSNCode() {
        return this.SNCode;
    }

    /**
     * Set <p>Device SN (deprecated, reserved for compatibility, can be ignored)</p>
     * @param SNCode <p>Device SN (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setSNCode(String SNCode) {
        this.SNCode = SNCode;
    }

    /**
     * Get <p>Custom AppName for RTMP publishing address (required for RTMP only, support English, digits, _, -, ., length not exceeding 64 characters)</p> 
     * @return AppName <p>Custom AppName for RTMP publishing address (required for RTMP only, support English, digits, _, -, ., length not exceeding 64 characters)</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>Custom AppName for RTMP publishing address (required for RTMP only, support English, digits, _, -, ., length not exceeding 64 characters)</p>
     * @param AppName <p>Custom AppName for RTMP publishing address (required for RTMP only, support English, digits, _, -, ., length not exceeding 64 characters)</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Custom StreamName for RTMP publishing address (required for RTMP only, supports English, digits, _, -, ., length not exceeding 64 characters)</p> 
     * @return StreamName <p>Custom StreamName for RTMP publishing address (required for RTMP only, supports English, digits, _, -, ., length not exceeding 64 characters)</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>Custom StreamName for RTMP publishing address (required for RTMP only, supports English, digits, _, -, ., length not exceeding 64 characters)</p>
     * @param StreamName <p>Custom StreamName for RTMP publishing address (required for RTMP only, supports English, digits, _, -, ., length not exceeding 64 characters)</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    public AddUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserDeviceRequest(AddUserDeviceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccessProtocol != null) {
            this.AccessProtocol = new Long(source.AccessProtocol);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        if (source.SNCode != null) {
            this.SNCode = new String(source.SNCode);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccessProtocol", this.AccessProtocol);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "SNCode", this.SNCode);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

