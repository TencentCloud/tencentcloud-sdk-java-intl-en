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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTInstanceDetail extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Mismatched domain name list
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
    * Server certificate list
    */
    @SerializedName("ServerCertIdList")
    @Expose
    private String [] ServerCertIdList;

    /**
    * Certificate list
    */
    @SerializedName("CaCertIdList")
    @Expose
    private String [] CaCertIdList;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance status 
     * @return InstanceStatus Instance status
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status
     * @param InstanceStatus Instance status
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Mismatched domain name list 
     * @return NoMatchDomains Mismatched domain name list
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set Mismatched domain name list
     * @param NoMatchDomains Mismatched domain name list
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    /**
     * Get Server certificate list 
     * @return ServerCertIdList Server certificate list
     */
    public String [] getServerCertIdList() {
        return this.ServerCertIdList;
    }

    /**
     * Set Server certificate list
     * @param ServerCertIdList Server certificate list
     */
    public void setServerCertIdList(String [] ServerCertIdList) {
        this.ServerCertIdList = ServerCertIdList;
    }

    /**
     * Get Certificate list 
     * @return CaCertIdList Certificate list
     */
    public String [] getCaCertIdList() {
        return this.CaCertIdList;
    }

    /**
     * Set Certificate list
     * @param CaCertIdList Certificate list
     */
    public void setCaCertIdList(String [] CaCertIdList) {
        this.CaCertIdList = CaCertIdList;
    }

    public MQTTInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTInstanceDetail(MQTTInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
        if (source.ServerCertIdList != null) {
            this.ServerCertIdList = new String[source.ServerCertIdList.length];
            for (int i = 0; i < source.ServerCertIdList.length; i++) {
                this.ServerCertIdList[i] = new String(source.ServerCertIdList[i]);
            }
        }
        if (source.CaCertIdList != null) {
            this.CaCertIdList = new String[source.CaCertIdList.length];
            for (int i = 0; i < source.CaCertIdList.length; i++) {
                this.CaCertIdList[i] = new String(source.CaCertIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);
        this.setParamArraySimple(map, prefix + "ServerCertIdList.", this.ServerCertIdList);
        this.setParamArraySimple(map, prefix + "CaCertIdList.", this.CaCertIdList);

    }
}

