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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaLiveHighlightResultRequest extends AbstractModel {

    /**
    * Media live broadcast channel ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Query start time, unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time, Unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Paging query page number.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Paging query the size of each page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Media live broadcast channel ID. 
     * @return Id Media live broadcast channel ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Media live broadcast channel ID.
     * @param Id Media live broadcast channel ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Query start time, unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days. 
     * @return StartTime Query start time, unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
     * @param StartTime Query start time, unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, Unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days. 
     * @return EndTime Query end time, Unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, Unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
     * @param EndTime Query end time, Unix timestamp, query data within the last 6 hours by default, and the maximum query range supports the last 7 days.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Paging query page number. 
     * @return PageNum Paging query page number.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Paging query page number.
     * @param PageNum Paging query page number.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Paging query the size of each page. 
     * @return PageSize Paging query the size of each page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Paging query the size of each page.
     * @param PageSize Paging query the size of each page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeMediaLiveHighlightResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMediaLiveHighlightResultRequest(DescribeMediaLiveHighlightResultRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

