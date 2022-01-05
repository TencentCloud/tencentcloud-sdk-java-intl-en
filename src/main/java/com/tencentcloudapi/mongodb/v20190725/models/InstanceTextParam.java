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

public class InstanceTextParam extends AbstractModel{

    /**
    * Current value (not in use)
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Default value (not in use)
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Whether to restart the instance for the parameter to take effect (not in use)
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * Parameter name (not in use)
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Acceptable values (not in use)
    */
    @SerializedName("TextValue")
    @Expose
    private String TextValue;

    /**
    * Parameter description (not in use)
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * Data type of the parameter (not in use)
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Whether the TencentDB for MongoDB console has pulled parameter information successfully (not in use)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Current value (not in use) 
     * @return CurrentValue Current value (not in use)
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value (not in use)
     * @param CurrentValue Current value (not in use)
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Default value (not in use) 
     * @return DefaultValue Default value (not in use)
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value (not in use)
     * @param DefaultValue Default value (not in use)
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Whether to restart the instance for the parameter to take effect (not in use) 
     * @return NeedRestart Whether to restart the instance for the parameter to take effect (not in use)
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether to restart the instance for the parameter to take effect (not in use)
     * @param NeedRestart Whether to restart the instance for the parameter to take effect (not in use)
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Parameter name (not in use) 
     * @return ParamName Parameter name (not in use)
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name (not in use)
     * @param ParamName Parameter name (not in use)
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Acceptable values (not in use) 
     * @return TextValue Acceptable values (not in use)
     */
    public String getTextValue() {
        return this.TextValue;
    }

    /**
     * Set Acceptable values (not in use)
     * @param TextValue Acceptable values (not in use)
     */
    public void setTextValue(String TextValue) {
        this.TextValue = TextValue;
    }

    /**
     * Get Parameter description (not in use) 
     * @return Tips Parameter description (not in use)
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set Parameter description (not in use)
     * @param Tips Parameter description (not in use)
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Data type of the parameter (not in use) 
     * @return ValueType Data type of the parameter (not in use)
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Data type of the parameter (not in use)
     * @param ValueType Data type of the parameter (not in use)
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Whether the TencentDB for MongoDB console has pulled parameter information successfully (not in use) 
     * @return Status Whether the TencentDB for MongoDB console has pulled parameter information successfully (not in use)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the TencentDB for MongoDB console has pulled parameter information successfully (not in use)
     * @param Status Whether the TencentDB for MongoDB console has pulled parameter information successfully (not in use)
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

