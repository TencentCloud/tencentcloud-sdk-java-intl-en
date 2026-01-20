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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleTemplateRecordInfo extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Details of the original rule template.
    */
    @SerializedName("ModifyBeforeInfo")
    @Expose
    private RuleTemplateInfo ModifyBeforeInfo;

    /**
    * Details of the modified rule template.
    */
    @SerializedName("ModifyAfterInfo")
    @Expose
    private RuleTemplateInfo ModifyAfterInfo;

    /**
    * Affected instances.
    */
    @SerializedName("AffectedInstances")
    @Expose
    private String [] AffectedInstances;

    /**
    * Operator (account UIN).
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Time of the change.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Details of the original rule template. 
     * @return ModifyBeforeInfo Details of the original rule template.
     */
    public RuleTemplateInfo getModifyBeforeInfo() {
        return this.ModifyBeforeInfo;
    }

    /**
     * Set Details of the original rule template.
     * @param ModifyBeforeInfo Details of the original rule template.
     */
    public void setModifyBeforeInfo(RuleTemplateInfo ModifyBeforeInfo) {
        this.ModifyBeforeInfo = ModifyBeforeInfo;
    }

    /**
     * Get Details of the modified rule template. 
     * @return ModifyAfterInfo Details of the modified rule template.
     */
    public RuleTemplateInfo getModifyAfterInfo() {
        return this.ModifyAfterInfo;
    }

    /**
     * Set Details of the modified rule template.
     * @param ModifyAfterInfo Details of the modified rule template.
     */
    public void setModifyAfterInfo(RuleTemplateInfo ModifyAfterInfo) {
        this.ModifyAfterInfo = ModifyAfterInfo;
    }

    /**
     * Get Affected instances. 
     * @return AffectedInstances Affected instances.
     */
    public String [] getAffectedInstances() {
        return this.AffectedInstances;
    }

    /**
     * Set Affected instances.
     * @param AffectedInstances Affected instances.
     */
    public void setAffectedInstances(String [] AffectedInstances) {
        this.AffectedInstances = AffectedInstances;
    }

    /**
     * Get Operator (account UIN). 
     * @return Operator Operator (account UIN).
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator (account UIN).
     * @param Operator Operator (account UIN).
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Time of the change. 
     * @return UpdateTime Time of the change.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Time of the change.
     * @param UpdateTime Time of the change.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RuleTemplateRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplateRecordInfo(RuleTemplateRecordInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.ModifyBeforeInfo != null) {
            this.ModifyBeforeInfo = new RuleTemplateInfo(source.ModifyBeforeInfo);
        }
        if (source.ModifyAfterInfo != null) {
            this.ModifyAfterInfo = new RuleTemplateInfo(source.ModifyAfterInfo);
        }
        if (source.AffectedInstances != null) {
            this.AffectedInstances = new String[source.AffectedInstances.length];
            for (int i = 0; i < source.AffectedInstances.length; i++) {
                this.AffectedInstances[i] = new String(source.AffectedInstances[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "ModifyBeforeInfo.", this.ModifyBeforeInfo);
        this.setParamObj(map, prefix + "ModifyAfterInfo.", this.ModifyAfterInfo);
        this.setParamArraySimple(map, prefix + "AffectedInstances.", this.AffectedInstances);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

