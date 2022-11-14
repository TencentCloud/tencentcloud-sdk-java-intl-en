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

public class SetNatFwDnatRuleRequest extends AbstractModel{

    /**
    * 0: Create new; 1: Use existing
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Operation type. Valid values: add, del, and modify.
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Firewall instance ID. This field is required.
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * List of added/deleted DNAT rules
    */
    @SerializedName("AddOrDelDnatRules")
    @Expose
    private CfwNatDnatRule [] AddOrDelDnatRules;

    /**
    * Original DNAT rule before change
    */
    @SerializedName("OriginDnat")
    @Expose
    private CfwNatDnatRule OriginDnat;

    /**
    * New DNAT rule after change
    */
    @SerializedName("NewDnat")
    @Expose
    private CfwNatDnatRule NewDnat;

    /**
     * Get 0: Create new; 1: Use existing 
     * @return Mode 0: Create new; 1: Use existing
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0: Create new; 1: Use existing
     * @param Mode 0: Create new; 1: Use existing
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Operation type. Valid values: add, del, and modify. 
     * @return OperationType Operation type. Valid values: add, del, and modify.
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type. Valid values: add, del, and modify.
     * @param OperationType Operation type. Valid values: add, del, and modify.
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Firewall instance ID. This field is required. 
     * @return CfwInstance Firewall instance ID. This field is required.
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set Firewall instance ID. This field is required.
     * @param CfwInstance Firewall instance ID. This field is required.
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get List of added/deleted DNAT rules 
     * @return AddOrDelDnatRules List of added/deleted DNAT rules
     */
    public CfwNatDnatRule [] getAddOrDelDnatRules() {
        return this.AddOrDelDnatRules;
    }

    /**
     * Set List of added/deleted DNAT rules
     * @param AddOrDelDnatRules List of added/deleted DNAT rules
     */
    public void setAddOrDelDnatRules(CfwNatDnatRule [] AddOrDelDnatRules) {
        this.AddOrDelDnatRules = AddOrDelDnatRules;
    }

    /**
     * Get Original DNAT rule before change 
     * @return OriginDnat Original DNAT rule before change
     */
    public CfwNatDnatRule getOriginDnat() {
        return this.OriginDnat;
    }

    /**
     * Set Original DNAT rule before change
     * @param OriginDnat Original DNAT rule before change
     */
    public void setOriginDnat(CfwNatDnatRule OriginDnat) {
        this.OriginDnat = OriginDnat;
    }

    /**
     * Get New DNAT rule after change 
     * @return NewDnat New DNAT rule after change
     */
    public CfwNatDnatRule getNewDnat() {
        return this.NewDnat;
    }

    /**
     * Set New DNAT rule after change
     * @param NewDnat New DNAT rule after change
     */
    public void setNewDnat(CfwNatDnatRule NewDnat) {
        this.NewDnat = NewDnat;
    }

    public SetNatFwDnatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNatFwDnatRuleRequest(SetNatFwDnatRuleRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.AddOrDelDnatRules != null) {
            this.AddOrDelDnatRules = new CfwNatDnatRule[source.AddOrDelDnatRules.length];
            for (int i = 0; i < source.AddOrDelDnatRules.length; i++) {
                this.AddOrDelDnatRules[i] = new CfwNatDnatRule(source.AddOrDelDnatRules[i]);
            }
        }
        if (source.OriginDnat != null) {
            this.OriginDnat = new CfwNatDnatRule(source.OriginDnat);
        }
        if (source.NewDnat != null) {
            this.NewDnat = new CfwNatDnatRule(source.NewDnat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArrayObj(map, prefix + "AddOrDelDnatRules.", this.AddOrDelDnatRules);
        this.setParamObj(map, prefix + "OriginDnat.", this.OriginDnat);
        this.setParamObj(map, prefix + "NewDnat.", this.NewDnat);

    }
}

