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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableLineageRequest extends AbstractModel {

    /**
    * Query Direction, INPUT, OUTPUT, BOTH enumerated values
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Table information
    */
    @SerializedName("Data")
    @Expose
    private TableLineageInfo Data;

    /**
    * Single Query Indegree, default 1
    */
    @SerializedName("InputDepth")
    @Expose
    private Long InputDepth;

    /**
    * Single Query Outdegree, default 1
    */
    @SerializedName("OutputDepth")
    @Expose
    private Long OutputDepth;

    /**
    * Additional Parameters (Pass Caller Information)
    */
    @SerializedName("ExtParams")
    @Expose
    private LineageParamRecord [] ExtParams;

    /**
    * Filter Temporary Tables, default true
    */
    @SerializedName("IgnoreTemp")
    @Expose
    private Boolean IgnoreTemp;

    /**
    * Recursively Query Number of Secondary Nodes, default is true
    */
    @SerializedName("RecursiveSecond")
    @Expose
    private Boolean RecursiveSecond;

    /**
     * Get Query Direction, INPUT, OUTPUT, BOTH enumerated values 
     * @return Direction Query Direction, INPUT, OUTPUT, BOTH enumerated values
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Query Direction, INPUT, OUTPUT, BOTH enumerated values
     * @param Direction Query Direction, INPUT, OUTPUT, BOTH enumerated values
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Table information 
     * @return Data Table information
     */
    public TableLineageInfo getData() {
        return this.Data;
    }

    /**
     * Set Table information
     * @param Data Table information
     */
    public void setData(TableLineageInfo Data) {
        this.Data = Data;
    }

    /**
     * Get Single Query Indegree, default 1 
     * @return InputDepth Single Query Indegree, default 1
     */
    public Long getInputDepth() {
        return this.InputDepth;
    }

    /**
     * Set Single Query Indegree, default 1
     * @param InputDepth Single Query Indegree, default 1
     */
    public void setInputDepth(Long InputDepth) {
        this.InputDepth = InputDepth;
    }

    /**
     * Get Single Query Outdegree, default 1 
     * @return OutputDepth Single Query Outdegree, default 1
     */
    public Long getOutputDepth() {
        return this.OutputDepth;
    }

    /**
     * Set Single Query Outdegree, default 1
     * @param OutputDepth Single Query Outdegree, default 1
     */
    public void setOutputDepth(Long OutputDepth) {
        this.OutputDepth = OutputDepth;
    }

    /**
     * Get Additional Parameters (Pass Caller Information) 
     * @return ExtParams Additional Parameters (Pass Caller Information)
     */
    public LineageParamRecord [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set Additional Parameters (Pass Caller Information)
     * @param ExtParams Additional Parameters (Pass Caller Information)
     */
    public void setExtParams(LineageParamRecord [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get Filter Temporary Tables, default true 
     * @return IgnoreTemp Filter Temporary Tables, default true
     */
    public Boolean getIgnoreTemp() {
        return this.IgnoreTemp;
    }

    /**
     * Set Filter Temporary Tables, default true
     * @param IgnoreTemp Filter Temporary Tables, default true
     */
    public void setIgnoreTemp(Boolean IgnoreTemp) {
        this.IgnoreTemp = IgnoreTemp;
    }

    /**
     * Get Recursively Query Number of Secondary Nodes, default is true 
     * @return RecursiveSecond Recursively Query Number of Secondary Nodes, default is true
     */
    public Boolean getRecursiveSecond() {
        return this.RecursiveSecond;
    }

    /**
     * Set Recursively Query Number of Secondary Nodes, default is true
     * @param RecursiveSecond Recursively Query Number of Secondary Nodes, default is true
     */
    public void setRecursiveSecond(Boolean RecursiveSecond) {
        this.RecursiveSecond = RecursiveSecond;
    }

    public DescribeTableLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableLineageRequest(DescribeTableLineageRequest source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Data != null) {
            this.Data = new TableLineageInfo(source.Data);
        }
        if (source.InputDepth != null) {
            this.InputDepth = new Long(source.InputDepth);
        }
        if (source.OutputDepth != null) {
            this.OutputDepth = new Long(source.OutputDepth);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new LineageParamRecord[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new LineageParamRecord(source.ExtParams[i]);
            }
        }
        if (source.IgnoreTemp != null) {
            this.IgnoreTemp = new Boolean(source.IgnoreTemp);
        }
        if (source.RecursiveSecond != null) {
            this.RecursiveSecond = new Boolean(source.RecursiveSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "InputDepth", this.InputDepth);
        this.setParamSimple(map, prefix + "OutputDepth", this.OutputDepth);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "IgnoreTemp", this.IgnoreTemp);
        this.setParamSimple(map, prefix + "RecursiveSecond", this.RecursiveSecond);

    }
}

