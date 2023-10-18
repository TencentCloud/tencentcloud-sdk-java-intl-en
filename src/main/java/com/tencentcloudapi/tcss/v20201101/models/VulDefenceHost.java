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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceHost extends AbstractModel {

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server IP, which is the private IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Server QUuid
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Public IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * First enablement time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Server IP, which is the private IP 
     * @return HostIP Server IP, which is the private IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP, which is the private IP
     * @param HostIP Server IP, which is the private IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Server QUuid 
     * @return HostID Server QUuid
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server QUuid
     * @param HostID Server QUuid
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended). 
     * @return Status Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
     * @param Status Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Public IP 
     * @return PublicIP Public IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP
     * @param PublicIP Public IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get First enablement time 
     * @return CreateTime First enablement time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First enablement time
     * @param CreateTime First enablement time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return ModifyTime Update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
     * @param ModifyTime Update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public VulDefenceHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceHost(VulDefenceHost source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

