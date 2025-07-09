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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReqParameter extends AbstractModel {

    /**
    * API frontend parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Position of the API frontend parameter, such as the header. Supported values: `header`, `query`, and `path`.
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * API frontend parameter type, such as `String` and `int`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Default value of API frontend parameter.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Whether the API frontend parameter is required. True: yes; False: no.
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * API frontend parameter remarks.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get API frontend parameter name. 
     * @return Name API frontend parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API frontend parameter name.
     * @param Name API frontend parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Position of the API frontend parameter, such as the header. Supported values: `header`, `query`, and `path`. 
     * @return Position Position of the API frontend parameter, such as the header. Supported values: `header`, `query`, and `path`.
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set Position of the API frontend parameter, such as the header. Supported values: `header`, `query`, and `path`.
     * @param Position Position of the API frontend parameter, such as the header. Supported values: `header`, `query`, and `path`.
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get API frontend parameter type, such as `String` and `int`. 
     * @return Type API frontend parameter type, such as `String` and `int`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set API frontend parameter type, such as `String` and `int`.
     * @param Type API frontend parameter type, such as `String` and `int`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Default value of API frontend parameter. 
     * @return DefaultValue Default value of API frontend parameter.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value of API frontend parameter.
     * @param DefaultValue Default value of API frontend parameter.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Whether the API frontend parameter is required. True: yes; False: no. 
     * @return Required Whether the API frontend parameter is required. True: yes; False: no.
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set Whether the API frontend parameter is required. True: yes; False: no.
     * @param Required Whether the API frontend parameter is required. True: yes; False: no.
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get API frontend parameter remarks. 
     * @return Desc API frontend parameter remarks.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set API frontend parameter remarks.
     * @param Desc API frontend parameter remarks.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public ReqParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReqParameter(ReqParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

