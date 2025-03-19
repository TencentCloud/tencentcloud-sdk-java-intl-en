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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionTimer extends AbstractModel {

    /**
    * Timer action. Valid value: `TerminateInstances`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * Action time, which follows the ISO8601 standard and uses UTC time. It must be 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * Extended data
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Timer ID.
    */
    @SerializedName("ActionTimerId")
    @Expose
    private String ActionTimerId;

    /**
    * Timer status. Valid values:

UNDO: Not triggered.
DOING: Triggering.
DONE: Triggered already.

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance ID corresponding to a timer.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Timer action. Valid value: `TerminateInstances`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerAction Timer action. Valid value: `TerminateInstances`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set Timer action. Valid value: `TerminateInstances`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TimerAction Timer action. Valid value: `TerminateInstances`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get Action time, which follows the ISO8601 standard and uses UTC time. It must be 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ActionTime Action time, which follows the ISO8601 standard and uses UTC time. It must be 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Action time, which follows the ISO8601 standard and uses UTC time. It must be 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ActionTime Action time, which follows the ISO8601 standard and uses UTC time. It must be 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get Extended data
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Externals Extended data
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set Extended data
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Externals Extended data
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get Timer ID. 
     * @return ActionTimerId Timer ID.
     */
    public String getActionTimerId() {
        return this.ActionTimerId;
    }

    /**
     * Set Timer ID.
     * @param ActionTimerId Timer ID.
     */
    public void setActionTimerId(String ActionTimerId) {
        this.ActionTimerId = ActionTimerId;
    }

    /**
     * Get Timer status. Valid values:

UNDO: Not triggered.
DOING: Triggering.
DONE: Triggered already.
 
     * @return Status Timer status. Valid values:

UNDO: Not triggered.
DOING: Triggering.
DONE: Triggered already.

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Timer status. Valid values:

UNDO: Not triggered.
DOING: Triggering.
DONE: Triggered already.

     * @param Status Timer status. Valid values:

UNDO: Not triggered.
DOING: Triggering.
DONE: Triggered already.

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance ID corresponding to a timer. 
     * @return InstanceId Instance ID corresponding to a timer.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID corresponding to a timer.
     * @param InstanceId Instance ID corresponding to a timer.
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

