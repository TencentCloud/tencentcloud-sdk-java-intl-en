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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountDetail extends AbstractModel{

    /**
    * Account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Account remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Account creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Account update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Password update time
    */
    @SerializedName("PassTime")
    @Expose
    private String PassTime;

    /**
    * Internal account status, which should be `enable` normally
    */
    @SerializedName("InternalStatus")
    @Expose
    private String InternalStatus;

    /**
    * Information of read and write permissions of this account on relevant databases
    */
    @SerializedName("Dbs")
    @Expose
    private DBPrivilege [] Dbs;

    /**
    * Whether it is an admin account
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
     * Get Account name 
     * @return Name Account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account name
     * @param Name Account name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Account remarks 
     * @return Remark Account remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Account remarks
     * @param Remark Account remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Account creation time 
     * @return CreateTime Account creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Account creation time
     * @param CreateTime Account creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting 
     * @return Status Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
     * @param Status Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Account update time 
     * @return UpdateTime Account update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Account update time
     * @param UpdateTime Account update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Password update time 
     * @return PassTime Password update time
     */
    public String getPassTime() {
        return this.PassTime;
    }

    /**
     * Set Password update time
     * @param PassTime Password update time
     */
    public void setPassTime(String PassTime) {
        this.PassTime = PassTime;
    }

    /**
     * Get Internal account status, which should be `enable` normally 
     * @return InternalStatus Internal account status, which should be `enable` normally
     */
    public String getInternalStatus() {
        return this.InternalStatus;
    }

    /**
     * Set Internal account status, which should be `enable` normally
     * @param InternalStatus Internal account status, which should be `enable` normally
     */
    public void setInternalStatus(String InternalStatus) {
        this.InternalStatus = InternalStatus;
    }

    /**
     * Get Information of read and write permissions of this account on relevant databases 
     * @return Dbs Information of read and write permissions of this account on relevant databases
     */
    public DBPrivilege [] getDbs() {
        return this.Dbs;
    }

    /**
     * Set Information of read and write permissions of this account on relevant databases
     * @param Dbs Information of read and write permissions of this account on relevant databases
     */
    public void setDbs(DBPrivilege [] Dbs) {
        this.Dbs = Dbs;
    }

    /**
     * Get Whether it is an admin account 
     * @return IsAdmin Whether it is an admin account
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set Whether it is an admin account
     * @param IsAdmin Whether it is an admin account
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public AccountDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountDetail(AccountDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PassTime != null) {
            this.PassTime = new String(source.PassTime);
        }
        if (source.InternalStatus != null) {
            this.InternalStatus = new String(source.InternalStatus);
        }
        if (source.Dbs != null) {
            this.Dbs = new DBPrivilege[source.Dbs.length];
            for (int i = 0; i < source.Dbs.length; i++) {
                this.Dbs[i] = new DBPrivilege(source.Dbs[i]);
            }
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PassTime", this.PassTime);
        this.setParamSimple(map, prefix + "InternalStatus", this.InternalStatus);
        this.setParamArrayObj(map, prefix + "Dbs.", this.Dbs);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);

    }
}

