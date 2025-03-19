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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionDetail extends AbstractModel {

    /**
    * Region code.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region ID.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Area where the region is located.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Region name.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region state.
    */
    @SerializedName("RegionState")
    @Expose
    private Long RegionState;

    /**
    * Region abbreviation.
    */
    @SerializedName("RegionShortName")
    @Expose
    private String RegionShortName;

    /**
    * Create time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get Region code. 
     * @return Region Region code.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region code.
     * @param Region Region code.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region ID. 
     * @return RegionId Region ID.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.
     * @param RegionId Region ID.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Area where the region is located. 
     * @return Area Area where the region is located.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Area where the region is located.
     * @param Area Area where the region is located.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Region name. 
     * @return RegionName Region name.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name.
     * @param RegionName Region name.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region state. 
     * @return RegionState Region state.
     */
    public Long getRegionState() {
        return this.RegionState;
    }

    /**
     * Set Region state.
     * @param RegionState Region state.
     */
    public void setRegionState(Long RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Get Region abbreviation. 
     * @return RegionShortName Region abbreviation.
     */
    public String getRegionShortName() {
        return this.RegionShortName;
    }

    /**
     * Set Region abbreviation.
     * @param RegionShortName Region abbreviation.
     */
    public void setRegionShortName(String RegionShortName) {
        this.RegionShortName = RegionShortName;
    }

    /**
     * Get Create time. 
     * @return CreatedAt Create time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create time.
     * @param CreatedAt Create time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time. 
     * @return UpdatedAt Update time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
     * @param UpdatedAt Update time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public RegionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionDetail(RegionDetail source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionState != null) {
            this.RegionState = new Long(source.RegionState);
        }
        if (source.RegionShortName != null) {
            this.RegionShortName = new String(source.RegionShortName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "RegionShortName", this.RegionShortName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

