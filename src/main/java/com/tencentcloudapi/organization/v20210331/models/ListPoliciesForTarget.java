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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPoliciesForTarget extends AbstractModel {

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Policy name.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Associated account or node.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Association type. 1: node association; 2: user association.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Policy creation time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Department name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy binding time.
    */
    @SerializedName("AttachTime")
    @Expose
    private String AttachTime;

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Policy name. 
     * @return StrategyName Policy name.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name.
     * @param StrategyName Policy name.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Associated account or node. 
     * @return Uin Associated account or node.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Associated account or node.
     * @param Uin Associated account or node.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Association type. 1: node association; 2: user association. 
     * @return Type Association type. 1: node association; 2: user association.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Association type. 1: node association; 2: user association.
     * @param Type Association type. 1: node association; 2: user association.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Policy creation time. 
     * @return AddTime Policy creation time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Policy creation time.
     * @param AddTime Policy creation time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Policy update time. 
     * @return UpdateTime Policy update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Policy update time.
     * @param UpdateTime Policy update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Department name. 
     * @return Name Department name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Department name.
     * @param Name Department name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy binding time. 
     * @return AttachTime Policy binding time.
     */
    public String getAttachTime() {
        return this.AttachTime;
    }

    /**
     * Set Policy binding time.
     * @param AttachTime Policy binding time.
     */
    public void setAttachTime(String AttachTime) {
        this.AttachTime = AttachTime;
    }

    public ListPoliciesForTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesForTarget(ListPoliciesForTarget source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AttachTime != null) {
            this.AttachTime = new String(source.AttachTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AttachTime", this.AttachTime);

    }
}

