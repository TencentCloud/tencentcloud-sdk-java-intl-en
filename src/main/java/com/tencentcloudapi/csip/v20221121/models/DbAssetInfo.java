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

public class DbAssetInfo extends AbstractModel {

    /**
    * Cloud Defense Status
    */
    @SerializedName("CFWStatus")
    @Expose
    private Long CFWStatus;

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * VPC information
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * VPC IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * VPC information
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Cloud Defense Protection Edition
    */
    @SerializedName("CFWProtectLevel")
    @Expose
    private Long CFWProtectLevel;

    /**
    * Tag Information
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
     * Get Cloud Defense Status 
     * @return CFWStatus Cloud Defense Status
     */
    public Long getCFWStatus() {
        return this.CFWStatus;
    }

    /**
     * Set Cloud Defense Status
     * @param CFWStatus Cloud Defense Status
     */
    public void setCFWStatus(Long CFWStatus) {
        this.CFWStatus = CFWStatus;
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
     * Get VPC information 
     * @return VpcName VPC information
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC information
     * @param VpcName VPC information
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
     * Get VPC IP 
     * @return PrivateIp VPC IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set VPC IP
     * @param PrivateIp VPC IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
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
     * Get VPC information 
     * @return VpcId VPC information
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC information
     * @param VpcId VPC information
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get Cloud Defense Protection Edition 
     * @return CFWProtectLevel Cloud Defense Protection Edition
     */
    public Long getCFWProtectLevel() {
        return this.CFWProtectLevel;
    }

    /**
     * Set Cloud Defense Protection Edition
     * @param CFWProtectLevel Cloud Defense Protection Edition
     */
    public void setCFWProtectLevel(Long CFWProtectLevel) {
        this.CFWProtectLevel = CFWProtectLevel;
    }

    /**
     * Get Tag Information 
     * @return Tag Tag Information
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag Information
     * @param Tag Tag Information
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    public DbAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbAssetInfo(DbAssetInfo source) {
        if (source.CFWStatus != null) {
            this.CFWStatus = new Long(source.CFWStatus);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.CFWProtectLevel != null) {
            this.CFWProtectLevel = new Long(source.CFWProtectLevel);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CFWStatus", this.CFWStatus);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "CFWProtectLevel", this.CFWProtectLevel);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);

    }
}

