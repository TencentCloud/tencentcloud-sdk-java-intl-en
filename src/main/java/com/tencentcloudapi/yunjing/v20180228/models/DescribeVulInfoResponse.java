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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulInfoResponse extends AbstractModel{

    /**
    * Vulnerability category ID.
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability level.
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * Vulnerability type.
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * Vulnerability description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Repair plan.
    */
    @SerializedName("RepairPlan")
    @Expose
    private String RepairPlan;

    /**
    * Vulnerability CVE.
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Reference link.
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Vulnerability category ID. 
     * @return VulId Vulnerability category ID.
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability category ID.
     * @param VulId Vulnerability category ID.
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name. 
     * @return VulName Vulnerability name.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name.
     * @param VulName Vulnerability name.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability level. 
     * @return VulLevel Vulnerability level.
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Vulnerability level.
     * @param VulLevel Vulnerability level.
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get Vulnerability type. 
     * @return VulType Vulnerability type.
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set Vulnerability type.
     * @param VulType Vulnerability type.
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get Vulnerability description. 
     * @return Description Vulnerability description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vulnerability description.
     * @param Description Vulnerability description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Repair plan. 
     * @return RepairPlan Repair plan.
     */
    public String getRepairPlan() {
        return this.RepairPlan;
    }

    /**
     * Set Repair plan.
     * @param RepairPlan Repair plan.
     */
    public void setRepairPlan(String RepairPlan) {
        this.RepairPlan = RepairPlan;
    }

    /**
     * Get Vulnerability CVE. 
     * @return CveId Vulnerability CVE.
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set Vulnerability CVE.
     * @param CveId Vulnerability CVE.
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get Reference link. 
     * @return Reference Reference link.
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference link.
     * @param Reference Reference link.
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulInfoResponse(DescribeVulInfoResponse source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new String(source.VulLevel);
        }
        if (source.VulType != null) {
            this.VulType = new String(source.VulType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RepairPlan != null) {
            this.RepairPlan = new String(source.RepairPlan);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RepairPlan", this.RepairPlan);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

