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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeTasksRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Type of the purging task
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Start time of the query
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offset of the query
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of results returned
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Statuses of tasks to be queried. Values:
`processing`, `success`, `failed`, `timeout` and `invalid`
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * ID of the site
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of domain names queried
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Queries content
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
     * Get Task ID 
     * @return JobId Task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID
     * @param JobId Task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Type of the purging task 
     * @return Type Type of the purging task
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the purging task
     * @param Type Type of the purging task
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Start time of the query 
     * @return StartTime Start time of the query
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query
     * @param StartTime Start time of the query
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query 
     * @return EndTime End time of the query
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query
     * @param EndTime End time of the query
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offset of the query 
     * @return Offset Offset of the query
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of the query
     * @param Offset Offset of the query
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of results returned 
     * @return Limit Maximum number of results returned
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results returned
     * @param Limit Maximum number of results returned
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Statuses of tasks to be queried. Values:
`processing`, `success`, `failed`, `timeout` and `invalid` 
     * @return Statuses Statuses of tasks to be queried. Values:
`processing`, `success`, `failed`, `timeout` and `invalid`
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set Statuses of tasks to be queried. Values:
`processing`, `success`, `failed`, `timeout` and `invalid`
     * @param Statuses Statuses of tasks to be queried. Values:
`processing`, `success`, `failed`, `timeout` and `invalid`
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get ID of the site 
     * @return ZoneId ID of the site
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site
     * @param ZoneId ID of the site
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of domain names queried 
     * @return Domains List of domain names queried
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of domain names queried
     * @param Domains List of domain names queried
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Queries content 
     * @return Target Queries content
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Queries content
     * @param Target Queries content
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    public DescribePurgeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurgeTasksRequest(DescribePurgeTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Target", this.Target);

    }
}

