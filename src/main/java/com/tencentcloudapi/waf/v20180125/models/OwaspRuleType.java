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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwaspRuleType extends AbstractModel {

    /**
    * Type ID
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Type name
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Type description.


    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Data type category.
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * Protection mode of the rule type. valid values: 0 (observation), 1 (intercept).
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * Protection level of the rule type. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * The switch status of the rule type. valid values: 0 (disabled), 1 (enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Specifies all rules under the rule type. always.
    */
    @SerializedName("TotalRule")
    @Expose
    private Long TotalRule;

    /**
    * Indicates the total number of rules enabled under the rule type.
    */
    @SerializedName("ActiveRule")
    @Expose
    private Long ActiveRule;

    /**
     * Get Type ID 
     * @return TypeId Type ID
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Type ID
     * @param TypeId Type ID
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Type name 
     * @return TypeName Type name
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Type name
     * @param TypeName Type name
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Type description.

 
     * @return Description Type description.


     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Type description.


     * @param Description Type description.


     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Data type category. 
     * @return Classification Data type category.
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set Data type category.
     * @param Classification Data type category.
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get Protection mode of the rule type. valid values: 0 (observation), 1 (intercept). 
     * @return Action Protection mode of the rule type. valid values: 0 (observation), 1 (intercept).
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Protection mode of the rule type. valid values: 0 (observation), 1 (intercept).
     * @param Action Protection mode of the rule type. valid values: 0 (observation), 1 (intercept).
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get Protection level of the rule type. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict). 
     * @return Level Protection level of the rule type. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Protection level of the rule type. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     * @param Level Protection level of the rule type. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get The switch status of the rule type. valid values: 0 (disabled), 1 (enabled). 
     * @return Status The switch status of the rule type. valid values: 0 (disabled), 1 (enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The switch status of the rule type. valid values: 0 (disabled), 1 (enabled).
     * @param Status The switch status of the rule type. valid values: 0 (disabled), 1 (enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies all rules under the rule type. always. 
     * @return TotalRule Specifies all rules under the rule type. always.
     */
    public Long getTotalRule() {
        return this.TotalRule;
    }

    /**
     * Set Specifies all rules under the rule type. always.
     * @param TotalRule Specifies all rules under the rule type. always.
     */
    public void setTotalRule(Long TotalRule) {
        this.TotalRule = TotalRule;
    }

    /**
     * Get Indicates the total number of rules enabled under the rule type. 
     * @return ActiveRule Indicates the total number of rules enabled under the rule type.
     */
    public Long getActiveRule() {
        return this.ActiveRule;
    }

    /**
     * Set Indicates the total number of rules enabled under the rule type.
     * @param ActiveRule Indicates the total number of rules enabled under the rule type.
     */
    public void setActiveRule(Long ActiveRule) {
        this.ActiveRule = ActiveRule;
    }

    public OwaspRuleType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwaspRuleType(OwaspRuleType source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TotalRule != null) {
            this.TotalRule = new Long(source.TotalRule);
        }
        if (source.ActiveRule != null) {
            this.ActiveRule = new Long(source.ActiveRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalRule", this.TotalRule);
        this.setParamSimple(map, prefix + "ActiveRule", this.ActiveRule);

    }
}

