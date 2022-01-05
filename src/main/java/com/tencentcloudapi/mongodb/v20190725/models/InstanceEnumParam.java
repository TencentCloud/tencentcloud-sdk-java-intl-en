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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceEnumParam extends AbstractModel{

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
    * Acceptable values
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no)
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
    * Parameter description
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * Data type of the parameter
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Whether the TencentDB for MongoDB console has pulled parameter information successfully. Valid values: `1` (yes), `0` (no, and displays "Loading" in the console)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get Acceptable values 
     * @return EnumValue Acceptable values
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Acceptable values
     * @param EnumValue Acceptable values
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no) 
     * @return NeedRestart Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no)
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no)
     * @param NeedRestart Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no)
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
     * Get Data type of the parameter 
     * @return ValueType Data type of the parameter
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Data type of the parameter
     * @param ValueType Data type of the parameter
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Whether the TencentDB for MongoDB console has pulled parameter information successfully. Valid values: `1` (yes), `0` (no, and displays "Loading" in the console) 
     * @return Status Whether the TencentDB for MongoDB console has pulled parameter information successfully. Valid values: `1` (yes), `0` (no, and displays "Loading" in the console)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the TencentDB for MongoDB console has pulled parameter information successfully. Valid values: `1` (yes), `0` (no, and displays "Loading" in the console)
     * @param Status Whether the TencentDB for MongoDB console has pulled parameter information successfully. Valid values: `1` (yes), `0` (no, and displays "Loading" in the console)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InstanceEnumParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceEnumParam(InstanceEnumParam source) {
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
            this.Status = new Long(source.Status);
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
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

