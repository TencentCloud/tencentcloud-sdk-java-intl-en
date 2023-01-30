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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EscapeRule extends AbstractModel{

    /**
    * Rule type   
`ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
`ESCAPE_SYSCALL`: Syscall escape.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Rule name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to enable. Valid values: `false` (no); `true` (yes).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * Rule group. Valid values: `RISK_CONTAINER` (container in risk); `PROCESS_PRIVILEGE` (program privilege escalation); `CONTAINER_ESCAPE` (container escape).
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
     * Get Rule type   
`ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
`ESCAPE_SYSCALL`: Syscall escape. 
     * @return Type Rule type   
`ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
`ESCAPE_SYSCALL`: Syscall escape.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Rule type   
`ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
`ESCAPE_SYSCALL`: Syscall escape.
     * @param Type Rule type   
`ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
`ESCAPE_SYSCALL`: Syscall escape.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Rule name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount 
     * @return Name Rule name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
     * @param Name Rule name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
     */
    public void setName(String Name) {
        this.Name = Name;
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

    /**
     * Get Rule group. Valid values: `RISK_CONTAINER` (container in risk); `PROCESS_PRIVILEGE` (program privilege escalation); `CONTAINER_ESCAPE` (container escape). 
     * @return Group Rule group. Valid values: `RISK_CONTAINER` (container in risk); `PROCESS_PRIVILEGE` (program privilege escalation); `CONTAINER_ESCAPE` (container escape).
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Rule group. Valid values: `RISK_CONTAINER` (container in risk); `PROCESS_PRIVILEGE` (program privilege escalation); `CONTAINER_ESCAPE` (container escape).
     * @param Group Rule group. Valid values: `RISK_CONTAINER` (container in risk); `PROCESS_PRIVILEGE` (program privilege escalation); `CONTAINER_ESCAPE` (container escape).
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    public EscapeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscapeRule(EscapeRule source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "Group", this.Group);

    }
}

