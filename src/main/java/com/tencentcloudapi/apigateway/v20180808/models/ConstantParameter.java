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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConstantParameter extends AbstractModel{

    /**
    * Constant parameter name This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Constant parameter description This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Constant paramter location This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * Default value of the constant parameter This is only applicable when `ServiceType` is `HTTP`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
     * Get Constant parameter name This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name Constant parameter name This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Constant parameter name This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name Constant parameter name This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Constant parameter description This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Desc Constant parameter description This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Constant parameter description This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Desc Constant parameter description This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Constant paramter location This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Position Constant paramter location This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set Constant paramter location This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Position Constant paramter location This is only applicable when `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get Default value of the constant parameter This is only applicable when `ServiceType` is `HTTP`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultValue Default value of the constant parameter This is only applicable when `ServiceType` is `HTTP`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value of the constant parameter This is only applicable when `ServiceType` is `HTTP`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultValue Default value of the constant parameter This is only applicable when `ServiceType` is `HTTP`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    public ConstantParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConstantParameter(ConstantParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);

    }
}

