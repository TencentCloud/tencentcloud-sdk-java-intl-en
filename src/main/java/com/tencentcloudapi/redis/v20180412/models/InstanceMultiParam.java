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

public class InstanceMultiParam extends AbstractModel {

    /**
    * <p>Parameter name.</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>Parameter type. For example: multi.</p>
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * <p>Whether restart is required after parameter modification.</p><ul><li>true: required.</li><li>false: not required.</li></ul>
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * <p>Default parameter value.</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>Current running parameter value.</p>
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * <p>Parameter description.</p>
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * <p>Parameter enumeration value.</p>
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * <p>Parameter modification status.</p><ul><li>1: Modifying.</li><li>2: Modified.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Parameter type</p><p>Enumeration values:</p><ul><li>redis: parameters supported by cache nodes</li><li>redis-interface: parameters supported by proxy</li><li>tendis: parameters supported by tendis</li></ul>
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * <p>Whether the current instance supports this feature</p>
    */
    @SerializedName("FeatureSupported")
    @Expose
    private Boolean FeatureSupported;

    /**
    * <p>New feature launch date</p><p>Parameter format: time format YYYY-MM-DD</p>
    */
    @SerializedName("NewFeatureOnlineTime")
    @Expose
    private String NewFeatureOnlineTime;

    /**
    * <p>Regular expression validation rule</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * <p>Input format description</p>
    */
    @SerializedName("InputDescription")
    @Expose
    private String InputDescription;

    /**
     * Get <p>Parameter name.</p> 
     * @return ParamName <p>Parameter name.</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>Parameter name.</p>
     * @param ParamName <p>Parameter name.</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>Parameter type. For example: multi.</p> 
     * @return ValueType <p>Parameter type. For example: multi.</p>
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>Parameter type. For example: multi.</p>
     * @param ValueType <p>Parameter type. For example: multi.</p>
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>Whether restart is required after parameter modification.</p><ul><li>true: required.</li><li>false: not required.</li></ul> 
     * @return NeedRestart <p>Whether restart is required after parameter modification.</p><ul><li>true: required.</li><li>false: not required.</li></ul>
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set <p>Whether restart is required after parameter modification.</p><ul><li>true: required.</li><li>false: not required.</li></ul>
     * @param NeedRestart <p>Whether restart is required after parameter modification.</p><ul><li>true: required.</li><li>false: not required.</li></ul>
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get <p>Default parameter value.</p> 
     * @return DefaultValue <p>Default parameter value.</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>Default parameter value.</p>
     * @param DefaultValue <p>Default parameter value.</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>Current running parameter value.</p> 
     * @return CurrentValue <p>Current running parameter value.</p>
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set <p>Current running parameter value.</p>
     * @param CurrentValue <p>Current running parameter value.</p>
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get <p>Parameter description.</p> 
     * @return Tips <p>Parameter description.</p>
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set <p>Parameter description.</p>
     * @param Tips <p>Parameter description.</p>
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get <p>Parameter enumeration value.</p> 
     * @return EnumValue <p>Parameter enumeration value.</p>
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set <p>Parameter enumeration value.</p>
     * @param EnumValue <p>Parameter enumeration value.</p>
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get <p>Parameter modification status.</p><ul><li>1: Modifying.</li><li>2: Modified.</li></ul> 
     * @return Status <p>Parameter modification status.</p><ul><li>1: Modifying.</li><li>2: Modified.</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Parameter modification status.</p><ul><li>1: Modifying.</li><li>2: Modified.</li></ul>
     * @param Status <p>Parameter modification status.</p><ul><li>1: Modifying.</li><li>2: Modified.</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Parameter type</p><p>Enumeration values:</p><ul><li>redis: parameters supported by cache nodes</li><li>redis-interface: parameters supported by proxy</li><li>tendis: parameters supported by tendis</li></ul> 
     * @return ParamType <p>Parameter type</p><p>Enumeration values:</p><ul><li>redis: parameters supported by cache nodes</li><li>redis-interface: parameters supported by proxy</li><li>tendis: parameters supported by tendis</li></ul>
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set <p>Parameter type</p><p>Enumeration values:</p><ul><li>redis: parameters supported by cache nodes</li><li>redis-interface: parameters supported by proxy</li><li>tendis: parameters supported by tendis</li></ul>
     * @param ParamType <p>Parameter type</p><p>Enumeration values:</p><ul><li>redis: parameters supported by cache nodes</li><li>redis-interface: parameters supported by proxy</li><li>tendis: parameters supported by tendis</li></ul>
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>Whether the current instance supports this feature</p> 
     * @return FeatureSupported <p>Whether the current instance supports this feature</p>
     */
    public Boolean getFeatureSupported() {
        return this.FeatureSupported;
    }

    /**
     * Set <p>Whether the current instance supports this feature</p>
     * @param FeatureSupported <p>Whether the current instance supports this feature</p>
     */
    public void setFeatureSupported(Boolean FeatureSupported) {
        this.FeatureSupported = FeatureSupported;
    }

    /**
     * Get <p>New feature launch date</p><p>Parameter format: time format YYYY-MM-DD</p> 
     * @return NewFeatureOnlineTime <p>New feature launch date</p><p>Parameter format: time format YYYY-MM-DD</p>
     */
    public String getNewFeatureOnlineTime() {
        return this.NewFeatureOnlineTime;
    }

    /**
     * Set <p>New feature launch date</p><p>Parameter format: time format YYYY-MM-DD</p>
     * @param NewFeatureOnlineTime <p>New feature launch date</p><p>Parameter format: time format YYYY-MM-DD</p>
     */
    public void setNewFeatureOnlineTime(String NewFeatureOnlineTime) {
        this.NewFeatureOnlineTime = NewFeatureOnlineTime;
    }

    /**
     * Get <p>Regular expression validation rule</p> 
     * @return Pattern <p>Regular expression validation rule</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>Regular expression validation rule</p>
     * @param Pattern <p>Regular expression validation rule</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get <p>Input format description</p> 
     * @return InputDescription <p>Input format description</p>
     */
    public String getInputDescription() {
        return this.InputDescription;
    }

    /**
     * Set <p>Input format description</p>
     * @param InputDescription <p>Input format description</p>
     */
    public void setInputDescription(String InputDescription) {
        this.InputDescription = InputDescription;
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
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.FeatureSupported != null) {
            this.FeatureSupported = new Boolean(source.FeatureSupported);
        }
        if (source.NewFeatureOnlineTime != null) {
            this.NewFeatureOnlineTime = new String(source.NewFeatureOnlineTime);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.InputDescription != null) {
            this.InputDescription = new String(source.InputDescription);
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
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "FeatureSupported", this.FeatureSupported);
        this.setParamSimple(map, prefix + "NewFeatureOnlineTime", this.NewFeatureOnlineTime);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "InputDescription", this.InputDescription);

    }
}

