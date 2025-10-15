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

public class ListTaskInstanceExecutionsRequest extends AbstractModel {

    /**
    * Project id.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Instance unique id, can be obtained through ListInstances.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Size per page. default: 10. maximum: 200.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number, which is 1 by default.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Project id. 
     * @return ProjectId Project id.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id.
     * @param ProjectId Project id.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance unique id, can be obtained through ListInstances. 
     * @return InstanceKey Instance unique id, can be obtained through ListInstances.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance unique id, can be obtained through ListInstances.
     * @param InstanceKey Instance unique id, can be obtained through ListInstances.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8. 
     * @return TimeZone **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     * @param TimeZone **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Size per page. default: 10. maximum: 200. 
     * @return PageSize Size per page. default: 10. maximum: 200.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Size per page. default: 10. maximum: 200.
     * @param PageSize Size per page. default: 10. maximum: 200.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number, which is 1 by default. 
     * @return PageNumber Page number, which is 1 by default.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, which is 1 by default.
     * @param PageNumber Page number, which is 1 by default.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListTaskInstanceExecutionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskInstanceExecutionsRequest(ListTaskInstanceExecutionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

