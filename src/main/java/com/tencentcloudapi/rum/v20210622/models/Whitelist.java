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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Whitelist extends AbstractModel{

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * End time
    */
    @SerializedName("Ttl")
    @Expose
    private String Ttl;

    /**
    * Auto-Increment allowlist ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Unique business identifier
    */
    @SerializedName("WhitelistUin")
    @Expose
    private String WhitelistUin;

    /**
    * Creator ID
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * aid
    */
    @SerializedName("Aid")
    @Expose
    private String Aid;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get End time 
     * @return Ttl End time
     */
    public String getTtl() {
        return this.Ttl;
    }

    /**
     * Set End time
     * @param Ttl End time
     */
    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get Auto-Increment allowlist ID 
     * @return ID Auto-Increment allowlist ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Auto-Increment allowlist ID
     * @param ID Auto-Increment allowlist ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Unique business identifier 
     * @return WhitelistUin Unique business identifier
     */
    public String getWhitelistUin() {
        return this.WhitelistUin;
    }

    /**
     * Set Unique business identifier
     * @param WhitelistUin Unique business identifier
     */
    public void setWhitelistUin(String WhitelistUin) {
        this.WhitelistUin = WhitelistUin;
    }

    /**
     * Get Creator ID 
     * @return CreateUser Creator ID
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator ID
     * @param CreateUser Creator ID
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get aid 
     * @return Aid aid
     */
    public String getAid() {
        return this.Aid;
    }

    /**
     * Set aid
     * @param Aid aid
     */
    public void setAid(String Aid) {
        this.Aid = Aid;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Whitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Whitelist(Whitelist source) {
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Ttl != null) {
            this.Ttl = new String(source.Ttl);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.WhitelistUin != null) {
            this.WhitelistUin = new String(source.WhitelistUin);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.Aid != null) {
            this.Aid = new String(source.Aid);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "WhitelistUin", this.WhitelistUin);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "Aid", this.Aid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

