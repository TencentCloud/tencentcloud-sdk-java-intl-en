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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRoleConfigurationRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * New permission configuration description, which contains up to 1,024 characters.
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * New session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours).
    */
    @SerializedName("NewSessionDuration")
    @Expose
    private Long NewSessionDuration;

    /**
    * New initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page.
    */
    @SerializedName("NewRelayState")
    @Expose
    private String NewRelayState;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Permission configuration ID. 
     * @return RoleConfigurationId Permission configuration ID.
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set Permission configuration ID.
     * @param RoleConfigurationId Permission configuration ID.
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get New permission configuration description, which contains up to 1,024 characters. 
     * @return NewDescription New permission configuration description, which contains up to 1,024 characters.
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set New permission configuration description, which contains up to 1,024 characters.
     * @param NewDescription New permission configuration description, which contains up to 1,024 characters.
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get New session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours). 
     * @return NewSessionDuration New session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours).
     */
    public Long getNewSessionDuration() {
        return this.NewSessionDuration;
    }

    /**
     * Set New session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours).
     * @param NewSessionDuration New session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours).
     */
    public void setNewSessionDuration(Long NewSessionDuration) {
        this.NewSessionDuration = NewSessionDuration;
    }

    /**
     * Get New initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page. 
     * @return NewRelayState New initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page.
     */
    public String getNewRelayState() {
        return this.NewRelayState;
    }

    /**
     * Set New initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page.
     * @param NewRelayState New initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page.
     */
    public void setNewRelayState(String NewRelayState) {
        this.NewRelayState = NewRelayState;
    }

    public UpdateRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRoleConfigurationRequest(UpdateRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
        if (source.NewSessionDuration != null) {
            this.NewSessionDuration = new Long(source.NewSessionDuration);
        }
        if (source.NewRelayState != null) {
            this.NewRelayState = new String(source.NewRelayState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);
        this.setParamSimple(map, prefix + "NewSessionDuration", this.NewSessionDuration);
        this.setParamSimple(map, prefix + "NewRelayState", this.NewRelayState);

    }
}

