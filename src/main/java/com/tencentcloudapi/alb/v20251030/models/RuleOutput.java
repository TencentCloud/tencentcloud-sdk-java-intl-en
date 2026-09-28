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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleOutput extends AbstractModel {

    /**
    * Action list of the forwarding rule.	
    */
    @SerializedName("Actions")
    @Expose
    private RuleAction [] Actions;

    /**
    * List of forward rule conditions.
    */
    @SerializedName("Conditions")
    @Expose
    private RuleCondition [] Conditions;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Direction of the forwarding rule. Request: request direction from the client to load balancing. Response: response direction from the real server to load balancing.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Last modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Priority. A smaller value indicates higher priority. Value range: 1-10000.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Forwarding rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Forwarding rule status. Provisioning: under creation. Active: running. Configuring: configuration in progress.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Tag list.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Action list of the forwarding rule.	 
     * @return Actions Action list of the forwarding rule.	
     */
    public RuleAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set Action list of the forwarding rule.	
     * @param Actions Action list of the forwarding rule.	
     */
    public void setActions(RuleAction [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get List of forward rule conditions. 
     * @return Conditions List of forward rule conditions.
     */
    public RuleCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set List of forward rule conditions.
     * @param Conditions List of forward rule conditions.
     */
    public void setConditions(RuleCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Direction of the forwarding rule. Request: request direction from the client to load balancing. Response: response direction from the real server to load balancing. 
     * @return Direction Direction of the forwarding rule. Request: request direction from the client to load balancing. Response: response direction from the real server to load balancing.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction of the forwarding rule. Request: request direction from the client to load balancing. Response: response direction from the real server to load balancing.
     * @param Direction Direction of the forwarding rule. Request: request direction from the client to load balancing. Response: response direction from the real server to load balancing.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Last modification time. 
     * @return ModifyTime Last modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modification time.
     * @param ModifyTime Last modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Priority. A smaller value indicates higher priority. Value range: 1-10000. 
     * @return Priority Priority. A smaller value indicates higher priority. Value range: 1-10000.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority. A smaller value indicates higher priority. Value range: 1-10000.
     * @param Priority Priority. A smaller value indicates higher priority. Value range: 1-10000.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters. 
     * @return RuleId Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     * @param RuleId Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Forwarding rule name. 
     * @return RuleName Forwarding rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Forwarding rule name.
     * @param RuleName Forwarding rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Forwarding rule status. Provisioning: under creation. Active: running. Configuring: configuration in progress. 
     * @return Status Forwarding rule status. Provisioning: under creation. Active: running. Configuring: configuration in progress.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Forwarding rule status. Provisioning: under creation. Active: running. Configuring: configuration in progress.
     * @param Status Forwarding rule status. Provisioning: under creation. Active: running. Configuring: configuration in progress.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Tag list. 
     * @return Tags Tag list.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
     * @param Tags Tag list.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public RuleOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleOutput(RuleOutput source) {
        if (source.Actions != null) {
            this.Actions = new RuleAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new RuleAction(source.Actions[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new RuleCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleCondition(source.Conditions[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

