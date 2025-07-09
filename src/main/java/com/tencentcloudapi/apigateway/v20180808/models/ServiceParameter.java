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

public class ServiceParameter extends AbstractModel {

    /**
    * API backend service parameter name, which is used only if `ServiceType` is `HTTP`. The frontend and backend parameter names can be different.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Position of API backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`. The positions of frontend and backend parameters can be different.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * Position of the API frontend parameter corresponding to the backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelevantRequestParameterPosition")
    @Expose
    private String RelevantRequestParameterPosition;

    /**
    * Name of the API frontend parameter corresponding to the backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelevantRequestParameterName")
    @Expose
    private String RelevantRequestParameterName;

    /**
    * Default value of API backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * API backend service parameter remarks, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelevantRequestParameterDesc")
    @Expose
    private String RelevantRequestParameterDesc;

    /**
    * API backend service parameter type, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelevantRequestParameterType")
    @Expose
    private String RelevantRequestParameterType;

    /**
     * Get API backend service parameter name, which is used only if `ServiceType` is `HTTP`. The frontend and backend parameter names can be different.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name API backend service parameter name, which is used only if `ServiceType` is `HTTP`. The frontend and backend parameter names can be different.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API backend service parameter name, which is used only if `ServiceType` is `HTTP`. The frontend and backend parameter names can be different.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name API backend service parameter name, which is used only if `ServiceType` is `HTTP`. The frontend and backend parameter names can be different.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Position of API backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`. The positions of frontend and backend parameters can be different.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Position Position of API backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`. The positions of frontend and backend parameters can be different.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set Position of API backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`. The positions of frontend and backend parameters can be different.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Position Position of API backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`. The positions of frontend and backend parameters can be different.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get Position of the API frontend parameter corresponding to the backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelevantRequestParameterPosition Position of the API frontend parameter corresponding to the backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRelevantRequestParameterPosition() {
        return this.RelevantRequestParameterPosition;
    }

    /**
     * Set Position of the API frontend parameter corresponding to the backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelevantRequestParameterPosition Position of the API frontend parameter corresponding to the backend service parameter, such as `head`, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRelevantRequestParameterPosition(String RelevantRequestParameterPosition) {
        this.RelevantRequestParameterPosition = RelevantRequestParameterPosition;
    }

    /**
     * Get Name of the API frontend parameter corresponding to the backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelevantRequestParameterName Name of the API frontend parameter corresponding to the backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRelevantRequestParameterName() {
        return this.RelevantRequestParameterName;
    }

    /**
     * Set Name of the API frontend parameter corresponding to the backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelevantRequestParameterName Name of the API frontend parameter corresponding to the backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRelevantRequestParameterName(String RelevantRequestParameterName) {
        this.RelevantRequestParameterName = RelevantRequestParameterName;
    }

    /**
     * Get Default value of API backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DefaultValue Default value of API backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value of API backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DefaultValue Default value of API backend service parameter, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get API backend service parameter remarks, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelevantRequestParameterDesc API backend service parameter remarks, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRelevantRequestParameterDesc() {
        return this.RelevantRequestParameterDesc;
    }

    /**
     * Set API backend service parameter remarks, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelevantRequestParameterDesc API backend service parameter remarks, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRelevantRequestParameterDesc(String RelevantRequestParameterDesc) {
        this.RelevantRequestParameterDesc = RelevantRequestParameterDesc;
    }

    /**
     * Get API backend service parameter type, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelevantRequestParameterType API backend service parameter type, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRelevantRequestParameterType() {
        return this.RelevantRequestParameterType;
    }

    /**
     * Set API backend service parameter type, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelevantRequestParameterType API backend service parameter type, which is used only if `ServiceType` is `HTTP`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRelevantRequestParameterType(String RelevantRequestParameterType) {
        this.RelevantRequestParameterType = RelevantRequestParameterType;
    }

    public ServiceParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceParameter(ServiceParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.RelevantRequestParameterPosition != null) {
            this.RelevantRequestParameterPosition = new String(source.RelevantRequestParameterPosition);
        }
        if (source.RelevantRequestParameterName != null) {
            this.RelevantRequestParameterName = new String(source.RelevantRequestParameterName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.RelevantRequestParameterDesc != null) {
            this.RelevantRequestParameterDesc = new String(source.RelevantRequestParameterDesc);
        }
        if (source.RelevantRequestParameterType != null) {
            this.RelevantRequestParameterType = new String(source.RelevantRequestParameterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "RelevantRequestParameterPosition", this.RelevantRequestParameterPosition);
        this.setParamSimple(map, prefix + "RelevantRequestParameterName", this.RelevantRequestParameterName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "RelevantRequestParameterDesc", this.RelevantRequestParameterDesc);
        this.setParamSimple(map, prefix + "RelevantRequestParameterType", this.RelevantRequestParameterType);

    }
}

