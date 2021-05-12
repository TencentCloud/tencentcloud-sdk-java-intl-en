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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * Region `Ap-code`
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region abbreviation
    */
    @SerializedName("RegionAbbr")
    @Expose
    private String RegionAbbr;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Whether to support IPv6 address access. Valid values: 0 (support), 1 (not support)
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
     * Get Region `Ap-code` 
     * @return RegionName Region `Ap-code`
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region `Ap-code`
     * @param RegionName Region `Ap-code`
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region abbreviation 
     * @return RegionAbbr Region abbreviation
     */
    public String getRegionAbbr() {
        return this.RegionAbbr;
    }

    /**
     * Set Region abbreviation
     * @param RegionAbbr Region abbreviation
     */
    public void setRegionAbbr(String RegionAbbr) {
        this.RegionAbbr = RegionAbbr;
    }

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
     * Get Whether to support IPv6 address access. Valid values: 0 (support), 1 (not support) 
     * @return Ipv6Enable Whether to support IPv6 address access. Valid values: 0 (support), 1 (not support)
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set Whether to support IPv6 address access. Valid values: 0 (support), 1 (not support)
     * @param Ipv6Enable Whether to support IPv6 address access. Valid values: 0 (support), 1 (not support)
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionAbbr != null) {
            this.RegionAbbr = new String(source.RegionAbbr);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Ipv6Enable != null) {
            this.Ipv6Enable = new Long(source.Ipv6Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionAbbr", this.RegionAbbr);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);

    }
}

