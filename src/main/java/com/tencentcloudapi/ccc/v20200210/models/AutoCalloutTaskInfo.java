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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoCalloutTaskInfo extends AbstractModel {

    /**
    * Task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of called parties.
    */
    @SerializedName("CalleeCount")
    @Expose
    private Long CalleeCount;

    /**
    * List of calling numbers.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Start timestamp.
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * End timestamp
.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * IvrId used by the task.
    */
    @SerializedName("IvrId")
    @Expose
    private Long IvrId;

    /**
    * Task status:.
0 initial: task creation, call not started.
1 running.
2 completed: all calls in the task are completed.
3 ending: the task has expired, but there are still some calls not ended.
4 ended: task terminated due to expiration.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <Task id>.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get Task name. 
     * @return Name Task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name.
     * @param Name Task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of called parties. 
     * @return CalleeCount Number of called parties.
     */
    public Long getCalleeCount() {
        return this.CalleeCount;
    }

    /**
     * Set Number of called parties.
     * @param CalleeCount Number of called parties.
     */
    public void setCalleeCount(Long CalleeCount) {
        this.CalleeCount = CalleeCount;
    }

    /**
     * Get List of calling numbers. 
     * @return Callers List of calling numbers.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set List of calling numbers.
     * @param Callers List of calling numbers.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Start timestamp. 
     * @return NotBefore Start timestamp.
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set Start timestamp.
     * @param NotBefore Start timestamp.
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get End timestamp
.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NotAfter End timestamp
.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set End timestamp
.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NotAfter End timestamp
.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get IvrId used by the task. 
     * @return IvrId IvrId used by the task.
     */
    public Long getIvrId() {
        return this.IvrId;
    }

    /**
     * Set IvrId used by the task.
     * @param IvrId IvrId used by the task.
     */
    public void setIvrId(Long IvrId) {
        this.IvrId = IvrId;
    }

    /**
     * Get Task status:.
0 initial: task creation, call not started.
1 running.
2 completed: all calls in the task are completed.
3 ending: the task has expired, but there are still some calls not ended.
4 ended: task terminated due to expiration. 
     * @return State Task status:.
0 initial: task creation, call not started.
1 running.
2 completed: all calls in the task are completed.
3 ending: the task has expired, but there are still some calls not ended.
4 ended: task terminated due to expiration.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Task status:.
0 initial: task creation, call not started.
1 running.
2 completed: all calls in the task are completed.
3 ending: the task has expired, but there are still some calls not ended.
4 ended: task terminated due to expiration.
     * @param State Task status:.
0 initial: task creation, call not started.
1 running.
2 completed: all calls in the task are completed.
3 ending: the task has expired, but there are still some calls not ended.
4 ended: task terminated due to expiration.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <Task id>. 
     * @return TaskId <Task id>.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <Task id>.
     * @param TaskId <Task id>.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public AutoCalloutTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoCalloutTaskInfo(AutoCalloutTaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CalleeCount != null) {
            this.CalleeCount = new Long(source.CalleeCount);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.NotBefore != null) {
            this.NotBefore = new Long(source.NotBefore);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new Long(source.NotAfter);
        }
        if (source.IvrId != null) {
            this.IvrId = new Long(source.IvrId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CalleeCount", this.CalleeCount);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "IvrId", this.IvrId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

