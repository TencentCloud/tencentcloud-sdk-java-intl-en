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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RolePrivilege extends AbstractModel {

    /**
    * id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivilegeId")
    @Expose
    private String PrivilegeId;

    /**
    * Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivilegeName")
    @Expose
    private String PrivilegeName;

    /**
    * Path

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestPath")
    @Expose
    private String RestPath;

    /**
    * Method.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestMethod")
    @Expose
    private String RestMethod;

    /**
    * Description

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Module ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Permission type: N, R, RW, RWD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivilegeId id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivilegeId() {
        return this.PrivilegeId;
    }

    /**
     * Set id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivilegeId id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivilegeId(String PrivilegeId) {
        this.PrivilegeId = PrivilegeId;
    }

    /**
     * Get Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivilegeName Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivilegeName() {
        return this.PrivilegeName;
    }

    /**
     * Set Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivilegeName Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivilegeName(String PrivilegeName) {
        this.PrivilegeName = PrivilegeName;
    }

    /**
     * Get Path

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RestPath Path

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRestPath() {
        return this.RestPath;
    }

    /**
     * Set Path

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RestPath Path

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestPath(String RestPath) {
        this.RestPath = RestPath;
    }

    /**
     * Get Method.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RestMethod Method.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRestMethod() {
        return this.RestMethod;
    }

    /**
     * Set Method.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RestMethod Method.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestMethod(String RestMethod) {
        this.RestMethod = RestMethod;
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
     * Get Module ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModuleId Module ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Module ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModuleId Module ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Permission type: N, R, RW, RWD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Permission type: N, R, RW, RWD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Permission type: N, R, RW, RWD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Permission type: N, R, RW, RWD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RolePrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePrivilege(RolePrivilege source) {
        if (source.PrivilegeId != null) {
            this.PrivilegeId = new String(source.PrivilegeId);
        }
        if (source.PrivilegeName != null) {
            this.PrivilegeName = new String(source.PrivilegeName);
        }
        if (source.RestPath != null) {
            this.RestPath = new String(source.RestPath);
        }
        if (source.RestMethod != null) {
            this.RestMethod = new String(source.RestMethod);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivilegeId", this.PrivilegeId);
        this.setParamSimple(map, prefix + "PrivilegeName", this.PrivilegeName);
        this.setParamSimple(map, prefix + "RestPath", this.RestPath);
        this.setParamSimple(map, prefix + "RestMethod", this.RestMethod);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

