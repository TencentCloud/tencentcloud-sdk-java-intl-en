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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffDetailItem extends AbstractModel {

    /**
    * Attribute.
    */
    @SerializedName("Attribute")
    @Expose
    private String Attribute;

    /**
    * Currently effective.
    */
    @SerializedName("InEffect")
    @Expose
    private String InEffect;

    /**
    * To be effective.
    */
    @SerializedName("PendingEffectiveness")
    @Expose
    private String PendingEffectiveness;

    /**
    * Operation.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Queue.
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * Configuration set.
    */
    @SerializedName("ConfigSet")
    @Expose
    private String ConfigSet;

    /**
    * Tag.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Current position.
    */
    @SerializedName("InEffectIndex")
    @Expose
    private String InEffectIndex;

    /**
    * Position to be effective.
    */
    @SerializedName("PendingEffectIndex")
    @Expose
    private String PendingEffectIndex;

    /**
    * Plan mode name.
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Tag.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Placement rule.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get Attribute. 
     * @return Attribute Attribute.
     */
    public String getAttribute() {
        return this.Attribute;
    }

    /**
     * Set Attribute.
     * @param Attribute Attribute.
     */
    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get Currently effective. 
     * @return InEffect Currently effective.
     */
    public String getInEffect() {
        return this.InEffect;
    }

    /**
     * Set Currently effective.
     * @param InEffect Currently effective.
     */
    public void setInEffect(String InEffect) {
        this.InEffect = InEffect;
    }

    /**
     * Get To be effective. 
     * @return PendingEffectiveness To be effective.
     */
    public String getPendingEffectiveness() {
        return this.PendingEffectiveness;
    }

    /**
     * Set To be effective.
     * @param PendingEffectiveness To be effective.
     */
    public void setPendingEffectiveness(String PendingEffectiveness) {
        this.PendingEffectiveness = PendingEffectiveness;
    }

    /**
     * Get Operation. 
     * @return Operation Operation.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation.
     * @param Operation Operation.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Queue. 
     * @return Queue Queue.
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set Queue.
     * @param Queue Queue.
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get Configuration set. 
     * @return ConfigSet Configuration set.
     */
    public String getConfigSet() {
        return this.ConfigSet;
    }

    /**
     * Set Configuration set.
     * @param ConfigSet Configuration set.
     */
    public void setConfigSet(String ConfigSet) {
        this.ConfigSet = ConfigSet;
    }

    /**
     * Get Tag. 
     * @return LabelName Tag.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Tag.
     * @param LabelName Tag.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get Current position. 
     * @return InEffectIndex Current position.
     */
    public String getInEffectIndex() {
        return this.InEffectIndex;
    }

    /**
     * Set Current position.
     * @param InEffectIndex Current position.
     */
    public void setInEffectIndex(String InEffectIndex) {
        this.InEffectIndex = InEffectIndex;
    }

    /**
     * Get Position to be effective. 
     * @return PendingEffectIndex Position to be effective.
     */
    public String getPendingEffectIndex() {
        return this.PendingEffectIndex;
    }

    /**
     * Set Position to be effective.
     * @param PendingEffectIndex Position to be effective.
     */
    public void setPendingEffectIndex(String PendingEffectIndex) {
        this.PendingEffectIndex = PendingEffectIndex;
    }

    /**
     * Get Plan mode name. 
     * @return PlanName Plan mode name.
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Plan mode name.
     * @param PlanName Plan mode name.
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Tag. 
     * @return Label Tag.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag.
     * @param Label Tag.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Placement rule. 
     * @return RuleName Placement rule.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Placement rule.
     * @param RuleName Placement rule.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public DiffDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffDetailItem(DiffDetailItem source) {
        if (source.Attribute != null) {
            this.Attribute = new String(source.Attribute);
        }
        if (source.InEffect != null) {
            this.InEffect = new String(source.InEffect);
        }
        if (source.PendingEffectiveness != null) {
            this.PendingEffectiveness = new String(source.PendingEffectiveness);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.ConfigSet != null) {
            this.ConfigSet = new String(source.ConfigSet);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.InEffectIndex != null) {
            this.InEffectIndex = new String(source.InEffectIndex);
        }
        if (source.PendingEffectIndex != null) {
            this.PendingEffectIndex = new String(source.PendingEffectIndex);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attribute", this.Attribute);
        this.setParamSimple(map, prefix + "InEffect", this.InEffect);
        this.setParamSimple(map, prefix + "PendingEffectiveness", this.PendingEffectiveness);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "ConfigSet", this.ConfigSet);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "InEffectIndex", this.InEffectIndex);
        this.setParamSimple(map, prefix + "PendingEffectIndex", this.PendingEffectIndex);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

