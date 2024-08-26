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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * Region name, such as ap-guangzhou
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Region description, such as Guangzhou
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Unique marker of region
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * List of all availability zones in the region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private ZoneInfo [] Zones;

    /**
    * Number of clusters in the region
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 0 indicates the international site; 1 indicates not.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsInternationalSite")
    @Expose
    private Long IsInternationalSite;

    /**
    * Bucket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get Region name, such as ap-guangzhou 
     * @return Name Region name, such as ap-guangzhou
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Region name, such as ap-guangzhou
     * @param Name Region name, such as ap-guangzhou
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Region description, such as Guangzhou 
     * @return Desc Region description, such as Guangzhou
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Region description, such as Guangzhou
     * @param Desc Region description, such as Guangzhou
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Unique marker of region 
     * @return RegionId Unique marker of region
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Unique marker of region
     * @param RegionId Unique marker of region
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get List of all availability zones in the region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zones List of all availability zones in the region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneInfo [] getZones() {
        return this.Zones;
    }

    /**
     * Set List of all availability zones in the region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zones List of all availability zones in the region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZones(ZoneInfo [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Number of clusters in the region 
     * @return Count Number of clusters in the region
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of clusters in the region
     * @param Count Number of clusters in the region
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 0 indicates the international site; 1 indicates not.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsInternationalSite 0 indicates the international site; 1 indicates not.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsInternationalSite() {
        return this.IsInternationalSite;
    }

    /**
     * Set 0 indicates the international site; 1 indicates not.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsInternationalSite 0 indicates the international site; 1 indicates not.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsInternationalSite(Long IsInternationalSite) {
        this.IsInternationalSite = IsInternationalSite;
    }

    /**
     * Get Bucket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bucket Bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bucket Bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zones != null) {
            this.Zones = new ZoneInfo[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new ZoneInfo(source.Zones[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.IsInternationalSite != null) {
            this.IsInternationalSite = new Long(source.IsInternationalSite);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "IsInternationalSite", this.IsInternationalSite);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);

    }
}

