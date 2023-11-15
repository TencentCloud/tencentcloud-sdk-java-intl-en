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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vpc extends AbstractModel {

    /**
    * Subnet (32-bit mask)
    */
    @SerializedName("Subnet")
    @Expose
    private Long Subnet;

    /**
    * Connected VPC (32-bit mask)
    */
    @SerializedName("ConnectedVpc")
    @Expose
    private Long ConnectedVpc;

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CVM (only 32-bit)
    */
    @SerializedName("CVM")
    @Expose
    private Long CVM;

    /**
    * Tags
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * DNS domain
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DNS")
    @Expose
    private String [] DNS;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * CIDR block
    */
    @SerializedName("CIDR")
    @Expose
    private String CIDR;

    /**
    * Asset creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * User name
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * Whether it's a critical asset. `1`: Yes; `2`: No
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
     * Get Subnet (32-bit mask) 
     * @return Subnet Subnet (32-bit mask)
     */
    public Long getSubnet() {
        return this.Subnet;
    }

    /**
     * Set Subnet (32-bit mask)
     * @param Subnet Subnet (32-bit mask)
     */
    public void setSubnet(Long Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get Connected VPC (32-bit mask) 
     * @return ConnectedVpc Connected VPC (32-bit mask)
     */
    public Long getConnectedVpc() {
        return this.ConnectedVpc;
    }

    /**
     * Set Connected VPC (32-bit mask)
     * @param ConnectedVpc Connected VPC (32-bit mask)
     */
    public void setConnectedVpc(Long ConnectedVpc) {
        this.ConnectedVpc = ConnectedVpc;
    }

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
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CVM (only 32-bit) 
     * @return CVM CVM (only 32-bit)
     */
    public Long getCVM() {
        return this.CVM;
    }

    /**
     * Set CVM (only 32-bit)
     * @param CVM CVM (only 32-bit)
     */
    public void setCVM(Long CVM) {
        this.CVM = CVM;
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
     * Get DNS domain
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DNS DNS domain
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getDNS() {
        return this.DNS;
    }

    /**
     * Set DNS domain
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DNS DNS domain
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDNS(String [] DNS) {
        this.DNS = DNS;
    }

    /**
     * Get Asset name 
     * @return AssetName Asset name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
     * @param AssetName Asset name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get CIDR block 
     * @return CIDR CIDR block
     */
    public String getCIDR() {
        return this.CIDR;
    }

    /**
     * Set CIDR block
     * @param CIDR CIDR block
     */
    public void setCIDR(String CIDR) {
        this.CIDR = CIDR;
    }

    /**
     * Get Asset creation time 
     * @return CreateTime Asset creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Asset creation time
     * @param CreateTime Asset creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get appid 
     * @return AppId appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get User name 
     * @return Nick User name
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User name
     * @param Nick User name
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
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

    /**
     * Get Whether it's a critical asset. `1`: Yes; `2`: No
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsCore Whether it's a critical asset. `1`: Yes; `2`: No
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Whether it's a critical asset. `1`: Yes; `2`: No
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsCore Whether it's a critical asset. `1`: Yes; `2`: No
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    public Vpc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vpc(Vpc source) {
        if (source.Subnet != null) {
            this.Subnet = new Long(source.Subnet);
        }
        if (source.ConnectedVpc != null) {
            this.ConnectedVpc = new Long(source.ConnectedVpc);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CVM != null) {
            this.CVM = new Long(source.CVM);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.DNS != null) {
            this.DNS = new String[source.DNS.length];
            for (int i = 0; i < source.DNS.length; i++) {
                this.DNS[i] = new String(source.DNS[i]);
            }
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.CIDR != null) {
            this.CIDR = new String(source.CIDR);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamSimple(map, prefix + "ConnectedVpc", this.ConnectedVpc);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamArraySimple(map, prefix + "DNS.", this.DNS);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "CIDR", this.CIDR);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);

    }
}

