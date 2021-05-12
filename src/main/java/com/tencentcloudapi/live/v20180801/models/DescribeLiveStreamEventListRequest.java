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

public class DescribeLiveStreamEventListRequest extends AbstractModel{

    /**
    * Start time. 
In UTC format, such as 2018-12-29T19:00:00Z.
This supports querying the history of 60 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
In UTC format, such as 2018-12-29T20:00:00Z.
This cannot be after the current time and cannot be more than 30 days after the start time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Stream name; query with wildcard (*) is not supported; fuzzy match by default.
The IsStrict field can be used to change to exact query.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Page number to get.
Default value: 1.
Note: Currently, query for up to 10,000 entries is supported.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
Note: currently, query for up to 10,000 entries is supported.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Whether to filter. No filtering by default.
0: No filtering at all.
1: Filter out the failing streams and return only the successful ones.
    */
    @SerializedName("IsFilter")
    @Expose
    private Long IsFilter;

    /**
    * Whether to query exactly. Fuzzy match by default.
0: Fuzzy match.
1: Exact query.
Note: This parameter takes effect when StreamName is used.
    */
    @SerializedName("IsStrict")
    @Expose
    private Long IsStrict;

    /**
    * Whether to display in ascending order by end time. Descending order by default.
0: Descending.
1: Ascending.
    */
    @SerializedName("IsAsc")
    @Expose
    private Long IsAsc;

    /**
     * Get Start time. 
In UTC format, such as 2018-12-29T19:00:00Z.
This supports querying the history of 60 days. 
     * @return StartTime Start time. 
In UTC format, such as 2018-12-29T19:00:00Z.
This supports querying the history of 60 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. 
In UTC format, such as 2018-12-29T19:00:00Z.
This supports querying the history of 60 days.
     * @param StartTime Start time. 
In UTC format, such as 2018-12-29T19:00:00Z.
This supports querying the history of 60 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time.
In UTC format, such as 2018-12-29T20:00:00Z.
This cannot be after the current time and cannot be more than 30 days after the start time. 
     * @return EndTime End time.
In UTC format, such as 2018-12-29T20:00:00Z.
This cannot be after the current time and cannot be more than 30 days after the start time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
In UTC format, such as 2018-12-29T20:00:00Z.
This cannot be after the current time and cannot be more than 30 days after the start time.
     * @param EndTime End time.
In UTC format, such as 2018-12-29T20:00:00Z.
This cannot be after the current time and cannot be more than 30 days after the start time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Push path, which is the same as the AppName in push and playback addresses and is "live" by default. 
     * @return AppName Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
     * @param AppName Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Push domain name. 
     * @return DomainName Push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Push domain name.
     * @param DomainName Push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Stream name; query with wildcard (*) is not supported; fuzzy match by default.
The IsStrict field can be used to change to exact query. 
     * @return StreamName Stream name; query with wildcard (*) is not supported; fuzzy match by default.
The IsStrict field can be used to change to exact query.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name; query with wildcard (*) is not supported; fuzzy match by default.
The IsStrict field can be used to change to exact query.
     * @param StreamName Stream name; query with wildcard (*) is not supported; fuzzy match by default.
The IsStrict field can be used to change to exact query.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Page number to get.
Default value: 1.
Note: Currently, query for up to 10,000 entries is supported. 
     * @return PageNum Page number to get.
Default value: 1.
Note: Currently, query for up to 10,000 entries is supported.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number to get.
Default value: 1.
Note: Currently, query for up to 10,000 entries is supported.
     * @param PageNum Page number to get.
Default value: 1.
Note: Currently, query for up to 10,000 entries is supported.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
Note: currently, query for up to 10,000 entries is supported. 
     * @return PageSize Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
Note: currently, query for up to 10,000 entries is supported.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
Note: currently, query for up to 10,000 entries is supported.
     * @param PageSize Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
Note: currently, query for up to 10,000 entries is supported.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Whether to filter. No filtering by default.
0: No filtering at all.
1: Filter out the failing streams and return only the successful ones. 
     * @return IsFilter Whether to filter. No filtering by default.
0: No filtering at all.
1: Filter out the failing streams and return only the successful ones.
     */
    public Long getIsFilter() {
        return this.IsFilter;
    }

    /**
     * Set Whether to filter. No filtering by default.
0: No filtering at all.
1: Filter out the failing streams and return only the successful ones.
     * @param IsFilter Whether to filter. No filtering by default.
0: No filtering at all.
1: Filter out the failing streams and return only the successful ones.
     */
    public void setIsFilter(Long IsFilter) {
        this.IsFilter = IsFilter;
    }

    /**
     * Get Whether to query exactly. Fuzzy match by default.
0: Fuzzy match.
1: Exact query.
Note: This parameter takes effect when StreamName is used. 
     * @return IsStrict Whether to query exactly. Fuzzy match by default.
0: Fuzzy match.
1: Exact query.
Note: This parameter takes effect when StreamName is used.
     */
    public Long getIsStrict() {
        return this.IsStrict;
    }

    /**
     * Set Whether to query exactly. Fuzzy match by default.
0: Fuzzy match.
1: Exact query.
Note: This parameter takes effect when StreamName is used.
     * @param IsStrict Whether to query exactly. Fuzzy match by default.
0: Fuzzy match.
1: Exact query.
Note: This parameter takes effect when StreamName is used.
     */
    public void setIsStrict(Long IsStrict) {
        this.IsStrict = IsStrict;
    }

    /**
     * Get Whether to display in ascending order by end time. Descending order by default.
0: Descending.
1: Ascending. 
     * @return IsAsc Whether to display in ascending order by end time. Descending order by default.
0: Descending.
1: Ascending.
     */
    public Long getIsAsc() {
        return this.IsAsc;
    }

    /**
     * Set Whether to display in ascending order by end time. Descending order by default.
0: Descending.
1: Ascending.
     * @param IsAsc Whether to display in ascending order by end time. Descending order by default.
0: Descending.
1: Ascending.
     */
    public void setIsAsc(Long IsAsc) {
        this.IsAsc = IsAsc;
    }

    public DescribeLiveStreamEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveStreamEventListRequest(DescribeLiveStreamEventListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.IsFilter != null) {
            this.IsFilter = new Long(source.IsFilter);
        }
        if (source.IsStrict != null) {
            this.IsStrict = new Long(source.IsStrict);
        }
        if (source.IsAsc != null) {
            this.IsAsc = new Long(source.IsAsc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "IsFilter", this.IsFilter);
        this.setParamSimple(map, prefix + "IsStrict", this.IsStrict);
        this.setParamSimple(map, prefix + "IsAsc", this.IsAsc);

    }
}

