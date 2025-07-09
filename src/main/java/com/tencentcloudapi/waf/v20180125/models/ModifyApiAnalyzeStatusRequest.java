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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApiAnalyzeStatusRequest extends AbstractModel {

    /**
    * Enabling status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of entities to be bulk enabled
    */
    @SerializedName("TargetList")
    @Expose
    private TargetEntity [] TargetList;

    /**
     * Get Enabling status 
     * @return Status Enabling status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling status
     * @param Status Enabling status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

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
     * Get List of entities to be bulk enabled 
     * @return TargetList List of entities to be bulk enabled
     */
    public TargetEntity [] getTargetList() {
        return this.TargetList;
    }

    /**
     * Set List of entities to be bulk enabled
     * @param TargetList List of entities to be bulk enabled
     */
    public void setTargetList(TargetEntity [] TargetList) {
        this.TargetList = TargetList;
    }

    public ModifyApiAnalyzeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiAnalyzeStatusRequest(ModifyApiAnalyzeStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TargetList != null) {
            this.TargetList = new TargetEntity[source.TargetList.length];
            for (int i = 0; i < source.TargetList.length; i++) {
                this.TargetList[i] = new TargetEntity(source.TargetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "TargetList.", this.TargetList);

    }
}

