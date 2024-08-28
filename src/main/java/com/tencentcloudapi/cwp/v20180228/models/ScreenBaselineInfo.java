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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenBaselineInfo extends AbstractModel {

    /**
    * Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * Last check time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Baseline check items with risks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BaselineFailCount")
    @Expose
    private Long BaselineFailCount;

    /**
    * Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Baseline name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Baseline ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CategoryId Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CategoryId Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get Last check time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastScanTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastScanTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Baseline check items with risks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BaselineFailCount Baseline check items with risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBaselineFailCount() {
        return this.BaselineFailCount;
    }

    /**
     * Set Baseline check items with risks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BaselineFailCount Baseline check items with risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBaselineFailCount(Long BaselineFailCount) {
        this.BaselineFailCount = BaselineFailCount;
    }

    /**
     * Get Host UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public ScreenBaselineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenBaselineInfo(ScreenBaselineInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.BaselineFailCount != null) {
            this.BaselineFailCount = new Long(source.BaselineFailCount);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "BaselineFailCount", this.BaselineFailCount);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

