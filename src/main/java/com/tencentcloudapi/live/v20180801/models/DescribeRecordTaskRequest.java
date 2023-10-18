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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordTaskRequest extends AbstractModel {

    /**
    * The start time of the tasks to retrieve in Unix timestamp. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time of the tasks to retrieve in Unix timestamp. The EndTime must be greater than the StartTime. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week. (Note: the start and end times of the task must be within the query time range).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Page token used for batch retrieval: If a single request cannot retrieve all data, the interface will return a ScrollToken. The next request carrying this token will start retrieving from the next record.
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
     * Get The start time of the tasks to retrieve in Unix timestamp. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week. 
     * @return StartTime The start time of the tasks to retrieve in Unix timestamp. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time of the tasks to retrieve in Unix timestamp. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week.
     * @param StartTime The start time of the tasks to retrieve in Unix timestamp. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time of the tasks to retrieve in Unix timestamp. The EndTime must be greater than the StartTime. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week. (Note: the start and end times of the task must be within the query time range). 
     * @return EndTime The end time of the tasks to retrieve in Unix timestamp. The EndTime must be greater than the StartTime. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week. (Note: the start and end times of the task must be within the query time range).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the tasks to retrieve in Unix timestamp. The EndTime must be greater than the StartTime. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week. (Note: the start and end times of the task must be within the query time range).
     * @param EndTime The end time of the tasks to retrieve in Unix timestamp. The EndTime must be greater than the StartTime. The time range should not be earlier than 90 days before the current time, and the query span should not exceed one week. (Note: the start and end times of the task must be within the query time range).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
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
     * Get Push path. 
     * @return AppName Push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path.
     * @param AppName Push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Page token used for batch retrieval: If a single request cannot retrieve all data, the interface will return a ScrollToken. The next request carrying this token will start retrieving from the next record. 
     * @return ScrollToken Page token used for batch retrieval: If a single request cannot retrieve all data, the interface will return a ScrollToken. The next request carrying this token will start retrieving from the next record.
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set Page token used for batch retrieval: If a single request cannot retrieve all data, the interface will return a ScrollToken. The next request carrying this token will start retrieving from the next record.
     * @param ScrollToken Page token used for batch retrieval: If a single request cannot retrieve all data, the interface will return a ScrollToken. The next request carrying this token will start retrieving from the next record.
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    public DescribeRecordTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordTaskRequest(DescribeRecordTaskRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);

    }
}

