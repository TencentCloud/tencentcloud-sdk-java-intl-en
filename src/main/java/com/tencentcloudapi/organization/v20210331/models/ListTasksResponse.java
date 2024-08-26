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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTasksResponse extends AbstractModel {

    /**
    * Token for querying the next page of returned results. Note: This parameter is displayed only when IsTruncated is true.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Total number of data entries that meet the request parameter conditions.
    */
    @SerializedName("TotalCounts")
    @Expose
    private Long TotalCounts;

    /**
    * Maximum number of data entries per page.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Whether the returned result is truncated. Valid values: true: truncated; false: not truncated.
    */
    @SerializedName("IsTruncated")
    @Expose
    private Boolean IsTruncated;

    /**
    * Task details.
    */
    @SerializedName("Tasks")
    @Expose
    private TaskInfo [] Tasks;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Token for querying the next page of returned results. Note: This parameter is displayed only when IsTruncated is true. 
     * @return NextToken Token for querying the next page of returned results. Note: This parameter is displayed only when IsTruncated is true.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for querying the next page of returned results. Note: This parameter is displayed only when IsTruncated is true.
     * @param NextToken Token for querying the next page of returned results. Note: This parameter is displayed only when IsTruncated is true.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Total number of data entries that meet the request parameter conditions. 
     * @return TotalCounts Total number of data entries that meet the request parameter conditions.
     */
    public Long getTotalCounts() {
        return this.TotalCounts;
    }

    /**
     * Set Total number of data entries that meet the request parameter conditions.
     * @param TotalCounts Total number of data entries that meet the request parameter conditions.
     */
    public void setTotalCounts(Long TotalCounts) {
        this.TotalCounts = TotalCounts;
    }

    /**
     * Get Maximum number of data entries per page. 
     * @return MaxResults Maximum number of data entries per page.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of data entries per page.
     * @param MaxResults Maximum number of data entries per page.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Whether the returned result is truncated. Valid values: true: truncated; false: not truncated. 
     * @return IsTruncated Whether the returned result is truncated. Valid values: true: truncated; false: not truncated.
     */
    public Boolean getIsTruncated() {
        return this.IsTruncated;
    }

    /**
     * Set Whether the returned result is truncated. Valid values: true: truncated; false: not truncated.
     * @param IsTruncated Whether the returned result is truncated. Valid values: true: truncated; false: not truncated.
     */
    public void setIsTruncated(Boolean IsTruncated) {
        this.IsTruncated = IsTruncated;
    }

    /**
     * Get Task details. 
     * @return Tasks Task details.
     */
    public TaskInfo [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task details.
     * @param Tasks Task details.
     */
    public void setTasks(TaskInfo [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksResponse(ListTasksResponse source) {
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.TotalCounts != null) {
            this.TotalCounts = new Long(source.TotalCounts);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.IsTruncated != null) {
            this.IsTruncated = new Boolean(source.IsTruncated);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskInfo[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskInfo(source.Tasks[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "TotalCounts", this.TotalCounts);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "IsTruncated", this.IsTruncated);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

