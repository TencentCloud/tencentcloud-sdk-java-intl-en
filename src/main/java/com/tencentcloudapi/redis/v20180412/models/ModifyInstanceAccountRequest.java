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

public class ModifyInstanceAccountRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sub-account name. If the root account is to be modified, enter `root`.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Sub-account password
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * Sub-account description information
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Routing policy. Valid values: master (master node); replication (replica node)
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * Sub-account read/write policy. Valid values: r (read-only); w (write-only); rw (read/write).
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * true: make the root account password-free. This is applicable to root accounts only. Sub-accounts cannot be made password-free.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sub-account name. If the root account is to be modified, enter `root`. 
     * @return AccountName Sub-account name. If the root account is to be modified, enter `root`.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Sub-account name. If the root account is to be modified, enter `root`.
     * @param AccountName Sub-account name. If the root account is to be modified, enter `root`.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Sub-account password 
     * @return AccountPassword Sub-account password
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set Sub-account password
     * @param AccountPassword Sub-account password
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get Sub-account description information 
     * @return Remark Sub-account description information
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-account description information
     * @param Remark Sub-account description information
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Routing policy. Valid values: master (master node); replication (replica node) 
     * @return ReadonlyPolicy Routing policy. Valid values: master (master node); replication (replica node)
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set Routing policy. Valid values: master (master node); replication (replica node)
     * @param ReadonlyPolicy Routing policy. Valid values: master (master node); replication (replica node)
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get Sub-account read/write policy. Valid values: r (read-only); w (write-only); rw (read/write). 
     * @return Privilege Sub-account read/write policy. Valid values: r (read-only); w (write-only); rw (read/write).
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Sub-account read/write policy. Valid values: r (read-only); w (write-only); rw (read/write).
     * @param Privilege Sub-account read/write policy. Valid values: r (read-only); w (write-only); rw (read/write).
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get true: make the root account password-free. This is applicable to root accounts only. Sub-accounts cannot be made password-free. 
     * @return NoAuth true: make the root account password-free. This is applicable to root accounts only. Sub-accounts cannot be made password-free.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set true: make the root account password-free. This is applicable to root accounts only. Sub-accounts cannot be made password-free.
     * @param NoAuth true: make the root account password-free. This is applicable to root accounts only. Sub-accounts cannot be made password-free.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    public ModifyInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAccountRequest(ModifyInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

