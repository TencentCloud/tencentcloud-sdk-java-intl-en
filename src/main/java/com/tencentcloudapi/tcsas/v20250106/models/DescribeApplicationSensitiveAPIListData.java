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
    * <p>APIID</p>
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * <p>API name.</p>
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * <p>API method.</p>
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * <p>API description.</p>
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modifier.</p>
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>Last modified time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Superapp ID.</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Superapp name.</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Superapp icon.</p>
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * <p>API type. Valid values: 1: System; 2: Custom.</p>
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * <p>API status. Valid values: 0: Public; 1: Restricted.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.</p>
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
     * Get <p>APIID</p> 
     * @return APIId <p>APIID</p>
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set <p>APIID</p>
     * @param APIId <p>APIID</p>
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get <p>API name.</p> 
     * @return APIName <p>API name.</p>
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set <p>API name.</p>
     * @param APIName <p>API name.</p>
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get <p>API method.</p> 
     * @return APIMethod <p>API method.</p>
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set <p>API method.</p>
     * @param APIMethod <p>API method.</p>
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get <p>API description.</p> 
     * @return APIDesc <p>API description.</p>
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set <p>API description.</p>
     * @param APIDesc <p>API description.</p>
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modifier.</p> 
     * @return UpdateUser <p>Last modifier.</p>
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>Last modifier.</p>
     * @param UpdateUser <p>Last modifier.</p>
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>Last modified time.</p> 
     * @return UpdateTime <p>Last modified time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last modified time.</p>
     * @param UpdateTime <p>Last modified time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Superapp ID.</p> 
     * @return ApplicationId <p>Superapp ID.</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID.</p>
     * @param ApplicationId <p>Superapp ID.</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Superapp name.</p> 
     * @return ApplicationName <p>Superapp name.</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name.</p>
     * @param ApplicationName <p>Superapp name.</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>Team ID.</p> 
     * @return TeamId <p>Team ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Team ID.</p>
     * @param TeamId <p>Team ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Team name.</p> 
     * @return TeamName <p>Team name.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param TeamName <p>Team name.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Superapp icon.</p> 
     * @return ApplicationLogo <p>Superapp icon.</p>
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set <p>Superapp icon.</p>
     * @param ApplicationLogo <p>Superapp icon.</p>
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get <p>API type. Valid values: 1: System; 2: Custom.</p> 
     * @return APIType <p>API type. Valid values: 1: System; 2: Custom.</p>
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set <p>API type. Valid values: 1: System; 2: Custom.</p>
     * @param APIType <p>API type. Valid values: 1: System; 2: Custom.</p>
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get <p>API status. Valid values: 0: Public; 1: Restricted.</p> 
     * @return Status <p>API status. Valid values: 0: Public; 1: Restricted.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>API status. Valid values: 0: Public; 1: Restricted.</p>
     * @param Status <p>API status. Valid values: 0: Public; 1: Restricted.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.</p> 
     * @return UseScope <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.</p>
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.</p>
     * @param UseScope <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Both.</p>
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

