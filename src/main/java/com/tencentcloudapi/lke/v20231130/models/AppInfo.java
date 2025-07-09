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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppInfo extends AbstractModel {

    /**
    * Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Application type description.
    */
    @SerializedName("AppTypeDesc")
    @Expose
    private String AppTypeDesc;

    /**
    * Application ID.
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * Application name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Application avatar.
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * Application description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Application status. 1: offline; 2: running; 3: disabled.
    */
    @SerializedName("AppStatus")
    @Expose
    private Long AppStatus;

    /**
    * Status description.
    */
    @SerializedName("AppStatusDesc")
    @Expose
    private String AppStatusDesc;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last modifier.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Model name.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Alias of the generative model.
    */
    @SerializedName("ModelAliasName")
    @Expose
    private String ModelAliasName;

    /**
    * Application mode: standard; agent; single_workflow.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Alias of the thought model.
    */
    @SerializedName("ThoughtModelAliasName")
    @Expose
    private String ThoughtModelAliasName;

    /**
     * Get Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction. 
     * @return AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     * @param AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Application type description. 
     * @return AppTypeDesc Application type description.
     */
    public String getAppTypeDesc() {
        return this.AppTypeDesc;
    }

    /**
     * Set Application type description.
     * @param AppTypeDesc Application type description.
     */
    public void setAppTypeDesc(String AppTypeDesc) {
        this.AppTypeDesc = AppTypeDesc;
    }

    /**
     * Get Application ID. 
     * @return AppBizId Application ID.
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set Application ID.
     * @param AppBizId Application ID.
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get Application name. 
     * @return Name Application name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Application name.
     * @param Name Application name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Application avatar. 
     * @return Avatar Application avatar.
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set Application avatar.
     * @param Avatar Application avatar.
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get Application description. 
     * @return Desc Application description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Application description.
     * @param Desc Application description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Application status. 1: offline; 2: running; 3: disabled. 
     * @return AppStatus Application status. 1: offline; 2: running; 3: disabled.
     */
    public Long getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set Application status. 1: offline; 2: running; 3: disabled.
     * @param AppStatus Application status. 1: offline; 2: running; 3: disabled.
     */
    public void setAppStatus(Long AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get Status description. 
     * @return AppStatusDesc Status description.
     */
    public String getAppStatusDesc() {
        return this.AppStatusDesc;
    }

    /**
     * Set Status description.
     * @param AppStatusDesc Status description.
     */
    public void setAppStatusDesc(String AppStatusDesc) {
        this.AppStatusDesc = AppStatusDesc;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last modifier. 
     * @return Operator Last modifier.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Last modifier.
     * @param Operator Last modifier.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Model name. 
     * @return ModelName Model name.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
     * @param ModelName Model name.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Alias of the generative model. 
     * @return ModelAliasName Alias of the generative model.
     */
    public String getModelAliasName() {
        return this.ModelAliasName;
    }

    /**
     * Set Alias of the generative model.
     * @param ModelAliasName Alias of the generative model.
     */
    public void setModelAliasName(String ModelAliasName) {
        this.ModelAliasName = ModelAliasName;
    }

    /**
     * Get Application mode: standard; agent; single_workflow. 
     * @return Pattern Application mode: standard; agent; single_workflow.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Application mode: standard; agent; single_workflow.
     * @param Pattern Application mode: standard; agent; single_workflow.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Alias of the thought model. 
     * @return ThoughtModelAliasName Alias of the thought model.
     */
    public String getThoughtModelAliasName() {
        return this.ThoughtModelAliasName;
    }

    /**
     * Set Alias of the thought model.
     * @param ThoughtModelAliasName Alias of the thought model.
     */
    public void setThoughtModelAliasName(String ThoughtModelAliasName) {
        this.ThoughtModelAliasName = ThoughtModelAliasName;
    }

    public AppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppInfo(AppInfo source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppTypeDesc != null) {
            this.AppTypeDesc = new String(source.AppTypeDesc);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Long(source.AppStatus);
        }
        if (source.AppStatusDesc != null) {
            this.AppStatusDesc = new String(source.AppStatusDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelAliasName != null) {
            this.ModelAliasName = new String(source.ModelAliasName);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.ThoughtModelAliasName != null) {
            this.ThoughtModelAliasName = new String(source.ThoughtModelAliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppTypeDesc", this.AppTypeDesc);
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "AppStatusDesc", this.AppStatusDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelAliasName", this.ModelAliasName);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "ThoughtModelAliasName", this.ThoughtModelAliasName);

    }
}

