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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SensitiveApiInfoResp extends AbstractModel {

    /**
    * APIID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API name
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API method
    */
    @SerializedName("ApiMethod")
    @Expose
    private String ApiMethod;

    /**
    * API description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * Creator
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Updater
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update date
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Team ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Application icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * API type 1 - System API 2 Custom API
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * API status 0 Public 1 Restricted
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get APIID 
     * @return ApiId APIID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set APIID
     * @param ApiId APIID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API name 
     * @return ApiName API name
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
     * @param ApiName API name
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API method 
     * @return ApiMethod API method
     */
    public String getApiMethod() {
        return this.ApiMethod;
    }

    /**
     * Set API method
     * @param ApiMethod API method
     */
    public void setApiMethod(String ApiMethod) {
        this.ApiMethod = ApiMethod;
    }

    /**
     * Get API description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get Creator 
     * @return CreateUser Creator
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
     * @param CreateUser Creator
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Updater 
     * @return UpdateUser Updater
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updater
     * @param UpdateUser Updater
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update date 
     * @return UpdateTime Update date
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update date
     * @param UpdateTime Update date
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Team ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Application icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationLogo Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationLogo Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get API type 1 - System API 2 Custom API
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIType API type 1 - System API 2 Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type 1 - System API 2 Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIType API type 1 - System API 2 Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get API status 0 Public 1 Restricted
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status API status 0 Public 1 Restricted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API status 0 Public 1 Restricted
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status API status 0 Public 1 Restricted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SensitiveApiInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SensitiveApiInfoResp(SensitiveApiInfoResp source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiMethod != null) {
            this.ApiMethod = new String(source.ApiMethod);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.ApplicationLogo != null) {
            this.ApplicationLogo = new String(source.ApplicationLogo);
        }
        if (source.APIType != null) {
            this.APIType = new Long(source.APIType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiMethod", this.ApiMethod);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "ApplicationLogo", this.ApplicationLogo);
        this.setParamSimple(map, prefix + "APIType", this.APIType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

