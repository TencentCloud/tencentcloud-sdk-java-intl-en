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

public class RequestParameter extends AbstractModel{

    /**
    * Request parameter name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Parameter position
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * Parameter type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Default value
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Whether it is required
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
     * Get Request parameter name 
     * @return Name Request parameter name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Request parameter name
     * @param Name Request parameter name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Parameter position 
     * @return Position Parameter position
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set Parameter position
     * @param Position Parameter position
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get Parameter type 
     * @return Type Parameter type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter type
     * @param Type Parameter type
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Whether it is required 
     * @return Required Whether it is required
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set Whether it is required
     * @param Required Whether it is required
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    public RequestParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestParameter(RequestParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Required", this.Required);

    }
}

