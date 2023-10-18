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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpBlockData extends AbstractModel {

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Status (Blocked: blocked, UnBlocking: unblocking, UnBlockFailed: unblocking failed)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Blocked time
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
    * Unblocked time (estimated)
    */
    @SerializedName("UnBlockTime")
    @Expose
    private String UnBlockTime;

    /**
    * Type of the unblocking action (`user`: self-service unblocking, `auto`: automatic unblocking, `update`: unblocking by service upgrading, `bind`: unblocking by binding Anti-DDoS Pro instance)
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Status (Blocked: blocked, UnBlocking: unblocking, UnBlockFailed: unblocking failed) 
     * @return Status Status (Blocked: blocked, UnBlocking: unblocking, UnBlockFailed: unblocking failed)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status (Blocked: blocked, UnBlocking: unblocking, UnBlockFailed: unblocking failed)
     * @param Status Status (Blocked: blocked, UnBlocking: unblocking, UnBlockFailed: unblocking failed)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Blocked time 
     * @return BlockTime Blocked time
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set Blocked time
     * @param BlockTime Blocked time
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get Unblocked time (estimated) 
     * @return UnBlockTime Unblocked time (estimated)
     */
    public String getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set Unblocked time (estimated)
     * @param UnBlockTime Unblocked time (estimated)
     */
    public void setUnBlockTime(String UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * Get Type of the unblocking action (`user`: self-service unblocking, `auto`: automatic unblocking, `update`: unblocking by service upgrading, `bind`: unblocking by binding Anti-DDoS Pro instance) 
     * @return ActionType Type of the unblocking action (`user`: self-service unblocking, `auto`: automatic unblocking, `update`: unblocking by service upgrading, `bind`: unblocking by binding Anti-DDoS Pro instance)
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Type of the unblocking action (`user`: self-service unblocking, `auto`: automatic unblocking, `update`: unblocking by service upgrading, `bind`: unblocking by binding Anti-DDoS Pro instance)
     * @param ActionType Type of the unblocking action (`user`: self-service unblocking, `auto`: automatic unblocking, `update`: unblocking by service upgrading, `bind`: unblocking by binding Anti-DDoS Pro instance)
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public IpBlockData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpBlockData(IpBlockData source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

