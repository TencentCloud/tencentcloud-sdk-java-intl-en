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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmRiskStatusRequest extends AbstractModel {

    /**
    * Alarm or risk id
    */
    @SerializedName("AlarmRiskIdSet")
    @Expose
    private CosAlarmRiskIdInfo [] AlarmRiskIdSet;

    /**
    * Risk or alarm status. 1: alarm, 2: risk
    */
    @SerializedName("AlarmRiskType")
    @Expose
    private Long AlarmRiskType;

    /**
    * Handling status
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
     * Get Alarm or risk id 
     * @return AlarmRiskIdSet Alarm or risk id
     */
    public CosAlarmRiskIdInfo [] getAlarmRiskIdSet() {
        return this.AlarmRiskIdSet;
    }

    /**
     * Set Alarm or risk id
     * @param AlarmRiskIdSet Alarm or risk id
     */
    public void setAlarmRiskIdSet(CosAlarmRiskIdInfo [] AlarmRiskIdSet) {
        this.AlarmRiskIdSet = AlarmRiskIdSet;
    }

    /**
     * Get Risk or alarm status. 1: alarm, 2: risk 
     * @return AlarmRiskType Risk or alarm status. 1: alarm, 2: risk
     */
    public Long getAlarmRiskType() {
        return this.AlarmRiskType;
    }

    /**
     * Set Risk or alarm status. 1: alarm, 2: risk
     * @param AlarmRiskType Risk or alarm status. 1: alarm, 2: risk
     */
    public void setAlarmRiskType(Long AlarmRiskType) {
        this.AlarmRiskType = AlarmRiskType;
    }

    /**
     * Get Handling status 
     * @return HandleStatus Handling status
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set Handling status
     * @param HandleStatus Handling status
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    public ModifyAlarmRiskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmRiskStatusRequest(ModifyAlarmRiskStatusRequest source) {
        if (source.AlarmRiskIdSet != null) {
            this.AlarmRiskIdSet = new CosAlarmRiskIdInfo[source.AlarmRiskIdSet.length];
            for (int i = 0; i < source.AlarmRiskIdSet.length; i++) {
                this.AlarmRiskIdSet[i] = new CosAlarmRiskIdInfo(source.AlarmRiskIdSet[i]);
            }
        }
        if (source.AlarmRiskType != null) {
            this.AlarmRiskType = new Long(source.AlarmRiskType);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmRiskIdSet.", this.AlarmRiskIdSet);
        this.setParamSimple(map, prefix + "AlarmRiskType", this.AlarmRiskType);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);

    }
}

