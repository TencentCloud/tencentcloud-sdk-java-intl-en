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

public class DescribeImageTasksRequest extends AbstractModel {

    /**
    * <p>Task status filter condition.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Number of returned records.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * <p>Task start time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Task end time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Filter subtask status.</p>
    */
    @SerializedName("SubTaskHasFailed")
    @Expose
    private Boolean SubTaskHasFailed;

    /**
     * Get <p>Task status filter condition.</p> 
     * @return Status <p>Task status filter condition.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status filter condition.</p>
     * @param Status <p>Task status filter condition.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Number of returned records.</p> 
     * @return Limit <p>Number of returned records.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned records.</p>
     * @param Limit <p>Number of returned records.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p> 
     * @return ScrollToken <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
     * @param ScrollToken <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get <p>Task start time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p> 
     * @return StartTime <p>Task start time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Task start time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
     * @param StartTime <p>Task start time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Task end time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p> 
     * @return EndTime <p>Task end time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Task end time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
     * @param EndTime <p>Task end time.</p><p>Parameter format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Filter subtask status.</p> 
     * @return SubTaskHasFailed <p>Filter subtask status.</p>
     */
    public Boolean getSubTaskHasFailed() {
        return this.SubTaskHasFailed;
    }

    /**
     * Set <p>Filter subtask status.</p>
     * @param SubTaskHasFailed <p>Filter subtask status.</p>
     */
    public void setSubTaskHasFailed(Boolean SubTaskHasFailed) {
        this.SubTaskHasFailed = SubTaskHasFailed;
    }

    public DescribeImageTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageTasksRequest(DescribeImageTasksRequest source) {
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
        if (source.SubTaskHasFailed != null) {
            this.SubTaskHasFailed = new Boolean(source.SubTaskHasFailed);
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
        this.setParamSimple(map, prefix + "SubTaskHasFailed", this.SubTaskHasFailed);

    }
}

