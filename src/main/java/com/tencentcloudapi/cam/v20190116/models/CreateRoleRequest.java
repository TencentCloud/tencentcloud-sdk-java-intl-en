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

public class CreateRoleRequest extends AbstractModel{

    /**
    * Role name
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Policy document
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
    * Whether login is allowed. 1: yes, 0: no
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * The maximum validity period of the temporary key for creating a role (range: 0-43200)
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

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
     * Get Policy document 
     * @return PolicyDocument Policy document
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set Policy document
     * @param PolicyDocument Policy document
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
     * Get Whether login is allowed. 1: yes, 0: no 
     * @return ConsoleLogin Whether login is allowed. 1: yes, 0: no
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set Whether login is allowed. 1: yes, 0: no
     * @param ConsoleLogin Whether login is allowed. 1: yes, 0: no
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get The maximum validity period of the temporary key for creating a role (range: 0-43200) 
     * @return SessionDuration The maximum validity period of the temporary key for creating a role (range: 0-43200)
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set The maximum validity period of the temporary key for creating a role (range: 0-43200)
     * @param SessionDuration The maximum validity period of the temporary key for creating a role (range: 0-43200)
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    public CreateRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleRequest(CreateRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);

    }
}

