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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineagePair extends AbstractModel {

    /**
    * Source.
    */
    @SerializedName("Source")
    @Expose
    private LineageResouce Source;

    /**
    * Goal.
    */
    @SerializedName("Target")
    @Expose
    private LineageResouce Target;

    /**
    * Lineage processing process.
    */
    @SerializedName("Processes")
    @Expose
    private LineageProcess [] Processes;

    /**
     * Get Source. 
     * @return Source Source.
     */
    public LineageResouce getSource() {
        return this.Source;
    }

    /**
     * Set Source.
     * @param Source Source.
     */
    public void setSource(LineageResouce Source) {
        this.Source = Source;
    }

    /**
     * Get Goal. 
     * @return Target Goal.
     */
    public LineageResouce getTarget() {
        return this.Target;
    }

    /**
     * Set Goal.
     * @param Target Goal.
     */
    public void setTarget(LineageResouce Target) {
        this.Target = Target;
    }

    /**
     * Get Lineage processing process. 
     * @return Processes Lineage processing process.
     */
    public LineageProcess [] getProcesses() {
        return this.Processes;
    }

    /**
     * Set Lineage processing process.
     * @param Processes Lineage processing process.
     */
    public void setProcesses(LineageProcess [] Processes) {
        this.Processes = Processes;
    }

    public LineagePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineagePair(LineagePair source) {
        if (source.Source != null) {
            this.Source = new LineageResouce(source.Source);
        }
        if (source.Target != null) {
            this.Target = new LineageResouce(source.Target);
        }
        if (source.Processes != null) {
            this.Processes = new LineageProcess[source.Processes.length];
            for (int i = 0; i < source.Processes.length; i++) {
                this.Processes[i] = new LineageProcess(source.Processes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "Processes.", this.Processes);

    }
}

