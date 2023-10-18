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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogMessage extends AbstractModel {

    /**
    * Log ID
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * User pool ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Event code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * Event timestamp in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventDate")
    @Expose
    private Long EventDate;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event participant

<li> **TENANT** </li>  Tenant
<li> **USER** </li>  User
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Participant")
    @Expose
    private String Participant;

    /**
    * Application `clientId`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationClientId")
    @Expose
    private String ApplicationClientId;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Authentication source ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthSourceId")
    @Expose
    private String AuthSourceId;

    /**
    * Authentication source name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthSourceName")
    @Expose
    private String AuthSourceName;

    /**
    * Authentication source type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthSourceType")
    @Expose
    private String AuthSourceType;

    /**
    * Authentication source category
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthSourceCategory")
    @Expose
    private String AuthSourceCategory;

    /**
    * IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * User agent
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * User ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
     * Get Log ID 
     * @return LogId Log ID
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set Log ID
     * @param LogId Log ID
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get Tenant ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TenantId Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TenantId Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get User pool ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserStoreId User pool ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User pool ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserStoreId User pool ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get Event code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventCode Event code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set Event code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventCode Event code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get Event timestamp in milliseconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventDate Event timestamp in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventDate() {
        return this.EventDate;
    }

    /**
     * Set Event timestamp in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventDate Event timestamp in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventDate(Long EventDate) {
        this.EventDate = EventDate;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Event participant

<li> **TENANT** </li>  Tenant
<li> **USER** </li>  User
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Participant Event participant

<li> **TENANT** </li>  Tenant
<li> **USER** </li>  User
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParticipant() {
        return this.Participant;
    }

    /**
     * Set Event participant

<li> **TENANT** </li>  Tenant
<li> **USER** </li>  User
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Participant Event participant

<li> **TENANT** </li>  Tenant
<li> **USER** </li>  User
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParticipant(String Participant) {
        this.Participant = Participant;
    }

    /**
     * Get Application `clientId`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationClientId Application `clientId`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationClientId() {
        return this.ApplicationClientId;
    }

    /**
     * Set Application `clientId`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationClientId Application `clientId`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationClientId(String ApplicationClientId) {
        this.ApplicationClientId = ApplicationClientId;
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
     * Get Authentication source ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthSourceId Authentication source ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthSourceId() {
        return this.AuthSourceId;
    }

    /**
     * Set Authentication source ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthSourceId Authentication source ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthSourceId(String AuthSourceId) {
        this.AuthSourceId = AuthSourceId;
    }

    /**
     * Get Authentication source name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthSourceName Authentication source name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthSourceName() {
        return this.AuthSourceName;
    }

    /**
     * Set Authentication source name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthSourceName Authentication source name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthSourceName(String AuthSourceName) {
        this.AuthSourceName = AuthSourceName;
    }

    /**
     * Get Authentication source type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthSourceType Authentication source type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthSourceType() {
        return this.AuthSourceType;
    }

    /**
     * Set Authentication source type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthSourceType Authentication source type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthSourceType(String AuthSourceType) {
        this.AuthSourceType = AuthSourceType;
    }

    /**
     * Get Authentication source category
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthSourceCategory Authentication source category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthSourceCategory() {
        return this.AuthSourceCategory;
    }

    /**
     * Set Authentication source category
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthSourceCategory Authentication source category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthSourceCategory(String AuthSourceCategory) {
        this.AuthSourceCategory = AuthSourceCategory;
    }

    /**
     * Get IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ip IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ip IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get User agent
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAgent User agent
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set User agent
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAgent User agent
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get User ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public LogMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogMessage(LogMessage source) {
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventDate != null) {
            this.EventDate = new Long(source.EventDate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Participant != null) {
            this.Participant = new String(source.Participant);
        }
        if (source.ApplicationClientId != null) {
            this.ApplicationClientId = new String(source.ApplicationClientId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.AuthSourceId != null) {
            this.AuthSourceId = new String(source.AuthSourceId);
        }
        if (source.AuthSourceName != null) {
            this.AuthSourceName = new String(source.AuthSourceName);
        }
        if (source.AuthSourceType != null) {
            this.AuthSourceType = new String(source.AuthSourceType);
        }
        if (source.AuthSourceCategory != null) {
            this.AuthSourceCategory = new String(source.AuthSourceCategory);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventDate", this.EventDate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Participant", this.Participant);
        this.setParamSimple(map, prefix + "ApplicationClientId", this.ApplicationClientId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "AuthSourceId", this.AuthSourceId);
        this.setParamSimple(map, prefix + "AuthSourceName", this.AuthSourceName);
        this.setParamSimple(map, prefix + "AuthSourceType", this.AuthSourceType);
        this.setParamSimple(map, prefix + "AuthSourceCategory", this.AuthSourceCategory);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Detail", this.Detail);

    }
}

