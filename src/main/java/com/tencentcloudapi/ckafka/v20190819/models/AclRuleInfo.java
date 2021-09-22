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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRuleInfo extends AbstractModel{

    /**
    * ACL operation types. Enumerated values: `All` (all operations), `Read` (read), `Write` (write).
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Permission types: `Deny`, `Allow`.
    */
    @SerializedName("PermissionType")
    @Expose
    private String PermissionType;

    /**
    * The default value is `*`, which means that any host can access the topic. CKafka currently does not support specifying a host value of * or an IP range.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The list of users allowed to access the topic. Default value: `User:*`, which means all users. The current user must be in the user list. Add the prefix `User:` before the user name (`User:A`, for example).
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
     * Get ACL operation types. Enumerated values: `All` (all operations), `Read` (read), `Write` (write). 
     * @return Operation ACL operation types. Enumerated values: `All` (all operations), `Read` (read), `Write` (write).
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set ACL operation types. Enumerated values: `All` (all operations), `Read` (read), `Write` (write).
     * @param Operation ACL operation types. Enumerated values: `All` (all operations), `Read` (read), `Write` (write).
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Permission types: `Deny`, `Allow`. 
     * @return PermissionType Permission types: `Deny`, `Allow`.
     */
    public String getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set Permission types: `Deny`, `Allow`.
     * @param PermissionType Permission types: `Deny`, `Allow`.
     */
    public void setPermissionType(String PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get The default value is `*`, which means that any host can access the topic. CKafka currently does not support specifying a host value of * or an IP range. 
     * @return Host The default value is `*`, which means that any host can access the topic. CKafka currently does not support specifying a host value of * or an IP range.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The default value is `*`, which means that any host can access the topic. CKafka currently does not support specifying a host value of * or an IP range.
     * @param Host The default value is `*`, which means that any host can access the topic. CKafka currently does not support specifying a host value of * or an IP range.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The list of users allowed to access the topic. Default value: `User:*`, which means all users. The current user must be in the user list. Add the prefix `User:` before the user name (`User:A`, for example). 
     * @return Principal The list of users allowed to access the topic. Default value: `User:*`, which means all users. The current user must be in the user list. Add the prefix `User:` before the user name (`User:A`, for example).
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set The list of users allowed to access the topic. Default value: `User:*`, which means all users. The current user must be in the user list. Add the prefix `User:` before the user name (`User:A`, for example).
     * @param Principal The list of users allowed to access the topic. Default value: `User:*`, which means all users. The current user must be in the user list. Add the prefix `User:` before the user name (`User:A`, for example).
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public AclRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRuleInfo(AclRuleInfo source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new String(source.PermissionType);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Principal != null) {
            this.Principal = new String(source.Principal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Principal", this.Principal);

    }
}

