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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationSensitiveAPIListData extends AbstractModel {

    /**
    * API ID.
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API name.
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * API request method.
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * API description.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * Creator.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modifier.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Last modified time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Superapp ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Superapp name.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Team ID.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Superapp icon.
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * API type. Valid values: 1: System; 2: Custom.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * API status. Valid values: 0: Public; 1: Restricted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
     * Get API ID. 
     * @return APIId API ID.
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set API ID.
     * @param APIId API ID.
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get API name. 
     * @return APIName API name.
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set API name.
     * @param APIName API name.
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get API request method. 
     * @return APIMethod API request method.
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set API request method.
     * @param APIMethod API request method.
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get API description. 
     * @return APIDesc API description.
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set API description.
     * @param APIDesc API description.
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    /**
     * Get Creator. 
     * @return CreateUser Creator.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator.
     * @param CreateUser Creator.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modifier. 
     * @return UpdateUser Last modifier.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Last modifier.
     * @param UpdateUser Last modifier.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Last modified time. 
     * @return UpdateTime Last modified time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time.
     * @param UpdateTime Last modified time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Superapp ID. 
     * @return ApplicationId Superapp ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID.
     * @param ApplicationId Superapp ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Superapp name. 
     * @return ApplicationName Superapp name.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Superapp name.
     * @param ApplicationName Superapp name.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Team ID. 
     * @return TeamId Team ID.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID.
     * @param TeamId Team ID.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name. 
     * @return TeamName Team name.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name.
     * @param TeamName Team name.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Superapp icon. 
     * @return ApplicationLogo Superapp icon.
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set Superapp icon.
     * @param ApplicationLogo Superapp icon.
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get API type. Valid values: 1: System; 2: Custom. 
     * @return APIType API type. Valid values: 1: System; 2: Custom.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type. Valid values: 1: System; 2: Custom.
     * @param APIType API type. Valid values: 1: System; 2: Custom.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get API status. Valid values: 0: Public; 1: Restricted. 
     * @return Status API status. Valid values: 0: Public; 1: Restricted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API status. Valid values: 0: Public; 1: Restricted.
     * @param Status API status. Valid values: 0: Public; 1: Restricted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both. 
     * @return UseScope Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.
     * @param UseScope Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.
     */
    public void setUseScope(Long UseScope) {
        this.UseScope = UseScope;
    }

    public DescribeApplicationSensitiveAPIListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationSensitiveAPIListData(DescribeApplicationSensitiveAPIListData source) {
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.APIName != null) {
            this.APIName = new String(source.APIName);
        }
        if (source.APIMethod != null) {
            this.APIMethod = new String(source.APIMethod);
        }
        if (source.APIDesc != null) {
            this.APIDesc = new String(source.APIDesc);
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
        if (source.UseScope != null) {
            this.UseScope = new Long(source.UseScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "APIName", this.APIName);
        this.setParamSimple(map, prefix + "APIMethod", this.APIMethod);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);
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
        this.setParamSimple(map, prefix + "UseScope", this.UseScope);

    }
}

