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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpBlockData extends AbstractModel {

    /**
    * Status (Blocked: Blocked; UnBlocking: Unblocking; UnBlockFailed: Unblock failed)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Resource IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Blocking Time
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
    * Unblock Time (Estimated Unblock Time)
    */
    @SerializedName("UnBlockTime")
    @Expose
    private String UnBlockTime;

    /**
    * Unblock type (user: self-service unblocking; auto: automatic unblocking; update: upgrade unblocking; bind: Anti-DDoS Pro binding unblocking)
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Anti-DDoS flag, 0: non-Anti-DDoS, 1: Anti-DDoS
    */
    @SerializedName("ProtectFlag")
    @Expose
    private Long ProtectFlag;

    /**
     * Get Status (Blocked: Blocked; UnBlocking: Unblocking; UnBlockFailed: Unblock failed) 
     * @return Status Status (Blocked: Blocked; UnBlocking: Unblocking; UnBlockFailed: Unblock failed)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status (Blocked: Blocked; UnBlocking: Unblocking; UnBlockFailed: Unblock failed)
     * @param Status Status (Blocked: Blocked; UnBlocking: Unblocking; UnBlockFailed: Unblock failed)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Resource IP 
     * @return Ip Resource IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Resource IP
     * @param Ip Resource IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Blocking Time 
     * @return BlockTime Blocking Time
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set Blocking Time
     * @param BlockTime Blocking Time
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get Unblock Time (Estimated Unblock Time) 
     * @return UnBlockTime Unblock Time (Estimated Unblock Time)
     */
    public String getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set Unblock Time (Estimated Unblock Time)
     * @param UnBlockTime Unblock Time (Estimated Unblock Time)
     */
    public void setUnBlockTime(String UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * Get Unblock type (user: self-service unblocking; auto: automatic unblocking; update: upgrade unblocking; bind: Anti-DDoS Pro binding unblocking) 
     * @return ActionType Unblock type (user: self-service unblocking; auto: automatic unblocking; update: upgrade unblocking; bind: Anti-DDoS Pro binding unblocking)
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Unblock type (user: self-service unblocking; auto: automatic unblocking; update: upgrade unblocking; bind: Anti-DDoS Pro binding unblocking)
     * @param ActionType Unblock type (user: self-service unblocking; auto: automatic unblocking; update: upgrade unblocking; bind: Anti-DDoS Pro binding unblocking)
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Anti-DDoS flag, 0: non-Anti-DDoS, 1: Anti-DDoS 
     * @return ProtectFlag Anti-DDoS flag, 0: non-Anti-DDoS, 1: Anti-DDoS
     */
    public Long getProtectFlag() {
        return this.ProtectFlag;
    }

    /**
     * Set Anti-DDoS flag, 0: non-Anti-DDoS, 1: Anti-DDoS
     * @param ProtectFlag Anti-DDoS flag, 0: non-Anti-DDoS, 1: Anti-DDoS
     */
    public void setProtectFlag(Long ProtectFlag) {
        this.ProtectFlag = ProtectFlag;
    }

    public IpBlockData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpBlockData(IpBlockData source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new String(source.BlockTime);
        }
        if (source.UnBlockTime != null) {
            this.UnBlockTime = new String(source.UnBlockTime);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ProtectFlag != null) {
            this.ProtectFlag = new Long(source.ProtectFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ProtectFlag", this.ProtectFlag);

    }
}

