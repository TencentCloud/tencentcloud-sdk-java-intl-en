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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDownstreamTaskInstancesRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **Instance unique id**.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **Time zone** timeZone, default UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * **Page number, int** used in conjunction with pageSize and cannot be less than 1. default value: 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of items to display per page. default: 10. value range: 1-100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Project ID.
 
     * @return ProjectId Project ID.

     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

     * @param ProjectId Project ID.

     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **Instance unique id**. 
     * @return InstanceKey **Instance unique id**.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set **Instance unique id**.
     * @param InstanceKey **Instance unique id**.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **Time zone** timeZone, default UTC+8. 
     * @return TimeZone **Time zone** timeZone, default UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set **Time zone** timeZone, default UTC+8.
     * @param TimeZone **Time zone** timeZone, default UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get **Page number, int** used in conjunction with pageSize and cannot be less than 1. default value: 1. 
     * @return PageNumber **Page number, int** used in conjunction with pageSize and cannot be less than 1. default value: 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set **Page number, int** used in conjunction with pageSize and cannot be less than 1. default value: 1.
     * @param PageNumber **Page number, int** used in conjunction with pageSize and cannot be less than 1. default value: 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of items to display per page. default: 10. value range: 1-100. 
     * @return PageSize Specifies the number of items to display per page. default: 10. value range: 1-100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of items to display per page. default: 10. value range: 1-100.
     * @param PageSize Specifies the number of items to display per page. default: 10. value range: 1-100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListDownstreamTaskInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDownstreamTaskInstancesRequest(ListDownstreamTaskInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

