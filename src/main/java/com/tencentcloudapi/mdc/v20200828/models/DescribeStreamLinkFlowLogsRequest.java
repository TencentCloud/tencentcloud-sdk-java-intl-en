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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLinkFlowLogsRequest extends AbstractModel {

    /**
    * <p>Transport stream Id.</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>Start time for statistics, defaults to the last hour, supports querying up to the last 7 days.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time for statistics, defaulting to one hour after StartTime, with support for querying up to 24 hours of data.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Input or output type. Valid values: `input`, `output`.</p>
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * <p>Primary or backup channel. Option [0|1].</p>
    */
    @SerializedName("Pipeline")
    @Expose
    private String [] Pipeline;

    /**
    * <p>Size per page. Default value: 100. Value range: [1, 1000].</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Sort by Timestamp in ascending or descending order. The default is descending order. Options: [desc|asc].</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>Page number. Default value: 1. Value range: [1, 1000].</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
     * Get <p>Transport stream Id.</p> 
     * @return FlowId <p>Transport stream Id.</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>Transport stream Id.</p>
     * @param FlowId <p>Transport stream Id.</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>Start time for statistics, defaults to the last hour, supports querying up to the last 7 days.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p> 
     * @return StartTime <p>Start time for statistics, defaults to the last hour, supports querying up to the last 7 days.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time for statistics, defaults to the last hour, supports querying up to the last 7 days.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
     * @param StartTime <p>Start time for statistics, defaults to the last hour, supports querying up to the last 7 days.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time for statistics, defaulting to one hour after StartTime, with support for querying up to 24 hours of data.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p> 
     * @return EndTime <p>End time for statistics, defaulting to one hour after StartTime, with support for querying up to 24 hours of data.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time for statistics, defaulting to one hour after StartTime, with support for querying up to 24 hours of data.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
     * @param EndTime <p>End time for statistics, defaulting to one hour after StartTime, with support for querying up to 24 hours of data.<br>UTC time, for example, '2020-01-01T12:00:00Z'.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Input or output type. Valid values: `input`, `output`.</p> 
     * @return Type <p>Input or output type. Valid values: `input`, `output`.</p>
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set <p>Input or output type. Valid values: `input`, `output`.</p>
     * @param Type <p>Input or output type. Valid values: `input`, `output`.</p>
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Primary or backup channel. Option [0|1].</p> 
     * @return Pipeline <p>Primary or backup channel. Option [0|1].</p>
     */
    public String [] getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set <p>Primary or backup channel. Option [0|1].</p>
     * @param Pipeline <p>Primary or backup channel. Option [0|1].</p>
     */
    public void setPipeline(String [] Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get <p>Size per page. Default value: 100. Value range: [1, 1000].</p> 
     * @return PageSize <p>Size per page. Default value: 100. Value range: [1, 1000].</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Default value: 100. Value range: [1, 1000].</p>
     * @param PageSize <p>Size per page. Default value: 100. Value range: [1, 1000].</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Sort by Timestamp in ascending or descending order. The default is descending order. Options: [desc|asc].</p> 
     * @return SortType <p>Sort by Timestamp in ascending or descending order. The default is descending order. Options: [desc|asc].</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>Sort by Timestamp in ascending or descending order. The default is descending order. Options: [desc|asc].</p>
     * @param SortType <p>Sort by Timestamp in ascending or descending order. The default is descending order. Options: [desc|asc].</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>Page number. Default value: 1. Value range: [1, 1000].</p> 
     * @return PageNum <p>Page number. Default value: 1. Value range: [1, 1000].</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>Page number. Default value: 1. Value range: [1, 1000].</p>
     * @param PageNum <p>Page number. Default value: 1. Value range: [1, 1000].</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    public DescribeStreamLinkFlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowLogsRequest(DescribeStreamLinkFlowLogsRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String[source.Pipeline.length];
            for (int i = 0; i < source.Pipeline.length; i++) {
                this.Pipeline[i] = new String(source.Pipeline[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "Pipeline.", this.Pipeline);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);

    }
}

