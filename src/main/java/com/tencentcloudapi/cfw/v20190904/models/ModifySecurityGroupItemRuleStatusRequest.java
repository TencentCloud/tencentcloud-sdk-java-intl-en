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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupItemRuleStatusRequest extends AbstractModel{

    /**
    * Direction. 0: outbound; 1: inbound. 1 by default
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Toggle status. 0: off; 1: on
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Modified priority of enterprise security group rules
    */
    @SerializedName("RuleSequence")
    @Expose
    private Long RuleSequence;

    /**
     * Get Direction. 0: outbound; 1: inbound. 1 by default 
     * @return Direction Direction. 0: outbound; 1: inbound. 1 by default
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound. 1 by default
     * @param Direction Direction. 0: outbound; 1: inbound. 1 by default
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Toggle status. 0: off; 1: on 
     * @return Status Toggle status. 0: off; 1: on
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Toggle status. 0: off; 1: on
     * @param Status Toggle status. 0: off; 1: on
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Modified priority of enterprise security group rules 
     * @return RuleSequence Modified priority of enterprise security group rules
     */
    public Long getRuleSequence() {
        return this.RuleSequence;
    }

    /**
     * Set Modified priority of enterprise security group rules
     * @param RuleSequence Modified priority of enterprise security group rules
     */
    public void setRuleSequence(Long RuleSequence) {
        this.RuleSequence = RuleSequence;
    }

    public ModifySecurityGroupItemRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupItemRuleStatusRequest(ModifySecurityGroupItemRuleStatusRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleSequence != null) {
            this.RuleSequence = new Long(source.RuleSequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleSequence", this.RuleSequence);

    }
}

