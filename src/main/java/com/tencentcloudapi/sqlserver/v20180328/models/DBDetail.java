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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBDetail extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Character set
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Database creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Database status. 1: creating, 2: running, 3: modifying, -1: dropping
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Database account permission information
    */
    @SerializedName("Accounts")
    @Expose
    private AccountPrivilege [] Accounts;

    /**
    * Internal status. ONLINE: running
    */
    @SerializedName("InternalStatus")
    @Expose
    private String InternalStatus;

    /**
    * TDE status. Valid values: `enable` (enabled), `disable` (disabled).
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Character set 
     * @return Charset Character set
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Character set
     * @param Charset Character set
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Database creation time 
     * @return CreateTime Database creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Database creation time
     * @param CreateTime Database creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Database status. 1: creating, 2: running, 3: modifying, -1: dropping 
     * @return Status Database status. 1: creating, 2: running, 3: modifying, -1: dropping
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Database status. 1: creating, 2: running, 3: modifying, -1: dropping
     * @param Status Database status. 1: creating, 2: running, 3: modifying, -1: dropping
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Database account permission information 
     * @return Accounts Database account permission information
     */
    public AccountPrivilege [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set Database account permission information
     * @param Accounts Database account permission information
     */
    public void setAccounts(AccountPrivilege [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Internal status. ONLINE: running 
     * @return InternalStatus Internal status. ONLINE: running
     */
    public String getInternalStatus() {
        return this.InternalStatus;
    }

    /**
     * Set Internal status. ONLINE: running
     * @param InternalStatus Internal status. ONLINE: running
     */
    public void setInternalStatus(String InternalStatus) {
        this.InternalStatus = InternalStatus;
    }

    /**
     * Get TDE status. Valid values: `enable` (enabled), `disable` (disabled). 
     * @return Encryption TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     * @param Encryption TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    public DBDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBDetail(DBDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Accounts != null) {
            this.Accounts = new AccountPrivilege[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new AccountPrivilege(source.Accounts[i]);
            }
        }
        if (source.InternalStatus != null) {
            this.InternalStatus = new String(source.InternalStatus);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "InternalStatus", this.InternalStatus);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);

    }
}

