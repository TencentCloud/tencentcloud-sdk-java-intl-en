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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionTimer extends AbstractModel{

    /**
    * Additional data
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Timer name. Currently `TerminateInstances` is the only supported value.
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * Execution time, which must be at least 5 minutes later than the current time. For example, 2018-5-29 11:26:40.
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
     * Get Additional data 
     * @return Externals Additional data
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set Additional data
     * @param Externals Additional data
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get Timer name. Currently `TerminateInstances` is the only supported value. 
     * @return TimerAction Timer name. Currently `TerminateInstances` is the only supported value.
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set Timer name. Currently `TerminateInstances` is the only supported value.
     * @param TimerAction Timer name. Currently `TerminateInstances` is the only supported value.
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get Execution time, which must be at least 5 minutes later than the current time. For example, 2018-5-29 11:26:40. 
     * @return ActionTime Execution time, which must be at least 5 minutes later than the current time. For example, 2018-5-29 11:26:40.
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Execution time, which must be at least 5 minutes later than the current time. For example, 2018-5-29 11:26:40.
     * @param ActionTime Execution time, which must be at least 5 minutes later than the current time. For example, 2018-5-29 11:26:40.
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);

    }
}

