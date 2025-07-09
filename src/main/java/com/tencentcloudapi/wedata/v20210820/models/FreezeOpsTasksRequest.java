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

public class FreezeOpsTasksRequest extends AbstractModel {

    /**
    * Task List
    */
    @SerializedName("Tasks")
    @Expose
    private SimpleTaskInfo [] Tasks;

    /**
    * Whether Task Operation Notifies Downstream Task Owners
    */
    @SerializedName("OperateIsInform")
    @Expose
    private Boolean OperateIsInform;

    /**
    * Whether to terminate the generated instance
    */
    @SerializedName("KillInstance")
    @Expose
    private Boolean KillInstance;

    /**
     * Get Task List 
     * @return Tasks Task List
     */
    public SimpleTaskInfo [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task List
     * @param Tasks Task List
     */
    public void setTasks(SimpleTaskInfo [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Whether Task Operation Notifies Downstream Task Owners 
     * @return OperateIsInform Whether Task Operation Notifies Downstream Task Owners
     */
    public Boolean getOperateIsInform() {
        return this.OperateIsInform;
    }

    /**
     * Set Whether Task Operation Notifies Downstream Task Owners
     * @param OperateIsInform Whether Task Operation Notifies Downstream Task Owners
     */
    public void setOperateIsInform(Boolean OperateIsInform) {
        this.OperateIsInform = OperateIsInform;
    }

    /**
     * Get Whether to terminate the generated instance 
     * @return KillInstance Whether to terminate the generated instance
     */
    public Boolean getKillInstance() {
        return this.KillInstance;
    }

    /**
     * Set Whether to terminate the generated instance
     * @param KillInstance Whether to terminate the generated instance
     */
    public void setKillInstance(Boolean KillInstance) {
        this.KillInstance = KillInstance;
    }

    public FreezeOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FreezeOpsTasksRequest(FreezeOpsTasksRequest source) {
        if (source.Tasks != null) {
            this.Tasks = new SimpleTaskInfo[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new SimpleTaskInfo(source.Tasks[i]);
            }
        }
        if (source.OperateIsInform != null) {
            this.OperateIsInform = new Boolean(source.OperateIsInform);
        }
        if (source.KillInstance != null) {
            this.KillInstance = new Boolean(source.KillInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "OperateIsInform", this.OperateIsInform);
        this.setParamSimple(map, prefix + "KillInstance", this.KillInstance);

    }
}

