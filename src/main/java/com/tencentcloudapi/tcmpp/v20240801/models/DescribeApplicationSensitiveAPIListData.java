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

public class DescribeApplicationSensitiveAPIListData extends AbstractModel {

    /**
    * APIID
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API name
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * API request method
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * API description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

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
    * Update time
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
    * API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * API status. 0: Public; 1: Restricted
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get APIID 
     * @return APIId APIID
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set APIID
     * @param APIId APIID
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get API name 
     * @return APIName API name
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set API name
     * @param APIName API name
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get API request method 
     * @return APIMethod API request method
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set API request method
     * @param APIMethod API request method
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get API description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set API description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
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
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
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
     * Get API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get API status. 0: Public; 1: Restricted
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status API status. 0: Public; 1: Restricted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API status. 0: Public; 1: Restricted
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status API status. 0: Public; 1: Restricted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    }
}

