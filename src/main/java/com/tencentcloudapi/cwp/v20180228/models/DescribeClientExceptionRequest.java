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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientExceptionRequest extends AbstractModel {

    /**
    * Client Exception Type 1: Client Offline, 2: Client Uninstallation
    */
    @SerializedName("ExceptionType")
    @Expose
    private Long ExceptionType;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit per Page, not 0, up to 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start time in the format of `2006-01-02 15:04:05`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of `2006-01-02 15:04:05`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Client Exception Type 1: Client Offline, 2: Client Uninstallation 
     * @return ExceptionType Client Exception Type 1: Client Offline, 2: Client Uninstallation
     */
    public Long getExceptionType() {
        return this.ExceptionType;
    }

    /**
     * Set Client Exception Type 1: Client Offline, 2: Client Uninstallation
     * @param ExceptionType Client Exception Type 1: Client Offline, 2: Client Uninstallation
     */
    public void setExceptionType(Long ExceptionType) {
        this.ExceptionType = ExceptionType;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit per Page, not 0, up to 100 
     * @return Limit Limit per Page, not 0, up to 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit per Page, not 0, up to 100
     * @param Limit Limit per Page, not 0, up to 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start time in the format of `2006-01-02 15:04:05` 
     * @return StartTime Start time in the format of `2006-01-02 15:04:05`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of `2006-01-02 15:04:05`
     * @param StartTime Start time in the format of `2006-01-02 15:04:05`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of `2006-01-02 15:04:05` 
     * @return EndTime End time in the format of `2006-01-02 15:04:05`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of `2006-01-02 15:04:05`
     * @param EndTime End time in the format of `2006-01-02 15:04:05`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeClientExceptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientExceptionRequest(DescribeClientExceptionRequest source) {
        if (source.ExceptionType != null) {
            this.ExceptionType = new Long(source.ExceptionType);
        }
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
        this.setParamSimple(map, prefix + "ExceptionType", this.ExceptionType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

