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

public class DescribeStreamLiveTranscodeDetailRequest extends AbstractModel {

    /**
    * The query start time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
    */
    @SerializedName("StartDayTime")
    @Expose
    private String StartDayTime;

    /**
    * The query end time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
    */
    @SerializedName("EndDayTime")
    @Expose
    private String EndDayTime;

    /**
    * The channel ID (optional).
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * The number of pages. Default value: 1.
The value cannot exceed 100.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * The number of records per page. Default value: 10.
Value range: 1-1000.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get The query start time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day). 
     * @return StartDayTime The query start time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
     */
    public String getStartDayTime() {
        return this.StartDayTime;
    }

    /**
     * Set The query start time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
     * @param StartDayTime The query start time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
     */
    public void setStartDayTime(String StartDayTime) {
        this.StartDayTime = StartDayTime;
    }

    /**
     * Get The query end time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day). 
     * @return EndDayTime The query end time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
     */
    public String getEndDayTime() {
        return this.EndDayTime;
    }

    /**
     * Set The query end time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
     * @param EndDayTime The query end time (UTC+8) in the format of yyyy-MM-dd.
You can only query data in the last month (not including the current day).
     */
    public void setEndDayTime(String EndDayTime) {
        this.EndDayTime = EndDayTime;
    }

    /**
     * Get The channel ID (optional). 
     * @return ChannelId The channel ID (optional).
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set The channel ID (optional).
     * @param ChannelId The channel ID (optional).
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get The number of pages. Default value: 1.
The value cannot exceed 100. 
     * @return PageNum The number of pages. Default value: 1.
The value cannot exceed 100.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set The number of pages. Default value: 1.
The value cannot exceed 100.
     * @param PageNum The number of pages. Default value: 1.
The value cannot exceed 100.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get The number of records per page. Default value: 10.
Value range: 1-1000. 
     * @return PageSize The number of records per page. Default value: 10.
Value range: 1-1000.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of records per page. Default value: 10.
Value range: 1-1000.
     * @param PageSize The number of records per page. Default value: 10.
Value range: 1-1000.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeStreamLiveTranscodeDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLiveTranscodeDetailRequest(DescribeStreamLiveTranscodeDetailRequest source) {
        if (source.StartDayTime != null) {
            this.StartDayTime = new String(source.StartDayTime);
        }
        if (source.EndDayTime != null) {
            this.EndDayTime = new String(source.EndDayTime);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
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
        this.setParamSimple(map, prefix + "StartDayTime", this.StartDayTime);
        this.setParamSimple(map, prefix + "EndDayTime", this.EndDayTime);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

