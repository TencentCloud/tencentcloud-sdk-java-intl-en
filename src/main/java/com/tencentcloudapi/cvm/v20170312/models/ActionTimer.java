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
    * Timer name. Currently `TerminateInstances` is the only supported value.
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * Execution time, which follows the ISO8601 standard and uses UTC time. It must be at least 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * Additional data
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

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
     * Get Execution time, which follows the ISO8601 standard and uses UTC time. It must be at least 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z. 
     * @return ActionTime Execution time, which follows the ISO8601 standard and uses UTC time. It must be at least 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Execution time, which follows the ISO8601 standard and uses UTC time. It must be at least 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
     * @param ActionTime Execution time, which follows the ISO8601 standard and uses UTC time. It must be at least 5 minutes later than the current time. Format: YYYY-MM-DDThh:mm:ssZ. For example: 2018-05-29T11:26:40Z.
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamObj(map, prefix + "Externals.", this.Externals);

    }
}

