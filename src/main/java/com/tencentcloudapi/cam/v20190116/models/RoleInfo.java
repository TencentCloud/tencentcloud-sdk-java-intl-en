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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleInfo extends AbstractModel {

    /**
    * Role ID
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Role policy document
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * Role description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Time role created
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Time role last updated
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * If login is allowed for the role
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * User role. Valid values: `user`, `system`, `service_linked`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * Valid period
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * Task identifier for deleting a service-linked role 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeletionTaskId")
    @Expose
    private String DeletionTaskId;

    /**
    * Tags.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
     * Get Role ID 
     * @return RoleId Role ID
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID
     * @param RoleId Role ID
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name 
     * @return RoleName Role name
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name
     * @param RoleName Role name
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Role policy document 
     * @return PolicyDocument Role policy document
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set Role policy document
     * @param PolicyDocument Role policy document
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get Role description 
     * @return Description Role description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Role description
     * @param Description Role description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Time role created 
     * @return AddTime Time role created
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Time role created
     * @param AddTime Time role created
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Time role last updated 
     * @return UpdateTime Time role last updated
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Time role last updated
     * @param UpdateTime Time role last updated
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get If login is allowed for the role 
     * @return ConsoleLogin If login is allowed for the role
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set If login is allowed for the role
     * @param ConsoleLogin If login is allowed for the role
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get User role. Valid values: `user`, `system`, `service_linked`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RoleType User role. Valid values: `user`, `system`, `service_linked`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set User role. Valid values: `user`, `system`, `service_linked`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RoleType User role. Valid values: `user`, `system`, `service_linked`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get Valid period
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SessionDuration Valid period
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set Valid period
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SessionDuration Valid period
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get Task identifier for deleting a service-linked role 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeletionTaskId Task identifier for deleting a service-linked role 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeletionTaskId() {
        return this.DeletionTaskId;
    }

    /**
     * Set Task identifier for deleting a service-linked role 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeletionTaskId Task identifier for deleting a service-linked role 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeletionTaskId(String DeletionTaskId) {
        this.DeletionTaskId = DeletionTaskId;
    }

    /**
     * Get Tags.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Tags.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Tags.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    public RoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleInfo(RoleInfo source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
        if (source.DeletionTaskId != null) {
            this.DeletionTaskId = new String(source.DeletionTaskId);
        }
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamSimple(map, prefix + "DeletionTaskId", this.DeletionTaskId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

