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

public class InstanceTextParam extends AbstractModel {

    /**
    * Current value
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Default value
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Whether to restart the instance for the parameter to take effect
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Value of a text parameter
    */
    @SerializedName("TextValue")
    @Expose
    private String TextValue;

    /**
    * Parameter description
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * Value type
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Current value 
     * @return CurrentValue Current value
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value
     * @param CurrentValue Current value
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Default value 
     * @return DefaultValue Default value
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value
     * @param DefaultValue Default value
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Whether to restart the instance for the parameter to take effect 
     * @return NeedRestart Whether to restart the instance for the parameter to take effect
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether to restart the instance for the parameter to take effect
     * @param NeedRestart Whether to restart the instance for the parameter to take effect
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

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
     * Get Value of a text parameter 
     * @return TextValue Value of a text parameter
     */
    public String getTextValue() {
        return this.TextValue;
    }

    /**
     * Set Value of a text parameter
     * @param TextValue Value of a text parameter
     */
    public void setTextValue(String TextValue) {
        this.TextValue = TextValue;
    }

    /**
     * Get Parameter description 
     * @return Tips Parameter description
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set Parameter description
     * @param Tips Parameter description
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Value type 
     * @return ValueType Value type
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Value type
     * @param ValueType Value type
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no) 
     * @return Status Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
     * @param Status Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public InstanceTextParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTextParam(InstanceTextParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.TextValue != null) {
            this.TextValue = new String(source.TextValue);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "TextValue", this.TextValue);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

