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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowSummary extends AbstractModel {

    /**
    * Task flow name.
    */
    @SerializedName("IntentName")
    @Expose
    private String IntentName;

    /**
    * Entity list.
    */
    @SerializedName("UpdatedSlotValues")
    @Expose
    private ValueInfo [] UpdatedSlotValues;

    /**
    * Node list.
    */
    @SerializedName("RunNodes")
    @Expose
    private RunNodeInfo [] RunNodes;

    /**
    * Intent determination.
    */
    @SerializedName("Purposes")
    @Expose
    private String [] Purposes;

    /**
     * Get Task flow name. 
     * @return IntentName Task flow name.
     */
    public String getIntentName() {
        return this.IntentName;
    }

    /**
     * Set Task flow name.
     * @param IntentName Task flow name.
     */
    public void setIntentName(String IntentName) {
        this.IntentName = IntentName;
    }

    /**
     * Get Entity list. 
     * @return UpdatedSlotValues Entity list.
     */
    public ValueInfo [] getUpdatedSlotValues() {
        return this.UpdatedSlotValues;
    }

    /**
     * Set Entity list.
     * @param UpdatedSlotValues Entity list.
     */
    public void setUpdatedSlotValues(ValueInfo [] UpdatedSlotValues) {
        this.UpdatedSlotValues = UpdatedSlotValues;
    }

    /**
     * Get Node list. 
     * @return RunNodes Node list.
     */
    public RunNodeInfo [] getRunNodes() {
        return this.RunNodes;
    }

    /**
     * Set Node list.
     * @param RunNodes Node list.
     */
    public void setRunNodes(RunNodeInfo [] RunNodes) {
        this.RunNodes = RunNodes;
    }

    /**
     * Get Intent determination. 
     * @return Purposes Intent determination.
     */
    public String [] getPurposes() {
        return this.Purposes;
    }

    /**
     * Set Intent determination.
     * @param Purposes Intent determination.
     */
    public void setPurposes(String [] Purposes) {
        this.Purposes = Purposes;
    }

    public TaskFlowSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowSummary(TaskFlowSummary source) {
        if (source.IntentName != null) {
            this.IntentName = new String(source.IntentName);
        }
        if (source.UpdatedSlotValues != null) {
            this.UpdatedSlotValues = new ValueInfo[source.UpdatedSlotValues.length];
            for (int i = 0; i < source.UpdatedSlotValues.length; i++) {
                this.UpdatedSlotValues[i] = new ValueInfo(source.UpdatedSlotValues[i]);
            }
        }
        if (source.RunNodes != null) {
            this.RunNodes = new RunNodeInfo[source.RunNodes.length];
            for (int i = 0; i < source.RunNodes.length; i++) {
                this.RunNodes[i] = new RunNodeInfo(source.RunNodes[i]);
            }
        }
        if (source.Purposes != null) {
            this.Purposes = new String[source.Purposes.length];
            for (int i = 0; i < source.Purposes.length; i++) {
                this.Purposes[i] = new String(source.Purposes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentName", this.IntentName);
        this.setParamArrayObj(map, prefix + "UpdatedSlotValues.", this.UpdatedSlotValues);
        this.setParamArrayObj(map, prefix + "RunNodes.", this.RunNodes);
        this.setParamArraySimple(map, prefix + "Purposes.", this.Purposes);

    }
}

