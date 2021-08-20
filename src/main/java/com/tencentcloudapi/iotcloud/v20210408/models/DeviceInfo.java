/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo extends AbstractModel{

    /**
    * Device name
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Whether the device is online. `0`: offline; `1`: online
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * Device login time
    */
    @SerializedName("LoginTime")
    @Expose
    private Long LoginTime;

    /**
    * Device version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Device certificate, which is returned for devices that use certificates for authentication
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * Device key, which is returned for devices that use keys for authentication
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * Device attribute
    */
    @SerializedName("Tags")
    @Expose
    private DeviceTag [] Tags;

    /**
    * Device type
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * International Mobile Equipment Identity (IMEI)
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * ISP
    */
    @SerializedName("Isp")
    @Expose
    private Long Isp;

    /**
    * Device ID at the NB-IoT ISP
    */
    @SerializedName("NbiotDeviceID")
    @Expose
    private String NbiotDeviceID;

    /**
    * IP address
    */
    @SerializedName("ConnIP")
    @Expose
    private Long ConnIP;

    /**
    * Last updated time of the device
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * DevEUI of a LoRa device
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
    * MoteType of a LoRa device
    */
    @SerializedName("LoraMoteType")
    @Expose
    private Long LoraMoteType;

    /**
    * The first time when the device went online
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FirstOnlineTime")
    @Expose
    private Long FirstOnlineTime;

    /**
    * The last time when the device went offline
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LastOfflineTime")
    @Expose
    private Long LastOfflineTime;

    /**
    * Device creation time
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Device log level
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
    * Whether the device certificate has been obtained. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("CertState")
    @Expose
    private Long CertState;

    /**
    * Whether the device is enabled. `0`: disabled; `1`: enabled
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("EnableState")
    @Expose
    private Long EnableState;

    /**
    * Device tags
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Labels")
    @Expose
    private DeviceLabel [] Labels;

    /**
    * IP address of the MQTT client
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * Time of last OTA update
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FirmwareUpdateTime")
    @Expose
    private Long FirmwareUpdateTime;

    /**
     * Get Device name 
     * @return DeviceName Device name
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name
     * @param DeviceName Device name
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Whether the device is online. `0`: offline; `1`: online 
     * @return Online Whether the device is online. `0`: offline; `1`: online
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set Whether the device is online. `0`: offline; `1`: online
     * @param Online Whether the device is online. `0`: offline; `1`: online
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get Device login time 
     * @return LoginTime Device login time
     */
    public Long getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set Device login time
     * @param LoginTime Device login time
     */
    public void setLoginTime(Long LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get Device version 
     * @return Version Device version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Device version
     * @param Version Device version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Device certificate, which is returned for devices that use certificates for authentication 
     * @return DeviceCert Device certificate, which is returned for devices that use certificates for authentication
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * Set Device certificate, which is returned for devices that use certificates for authentication
     * @param DeviceCert Device certificate, which is returned for devices that use certificates for authentication
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * Get Device key, which is returned for devices that use keys for authentication 
     * @return DevicePsk Device key, which is returned for devices that use keys for authentication
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set Device key, which is returned for devices that use keys for authentication
     * @param DevicePsk Device key, which is returned for devices that use keys for authentication
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * Get Device attribute 
     * @return Tags Device attribute
     */
    public DeviceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Device attribute
     * @param Tags Device attribute
     */
    public void setTags(DeviceTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Device type 
     * @return DeviceType Device type
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type
     * @param DeviceType Device type
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get International Mobile Equipment Identity (IMEI) 
     * @return Imei International Mobile Equipment Identity (IMEI)
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set International Mobile Equipment Identity (IMEI)
     * @param Imei International Mobile Equipment Identity (IMEI)
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get ISP 
     * @return Isp ISP
     */
    public Long getIsp() {
        return this.Isp;
    }

    /**
     * Set ISP
     * @param Isp ISP
     */
    public void setIsp(Long Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Device ID at the NB-IoT ISP 
     * @return NbiotDeviceID Device ID at the NB-IoT ISP
     */
    public String getNbiotDeviceID() {
        return this.NbiotDeviceID;
    }

    /**
     * Set Device ID at the NB-IoT ISP
     * @param NbiotDeviceID Device ID at the NB-IoT ISP
     */
    public void setNbiotDeviceID(String NbiotDeviceID) {
        this.NbiotDeviceID = NbiotDeviceID;
    }

    /**
     * Get IP address 
     * @return ConnIP IP address
     */
    public Long getConnIP() {
        return this.ConnIP;
    }

    /**
     * Set IP address
     * @param ConnIP IP address
     */
    public void setConnIP(Long ConnIP) {
        this.ConnIP = ConnIP;
    }

    /**
     * Get Last updated time of the device 
     * @return LastUpdateTime Last updated time of the device
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last updated time of the device
     * @param LastUpdateTime Last updated time of the device
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get DevEUI of a LoRa device 
     * @return LoraDevEui DevEUI of a LoRa device
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * Set DevEUI of a LoRa device
     * @param LoraDevEui DevEUI of a LoRa device
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * Get MoteType of a LoRa device 
     * @return LoraMoteType MoteType of a LoRa device
     */
    public Long getLoraMoteType() {
        return this.LoraMoteType;
    }

    /**
     * Set MoteType of a LoRa device
     * @param LoraMoteType MoteType of a LoRa device
     */
    public void setLoraMoteType(Long LoraMoteType) {
        this.LoraMoteType = LoraMoteType;
    }

    /**
     * Get The first time when the device went online
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FirstOnlineTime The first time when the device went online
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getFirstOnlineTime() {
        return this.FirstOnlineTime;
    }

    /**
     * Set The first time when the device went online
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FirstOnlineTime The first time when the device went online
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFirstOnlineTime(Long FirstOnlineTime) {
        this.FirstOnlineTime = FirstOnlineTime;
    }

    /**
     * Get The last time when the device went offline
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LastOfflineTime The last time when the device went offline
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getLastOfflineTime() {
        return this.LastOfflineTime;
    }

    /**
     * Set The last time when the device went offline
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LastOfflineTime The last time when the device went offline
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLastOfflineTime(Long LastOfflineTime) {
        this.LastOfflineTime = LastOfflineTime;
    }

    /**
     * Get Device creation time
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return CreateTime Device creation time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Device creation time
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param CreateTime Device creation time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Device log level
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LogLevel Device log level
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set Device log level
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LogLevel Device log level
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get Whether the device certificate has been obtained. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return CertState Whether the device certificate has been obtained. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getCertState() {
        return this.CertState;
    }

    /**
     * Set Whether the device certificate has been obtained. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param CertState Whether the device certificate has been obtained. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setCertState(Long CertState) {
        this.CertState = CertState;
    }

    /**
     * Get Whether the device is enabled. `0`: disabled; `1`: enabled
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return EnableState Whether the device is enabled. `0`: disabled; `1`: enabled
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getEnableState() {
        return this.EnableState;
    }

    /**
     * Set Whether the device is enabled. `0`: disabled; `1`: enabled
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param EnableState Whether the device is enabled. `0`: disabled; `1`: enabled
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setEnableState(Long EnableState) {
        this.EnableState = EnableState;
    }

    /**
     * Get Device tags
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Labels Device tags
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public DeviceLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Device tags
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Labels Device tags
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLabels(DeviceLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get IP address of the MQTT client
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ClientIP IP address of the MQTT client
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set IP address of the MQTT client
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ClientIP IP address of the MQTT client
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get Time of last OTA update
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FirmwareUpdateTime Time of last OTA update
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getFirmwareUpdateTime() {
        return this.FirmwareUpdateTime;
    }

    /**
     * Set Time of last OTA update
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FirmwareUpdateTime Time of last OTA update
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFirmwareUpdateTime(Long FirmwareUpdateTime) {
        this.FirmwareUpdateTime = FirmwareUpdateTime;
    }

    public DeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceInfo(DeviceInfo source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new Long(source.LoginTime);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.DeviceCert != null) {
            this.DeviceCert = new String(source.DeviceCert);
        }
        if (source.DevicePsk != null) {
            this.DevicePsk = new String(source.DevicePsk);
        }
        if (source.Tags != null) {
            this.Tags = new DeviceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new DeviceTag(source.Tags[i]);
            }
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.Isp != null) {
            this.Isp = new Long(source.Isp);
        }
        if (source.NbiotDeviceID != null) {
            this.NbiotDeviceID = new String(source.NbiotDeviceID);
        }
        if (source.ConnIP != null) {
            this.ConnIP = new Long(source.ConnIP);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.LoraDevEui != null) {
            this.LoraDevEui = new String(source.LoraDevEui);
        }
        if (source.LoraMoteType != null) {
            this.LoraMoteType = new Long(source.LoraMoteType);
        }
        if (source.FirstOnlineTime != null) {
            this.FirstOnlineTime = new Long(source.FirstOnlineTime);
        }
        if (source.LastOfflineTime != null) {
            this.LastOfflineTime = new Long(source.LastOfflineTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
        if (source.CertState != null) {
            this.CertState = new Long(source.CertState);
        }
        if (source.EnableState != null) {
            this.EnableState = new Long(source.EnableState);
        }
        if (source.Labels != null) {
            this.Labels = new DeviceLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new DeviceLabel(source.Labels[i]);
            }
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.FirmwareUpdateTime != null) {
            this.FirmwareUpdateTime = new Long(source.FirmwareUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "NbiotDeviceID", this.NbiotDeviceID);
        this.setParamSimple(map, prefix + "ConnIP", this.ConnIP);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);
        this.setParamSimple(map, prefix + "LoraMoteType", this.LoraMoteType);
        this.setParamSimple(map, prefix + "FirstOnlineTime", this.FirstOnlineTime);
        this.setParamSimple(map, prefix + "LastOfflineTime", this.LastOfflineTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "CertState", this.CertState);
        this.setParamSimple(map, prefix + "EnableState", this.EnableState);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "FirmwareUpdateTime", this.FirmwareUpdateTime);

    }
}

