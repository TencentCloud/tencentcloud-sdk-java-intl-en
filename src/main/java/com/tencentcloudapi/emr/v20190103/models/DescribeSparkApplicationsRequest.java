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

public class DescribeSparkApplicationsRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Querying start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Querying end time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Number of entries per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Which page.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Querying start time. 
     * @return StartTime Querying start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Querying start time.
     * @param StartTime Querying start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Querying end time. 
     * @return EndTime Querying end time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Querying end time.
     * @param EndTime Querying end time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of entries per page. 
     * @return PageSize Number of entries per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page.
     * @param PageSize Number of entries per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Which page. 
     * @return Page Which page.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Which page.
     * @param Page Which page.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public DescribeSparkApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkApplicationsRequest(DescribeSparkApplicationsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

