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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NumberInfo extends AbstractModel {

    /**
    * Number.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Bound outbound call skill group.
    */
    @SerializedName("CallOutSkillGroupIds")
    @Expose
    private Long [] CallOutSkillGroupIds;

    /**
    * Number status, 1-normal, 2-disabled due to overdue payment, 4-disabled by the administrator, 5-disabled due to violation.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get Number. 
     * @return Number Number.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Number.
     * @param Number Number.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Bound outbound call skill group. 
     * @return CallOutSkillGroupIds Bound outbound call skill group.
     */
    public Long [] getCallOutSkillGroupIds() {
        return this.CallOutSkillGroupIds;
    }

    /**
     * Set Bound outbound call skill group.
     * @param CallOutSkillGroupIds Bound outbound call skill group.
     */
    public void setCallOutSkillGroupIds(Long [] CallOutSkillGroupIds) {
        this.CallOutSkillGroupIds = CallOutSkillGroupIds;
    }

    /**
     * Get Number status, 1-normal, 2-disabled due to overdue payment, 4-disabled by the administrator, 5-disabled due to violation. 
     * @return State Number status, 1-normal, 2-disabled due to overdue payment, 4-disabled by the administrator, 5-disabled due to violation.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Number status, 1-normal, 2-disabled due to overdue payment, 4-disabled by the administrator, 5-disabled due to violation.
     * @param State Number status, 1-normal, 2-disabled due to overdue payment, 4-disabled by the administrator, 5-disabled due to violation.
     */
    public void setState(Long State) {
        this.State = State;
    }

    public NumberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NumberInfo(NumberInfo source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.CallOutSkillGroupIds != null) {
            this.CallOutSkillGroupIds = new Long[source.CallOutSkillGroupIds.length];
            for (int i = 0; i < source.CallOutSkillGroupIds.length; i++) {
                this.CallOutSkillGroupIds[i] = new Long(source.CallOutSkillGroupIds[i]);
            }
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArraySimple(map, prefix + "CallOutSkillGroupIds.", this.CallOutSkillGroupIds);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

