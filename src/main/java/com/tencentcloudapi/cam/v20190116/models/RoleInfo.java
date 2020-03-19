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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleInfo extends AbstractModel{

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
    * User role. Valid values: user, system
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

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
     * Get User role. Valid values: user, system
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RoleType User role. Valid values: user, system
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set User role. Valid values: user, system
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RoleType User role. Valid values: user, system
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get  
     * @return SessionDuration 
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set 
     * @param SessionDuration 
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
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

    }
}

