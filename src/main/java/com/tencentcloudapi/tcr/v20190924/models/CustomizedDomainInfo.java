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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomizedDomainInfo extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Certificate ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Domain name creation status. Valid values: SUCCESS, FAILURE, CREATING, DELETING.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Certificate ID 
     * @return CertId Certificate ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID
     * @param CertId Certificate ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Domain name 
     * @return DomainName Domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name
     * @param DomainName Domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Domain name creation status. Valid values: SUCCESS, FAILURE, CREATING, DELETING. 
     * @return Status Domain name creation status. Valid values: SUCCESS, FAILURE, CREATING, DELETING.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name creation status. Valid values: SUCCESS, FAILURE, CREATING, DELETING.
     * @param Status Domain name creation status. Valid values: SUCCESS, FAILURE, CREATING, DELETING.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CustomizedDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomizedDomainInfo(CustomizedDomainInfo source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

