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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Region extends AbstractModel{

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Area name
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * Region code
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Region code (V3)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionCodeV3")
    @Expose
    private String RegionCodeV3;

    /**
    * NONE: no special models are supported by default.\nCVM: the CVM type is supported.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Support")
    @Expose
    private String Support;

    /**
    * Whether ipv6 is supported. `0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6")
    @Expose
    private Long Ipv6;

    /**
    * Whether multi-zone clusters are supported.`0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("MultiZone")
    @Expose
    private Long MultiZone;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Area name 
     * @return AreaName Area name
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set Area name
     * @param AreaName Area name
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get Region code
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return RegionCode Region code
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region code
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param RegionCode Region code
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Region code (V3)
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return RegionCodeV3 Region code (V3)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getRegionCodeV3() {
        return this.RegionCodeV3;
    }

    /**
     * Set Region code (V3)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param RegionCodeV3 Region code (V3)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setRegionCodeV3(String RegionCodeV3) {
        this.RegionCodeV3 = RegionCodeV3;
    }

    /**
     * Get NONE: no special models are supported by default.\nCVM: the CVM type is supported.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Support NONE: no special models are supported by default.\nCVM: the CVM type is supported.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSupport() {
        return this.Support;
    }

    /**
     * Set NONE: no special models are supported by default.\nCVM: the CVM type is supported.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Support NONE: no special models are supported by default.\nCVM: the CVM type is supported.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSupport(String Support) {
        this.Support = Support;
    }

    /**
     * Get Whether ipv6 is supported. `0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Ipv6 Whether ipv6 is supported. `0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Whether ipv6 is supported. `0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Ipv6 Whether ipv6 is supported. `0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setIpv6(Long Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Whether multi-zone clusters are supported.`0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return MultiZone Whether multi-zone clusters are supported.`0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getMultiZone() {
        return this.MultiZone;
    }

    /**
     * Set Whether multi-zone clusters are supported.`0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param MultiZone Whether multi-zone clusters are supported.`0` indicates no, and `1` indicates yes.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setMultiZone(Long MultiZone) {
        this.MultiZone = MultiZone;
    }

    public Region() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Region(Region source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.RegionCodeV3 != null) {
            this.RegionCodeV3 = new String(source.RegionCodeV3);
        }
        if (source.Support != null) {
            this.Support = new String(source.Support);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Long(source.Ipv6);
        }
        if (source.MultiZone != null) {
            this.MultiZone = new Long(source.MultiZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "RegionCodeV3", this.RegionCodeV3);
        this.setParamSimple(map, prefix + "Support", this.Support);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "MultiZone", this.MultiZone);

    }
}

