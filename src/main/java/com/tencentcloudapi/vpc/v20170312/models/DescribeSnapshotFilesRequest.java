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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotFilesRequest extends AbstractModel{

    /**
    * Type of associated resource. Values: `securitygroup`
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * Service instance ID. It's corresponding to the `BusinessType`. 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time. Format: %Y-%m-%d %H:%M:%S
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End time. Format: %Y-%m-%d %H:%M:%S
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Type of associated resource. Values: `securitygroup` 
     * @return BusinessType Type of associated resource. Values: `securitygroup`
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set Type of associated resource. Values: `securitygroup`
     * @param BusinessType Type of associated resource. Values: `securitygroup`
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get Service instance ID. It's corresponding to the `BusinessType`.  
     * @return InstanceId Service instance ID. It's corresponding to the `BusinessType`. 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Service instance ID. It's corresponding to the `BusinessType`. 
     * @param InstanceId Service instance ID. It's corresponding to the `BusinessType`. 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time. Format: %Y-%m-%d %H:%M:%S 
     * @return StartDate Start time. Format: %Y-%m-%d %H:%M:%S
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start time. Format: %Y-%m-%d %H:%M:%S
     * @param StartDate Start time. Format: %Y-%m-%d %H:%M:%S
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End time. Format: %Y-%m-%d %H:%M:%S 
     * @return EndDate End time. Format: %Y-%m-%d %H:%M:%S
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End time. Format: %Y-%m-%d %H:%M:%S
     * @param EndDate End time. Format: %Y-%m-%d %H:%M:%S
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSnapshotFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotFilesRequest(DescribeSnapshotFilesRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

