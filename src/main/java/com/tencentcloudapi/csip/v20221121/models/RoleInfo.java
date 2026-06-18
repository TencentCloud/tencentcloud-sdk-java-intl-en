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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleInfo extends AbstractModel {

    /**
    * IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * HostIP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Original IP
    */
    @SerializedName("OriginIP")
    @Expose
    private String OriginIP;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * asset ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * city
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Province
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * nation
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * latitude
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * longitude
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * Information.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Enterprise Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Account
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * Family Group
    */
    @SerializedName("Family")
    @Expose
    private String Family;

    /**
    * Virus name
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * MD5 Value
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * Malicious process filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 1-Host Assets; 2-Domain Assets; 3-Network Assets
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * Information Fields of Source Log Analysis
    */
    @SerializedName("FromLogAnalysisData")
    @Expose
    private KeyValue [] FromLogAnalysisData;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * container ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
     * Get IP 
     * @return IP IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP
     * @param IP IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get HostIP 
     * @return HostIP HostIP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set HostIP
     * @param HostIP HostIP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Original IP 
     * @return OriginIP Original IP
     */
    public String getOriginIP() {
        return this.OriginIP;
    }

    /**
     * Set Original IP
     * @param OriginIP Original IP
     */
    public void setOriginIP(String OriginIP) {
        this.OriginIP = OriginIP;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get asset ID 
     * @return InstanceID asset ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set asset ID
     * @param InstanceID asset ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get city 
     * @return City city
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set city
     * @param City city
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Province 
     * @return Province Province
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province
     * @param Province Province
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get nation 
     * @return Country nation
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set nation
     * @param Country nation
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Address. 
     * @return Address Address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address.
     * @param Address Address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get latitude 
     * @return Latitude latitude
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set latitude
     * @param Latitude latitude
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get longitude 
     * @return Longitude longitude
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set longitude
     * @param Longitude longitude
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get Information. 
     * @return Info Information.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Information.
     * @param Info Information.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Enterprise Name 
     * @return Name Enterprise Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Enterprise Name
     * @param Name Enterprise Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Account 
     * @return Account Account
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Account
     * @param Account Account
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get Family Group 
     * @return Family Family Group
     */
    public String getFamily() {
        return this.Family;
    }

    /**
     * Set Family Group
     * @param Family Family Group
     */
    public void setFamily(String Family) {
        this.Family = Family;
    }

    /**
     * Get Virus name 
     * @return VirusName Virus name
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
     * @param VirusName Virus name
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get MD5 Value 
     * @return MD5 MD5 Value
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set MD5 Value
     * @param MD5 MD5 Value
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get Malicious process filename 
     * @return FileName Malicious process filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Malicious process filename
     * @param FileName Malicious process filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 1-Host Assets; 2-Domain Assets; 3-Network Assets 
     * @return AssetType 1-Host Assets; 2-Domain Assets; 3-Network Assets
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 1-Host Assets; 2-Domain Assets; 3-Network Assets
     * @param AssetType 1-Host Assets; 2-Domain Assets; 3-Network Assets
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Information Fields of Source Log Analysis 
     * @return FromLogAnalysisData Information Fields of Source Log Analysis
     */
    public KeyValue [] getFromLogAnalysisData() {
        return this.FromLogAnalysisData;
    }

    /**
     * Set Information Fields of Source Log Analysis
     * @param FromLogAnalysisData Information Fields of Source Log Analysis
     */
    public void setFromLogAnalysisData(KeyValue [] FromLogAnalysisData) {
        this.FromLogAnalysisData = FromLogAnalysisData;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get container ID 
     * @return ContainerID container ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set container ID
     * @param ContainerID container ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    public RoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleInfo(RoleInfo source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.OriginIP != null) {
            this.OriginIP = new String(source.OriginIP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Family != null) {
            this.Family = new String(source.Family);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.FromLogAnalysisData != null) {
            this.FromLogAnalysisData = new KeyValue[source.FromLogAnalysisData.length];
            for (int i = 0; i < source.FromLogAnalysisData.length; i++) {
                this.FromLogAnalysisData[i] = new KeyValue(source.FromLogAnalysisData[i]);
            }
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "OriginIP", this.OriginIP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Family", this.Family);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArrayObj(map, prefix + "FromLogAnalysisData.", this.FromLogAnalysisData);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);

    }
}

