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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceOplogRequest extends AbstractModel {

    /**
    * EMR instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start time timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Search criteria array.
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
    * Cluster, node, and component.
    */
    @SerializedName("Operand")
    @Expose
    private String Operand;

    /**
    * Low-risk, medium-risk, and high-risk.
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
     * Get EMR instance ID. 
     * @return InstanceId EMR instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR instance ID.
     * @param InstanceId EMR instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. 
     * @return Limit Number of entries per page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
     * @param Limit Number of entries per page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start time timestamp. 
     * @return StartTime Start time timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time timestamp.
     * @param StartTime Start time timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time timestamp. 
     * @return EndTime End time timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time timestamp.
     * @param EndTime End time timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Search criteria array. 
     * @return SearchFields Search criteria array.
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set Search criteria array.
     * @param SearchFields Search criteria array.
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    /**
     * Get Cluster, node, and component. 
     * @return Operand Cluster, node, and component.
     */
    public String getOperand() {
        return this.Operand;
    }

    /**
     * Set Cluster, node, and component.
     * @param Operand Cluster, node, and component.
     */
    public void setOperand(String Operand) {
        this.Operand = Operand;
    }

    /**
     * Get Low-risk, medium-risk, and high-risk. 
     * @return SecurityLevel Low-risk, medium-risk, and high-risk.
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set Low-risk, medium-risk, and high-risk.
     * @param SecurityLevel Low-risk, medium-risk, and high-risk.
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    public DescribeInstanceOplogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceOplogRequest(DescribeInstanceOplogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SearchFields != null) {
            this.SearchFields = new SearchItem[source.SearchFields.length];
            for (int i = 0; i < source.SearchFields.length; i++) {
                this.SearchFields[i] = new SearchItem(source.SearchFields[i]);
            }
        }
        if (source.Operand != null) {
            this.Operand = new String(source.Operand);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new String(source.SecurityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);
        this.setParamSimple(map, prefix + "Operand", this.Operand);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);

    }
}

