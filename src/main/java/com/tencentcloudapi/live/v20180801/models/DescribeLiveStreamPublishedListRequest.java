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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamPublishedListRequest extends AbstractModel{

    /**
    * Your push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * End time.
In UTC format, such as 2016-06-30T19:00:00Z.
This cannot be after the current time.
Note: The difference between EndTime and StartTime cannot be greater than 30 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Start time. 
In UTC format, such as 2016-06-29T19:00:00Z.
This supports querying data in the past 60 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. Fuzzy match is not supported.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Page number to get.
Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page.
Maximum value: 100
Valid values: integers between 10 and 100
Default value: 10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Stream name, which supports fuzzy match.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get Your push domain name. 
     * @return DomainName Your push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Your push domain name.
     * @param DomainName Your push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get End time.
In UTC format, such as 2016-06-30T19:00:00Z.
This cannot be after the current time.
Note: The difference between EndTime and StartTime cannot be greater than 30 days. 
     * @return EndTime End time.
In UTC format, such as 2016-06-30T19:00:00Z.
This cannot be after the current time.
Note: The difference between EndTime and StartTime cannot be greater than 30 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
In UTC format, such as 2016-06-30T19:00:00Z.
This cannot be after the current time.
Note: The difference between EndTime and StartTime cannot be greater than 30 days.
     * @param EndTime End time.
In UTC format, such as 2016-06-30T19:00:00Z.
This cannot be after the current time.
Note: The difference between EndTime and StartTime cannot be greater than 30 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Start time. 
In UTC format, such as 2016-06-29T19:00:00Z.
This supports querying data in the past 60 days. 
     * @return StartTime Start time. 
In UTC format, such as 2016-06-29T19:00:00Z.
This supports querying data in the past 60 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. 
In UTC format, such as 2016-06-29T19:00:00Z.
This supports querying data in the past 60 days.
     * @param StartTime Start time. 
In UTC format, such as 2016-06-29T19:00:00Z.
This supports querying data in the past 60 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. Fuzzy match is not supported. 
     * @return AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. Fuzzy match is not supported.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. Fuzzy match is not supported.
     * @param AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. Fuzzy match is not supported.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Page number to get.
Default value: 1. 
     * @return PageNum Page number to get.
Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number to get.
Default value: 1.
     * @param PageNum Page number to get.
Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page.
Maximum value: 100
Valid values: integers between 10 and 100
Default value: 10 
     * @return PageSize Number of entries per page.
Maximum value: 100
Valid values: integers between 10 and 100
Default value: 10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page.
Maximum value: 100
Valid values: integers between 10 and 100
Default value: 10
     * @param PageSize Number of entries per page.
Maximum value: 100
Valid values: integers between 10 and 100
Default value: 10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Stream name, which supports fuzzy match. 
     * @return StreamName Stream name, which supports fuzzy match.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name, which supports fuzzy match.
     * @param StreamName Stream name, which supports fuzzy match.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

