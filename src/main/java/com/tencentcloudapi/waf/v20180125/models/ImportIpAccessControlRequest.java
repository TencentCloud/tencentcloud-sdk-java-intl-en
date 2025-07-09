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

public class ImportIpAccessControlRequest extends AbstractModel {

    /**
    * List of imported IP allowlists/blocklists.
    */
    @SerializedName("Data")
    @Expose
    private IpAccessControlParam [] Data;

    /**
    * Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Batch protection IP blocklists/allowlists or not. If yes, the value is batch; otherwise, it is empty.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get List of imported IP allowlists/blocklists. 
     * @return Data List of imported IP allowlists/blocklists.
     */
    public IpAccessControlParam [] getData() {
        return this.Data;
    }

    /**
     * Set List of imported IP allowlists/blocklists.
     * @param Data List of imported IP allowlists/blocklists.
     */
    public void setData(IpAccessControlParam [] Data) {
        this.Data = Data;
    }

    /**
     * Get Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global. 
     * @return Domain Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
     * @param Domain Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Batch protection IP blocklists/allowlists or not. If yes, the value is batch; otherwise, it is empty. 
     * @return SourceType Batch protection IP blocklists/allowlists or not. If yes, the value is batch; otherwise, it is empty.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Batch protection IP blocklists/allowlists or not. If yes, the value is batch; otherwise, it is empty.
     * @param SourceType Batch protection IP blocklists/allowlists or not. If yes, the value is batch; otherwise, it is empty.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
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

    public ImportIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportIpAccessControlRequest(ImportIpAccessControlRequest source) {
        if (source.Data != null) {
            this.Data = new IpAccessControlParam[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new IpAccessControlParam(source.Data[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

