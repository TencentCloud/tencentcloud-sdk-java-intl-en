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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeColumnLineageRequest extends AbstractModel {

    /**
    * Enumeration value of query direction.

- INPUT
- OUTPUT
- BOTH
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Field Information
    */
    @SerializedName("Data")
    @Expose
    private ColumnLineageInfo Data;

    /**
    * Single Query Indegree
    */
    @SerializedName("InputDepth")
    @Expose
    private Long InputDepth;

    /**
    * Single Query Outdegree
    */
    @SerializedName("OutputDepth")
    @Expose
    private Long OutputDepth;

    /**
    * Additional Parameters (Pass Caller Information)
    */
    @SerializedName("ExtParams")
    @Expose
    private RecordField [] ExtParams;

    /**
    * Filter Temporary Tables with the default value true
    */
    @SerializedName("IgnoreTemp")
    @Expose
    private Boolean IgnoreTemp;

    /**
     * Get Enumeration value of query direction.

- INPUT
- OUTPUT
- BOTH 
     * @return Direction Enumeration value of query direction.

- INPUT
- OUTPUT
- BOTH
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Enumeration value of query direction.

- INPUT
- OUTPUT
- BOTH
     * @param Direction Enumeration value of query direction.

- INPUT
- OUTPUT
- BOTH
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Field Information 
     * @return Data Field Information
     */
    public ColumnLineageInfo getData() {
        return this.Data;
    }

    /**
     * Set Field Information
     * @param Data Field Information
     */
    public void setData(ColumnLineageInfo Data) {
        this.Data = Data;
    }

    /**
     * Get Single Query Indegree 
     * @return InputDepth Single Query Indegree
     */
    public Long getInputDepth() {
        return this.InputDepth;
    }

    /**
     * Set Single Query Indegree
     * @param InputDepth Single Query Indegree
     */
    public void setInputDepth(Long InputDepth) {
        this.InputDepth = InputDepth;
    }

    /**
     * Get Single Query Outdegree 
     * @return OutputDepth Single Query Outdegree
     */
    public Long getOutputDepth() {
        return this.OutputDepth;
    }

    /**
     * Set Single Query Outdegree
     * @param OutputDepth Single Query Outdegree
     */
    public void setOutputDepth(Long OutputDepth) {
        this.OutputDepth = OutputDepth;
    }

    /**
     * Get Additional Parameters (Pass Caller Information) 
     * @return ExtParams Additional Parameters (Pass Caller Information)
     */
    public RecordField [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set Additional Parameters (Pass Caller Information)
     * @param ExtParams Additional Parameters (Pass Caller Information)
     */
    public void setExtParams(RecordField [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get Filter Temporary Tables with the default value true 
     * @return IgnoreTemp Filter Temporary Tables with the default value true
     */
    public Boolean getIgnoreTemp() {
        return this.IgnoreTemp;
    }

    /**
     * Set Filter Temporary Tables with the default value true
     * @param IgnoreTemp Filter Temporary Tables with the default value true
     */
    public void setIgnoreTemp(Boolean IgnoreTemp) {
        this.IgnoreTemp = IgnoreTemp;
    }

    public DescribeColumnLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeColumnLineageRequest(DescribeColumnLineageRequest source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Data != null) {
            this.Data = new ColumnLineageInfo(source.Data);
        }
        if (source.InputDepth != null) {
            this.InputDepth = new Long(source.InputDepth);
        }
        if (source.OutputDepth != null) {
            this.OutputDepth = new Long(source.OutputDepth);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new RecordField[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new RecordField(source.ExtParams[i]);
            }
        }
        if (source.IgnoreTemp != null) {
            this.IgnoreTemp = new Boolean(source.IgnoreTemp);
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

    }
}

