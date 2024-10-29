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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpBlockData extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
    * 
    */
    @SerializedName("UnBlockTime")
    @Expose
    private String UnBlockTime;

    /**
    * 
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 
    */
    @SerializedName("ProtectFlag")
    @Expose
    private Long ProtectFlag;

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Ip 
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 
     * @param Ip 
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get  
     * @return BlockTime 
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set 
     * @param BlockTime 
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get  
     * @return UnBlockTime 
     */
    public String getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set 
     * @param UnBlockTime 
     */
    public void setUnBlockTime(String UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * Get  
     * @return ActionType 
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 
     * @param ActionType 
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get  
     * @return ProtectFlag 
     */
    public Long getProtectFlag() {
        return this.ProtectFlag;
    }

    /**
     * Set 
     * @param ProtectFlag 
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

