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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceMultiParam extends AbstractModel {

    /**
    * Current parameter value.
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Default parameter value.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Reference value range.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Whether a restart is required for the parameters to take effect after modification.
 - 1: Restart is required for the parameters to take effect.
 - 0: Restart is not required. Once set, the parameters take effect immediately.
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * Parameter name.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Whether the parameter values are used during running.
 - 1. parameter values used during running.
 - 0: parameter values not used during running.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Parameter description.
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * Describes the type of the current values. Default value: multi.
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get Current parameter value. 
     * @return CurrentValue Current parameter value.
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current parameter value.
     * @param CurrentValue Current parameter value.
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Default parameter value. 
     * @return DefaultValue Default parameter value.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default parameter value.
     * @param DefaultValue Default parameter value.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Reference value range. 
     * @return EnumValue Reference value range.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Reference value range.
     * @param EnumValue Reference value range.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get Whether a restart is required for the parameters to take effect after modification.
 - 1: Restart is required for the parameters to take effect.
 - 0: Restart is not required. Once set, the parameters take effect immediately. 
     * @return NeedRestart Whether a restart is required for the parameters to take effect after modification.
 - 1: Restart is required for the parameters to take effect.
 - 0: Restart is not required. Once set, the parameters take effect immediately.
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether a restart is required for the parameters to take effect after modification.
 - 1: Restart is required for the parameters to take effect.
 - 0: Restart is not required. Once set, the parameters take effect immediately.
     * @param NeedRestart Whether a restart is required for the parameters to take effect after modification.
 - 1: Restart is required for the parameters to take effect.
 - 0: Restart is not required. Once set, the parameters take effect immediately.
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Parameter name. 
     * @return ParamName Parameter name.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
     * @param ParamName Parameter name.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Whether the parameter values are used during running.
 - 1. parameter values used during running.
 - 0: parameter values not used during running. 
     * @return Status Whether the parameter values are used during running.
 - 1. parameter values used during running.
 - 0: parameter values not used during running.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the parameter values are used during running.
 - 1. parameter values used during running.
 - 0: parameter values not used during running.
     * @param Status Whether the parameter values are used during running.
 - 1. parameter values used during running.
 - 0: parameter values not used during running.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Parameter description. 
     * @return Tips Parameter description.
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set Parameter description.
     * @param Tips Parameter description.
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Describes the type of the current values. Default value: multi. 
     * @return ValueType Describes the type of the current values. Default value: multi.
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Describes the type of the current values. Default value: multi.
     * @param ValueType Describes the type of the current values. Default value: multi.
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public InstanceMultiParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceMultiParam(InstanceMultiParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tips != null) {
            this.Tips = new String[source.Tips.length];
            for (int i = 0; i < source.Tips.length; i++) {
                this.Tips[i] = new String(source.Tips[i]);
            }
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

