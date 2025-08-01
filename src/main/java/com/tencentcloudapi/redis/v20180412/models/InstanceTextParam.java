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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTextParam extends AbstractModel {

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Parameter type such as  `Text`.
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Whether to restart the database after modifying the parameter. Valid values:  - `true` (required) - `false` (not required)
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
    * Current value
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Description
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * Acceptable values of the parameter
    */
    @SerializedName("TextValue")
    @Expose
    private String [] TextValue;

    /**
    * Parameter modification status. Valid values: - `1` (modifying) - `2` (modified)
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
     * Get Parameter type such as  `Text`. 
     * @return ValueType Parameter type such as  `Text`.
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Parameter type such as  `Text`.
     * @param ValueType Parameter type such as  `Text`.
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Whether to restart the database after modifying the parameter. Valid values:  - `true` (required) - `false` (not required) 
     * @return NeedRestart Whether to restart the database after modifying the parameter. Valid values:  - `true` (required) - `false` (not required)
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether to restart the database after modifying the parameter. Valid values:  - `true` (required) - `false` (not required)
     * @param NeedRestart Whether to restart the database after modifying the parameter. Valid values:  - `true` (required) - `false` (not required)
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
     * Get Description 
     * @return Tips Description
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set Description
     * @param Tips Description
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Acceptable values of the parameter 
     * @return TextValue Acceptable values of the parameter
     */
    public String [] getTextValue() {
        return this.TextValue;
    }

    /**
     * Set Acceptable values of the parameter
     * @param TextValue Acceptable values of the parameter
     */
    public void setTextValue(String [] TextValue) {
        this.TextValue = TextValue;
    }

    /**
     * Get Parameter modification status. Valid values: - `1` (modifying) - `2` (modified) 
     * @return Status Parameter modification status. Valid values: - `1` (modifying) - `2` (modified)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Parameter modification status. Valid values: - `1` (modifying) - `2` (modified)
     * @param Status Parameter modification status. Valid values: - `1` (modifying) - `2` (modified)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InstanceTextParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTextParam(InstanceTextParam source) {
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
        if (source.TextValue != null) {
            this.TextValue = new String[source.TextValue.length];
            for (int i = 0; i < source.TextValue.length; i++) {
                this.TextValue[i] = new String(source.TextValue[i]);
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
        this.setParamArraySimple(map, prefix + "TextValue.", this.TextValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

