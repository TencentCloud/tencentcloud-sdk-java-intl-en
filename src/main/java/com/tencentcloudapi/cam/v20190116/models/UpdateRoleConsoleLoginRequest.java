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

public class UpdateRoleConsoleLoginRequest extends AbstractModel{

    /**
    * Whether login is allowed. 1: yes, 0: no
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * Role ID
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * Role name
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

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
     * Get Role ID 
     * @return RoleId Role ID
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID
     * @param RoleId Role ID
     */
    public void setRoleId(Long RoleId) {
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

    public UpdateRoleConsoleLoginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRoleConsoleLoginRequest(UpdateRoleConsoleLoginRequest source) {
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

