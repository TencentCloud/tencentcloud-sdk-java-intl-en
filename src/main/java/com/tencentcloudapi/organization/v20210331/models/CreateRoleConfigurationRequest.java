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

public class CreateRoleConfigurationRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Permission configuration name, which contains up to 128 characters, including English letters, digits, and hyphens (-).
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * Permission configuration description, which contains up to 1,024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours). Default: 3600 (1 hour).
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * Initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page. The default value is empty, representing a redirection to the home page of the Tencent Cloud console.
    */
    @SerializedName("RelayState")
    @Expose
    private String RelayState;

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
     * Get Permission configuration name, which contains up to 128 characters, including English letters, digits, and hyphens (-). 
     * @return RoleConfigurationName Permission configuration name, which contains up to 128 characters, including English letters, digits, and hyphens (-).
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set Permission configuration name, which contains up to 128 characters, including English letters, digits, and hyphens (-).
     * @param RoleConfigurationName Permission configuration name, which contains up to 128 characters, including English letters, digits, and hyphens (-).
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get Permission configuration description, which contains up to 1,024 characters. 
     * @return Description Permission configuration description, which contains up to 1,024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Permission configuration description, which contains up to 1,024 characters.
     * @param Description Permission configuration description, which contains up to 1,024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours). Default: 3600 (1 hour). 
     * @return SessionDuration Session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours). Default: 3600 (1 hour).
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set Session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours). Default: 3600 (1 hour).
     * @param SessionDuration Session duration, in seconds. It is the maximum time a CIC user can maintain a session while using permission configurations to access a target account in TCO. Value range: 900 to 43200 (15 minutes to 12 hours). Default: 3600 (1 hour).
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get Initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page. The default value is empty, representing a redirection to the home page of the Tencent Cloud console. 
     * @return RelayState Initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page. The default value is empty, representing a redirection to the home page of the Tencent Cloud console.
     */
    public String getRelayState() {
        return this.RelayState;
    }

    /**
     * Set Initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page. The default value is empty, representing a redirection to the home page of the Tencent Cloud console.
     * @param RelayState Initial access page. It is the initial page address when a CIC user uses permission configurations to access a target account in TCO. This page must be a Tencent Cloud console page. The default value is empty, representing a redirection to the home page of the Tencent Cloud console.
     */
    public void setRelayState(String RelayState) {
        this.RelayState = RelayState;
    }

    public CreateRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleConfigurationRequest(CreateRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
        if (source.RelayState != null) {
            this.RelayState = new String(source.RelayState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamSimple(map, prefix + "RelayState", this.RelayState);

    }
}

