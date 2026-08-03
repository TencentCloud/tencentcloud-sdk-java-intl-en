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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel {

    /**
    * <p>Database account name.</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>host</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Database account description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Maximum user connections</p>
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
    * <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
    */
    @SerializedName("PasswordRotation")
    @Expose
    private Long PasswordRotation;

    /**
     * Get <p>Database account name.</p> 
     * @return AccountName <p>Database account name.</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Database account name.</p>
     * @param AccountName <p>Database account name.</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>host</p> 
     * @return Host <p>host</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>host</p>
     * @param Host <p>host</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Database account description.</p> 
     * @return Description <p>Database account description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Database account description.</p>
     * @param Description <p>Database account description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Maximum user connections</p> 
     * @return MaxUserConnections <p>Maximum user connections</p>
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set <p>Maximum user connections</p>
     * @param MaxUserConnections <p>Maximum user connections</p>
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    /**
     * Get <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p> 
     * @return PasswordRotation <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
     */
    public Long getPasswordRotation() {
        return this.PasswordRotation;
    }

    /**
     * Set <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
     * @param PasswordRotation <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
     */
    public void setPasswordRotation(Long PasswordRotation) {
        this.PasswordRotation = PasswordRotation;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
        if (source.PasswordRotation != null) {
            this.PasswordRotation = new Long(source.PasswordRotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);
        this.setParamSimple(map, prefix + "PasswordRotation", this.PasswordRotation);

    }
}

