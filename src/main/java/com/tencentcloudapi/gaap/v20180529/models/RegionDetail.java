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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionDetail extends AbstractModel {

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name in Chinese or English
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region where the data center locates
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * Name of the region where the data center locates
    */
    @SerializedName("RegionAreaName")
    @Expose
    private String RegionAreaName;

    /**
    * Data center type. `dc`: data center; `ec`: edge server.
    */
    @SerializedName("IDCType")
    @Expose
    private String IDCType;

    /**
    * Feature bitmap. Valid values:
`0`: the feature is not supported;
`1`: the feature is supported.
Each bit in the bitmap represents a feature:
1st bit: layer-4 acceleration;
2nd bit: layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: dedicated BGP access;
6th bit: non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FeatureBitmap")
    @Expose
    private Long FeatureBitmap;

    /**
    * Network support 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportFeature")
    @Expose
    private SupportFeature SupportFeature;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name in Chinese or English 
     * @return RegionName Region name in Chinese or English
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name in Chinese or English
     * @param RegionName Region name in Chinese or English
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region where the data center locates 
     * @return RegionArea Region where the data center locates
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set Region where the data center locates
     * @param RegionArea Region where the data center locates
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get Name of the region where the data center locates 
     * @return RegionAreaName Name of the region where the data center locates
     */
    public String getRegionAreaName() {
        return this.RegionAreaName;
    }

    /**
     * Set Name of the region where the data center locates
     * @param RegionAreaName Name of the region where the data center locates
     */
    public void setRegionAreaName(String RegionAreaName) {
        this.RegionAreaName = RegionAreaName;
    }

    /**
     * Get Data center type. `dc`: data center; `ec`: edge server. 
     * @return IDCType Data center type. `dc`: data center; `ec`: edge server.
     */
    public String getIDCType() {
        return this.IDCType;
    }

    /**
     * Set Data center type. `dc`: data center; `ec`: edge server.
     * @param IDCType Data center type. `dc`: data center; `ec`: edge server.
     */
    public void setIDCType(String IDCType) {
        this.IDCType = IDCType;
    }

    /**
     * Get Feature bitmap. Valid values:
`0`: the feature is not supported;
`1`: the feature is supported.
Each bit in the bitmap represents a feature:
1st bit: layer-4 acceleration;
2nd bit: layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: dedicated BGP access;
6th bit: non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FeatureBitmap Feature bitmap. Valid values:
`0`: the feature is not supported;
`1`: the feature is supported.
Each bit in the bitmap represents a feature:
1st bit: layer-4 acceleration;
2nd bit: layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: dedicated BGP access;
6th bit: non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFeatureBitmap() {
        return this.FeatureBitmap;
    }

    /**
     * Set Feature bitmap. Valid values:
`0`: the feature is not supported;
`1`: the feature is supported.
Each bit in the bitmap represents a feature:
1st bit: layer-4 acceleration;
2nd bit: layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: dedicated BGP access;
6th bit: non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FeatureBitmap Feature bitmap. Valid values:
`0`: the feature is not supported;
`1`: the feature is supported.
Each bit in the bitmap represents a feature:
1st bit: layer-4 acceleration;
2nd bit: layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: dedicated BGP access;
6th bit: non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFeatureBitmap(Long FeatureBitmap) {
        this.FeatureBitmap = FeatureBitmap;
    }

    /**
     * Get Network support 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportFeature Network support 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SupportFeature getSupportFeature() {
        return this.SupportFeature;
    }

    /**
     * Set Network support 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportFeature Network support 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportFeature(SupportFeature SupportFeature) {
        this.SupportFeature = SupportFeature;
    }

    public RegionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionDetail(RegionDetail source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.RegionAreaName != null) {
            this.RegionAreaName = new String(source.RegionAreaName);
        }
        if (source.IDCType != null) {
            this.IDCType = new String(source.IDCType);
        }
        if (source.FeatureBitmap != null) {
            this.FeatureBitmap = new Long(source.FeatureBitmap);
        }
        if (source.SupportFeature != null) {
            this.SupportFeature = new SupportFeature(source.SupportFeature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "RegionAreaName", this.RegionAreaName);
        this.setParamSimple(map, prefix + "IDCType", this.IDCType);
        this.setParamSimple(map, prefix + "FeatureBitmap", this.FeatureBitmap);
        this.setParamObj(map, prefix + "SupportFeature.", this.SupportFeature);

    }
}

