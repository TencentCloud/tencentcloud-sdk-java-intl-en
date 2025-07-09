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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationRuleExpression extends AbstractModel {

    /**
    * RuleKey: cost allocation dimension.
Enumeration value.
ownerUin - user UIN.
Operator UIN.
businessCode - product-level code.
productCode - 2-tier product code.
itemCode - 4-tier product code.
projectId - specifies the project ID.
regionId.
resourceId - specifies the resource ID.
tag - tag key-value pair.
payMode - billing mode.
instanceType - instance type.
actionType - transaction type.
    */
    @SerializedName("RuleKey")
    @Expose
    private String RuleKey;

    /**
    * Specifies the dimension rules for cost allocation.
Enumeration value.
in.
not in.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Cost allocation dimension value. for example, when RuleKey is businessCode, ["p_cbs","p_sqlserver"] indicates the cost of products at the "p_cbs","p_sqlserver" level.
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * Logical connection for cost allocation, enumeration values are as follows:.
Create and bind a policy query an instance reset the access password of an instance.
Create and bind a policy query an instance reset the access password of an instance.
    */
    @SerializedName("Connectors")
    @Expose
    private String Connectors;

    /**
    * Nested rule.
    */
    @SerializedName("Children")
    @Expose
    private AllocationRuleExpression [] Children;

    /**
     * Get RuleKey: cost allocation dimension.
Enumeration value.
ownerUin - user UIN.
Operator UIN.
businessCode - product-level code.
productCode - 2-tier product code.
itemCode - 4-tier product code.
projectId - specifies the project ID.
regionId.
resourceId - specifies the resource ID.
tag - tag key-value pair.
payMode - billing mode.
instanceType - instance type.
actionType - transaction type. 
     * @return RuleKey RuleKey: cost allocation dimension.
Enumeration value.
ownerUin - user UIN.
Operator UIN.
businessCode - product-level code.
productCode - 2-tier product code.
itemCode - 4-tier product code.
projectId - specifies the project ID.
regionId.
resourceId - specifies the resource ID.
tag - tag key-value pair.
payMode - billing mode.
instanceType - instance type.
actionType - transaction type.
     */
    public String getRuleKey() {
        return this.RuleKey;
    }

    /**
     * Set RuleKey: cost allocation dimension.
Enumeration value.
ownerUin - user UIN.
Operator UIN.
businessCode - product-level code.
productCode - 2-tier product code.
itemCode - 4-tier product code.
projectId - specifies the project ID.
regionId.
resourceId - specifies the resource ID.
tag - tag key-value pair.
payMode - billing mode.
instanceType - instance type.
actionType - transaction type.
     * @param RuleKey RuleKey: cost allocation dimension.
Enumeration value.
ownerUin - user UIN.
Operator UIN.
businessCode - product-level code.
productCode - 2-tier product code.
itemCode - 4-tier product code.
projectId - specifies the project ID.
regionId.
resourceId - specifies the resource ID.
tag - tag key-value pair.
payMode - billing mode.
instanceType - instance type.
actionType - transaction type.
     */
    public void setRuleKey(String RuleKey) {
        this.RuleKey = RuleKey;
    }

    /**
     * Get Specifies the dimension rules for cost allocation.
Enumeration value.
in.
not in. 
     * @return Operator Specifies the dimension rules for cost allocation.
Enumeration value.
in.
not in.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Specifies the dimension rules for cost allocation.
Enumeration value.
in.
not in.
     * @param Operator Specifies the dimension rules for cost allocation.
Enumeration value.
in.
not in.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Cost allocation dimension value. for example, when RuleKey is businessCode, ["p_cbs","p_sqlserver"] indicates the cost of products at the "p_cbs","p_sqlserver" level. 
     * @return RuleValue Cost allocation dimension value. for example, when RuleKey is businessCode, ["p_cbs","p_sqlserver"] indicates the cost of products at the "p_cbs","p_sqlserver" level.
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set Cost allocation dimension value. for example, when RuleKey is businessCode, ["p_cbs","p_sqlserver"] indicates the cost of products at the "p_cbs","p_sqlserver" level.
     * @param RuleValue Cost allocation dimension value. for example, when RuleKey is businessCode, ["p_cbs","p_sqlserver"] indicates the cost of products at the "p_cbs","p_sqlserver" level.
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get Logical connection for cost allocation, enumeration values are as follows:.
Create and bind a policy query an instance reset the access password of an instance.
Create and bind a policy query an instance reset the access password of an instance. 
     * @return Connectors Logical connection for cost allocation, enumeration values are as follows:.
Create and bind a policy query an instance reset the access password of an instance.
Create and bind a policy query an instance reset the access password of an instance.
     */
    public String getConnectors() {
        return this.Connectors;
    }

    /**
     * Set Logical connection for cost allocation, enumeration values are as follows:.
Create and bind a policy query an instance reset the access password of an instance.
Create and bind a policy query an instance reset the access password of an instance.
     * @param Connectors Logical connection for cost allocation, enumeration values are as follows:.
Create and bind a policy query an instance reset the access password of an instance.
Create and bind a policy query an instance reset the access password of an instance.
     */
    public void setConnectors(String Connectors) {
        this.Connectors = Connectors;
    }

    /**
     * Get Nested rule. 
     * @return Children Nested rule.
     */
    public AllocationRuleExpression [] getChildren() {
        return this.Children;
    }

    /**
     * Set Nested rule.
     * @param Children Nested rule.
     */
    public void setChildren(AllocationRuleExpression [] Children) {
        this.Children = Children;
    }

    public AllocationRuleExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationRuleExpression(AllocationRuleExpression source) {
        if (source.RuleKey != null) {
            this.RuleKey = new String(source.RuleKey);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.Connectors != null) {
            this.Connectors = new String(source.Connectors);
        }
        if (source.Children != null) {
            this.Children = new AllocationRuleExpression[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new AllocationRuleExpression(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleKey", this.RuleKey);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "Connectors", this.Connectors);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

