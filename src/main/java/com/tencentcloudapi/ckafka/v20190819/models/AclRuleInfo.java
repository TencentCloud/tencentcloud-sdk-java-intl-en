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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRuleInfo extends AbstractModel {

    /**
    * ACL operation types. Enumerated values: `All` (all operations), `Read` (read), `Write` (write).
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Permission type. Deny: Deny. Allow: permission.
    */
    @SerializedName("PermissionType")
    @Expose
    private String PermissionType;

    /**
    * Indicates any host is accessible in the entire region.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The User. User:* means any User is accessible in the entire region. the current User can only be the User in the list of users. the input format requires the [User:] prefix. for example, for User A, input User:A.
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
     * Get Permission type. Deny: Deny. Allow: permission. 
     * @return PermissionType Permission type. Deny: Deny. Allow: permission.
     */
    public String getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set Permission type. Deny: Deny. Allow: permission.
     * @param PermissionType Permission type. Deny: Deny. Allow: permission.
     */
    public void setPermissionType(String PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get Indicates any host is accessible in the entire region. 
     * @return Host Indicates any host is accessible in the entire region.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Indicates any host is accessible in the entire region.
     * @param Host Indicates any host is accessible in the entire region.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The User. User:* means any User is accessible in the entire region. the current User can only be the User in the list of users. the input format requires the [User:] prefix. for example, for User A, input User:A. 
     * @return Principal The User. User:* means any User is accessible in the entire region. the current User can only be the User in the list of users. the input format requires the [User:] prefix. for example, for User A, input User:A.
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set The User. User:* means any User is accessible in the entire region. the current User can only be the User in the list of users. the input format requires the [User:] prefix. for example, for User A, input User:A.
     * @param Principal The User. User:* means any User is accessible in the entire region. the current User can only be the User in the list of users. the input format requires the [User:] prefix. for example, for User A, input User:A.
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

