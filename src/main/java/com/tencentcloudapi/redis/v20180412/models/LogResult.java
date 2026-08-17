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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogResult extends AbstractModel {

    /**
    * <p>Database ID</p>
    */
    @SerializedName("DBId")
    @Expose
    private Long DBId;

    /**
    * <p>Command delay (ms)</p>
    */
    @SerializedName("CommandLatency")
    @Expose
    private Long CommandLatency;

    /**
    * <p>Creation time (Format: 2006-01-02 15:04:05.000)</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>client address</p>
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Command type</p>
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * <p>Cache code, backend redis node</p>
    */
    @SerializedName("CacheCode")
    @Expose
    private String CacheCode;

    /**
    * <p>Command details</p>
    */
    @SerializedName("CommandDetail")
    @Expose
    private String CommandDetail;

    /**
    * <p>Error information</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>Database ID</p> 
     * @return DBId <p>Database ID</p>
     */
    public Long getDBId() {
        return this.DBId;
    }

    /**
     * Set <p>Database ID</p>
     * @param DBId <p>Database ID</p>
     */
    public void setDBId(Long DBId) {
        this.DBId = DBId;
    }

    /**
     * Get <p>Command delay (ms)</p> 
     * @return CommandLatency <p>Command delay (ms)</p>
     */
    public Long getCommandLatency() {
        return this.CommandLatency;
    }

    /**
     * Set <p>Command delay (ms)</p>
     * @param CommandLatency <p>Command delay (ms)</p>
     */
    public void setCommandLatency(Long CommandLatency) {
        this.CommandLatency = CommandLatency;
    }

    /**
     * Get <p>Creation time (Format: 2006-01-02 15:04:05.000)</p> 
     * @return Timestamp <p>Creation time (Format: 2006-01-02 15:04:05.000)</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Creation time (Format: 2006-01-02 15:04:05.000)</p>
     * @param Timestamp <p>Creation time (Format: 2006-01-02 15:04:05.000)</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>client address</p> 
     * @return ClientAddr <p>client address</p>
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set <p>client address</p>
     * @param ClientAddr <p>client address</p>
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get <p>Username.</p> 
     * @return UserName <p>Username.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
     * @param UserName <p>Username.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Command type</p> 
     * @return CommandType <p>Command type</p>
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set <p>Command type</p>
     * @param CommandType <p>Command type</p>
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get <p>Cache code, backend redis node</p> 
     * @return CacheCode <p>Cache code, backend redis node</p>
     */
    public String getCacheCode() {
        return this.CacheCode;
    }

    /**
     * Set <p>Cache code, backend redis node</p>
     * @param CacheCode <p>Cache code, backend redis node</p>
     */
    public void setCacheCode(String CacheCode) {
        this.CacheCode = CacheCode;
    }

    /**
     * Get <p>Command details</p> 
     * @return CommandDetail <p>Command details</p>
     */
    public String getCommandDetail() {
        return this.CommandDetail;
    }

    /**
     * Set <p>Command details</p>
     * @param CommandDetail <p>Command details</p>
     */
    public void setCommandDetail(String CommandDetail) {
        this.CommandDetail = CommandDetail;
    }

    /**
     * Get <p>Error information</p> 
     * @return ErrMsg <p>Error information</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Error information</p>
     * @param ErrMsg <p>Error information</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public LogResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogResult(LogResult source) {
        if (source.DBId != null) {
            this.DBId = new Long(source.DBId);
        }
        if (source.CommandLatency != null) {
            this.CommandLatency = new Long(source.CommandLatency);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.CacheCode != null) {
            this.CacheCode = new String(source.CacheCode);
        }
        if (source.CommandDetail != null) {
            this.CommandDetail = new String(source.CommandDetail);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBId", this.DBId);
        this.setParamSimple(map, prefix + "CommandLatency", this.CommandLatency);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "CacheCode", this.CacheCode);
        this.setParamSimple(map, prefix + "CommandDetail", this.CommandDetail);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

