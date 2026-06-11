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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EscapeRuleEnabled extends AbstractModel {

    /**
    * Rule type
ESCAPE_CGROUPS: Escape by using the cgroup mechanism
ESCAPE_TAMPER_SENSITIVE_FILE: Escape by tampering with sensitive files
ESCAPE_DOCKER_API: Escape by accessing the Docker API
ESCAPE_VUL_OCCURRED: Escape vulnerability exploitation.
MOUNT_SENSITIVE_PATH: MOUNT SENSITIVE path
PRIVILEGE_CONTAINER_START: Privilege container
PRIVILEGE: Escape by program privilege escalation
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether to enable. Valid values: `false` (no); `true` (yes).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
     * Get Rule type
ESCAPE_CGROUPS: Escape by using the cgroup mechanism
ESCAPE_TAMPER_SENSITIVE_FILE: Escape by tampering with sensitive files
ESCAPE_DOCKER_API: Escape by accessing the Docker API
ESCAPE_VUL_OCCURRED: Escape vulnerability exploitation.
MOUNT_SENSITIVE_PATH: MOUNT SENSITIVE path
PRIVILEGE_CONTAINER_START: Privilege container
PRIVILEGE: Escape by program privilege escalation 
     * @return Type Rule type
ESCAPE_CGROUPS: Escape by using the cgroup mechanism
ESCAPE_TAMPER_SENSITIVE_FILE: Escape by tampering with sensitive files
ESCAPE_DOCKER_API: Escape by accessing the Docker API
ESCAPE_VUL_OCCURRED: Escape vulnerability exploitation.
MOUNT_SENSITIVE_PATH: MOUNT SENSITIVE path
PRIVILEGE_CONTAINER_START: Privilege container
PRIVILEGE: Escape by program privilege escalation
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Rule type
ESCAPE_CGROUPS: Escape by using the cgroup mechanism
ESCAPE_TAMPER_SENSITIVE_FILE: Escape by tampering with sensitive files
ESCAPE_DOCKER_API: Escape by accessing the Docker API
ESCAPE_VUL_OCCURRED: Escape vulnerability exploitation.
MOUNT_SENSITIVE_PATH: MOUNT SENSITIVE path
PRIVILEGE_CONTAINER_START: Privilege container
PRIVILEGE: Escape by program privilege escalation
     * @param Type Rule type
ESCAPE_CGROUPS: Escape by using the cgroup mechanism
ESCAPE_TAMPER_SENSITIVE_FILE: Escape by tampering with sensitive files
ESCAPE_DOCKER_API: Escape by accessing the Docker API
ESCAPE_VUL_OCCURRED: Escape vulnerability exploitation.
MOUNT_SENSITIVE_PATH: MOUNT SENSITIVE path
PRIVILEGE_CONTAINER_START: Privilege container
PRIVILEGE: Escape by program privilege escalation
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to enable. Valid values: `false` (no); `true` (yes). 
     * @return IsEnable Whether to enable. Valid values: `false` (no); `true` (yes).
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Whether to enable. Valid values: `false` (no); `true` (yes).
     * @param IsEnable Whether to enable. Valid values: `false` (no); `true` (yes).
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public EscapeRuleEnabled() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscapeRuleEnabled(EscapeRuleEnabled source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);

    }
}

