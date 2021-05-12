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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyAccountPrivilegesRequest extends AbstractModel{

    /**
    * Instance ID in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Source username
    */
    @SerializedName("SrcUserName")
    @Expose
    private String SrcUserName;

    /**
    * Access host allowed for a source user
    */
    @SerializedName("SrcHost")
    @Expose
    private String SrcHost;

    /**
    * Target username
    */
    @SerializedName("DstUserName")
    @Expose
    private String DstUserName;

    /**
    * Access host allowed for a target user
    */
    @SerializedName("DstHost")
    @Expose
    private String DstHost;

    /**
    * `ReadOnly` attribute of a source account
    */
    @SerializedName("SrcReadOnly")
    @Expose
    private String SrcReadOnly;

    /**
    * `ReadOnly` attribute of a target account
    */
    @SerializedName("DstReadOnly")
    @Expose
    private String DstReadOnly;

    /**
     * Get Instance ID in the format of dcdbt-ow728lmc. 
     * @return InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of dcdbt-ow728lmc.
     * @param InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Source username 
     * @return SrcUserName Source username
     */
    public String getSrcUserName() {
        return this.SrcUserName;
    }

    /**
     * Set Source username
     * @param SrcUserName Source username
     */
    public void setSrcUserName(String SrcUserName) {
        this.SrcUserName = SrcUserName;
    }

    /**
     * Get Access host allowed for a source user 
     * @return SrcHost Access host allowed for a source user
     */
    public String getSrcHost() {
        return this.SrcHost;
    }

    /**
     * Set Access host allowed for a source user
     * @param SrcHost Access host allowed for a source user
     */
    public void setSrcHost(String SrcHost) {
        this.SrcHost = SrcHost;
    }

    /**
     * Get Target username 
     * @return DstUserName Target username
     */
    public String getDstUserName() {
        return this.DstUserName;
    }

    /**
     * Set Target username
     * @param DstUserName Target username
     */
    public void setDstUserName(String DstUserName) {
        this.DstUserName = DstUserName;
    }

    /**
     * Get Access host allowed for a target user 
     * @return DstHost Access host allowed for a target user
     */
    public String getDstHost() {
        return this.DstHost;
    }

    /**
     * Set Access host allowed for a target user
     * @param DstHost Access host allowed for a target user
     */
    public void setDstHost(String DstHost) {
        this.DstHost = DstHost;
    }

    /**
     * Get `ReadOnly` attribute of a source account 
     * @return SrcReadOnly `ReadOnly` attribute of a source account
     */
    public String getSrcReadOnly() {
        return this.SrcReadOnly;
    }

    /**
     * Set `ReadOnly` attribute of a source account
     * @param SrcReadOnly `ReadOnly` attribute of a source account
     */
    public void setSrcReadOnly(String SrcReadOnly) {
        this.SrcReadOnly = SrcReadOnly;
    }

    /**
     * Get `ReadOnly` attribute of a target account 
     * @return DstReadOnly `ReadOnly` attribute of a target account
     */
    public String getDstReadOnly() {
        return this.DstReadOnly;
    }

    /**
     * Set `ReadOnly` attribute of a target account
     * @param DstReadOnly `ReadOnly` attribute of a target account
     */
    public void setDstReadOnly(String DstReadOnly) {
        this.DstReadOnly = DstReadOnly;
    }

    public CopyAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAccountPrivilegesRequest(CopyAccountPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SrcUserName != null) {
            this.SrcUserName = new String(source.SrcUserName);
        }
        if (source.SrcHost != null) {
            this.SrcHost = new String(source.SrcHost);
        }
        if (source.DstUserName != null) {
            this.DstUserName = new String(source.DstUserName);
        }
        if (source.DstHost != null) {
            this.DstHost = new String(source.DstHost);
        }
        if (source.SrcReadOnly != null) {
            this.SrcReadOnly = new String(source.SrcReadOnly);
        }
        if (source.DstReadOnly != null) {
            this.DstReadOnly = new String(source.DstReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcUserName", this.SrcUserName);
        this.setParamSimple(map, prefix + "SrcHost", this.SrcHost);
        this.setParamSimple(map, prefix + "DstUserName", this.DstUserName);
        this.setParamSimple(map, prefix + "DstHost", this.DstHost);
        this.setParamSimple(map, prefix + "SrcReadOnly", this.SrcReadOnly);
        this.setParamSimple(map, prefix + "DstReadOnly", this.DstReadOnly);

    }
}

