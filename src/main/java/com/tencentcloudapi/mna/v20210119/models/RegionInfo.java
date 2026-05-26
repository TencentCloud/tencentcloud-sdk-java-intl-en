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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>Region name.</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>English abbreviation of the region.</p>
    */
    @SerializedName("RegionAbbr")
    @Expose
    private String RegionAbbr;

    /**
     * Get <p>Region ID.</p> 
     * @return RegionId <p>Region ID.</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region ID.</p>
     * @param RegionId <p>Region ID.</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Region name.</p> 
     * @return RegionName <p>Region name.</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>Region name.</p>
     * @param RegionName <p>Region name.</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>English abbreviation of the region.</p> 
     * @return RegionAbbr <p>English abbreviation of the region.</p>
     */
    public String getRegionAbbr() {
        return this.RegionAbbr;
    }

    /**
     * Set <p>English abbreviation of the region.</p>
     * @param RegionAbbr <p>English abbreviation of the region.</p>
     */
    public void setRegionAbbr(String RegionAbbr) {
        this.RegionAbbr = RegionAbbr;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionAbbr != null) {
            this.RegionAbbr = new String(source.RegionAbbr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionAbbr", this.RegionAbbr);

    }
}

