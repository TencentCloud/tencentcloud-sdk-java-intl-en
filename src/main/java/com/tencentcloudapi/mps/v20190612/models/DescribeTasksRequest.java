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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * Query task start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query task end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed). 
     * @return Status Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
     * @param Status Filter: Task status. Valid values: WAITING (waiting), PROCESSING (processing), FINISH (completed).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry. 
     * @return ScrollToken Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
     * @param ScrollToken Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get Query task start time. 
     * @return StartTime Query task start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query task start time.
     * @param StartTime Query task start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query task end time. 
     * @return EndTime Query task end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query task end time.
     * @param EndTime Query task end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

