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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceConditionForManage extends AbstractModel {

    /**
    * Compliance status when the condition is empty. Valid values: COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
    @SerializedName("EmptyAs")
    @Expose
    private String EmptyAs;

    /**
    * Configuration path
    */
    @SerializedName("SelectPath")
    @Expose
    private String SelectPath;

    /**
    * Operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Whether it is mandatory.
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * Expected value
    */
    @SerializedName("DesiredValue")
    @Expose
    private String DesiredValue;

    /**
     * Get Compliance status when the condition is empty. Valid values: COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE. 
     * @return EmptyAs Compliance status when the condition is empty. Valid values: COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
     */
    public String getEmptyAs() {
        return this.EmptyAs;
    }

    /**
     * Set Compliance status when the condition is empty. Valid values: COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
     * @param EmptyAs Compliance status when the condition is empty. Valid values: COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
     */
    public void setEmptyAs(String EmptyAs) {
        this.EmptyAs = EmptyAs;
    }

    /**
     * Get Configuration path 
     * @return SelectPath Configuration path
     */
    public String getSelectPath() {
        return this.SelectPath;
    }

    /**
     * Set Configuration path
     * @param SelectPath Configuration path
     */
    public void setSelectPath(String SelectPath) {
        this.SelectPath = SelectPath;
    }

    /**
     * Get Operator. 
     * @return Operator Operator.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator.
     * @param Operator Operator.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Whether it is mandatory. 
     * @return Required Whether it is mandatory.
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set Whether it is mandatory.
     * @param Required Whether it is mandatory.
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get Expected value 
     * @return DesiredValue Expected value
     */
    public String getDesiredValue() {
        return this.DesiredValue;
    }

    /**
     * Set Expected value
     * @param DesiredValue Expected value
     */
    public void setDesiredValue(String DesiredValue) {
        this.DesiredValue = DesiredValue;
    }

    public SourceConditionForManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceConditionForManage(SourceConditionForManage source) {
        if (source.EmptyAs != null) {
            this.EmptyAs = new String(source.EmptyAs);
        }
        if (source.SelectPath != null) {
            this.SelectPath = new String(source.SelectPath);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.DesiredValue != null) {
            this.DesiredValue = new String(source.DesiredValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmptyAs", this.EmptyAs);
        this.setParamSimple(map, prefix + "SelectPath", this.SelectPath);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "DesiredValue", this.DesiredValue);

    }
}

