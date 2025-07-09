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

public class DBAssetVO extends AbstractModel {

    /**
    * Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC tags
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * 
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * User `appid`
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * User name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Port
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Tags
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get Asset ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC tags
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VpcName VPC tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC tags
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VpcName VPC tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Region
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Domain name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Domain Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Domain Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetCreateTime Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetCreateTime Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get Last scan time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LastScanTime Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LastScanTime Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ConfigurationRisk Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ConfigurationRisk Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Network attacks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Attack Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Attack Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get  
     * @return Access 
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set 
     * @param Access 
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ScanTask Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ScanTask Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get User `appid`
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppId User `appid`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `appid`
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppId User `appid`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get User name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NickName User name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set User name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NickName User name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Port
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Port Port
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Port Port
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Tags
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Tag Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Tag Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Private IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PrivateIp Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PrivateIp Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Public IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PublicIp Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PublicIp Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsCore Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsCore Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsNewAsset Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsNewAsset Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public DBAssetVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBAssetVO(DBAssetVO source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.ScanTask != null) {
            this.ScanTask = new Long(source.ScanTask);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

