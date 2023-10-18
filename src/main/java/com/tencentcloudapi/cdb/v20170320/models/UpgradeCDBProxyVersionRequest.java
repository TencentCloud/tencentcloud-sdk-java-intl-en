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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeCDBProxyVersionRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database proxy ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Current version of database proxy
    */
    @SerializedName("SrcProxyVersion")
    @Expose
    private String SrcProxyVersion;

    /**
    * Target version of database proxy
    */
    @SerializedName("DstProxyVersion")
    @Expose
    private String DstProxyVersion;

    /**
    * Upgrade time. Valid values: `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time)
    */
    @SerializedName("UpgradeTime")
    @Expose
    private String UpgradeTime;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database proxy ID 
     * @return ProxyGroupId Database proxy ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database proxy ID
     * @param ProxyGroupId Database proxy ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Current version of database proxy 
     * @return SrcProxyVersion Current version of database proxy
     */
    public String getSrcProxyVersion() {
        return this.SrcProxyVersion;
    }

    /**
     * Set Current version of database proxy
     * @param SrcProxyVersion Current version of database proxy
     */
    public void setSrcProxyVersion(String SrcProxyVersion) {
        this.SrcProxyVersion = SrcProxyVersion;
    }

    /**
     * Get Target version of database proxy 
     * @return DstProxyVersion Target version of database proxy
     */
    public String getDstProxyVersion() {
        return this.DstProxyVersion;
    }

    /**
     * Set Target version of database proxy
     * @param DstProxyVersion Target version of database proxy
     */
    public void setDstProxyVersion(String DstProxyVersion) {
        this.DstProxyVersion = DstProxyVersion;
    }

    /**
     * Get Upgrade time. Valid values: `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time) 
     * @return UpgradeTime Upgrade time. Valid values: `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time)
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set Upgrade time. Valid values: `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time)
     * @param UpgradeTime Upgrade time. Valid values: `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time)
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    public UpgradeCDBProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeCDBProxyVersionRequest(UpgradeCDBProxyVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.SrcProxyVersion != null) {
            this.SrcProxyVersion = new String(source.SrcProxyVersion);
        }
        if (source.DstProxyVersion != null) {
            this.DstProxyVersion = new String(source.DstProxyVersion);
        }
        if (source.UpgradeTime != null) {
            this.UpgradeTime = new String(source.UpgradeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "SrcProxyVersion", this.SrcProxyVersion);
        this.setParamSimple(map, prefix + "DstProxyVersion", this.DstProxyVersion);
        this.setParamSimple(map, prefix + "UpgradeTime", this.UpgradeTime);

    }
}

