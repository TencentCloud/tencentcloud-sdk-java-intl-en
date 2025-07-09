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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionTimer extends AbstractModel {

    /**
    * Timer action currently only supports terminating one value: TerminateInstances.
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * Execution time, in standard ISO8601 representation and using UTC time. format: YYYY-MM-DDThh:MM:ssZ. for example, 2018-05-29T11:26:40Z. the execution time must be later than the current time by 5 minutes.
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * Extension data. only used as output usage.
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Timer ID. only used as output usage.
    */
    @SerializedName("ActionTimerId")
    @Expose
    private String ActionTimerId;

    /**
    * Timer status, for output usage only. value ranges from: <li>UNDO: unexecuted</li> <li>DOING: executing</li> <li>DONE: execution completed.</li>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance ID corresponding to a timer. used only for output.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Timer action currently only supports terminating one value: TerminateInstances. 
     * @return TimerAction Timer action currently only supports terminating one value: TerminateInstances.
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set Timer action currently only supports terminating one value: TerminateInstances.
     * @param TimerAction Timer action currently only supports terminating one value: TerminateInstances.
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get Execution time, in standard ISO8601 representation and using UTC time. format: YYYY-MM-DDThh:MM:ssZ. for example, 2018-05-29T11:26:40Z. the execution time must be later than the current time by 5 minutes. 
     * @return ActionTime Execution time, in standard ISO8601 representation and using UTC time. format: YYYY-MM-DDThh:MM:ssZ. for example, 2018-05-29T11:26:40Z. the execution time must be later than the current time by 5 minutes.
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Execution time, in standard ISO8601 representation and using UTC time. format: YYYY-MM-DDThh:MM:ssZ. for example, 2018-05-29T11:26:40Z. the execution time must be later than the current time by 5 minutes.
     * @param ActionTime Execution time, in standard ISO8601 representation and using UTC time. format: YYYY-MM-DDThh:MM:ssZ. for example, 2018-05-29T11:26:40Z. the execution time must be later than the current time by 5 minutes.
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get Extension data. only used as output usage. 
     * @return Externals Extension data. only used as output usage.
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set Extension data. only used as output usage.
     * @param Externals Extension data. only used as output usage.
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get Timer ID. only used as output usage. 
     * @return ActionTimerId Timer ID. only used as output usage.
     */
    public String getActionTimerId() {
        return this.ActionTimerId;
    }

    /**
     * Set Timer ID. only used as output usage.
     * @param ActionTimerId Timer ID. only used as output usage.
     */
    public void setActionTimerId(String ActionTimerId) {
        this.ActionTimerId = ActionTimerId;
    }

    /**
     * Get Timer status, for output usage only. value ranges from: <li>UNDO: unexecuted</li> <li>DOING: executing</li> <li>DONE: execution completed.</li>. 
     * @return Status Timer status, for output usage only. value ranges from: <li>UNDO: unexecuted</li> <li>DOING: executing</li> <li>DONE: execution completed.</li>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Timer status, for output usage only. value ranges from: <li>UNDO: unexecuted</li> <li>DOING: executing</li> <li>DONE: execution completed.</li>.
     * @param Status Timer status, for output usage only. value ranges from: <li>UNDO: unexecuted</li> <li>DOING: executing</li> <li>DONE: execution completed.</li>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance ID corresponding to a timer. used only for output. 
     * @return InstanceId Instance ID corresponding to a timer. used only for output.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID corresponding to a timer. used only for output.
     * @param InstanceId Instance ID corresponding to a timer. used only for output.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ActionTimer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionTimer(ActionTimer source) {
        if (source.TimerAction != null) {
            this.TimerAction = new String(source.TimerAction);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.Externals != null) {
            this.Externals = new Externals(source.Externals);
        }
        if (source.ActionTimerId != null) {
            this.ActionTimerId = new String(source.ActionTimerId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "ActionTimerId", this.ActionTimerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

