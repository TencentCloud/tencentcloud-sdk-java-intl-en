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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInstance extends AbstractModel {

    /**
    * Region name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status of region-related features (return all attributes in JSON format)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FeatureGates")
    @Expose
    private String FeatureGates;

    /**
    * Region abbreviation
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Whitelisted location
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Region name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionName Region name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionName Region name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Region status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Region status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Region status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status of region-related features (return all attributes in JSON format)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FeatureGates Status of region-related features (return all attributes in JSON format)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFeatureGates() {
        return this.FeatureGates;
    }

    /**
     * Set Status of region-related features (return all attributes in JSON format)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FeatureGates Status of region-related features (return all attributes in JSON format)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFeatureGates(String FeatureGates) {
        this.FeatureGates = FeatureGates;
    }

    /**
     * Get Region abbreviation
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Alias Region abbreviation
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Region abbreviation
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Alias Region abbreviation
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Whitelisted location
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Whitelisted location
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Whitelisted location
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Whitelisted location
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public RegionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInstance(RegionInstance source) {
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FeatureGates != null) {
            this.FeatureGates = new String(source.FeatureGates);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FeatureGates", this.FeatureGates);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

