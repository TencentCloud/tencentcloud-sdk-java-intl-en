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

public class WorkflowTaskCountOpsDto extends AbstractModel {

    /**
    * Number of Workflow Tasks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Task Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeCount")
    @Expose
    private PairDto [] TypeCount;

    /**
    * Task Cycle Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleCount")
    @Expose
    private PairDto [] CycleCount;

    /**
     * Get Number of Workflow Tasks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Count Number of Workflow Tasks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of Workflow Tasks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Count Number of Workflow Tasks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Task Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TypeCount Task Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public PairDto [] getTypeCount() {
        return this.TypeCount;
    }

    /**
     * Set Task Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TypeCount Task Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTypeCount(PairDto [] TypeCount) {
        this.TypeCount = TypeCount;
    }

    /**
     * Get Task Cycle Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleCount Task Cycle Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public PairDto [] getCycleCount() {
        return this.CycleCount;
    }

    /**
     * Set Task Cycle Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleCount Task Cycle Type Dimension Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleCount(PairDto [] CycleCount) {
        this.CycleCount = CycleCount;
    }

    public WorkflowTaskCountOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTaskCountOpsDto(WorkflowTaskCountOpsDto source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.TypeCount != null) {
            this.TypeCount = new PairDto[source.TypeCount.length];
            for (int i = 0; i < source.TypeCount.length; i++) {
                this.TypeCount[i] = new PairDto(source.TypeCount[i]);
            }
        }
        if (source.CycleCount != null) {
            this.CycleCount = new PairDto[source.CycleCount.length];
            for (int i = 0; i < source.CycleCount.length; i++) {
                this.CycleCount[i] = new PairDto(source.CycleCount[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "TypeCount.", this.TypeCount);
        this.setParamArrayObj(map, prefix + "CycleCount.", this.CycleCount);

    }
}

