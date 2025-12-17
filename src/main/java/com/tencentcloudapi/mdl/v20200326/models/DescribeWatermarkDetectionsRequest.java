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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWatermarkDetectionsRequest extends AbstractModel {

    /**
    * Start time, 2022-12-04T16:50:00+08:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, 2022-12-04T17:50:00+08:00, maximum supported query range of 7 days
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of pages queried
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Single page quantity, 1-100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Start time, 2022-12-04T16:50:00+08:00 
     * @return StartTime Start time, 2022-12-04T16:50:00+08:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, 2022-12-04T16:50:00+08:00
     * @param StartTime Start time, 2022-12-04T16:50:00+08:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, 2022-12-04T17:50:00+08:00, maximum supported query range of 7 days 
     * @return EndTime End time, 2022-12-04T17:50:00+08:00, maximum supported query range of 7 days
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, 2022-12-04T17:50:00+08:00, maximum supported query range of 7 days
     * @param EndTime End time, 2022-12-04T17:50:00+08:00, maximum supported query range of 7 days
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of pages queried 
     * @return PageNum Number of pages queried
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Number of pages queried
     * @param PageNum Number of pages queried
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Single page quantity, 1-100 
     * @return PageSize Single page quantity, 1-100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Single page quantity, 1-100
     * @param PageSize Single page quantity, 1-100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeWatermarkDetectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWatermarkDetectionsRequest(DescribeWatermarkDetectionsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

