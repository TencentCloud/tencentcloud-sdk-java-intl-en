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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesPasswordRequest extends AbstractModel {

    /**
    * List of IDs of the instances for which to set the password. You can request up to 100 instances in a region at a time.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * New password. The password of a Linux instance must contain 8–16 characters in at least two of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
The password of a Windows instance must contain 12–16 characters in at least three of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
If the instances include both Linux instances and Windows instances, the password complexity limit for Windows instances will apply.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Whether to force shut down. Default value: false.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * Username of the instance for which to reset the password, which can contain up to 64 characters. If this parameter is not specified, the password of the root user will be reset by default for Linux, and the password of the admin will be reset by default for Windows.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get List of IDs of the instances for which to set the password. You can request up to 100 instances in a region at a time. 
     * @return InstanceIdSet List of IDs of the instances for which to set the password. You can request up to 100 instances in a region at a time.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances for which to set the password. You can request up to 100 instances in a region at a time.
     * @param InstanceIdSet List of IDs of the instances for which to set the password. You can request up to 100 instances in a region at a time.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get New password. The password of a Linux instance must contain 8–16 characters in at least two of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
The password of a Windows instance must contain 12–16 characters in at least three of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
If the instances include both Linux instances and Windows instances, the password complexity limit for Windows instances will apply. 
     * @return Password New password. The password of a Linux instance must contain 8–16 characters in at least two of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
The password of a Windows instance must contain 12–16 characters in at least three of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
If the instances include both Linux instances and Windows instances, the password complexity limit for Windows instances will apply.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New password. The password of a Linux instance must contain 8–16 characters in at least two of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
The password of a Windows instance must contain 12–16 characters in at least three of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
If the instances include both Linux instances and Windows instances, the password complexity limit for Windows instances will apply.
     * @param Password New password. The password of a Linux instance must contain 8–16 characters in at least two of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
The password of a Windows instance must contain 12–16 characters in at least three of the following character types: letters, digits, and special symbols [( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /] and cannot start with `/`.
If the instances include both Linux instances and Windows instances, the password complexity limit for Windows instances will apply.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Whether to force shut down. Default value: false. 
     * @return ForceStop Whether to force shut down. Default value: false.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set Whether to force shut down. Default value: false.
     * @param ForceStop Whether to force shut down. Default value: false.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get Username of the instance for which to reset the password, which can contain up to 64 characters. If this parameter is not specified, the password of the root user will be reset by default for Linux, and the password of the admin will be reset by default for Windows. 
     * @return UserName Username of the instance for which to reset the password, which can contain up to 64 characters. If this parameter is not specified, the password of the root user will be reset by default for Linux, and the password of the admin will be reset by default for Windows.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username of the instance for which to reset the password, which can contain up to 64 characters. If this parameter is not specified, the password of the root user will be reset by default for Linux, and the password of the admin will be reset by default for Windows.
     * @param UserName Username of the instance for which to reset the password, which can contain up to 64 characters. If this parameter is not specified, the password of the root user will be reset by default for Linux, and the password of the admin will be reset by default for Windows.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ResetInstancesPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstancesPasswordRequest(ResetInstancesPasswordRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

