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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRuleRequest extends AbstractModel{

    /**
    * Layer-7 listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Forwarding rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get Layer-7 listener ID 
     * @return ListenerId Layer-7 listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Layer-7 listener ID
     * @param ListenerId Layer-7 listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Forwarding rule ID 
     * @return RuleId Forwarding rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID
     * @param RuleId Forwarding rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes. 
     * @return Force Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
     * @param Force Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

