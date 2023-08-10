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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentRoleSet extends AbstractModel{

    /**
    * The IDs of the bound namespaces cannot be delicate and the namespaces must contain resources
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Permissions to be bound to a namespace. Enumerated values: `consume`, `produce`, and `consume, produce`. This parameter cannot be left empty.

Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
     * Get The IDs of the bound namespaces cannot be delicate and the namespaces must contain resources
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentId The IDs of the bound namespaces cannot be delicate and the namespaces must contain resources
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set The IDs of the bound namespaces cannot be delicate and the namespaces must contain resources
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentId The IDs of the bound namespaces cannot be delicate and the namespaces must contain resources
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Permissions to be bound to a namespace. Enumerated values: `consume`, `produce`, and `consume, produce`. This parameter cannot be left empty.

Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Permissions Permissions to be bound to a namespace. Enumerated values: `consume`, `produce`, and `consume, produce`. This parameter cannot be left empty.

Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Permissions to be bound to a namespace. Enumerated values: `consume`, `produce`, and `consume, produce`. This parameter cannot be left empty.

Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Permissions Permissions to be bound to a namespace. Enumerated values: `consume`, `produce`, and `consume, produce`. This parameter cannot be left empty.

Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    public EnvironmentRoleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentRoleSet(EnvironmentRoleSet source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);

    }
}

