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
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset name.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * vpcid
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc Tag.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Asset creation time.
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Last scan time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Configuration risk.
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Network attack.
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * Network access.
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * Scan Task
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Nickname Alias
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Core or Not
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * New Asset or Not. 1: New
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset name. 
     * @return AssetName Asset name.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name.
     * @param AssetName Asset name.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type. 
     * @return AssetType Asset type.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type.
     * @param AssetType Asset type.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get vpcid 
     * @return VpcId vpcid
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcid
     * @param VpcId vpcid
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc Tag. 
     * @return VpcName vpc Tag.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc Tag.
     * @param VpcName vpc Tag.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get Asset creation time. 
     * @return AssetCreateTime Asset creation time.
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset creation time.
     * @param AssetCreateTime Asset creation time.
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get Last scan time 
     * @return LastScanTime Last scan time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scan time
     * @param LastScanTime Last scan time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Configuration risk. 
     * @return ConfigurationRisk Configuration risk.
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuration risk.
     * @param ConfigurationRisk Configuration risk.
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Network attack. 
     * @return Attack Network attack.
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Network attack.
     * @param Attack Network attack.
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get Network access. 
     * @return Access Network access.
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set Network access.
     * @param Access Network access.
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get Scan Task 
     * @return ScanTask Scan Task
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Scan Task
     * @param ScanTask Scan Task
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN 
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Nickname Alias 
     * @return NickName Nickname Alias
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Nickname Alias
     * @param NickName Nickname Alias
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
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
     * Get Tag. 
     * @return Tag Tag.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Core or Not 
     * @return IsCore Core or Not
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Core or Not
     * @param IsCore Core or Not
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get New Asset or Not. 1: New 
     * @return IsNewAsset New Asset or Not. 1: New
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set New Asset or Not. 1: New
     * @param IsNewAsset New Asset or Not. 1: New
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

