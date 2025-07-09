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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBAccount extends AbstractModel {

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Host from which a user can log in (corresponding to the `host` field for a MySQL user; a user is uniquely identified by username and host; this parameter is in IP format and ends with % for IP range; % can be entered; if this parameter is left empty, % will be used by default).
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * User remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last updated time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Read-only flag. 0: no; 1: for the account's SQL requests, the replica will be used first, and if it is unavailable, the source will be used; 2: the replica will be used first, and if it is unavailable, the operation will fail.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * If the replica delay exceeds the set value of this parameter, the replica will be considered to have failed.
Set this parameter to a value above 10. This parameter takes effect when `ReadOnly` is 1 or 2.
    */
    @SerializedName("DelayThresh")
    @Expose
    private Long DelayThresh;

    /**
    * Whether to specify a replica server for read-only account. Valid values: `0` (No replica server is specified, which means that the proxy will select another available replica server to keep connection with the client if the current replica server doesn’t meet the requirement). `1` (The replica server is specified, which means that the connection will be disconnected if the specified replica server doesn’t meet the requirement.)
    */
    @SerializedName("SlaveConst")
    @Expose
    private Long SlaveConst;

    /**
    * Maximum number of connections. `0` indicates no limit.	
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Host from which a user can log in (corresponding to the `host` field for a MySQL user; a user is uniquely identified by username and host; this parameter is in IP format and ends with % for IP range; % can be entered; if this parameter is left empty, % will be used by default). 
     * @return Host Host from which a user can log in (corresponding to the `host` field for a MySQL user; a user is uniquely identified by username and host; this parameter is in IP format and ends with % for IP range; % can be entered; if this parameter is left empty, % will be used by default).
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host from which a user can log in (corresponding to the `host` field for a MySQL user; a user is uniquely identified by username and host; this parameter is in IP format and ends with % for IP range; % can be entered; if this parameter is left empty, % will be used by default).
     * @param Host Host from which a user can log in (corresponding to the `host` field for a MySQL user; a user is uniquely identified by username and host; this parameter is in IP format and ends with % for IP range; % can be entered; if this parameter is left empty, % will be used by default).
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get User remarks 
     * @return Description User remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User remarks
     * @param Description User remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    /**
     * Get Last updated time 
     * @return UpdateTime Last updated time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last updated time
     * @param UpdateTime Last updated time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Read-only flag. 0: no; 1: for the account's SQL requests, the replica will be used first, and if it is unavailable, the source will be used; 2: the replica will be used first, and if it is unavailable, the operation will fail. 
     * @return ReadOnly Read-only flag. 0: no; 1: for the account's SQL requests, the replica will be used first, and if it is unavailable, the source will be used; 2: the replica will be used first, and if it is unavailable, the operation will fail.
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Read-only flag. 0: no; 1: for the account's SQL requests, the replica will be used first, and if it is unavailable, the source will be used; 2: the replica will be used first, and if it is unavailable, the operation will fail.
     * @param ReadOnly Read-only flag. 0: no; 1: for the account's SQL requests, the replica will be used first, and if it is unavailable, the source will be used; 2: the replica will be used first, and if it is unavailable, the operation will fail.
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get If the replica delay exceeds the set value of this parameter, the replica will be considered to have failed.
Set this parameter to a value above 10. This parameter takes effect when `ReadOnly` is 1 or 2. 
     * @return DelayThresh If the replica delay exceeds the set value of this parameter, the replica will be considered to have failed.
Set this parameter to a value above 10. This parameter takes effect when `ReadOnly` is 1 or 2.
     */
    public Long getDelayThresh() {
        return this.DelayThresh;
    }

    /**
     * Set If the replica delay exceeds the set value of this parameter, the replica will be considered to have failed.
Set this parameter to a value above 10. This parameter takes effect when `ReadOnly` is 1 or 2.
     * @param DelayThresh If the replica delay exceeds the set value of this parameter, the replica will be considered to have failed.
Set this parameter to a value above 10. This parameter takes effect when `ReadOnly` is 1 or 2.
     */
    public void setDelayThresh(Long DelayThresh) {
        this.DelayThresh = DelayThresh;
    }

    /**
     * Get Whether to specify a replica server for read-only account. Valid values: `0` (No replica server is specified, which means that the proxy will select another available replica server to keep connection with the client if the current replica server doesn’t meet the requirement). `1` (The replica server is specified, which means that the connection will be disconnected if the specified replica server doesn’t meet the requirement.) 
     * @return SlaveConst Whether to specify a replica server for read-only account. Valid values: `0` (No replica server is specified, which means that the proxy will select another available replica server to keep connection with the client if the current replica server doesn’t meet the requirement). `1` (The replica server is specified, which means that the connection will be disconnected if the specified replica server doesn’t meet the requirement.)
     */
    public Long getSlaveConst() {
        return this.SlaveConst;
    }

    /**
     * Set Whether to specify a replica server for read-only account. Valid values: `0` (No replica server is specified, which means that the proxy will select another available replica server to keep connection with the client if the current replica server doesn’t meet the requirement). `1` (The replica server is specified, which means that the connection will be disconnected if the specified replica server doesn’t meet the requirement.)
     * @param SlaveConst Whether to specify a replica server for read-only account. Valid values: `0` (No replica server is specified, which means that the proxy will select another available replica server to keep connection with the client if the current replica server doesn’t meet the requirement). `1` (The replica server is specified, which means that the connection will be disconnected if the specified replica server doesn’t meet the requirement.)
     */
    public void setSlaveConst(Long SlaveConst) {
        this.SlaveConst = SlaveConst;
    }

    /**
     * Get Maximum number of connections. `0` indicates no limit.	 
     * @return MaxUserConnections Maximum number of connections. `0` indicates no limit.	
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set Maximum number of connections. `0` indicates no limit.	
     * @param MaxUserConnections Maximum number of connections. `0` indicates no limit.	
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public DBAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBAccount(DBAccount source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
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
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.DelayThresh != null) {
            this.DelayThresh = new Long(source.DelayThresh);
        }
        if (source.SlaveConst != null) {
            this.SlaveConst = new Long(source.SlaveConst);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "DelayThresh", this.DelayThresh);
        this.setParamSimple(map, prefix + "SlaveConst", this.SlaveConst);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

