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

public class ModifyEDRRulesActionRequest extends AbstractModel {

    /**
    * <p>Policy ID array</p>
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * <p>Target Action: 0-Alert 1-Allow 2-Alert and block</p>
    */
    @SerializedName("AlertAction")
    @Expose
    private Long AlertAction;

    /**
    * <p>Target account AppId list</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Policy ID array</p> 
     * @return RuleIDs <p>Policy ID array</p>
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set <p>Policy ID array</p>
     * @param RuleIDs <p>Policy ID array</p>
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get <p>Target Action: 0-Alert 1-Allow 2-Alert and block</p> 
     * @return AlertAction <p>Target Action: 0-Alert 1-Allow 2-Alert and block</p>
     */
    public Long getAlertAction() {
        return this.AlertAction;
    }

    /**
     * Set <p>Target Action: 0-Alert 1-Allow 2-Alert and block</p>
     * @param AlertAction <p>Target Action: 0-Alert 1-Allow 2-Alert and block</p>
     */
    public void setAlertAction(Long AlertAction) {
        this.AlertAction = AlertAction;
    }

    /**
     * Get <p>Target account AppId list</p> 
     * @return TargetAppIDs <p>Target account AppId list</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>Target account AppId list</p>
     * @param TargetAppIDs <p>Target account AppId list</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyEDRRulesActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEDRRulesActionRequest(ModifyEDRRulesActionRequest source) {
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.AlertAction != null) {
            this.AlertAction = new Long(source.AlertAction);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamSimple(map, prefix + "AlertAction", this.AlertAction);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

