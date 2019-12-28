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
    * If login is allowed
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

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
     * Get If login is allowed 
     * @return ConsoleLogin If login is allowed
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set If login is allowed
     * @param ConsoleLogin If login is allowed
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);

    }
}

