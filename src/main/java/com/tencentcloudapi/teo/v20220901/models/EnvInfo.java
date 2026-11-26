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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInfo extends AbstractModel {

    /**
    * Environment ID.
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Environment type. Valid values:
<li>production: production environment;</li><li>staging: testing environment.</li>
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Environment status. Valid values:
<li>creating: under creation;</li>
<li>running: running steadily. Version change can be performed;</li>
<li>version_deploying: Version deployment in progress, cannot proceed with new changes.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Configuration effective range in the current environment:
<li>When the value of EnvType is production, the value of this parameter is ["ALL"], which means it takes effect globally;</li>
<li>When the value of EnvType is staging, the test node IP will be returned, which can be used to bind a host for testing.</li>
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * Versions that actually take effect for each configuration group in the current environment. According to the value of Status, there are the following two scenarios:
<li>When the value of Status is version_deploying, the value returned by this field is the version effective before the change action is executed. That is, during the new version deployment, the version actually effective is the version prior to the execution of the change action;</li>
<li>When the value of Status is running, the returned value of this field is the currently effective version.</li>
    */
    @SerializedName("CurrentConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] CurrentConfigGroupVersionInfos;

    /**
    * Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Environment ID. 
     * @return EnvId Environment ID.
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Environment ID.
     * @param EnvId Environment ID.
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Environment type. Valid values:
<li>production: production environment;</li><li>staging: testing environment.</li> 
     * @return EnvType Environment type. Valid values:
<li>production: production environment;</li><li>staging: testing environment.</li>
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Environment type. Valid values:
<li>production: production environment;</li><li>staging: testing environment.</li>
     * @param EnvType Environment type. Valid values:
<li>production: production environment;</li><li>staging: testing environment.</li>
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Environment status. Valid values:
<li>creating: under creation;</li>
<li>running: running steadily. Version change can be performed;</li>
<li>version_deploying: Version deployment in progress, cannot proceed with new changes.</li> 
     * @return Status Environment status. Valid values:
<li>creating: under creation;</li>
<li>running: running steadily. Version change can be performed;</li>
<li>version_deploying: Version deployment in progress, cannot proceed with new changes.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Environment status. Valid values:
<li>creating: under creation;</li>
<li>running: running steadily. Version change can be performed;</li>
<li>version_deploying: Version deployment in progress, cannot proceed with new changes.</li>
     * @param Status Environment status. Valid values:
<li>creating: under creation;</li>
<li>running: running steadily. Version change can be performed;</li>
<li>version_deploying: Version deployment in progress, cannot proceed with new changes.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Configuration effective range in the current environment:
<li>When the value of EnvType is production, the value of this parameter is ["ALL"], which means it takes effect globally;</li>
<li>When the value of EnvType is staging, the test node IP will be returned, which can be used to bind a host for testing.</li> 
     * @return Scope Configuration effective range in the current environment:
<li>When the value of EnvType is production, the value of this parameter is ["ALL"], which means it takes effect globally;</li>
<li>When the value of EnvType is staging, the test node IP will be returned, which can be used to bind a host for testing.</li>
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set Configuration effective range in the current environment:
<li>When the value of EnvType is production, the value of this parameter is ["ALL"], which means it takes effect globally;</li>
<li>When the value of EnvType is staging, the test node IP will be returned, which can be used to bind a host for testing.</li>
     * @param Scope Configuration effective range in the current environment:
<li>When the value of EnvType is production, the value of this parameter is ["ALL"], which means it takes effect globally;</li>
<li>When the value of EnvType is staging, the test node IP will be returned, which can be used to bind a host for testing.</li>
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Versions that actually take effect for each configuration group in the current environment. According to the value of Status, there are the following two scenarios:
<li>When the value of Status is version_deploying, the value returned by this field is the version effective before the change action is executed. That is, during the new version deployment, the version actually effective is the version prior to the execution of the change action;</li>
<li>When the value of Status is running, the returned value of this field is the currently effective version.</li> 
     * @return CurrentConfigGroupVersionInfos Versions that actually take effect for each configuration group in the current environment. According to the value of Status, there are the following two scenarios:
<li>When the value of Status is version_deploying, the value returned by this field is the version effective before the change action is executed. That is, during the new version deployment, the version actually effective is the version prior to the execution of the change action;</li>
<li>When the value of Status is running, the returned value of this field is the currently effective version.</li>
     */
    public ConfigGroupVersionInfo [] getCurrentConfigGroupVersionInfos() {
        return this.CurrentConfigGroupVersionInfos;
    }

    /**
     * Set Versions that actually take effect for each configuration group in the current environment. According to the value of Status, there are the following two scenarios:
<li>When the value of Status is version_deploying, the value returned by this field is the version effective before the change action is executed. That is, during the new version deployment, the version actually effective is the version prior to the execution of the change action;</li>
<li>When the value of Status is running, the returned value of this field is the currently effective version.</li>
     * @param CurrentConfigGroupVersionInfos Versions that actually take effect for each configuration group in the current environment. According to the value of Status, there are the following two scenarios:
<li>When the value of Status is version_deploying, the value returned by this field is the version effective before the change action is executed. That is, during the new version deployment, the version actually effective is the version prior to the execution of the change action;</li>
<li>When the value of Status is running, the returned value of this field is the currently effective version.</li>
     */
    public void setCurrentConfigGroupVersionInfos(ConfigGroupVersionInfo [] CurrentConfigGroupVersionInfos) {
        this.CurrentConfigGroupVersionInfos = CurrentConfigGroupVersionInfos;
    }

    /**
     * Get Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return CreateTime Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param CreateTime Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return UpdateTime Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param UpdateTime Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public EnvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvInfo(EnvInfo source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.CurrentConfigGroupVersionInfos != null) {
            this.CurrentConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.CurrentConfigGroupVersionInfos.length];
            for (int i = 0; i < source.CurrentConfigGroupVersionInfos.length; i++) {
                this.CurrentConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.CurrentConfigGroupVersionInfos[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamArrayObj(map, prefix + "CurrentConfigGroupVersionInfos.", this.CurrentConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

