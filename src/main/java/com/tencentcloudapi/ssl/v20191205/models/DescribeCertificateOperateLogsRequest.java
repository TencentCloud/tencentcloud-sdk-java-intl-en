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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateOperateLogsRequest extends AbstractModel {

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of requested logs, 20 by default, with a maximum value of 1000. if it exceeds 1000, it will be treated as 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start time. The default value is 15 days ago.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. The default value is the current time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of requested logs, 20 by default, with a maximum value of 1000. if it exceeds 1000, it will be treated as 1000. 
     * @return Limit Number of requested logs, 20 by default, with a maximum value of 1000. if it exceeds 1000, it will be treated as 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of requested logs, 20 by default, with a maximum value of 1000. if it exceeds 1000, it will be treated as 1000.
     * @param Limit Number of requested logs, 20 by default, with a maximum value of 1000. if it exceeds 1000, it will be treated as 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start time. The default value is 15 days ago. 
     * @return StartTime Start time. The default value is 15 days ago.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. The default value is 15 days ago.
     * @param StartTime Start time. The default value is 15 days ago.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. The default value is the current time. 
     * @return EndTime End time. The default value is the current time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The default value is the current time.
     * @param EndTime End time. The default value is the current time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeCertificateOperateLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateOperateLogsRequest(DescribeCertificateOperateLogsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

