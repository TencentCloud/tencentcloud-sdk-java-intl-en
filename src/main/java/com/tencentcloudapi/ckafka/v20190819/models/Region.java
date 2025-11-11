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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Region extends AbstractModel {

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
    * Region code.
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Region code (V3 version).
    */
    @SerializedName("RegionCodeV3")
    @Expose
    private String RegionCodeV3;

    /**
    * Specifies the default value does not support any special type instance type.
    */
    @SerializedName("Support")
    @Expose
    private String Support;

    /**
    * Whether ipv6 is supported. 0: indicates no support. 1: indicates support.
    */
    @SerializedName("Ipv6")
    @Expose
    private Long Ipv6;

    /**
    * Whether cross-az is supported. valid values: 0 (unsupported), 1 (supported).
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
     * Get Region code. 
     * @return RegionCode Region code.
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region code.
     * @param RegionCode Region code.
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Region code (V3 version). 
     * @return RegionCodeV3 Region code (V3 version).
     */
    public String getRegionCodeV3() {
        return this.RegionCodeV3;
    }

    /**
     * Set Region code (V3 version).
     * @param RegionCodeV3 Region code (V3 version).
     */
    public void setRegionCodeV3(String RegionCodeV3) {
        this.RegionCodeV3 = RegionCodeV3;
    }

    /**
     * Get Specifies the default value does not support any special type instance type. 
     * @return Support Specifies the default value does not support any special type instance type.
     */
    public String getSupport() {
        return this.Support;
    }

    /**
     * Set Specifies the default value does not support any special type instance type.
     * @param Support Specifies the default value does not support any special type instance type.
     */
    public void setSupport(String Support) {
        this.Support = Support;
    }

    /**
     * Get Whether ipv6 is supported. 0: indicates no support. 1: indicates support. 
     * @return Ipv6 Whether ipv6 is supported. 0: indicates no support. 1: indicates support.
     */
    public Long getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Whether ipv6 is supported. 0: indicates no support. 1: indicates support.
     * @param Ipv6 Whether ipv6 is supported. 0: indicates no support. 1: indicates support.
     */
    public void setIpv6(Long Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Whether cross-az is supported. valid values: 0 (unsupported), 1 (supported). 
     * @return MultiZone Whether cross-az is supported. valid values: 0 (unsupported), 1 (supported).
     */
    public Long getMultiZone() {
        return this.MultiZone;
    }

    /**
     * Set Whether cross-az is supported. valid values: 0 (unsupported), 1 (supported).
     * @param MultiZone Whether cross-az is supported. valid values: 0 (unsupported), 1 (supported).
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

