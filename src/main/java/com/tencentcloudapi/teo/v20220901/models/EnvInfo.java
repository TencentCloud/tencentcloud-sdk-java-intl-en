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
<li>production: Production environment.</li><li> staging: Test environment. </li>
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Environment status. Valid values: 
<li>creating: Being created.</li>
<li>running: The environment is stable, with version changes allowed.</li>
<li>version_deploying: The version is currently being deployed, with no more changes allowed. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Effective scope of the configuration in the current environment. Valid values: 
<li>ALL: It takes effect on the entire network when EnvType is set to production.</li>
<li>It returns the IP address of the test node for host binding during testing when EnvType is set to staging. </li>
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * For the effective versions of each configuration group in the current environment, there are two possible scenarios based on the value of Status: 
<li>When Status is set to version_deploying, the returned value of this field represents the previously effective version. In other words, during the deployment of the new version, the effective version is the one that was in effect before any changes were made.</li>
<li>When Status is set to running, the value returned by this field is the currently effective version. </li>
    */
    @SerializedName("CurrentConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] CurrentConfigGroupVersionInfos;

    /**
    * Creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
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
<li>production: Production environment.</li><li> staging: Test environment. </li> 
     * @return EnvType Environment type. Valid values: 
<li>production: Production environment.</li><li> staging: Test environment. </li>
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Environment type. Valid values: 
<li>production: Production environment.</li><li> staging: Test environment. </li>
     * @param EnvType Environment type. Valid values: 
<li>production: Production environment.</li><li> staging: Test environment. </li>
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Environment status. Valid values: 
<li>creating: Being created.</li>
<li>running: The environment is stable, with version changes allowed.</li>
<li>version_deploying: The version is currently being deployed, with no more changes allowed. </li> 
     * @return Status Environment status. Valid values: 
<li>creating: Being created.</li>
<li>running: The environment is stable, with version changes allowed.</li>
<li>version_deploying: The version is currently being deployed, with no more changes allowed. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Environment status. Valid values: 
<li>creating: Being created.</li>
<li>running: The environment is stable, with version changes allowed.</li>
<li>version_deploying: The version is currently being deployed, with no more changes allowed. </li>
     * @param Status Environment status. Valid values: 
<li>creating: Being created.</li>
<li>running: The environment is stable, with version changes allowed.</li>
<li>version_deploying: The version is currently being deployed, with no more changes allowed. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Effective scope of the configuration in the current environment. Valid values: 
<li>ALL: It takes effect on the entire network when EnvType is set to production.</li>
<li>It returns the IP address of the test node for host binding during testing when EnvType is set to staging. </li> 
     * @return Scope Effective scope of the configuration in the current environment. Valid values: 
<li>ALL: It takes effect on the entire network when EnvType is set to production.</li>
<li>It returns the IP address of the test node for host binding during testing when EnvType is set to staging. </li>
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set Effective scope of the configuration in the current environment. Valid values: 
<li>ALL: It takes effect on the entire network when EnvType is set to production.</li>
<li>It returns the IP address of the test node for host binding during testing when EnvType is set to staging. </li>
     * @param Scope Effective scope of the configuration in the current environment. Valid values: 
<li>ALL: It takes effect on the entire network when EnvType is set to production.</li>
<li>It returns the IP address of the test node for host binding during testing when EnvType is set to staging. </li>
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get For the effective versions of each configuration group in the current environment, there are two possible scenarios based on the value of Status: 
<li>When Status is set to version_deploying, the returned value of this field represents the previously effective version. In other words, during the deployment of the new version, the effective version is the one that was in effect before any changes were made.</li>
<li>When Status is set to running, the value returned by this field is the currently effective version. </li> 
     * @return CurrentConfigGroupVersionInfos For the effective versions of each configuration group in the current environment, there are two possible scenarios based on the value of Status: 
<li>When Status is set to version_deploying, the returned value of this field represents the previously effective version. In other words, during the deployment of the new version, the effective version is the one that was in effect before any changes were made.</li>
<li>When Status is set to running, the value returned by this field is the currently effective version. </li>
     */
    public ConfigGroupVersionInfo [] getCurrentConfigGroupVersionInfos() {
        return this.CurrentConfigGroupVersionInfos;
    }

    /**
     * Set For the effective versions of each configuration group in the current environment, there are two possible scenarios based on the value of Status: 
<li>When Status is set to version_deploying, the returned value of this field represents the previously effective version. In other words, during the deployment of the new version, the effective version is the one that was in effect before any changes were made.</li>
<li>When Status is set to running, the value returned by this field is the currently effective version. </li>
     * @param CurrentConfigGroupVersionInfos For the effective versions of each configuration group in the current environment, there are two possible scenarios based on the value of Status: 
<li>When Status is set to version_deploying, the returned value of this field represents the previously effective version. In other words, during the deployment of the new version, the effective version is the one that was in effect before any changes were made.</li>
<li>When Status is set to running, the value returned by this field is the currently effective version. </li>
     */
    public void setCurrentConfigGroupVersionInfos(ConfigGroupVersionInfo [] CurrentConfigGroupVersionInfos) {
        this.CurrentConfigGroupVersionInfos = CurrentConfigGroupVersionInfos;
    }

    /**
     * Get Creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC). 
     * @return CreateTime Creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     * @param CreateTime Creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC). 
     * @return UpdateTime Update time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     * @param UpdateTime Update time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
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

