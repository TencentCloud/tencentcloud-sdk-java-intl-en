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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceMultiParam extends AbstractModel{

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Parameter type: Multi
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Whether restart is required after a modification is made. Value range: true, false
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * Default value of the parameter
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Current value of a parameter
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Parameter description
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * Parameter description
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Parameter status. 1: modifying; 2: modified
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Parameter name 
     * @return ParamName Parameter name
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name
     * @param ParamName Parameter name
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Parameter type: Multi 
     * @return ValueType Parameter type: Multi
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Parameter type: Multi
     * @param ValueType Parameter type: Multi
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Whether restart is required after a modification is made. Value range: true, false 
     * @return NeedRestart Whether restart is required after a modification is made. Value range: true, false
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether restart is required after a modification is made. Value range: true, false
     * @param NeedRestart Whether restart is required after a modification is made. Value range: true, false
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Default value of the parameter 
     * @return DefaultValue Default value of the parameter
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value of the parameter
     * @param DefaultValue Default value of the parameter
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Current value of a parameter 
     * @return CurrentValue Current value of a parameter
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value of a parameter
     * @param CurrentValue Current value of a parameter
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Parameter description 
     * @return Tips Parameter description
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set Parameter description
     * @param Tips Parameter description
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Parameter description 
     * @return EnumValue Parameter description
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Parameter description
     * @param EnumValue Parameter description
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get Parameter status. 1: modifying; 2: modified 
     * @return Status Parameter status. 1: modifying; 2: modified
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Parameter status. 1: modifying; 2: modified
     * @param Status Parameter status. 1: modifying; 2: modified
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InstanceMultiParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceMultiParam(InstanceMultiParam source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Tips", this.Tips);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

