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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceAccountRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Custom the name of the database to access.
- Contains only letters, digits, underscores, and hyphens.
- The length cannot exceed 32 characters.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Set a password for the customized account. The password complexity requirements are as follows:
- Value range: [8, 32].
- Contains at least two types of characters from the following categories: lowercase letters, uppercase letters, digits, and characters ()`~!@#$%^&*-+=_|{}[]:;<>,.? /.- Cannot start with "/".

    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * The read requests for the designated account are routed to either the master node or replica nodes. If the Read-Only Replica is not enabled, the selection of replica nodes is not supported.
- master: Master node.- replication: Replica node.
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * The read/write permission of the account supports the selection of read-only and read/write permissions.
- r: read-only
- rw: Read/Write permission.
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * Sub-account description information, with a length of [0, 64] bytes, supports Chinese characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Custom the name of the database to access.
- Contains only letters, digits, underscores, and hyphens.
- The length cannot exceed 32 characters. 
     * @return AccountName Custom the name of the database to access.
- Contains only letters, digits, underscores, and hyphens.
- The length cannot exceed 32 characters.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Custom the name of the database to access.
- Contains only letters, digits, underscores, and hyphens.
- The length cannot exceed 32 characters.
     * @param AccountName Custom the name of the database to access.
- Contains only letters, digits, underscores, and hyphens.
- The length cannot exceed 32 characters.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Set a password for the customized account. The password complexity requirements are as follows:
- Value range: [8, 32].
- Contains at least two types of characters from the following categories: lowercase letters, uppercase letters, digits, and characters ()`~!@#$%^&*-+=_|{}[]:;<>,.? /.- Cannot start with "/".
 
     * @return AccountPassword Set a password for the customized account. The password complexity requirements are as follows:
- Value range: [8, 32].
- Contains at least two types of characters from the following categories: lowercase letters, uppercase letters, digits, and characters ()`~!@#$%^&*-+=_|{}[]:;<>,.? /.- Cannot start with "/".

     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set Set a password for the customized account. The password complexity requirements are as follows:
- Value range: [8, 32].
- Contains at least two types of characters from the following categories: lowercase letters, uppercase letters, digits, and characters ()`~!@#$%^&*-+=_|{}[]:;<>,.? /.- Cannot start with "/".

     * @param AccountPassword Set a password for the customized account. The password complexity requirements are as follows:
- Value range: [8, 32].
- Contains at least two types of characters from the following categories: lowercase letters, uppercase letters, digits, and characters ()`~!@#$%^&*-+=_|{}[]:;<>,.? /.- Cannot start with "/".

     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get The read requests for the designated account are routed to either the master node or replica nodes. If the Read-Only Replica is not enabled, the selection of replica nodes is not supported.
- master: Master node.- replication: Replica node. 
     * @return ReadonlyPolicy The read requests for the designated account are routed to either the master node or replica nodes. If the Read-Only Replica is not enabled, the selection of replica nodes is not supported.
- master: Master node.- replication: Replica node.
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set The read requests for the designated account are routed to either the master node or replica nodes. If the Read-Only Replica is not enabled, the selection of replica nodes is not supported.
- master: Master node.- replication: Replica node.
     * @param ReadonlyPolicy The read requests for the designated account are routed to either the master node or replica nodes. If the Read-Only Replica is not enabled, the selection of replica nodes is not supported.
- master: Master node.- replication: Replica node.
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get The read/write permission of the account supports the selection of read-only and read/write permissions.
- r: read-only
- rw: Read/Write permission. 
     * @return Privilege The read/write permission of the account supports the selection of read-only and read/write permissions.
- r: read-only
- rw: Read/Write permission.
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set The read/write permission of the account supports the selection of read-only and read/write permissions.
- r: read-only
- rw: Read/Write permission.
     * @param Privilege The read/write permission of the account supports the selection of read-only and read/write permissions.
- r: read-only
- rw: Read/Write permission.
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Sub-account description information, with a length of [0, 64] bytes, supports Chinese characters. 
     * @return Remark Sub-account description information, with a length of [0, 64] bytes, supports Chinese characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-account description information, with a length of [0, 64] bytes, supports Chinese characters.
     * @param Remark Sub-account description information, with a length of [0, 64] bytes, supports Chinese characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceAccountRequest(CreateInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

