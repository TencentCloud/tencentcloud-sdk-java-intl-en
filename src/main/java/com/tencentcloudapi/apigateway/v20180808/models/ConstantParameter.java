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
    * Constant parameter name. This parameter takes effect only when `ServiceType` is `HTTP`.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Constant parameter description. This parameter takes effect only when `ServiceType` is `HTTP`.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Constant parameter location. This parameter takes effect only when `ServiceType` is `HTTP`.
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * Constant parameter default value. This parameter takes effect only when `ServiceType` is `HTTP`.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
     * Get Constant parameter name. This parameter takes effect only when `ServiceType` is `HTTP`. 
     * @return Name Constant parameter name. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Constant parameter name. This parameter takes effect only when `ServiceType` is `HTTP`.
     * @param Name Constant parameter name. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Constant parameter description. This parameter takes effect only when `ServiceType` is `HTTP`. 
     * @return Desc Constant parameter description. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Constant parameter description. This parameter takes effect only when `ServiceType` is `HTTP`.
     * @param Desc Constant parameter description. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Constant parameter location. This parameter takes effect only when `ServiceType` is `HTTP`. 
     * @return Position Constant parameter location. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set Constant parameter location. This parameter takes effect only when `ServiceType` is `HTTP`.
     * @param Position Constant parameter location. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get Constant parameter default value. This parameter takes effect only when `ServiceType` is `HTTP`. 
     * @return DefaultValue Constant parameter default value. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Constant parameter default value. This parameter takes effect only when `ServiceType` is `HTTP`.
     * @param DefaultValue Constant parameter default value. This parameter takes effect only when `ServiceType` is `HTTP`.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
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

