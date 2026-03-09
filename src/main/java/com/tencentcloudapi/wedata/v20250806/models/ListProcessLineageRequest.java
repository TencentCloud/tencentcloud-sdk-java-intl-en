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

public class ListProcessLineageRequest extends AbstractModel {

    /**
    * Unique task ID.
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * TASK type //scheduling tasks SCHEDULE_TASK, //INTEGRATION tasks INTEGRATION_TASK, //THIRD-party reporting THIRD_REPORT, //DATA modeling TABLE_MODEL, //MODEL create metrics MODEL_METRIC, //atomic metrics create derived metrics METRIC_METRIC, //DATA SERVICE DATA_SERVICE.
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Source: WEDATA|THIRD default WEDATA.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get Unique task ID. 
     * @return ProcessId Unique task ID.
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set Unique task ID.
     * @param ProcessId Unique task ID.
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get TASK type //scheduling tasks SCHEDULE_TASK, //INTEGRATION tasks INTEGRATION_TASK, //THIRD-party reporting THIRD_REPORT, //DATA modeling TABLE_MODEL, //MODEL create metrics MODEL_METRIC, //atomic metrics create derived metrics METRIC_METRIC, //DATA SERVICE DATA_SERVICE. 
     * @return ProcessType TASK type //scheduling tasks SCHEDULE_TASK, //INTEGRATION tasks INTEGRATION_TASK, //THIRD-party reporting THIRD_REPORT, //DATA modeling TABLE_MODEL, //MODEL create metrics MODEL_METRIC, //atomic metrics create derived metrics METRIC_METRIC, //DATA SERVICE DATA_SERVICE.
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set TASK type //scheduling tasks SCHEDULE_TASK, //INTEGRATION tasks INTEGRATION_TASK, //THIRD-party reporting THIRD_REPORT, //DATA modeling TABLE_MODEL, //MODEL create metrics MODEL_METRIC, //atomic metrics create derived metrics METRIC_METRIC, //DATA SERVICE DATA_SERVICE.
     * @param ProcessType TASK type //scheduling tasks SCHEDULE_TASK, //INTEGRATION tasks INTEGRATION_TASK, //THIRD-party reporting THIRD_REPORT, //DATA modeling TABLE_MODEL, //MODEL create metrics MODEL_METRIC, //atomic metrics create derived metrics METRIC_METRIC, //DATA SERVICE DATA_SERVICE.
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Source: WEDATA|THIRD default WEDATA. 
     * @return Platform Source: WEDATA|THIRD default WEDATA.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Source: WEDATA|THIRD default WEDATA.
     * @param Platform Source: WEDATA|THIRD default WEDATA.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public ListProcessLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListProcessLineageRequest(ListProcessLineageRequest source) {
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

