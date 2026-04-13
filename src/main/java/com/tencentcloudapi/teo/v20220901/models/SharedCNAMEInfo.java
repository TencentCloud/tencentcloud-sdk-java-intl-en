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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharedCNAMEInfo extends AbstractModel {

    /**
    * Shared CNAME type: Value ranges from...to...
<li>custom: User-created custom shared CNAME</li>
<li>ip-ssl: Shared CNAME of IP SSL type</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Shared CNAME name.
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * When type is ip-ssl, show the associated IP SSL configuration message of the shared CNAME.
    */
    @SerializedName("IPSSLConfig")
    @Expose
    private IPSSLConfig IPSSLConfig;

    /**
    * Number of acceleration domain names bound to the shared CNAME.
    */
    @SerializedName("BindDomainCount")
    @Expose
    private Long BindDomainCount;

    /**
    * List of acceleration domain names added to the shared CNAME. When the number of domains exceeds 100, only return the first 100 acceleration domain names.
    */
    @SerializedName("AccelerationDomains")
    @Expose
    private ReferenceHolder [] AccelerationDomains;

    /**
     * Get Shared CNAME type: Value ranges from...to...
<li>custom: User-created custom shared CNAME</li>
<li>ip-ssl: Shared CNAME of IP SSL type</li> 
     * @return Type Shared CNAME type: Value ranges from...to...
<li>custom: User-created custom shared CNAME</li>
<li>ip-ssl: Shared CNAME of IP SSL type</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Shared CNAME type: Value ranges from...to...
<li>custom: User-created custom shared CNAME</li>
<li>ip-ssl: Shared CNAME of IP SSL type</li>
     * @param Type Shared CNAME type: Value ranges from...to...
<li>custom: User-created custom shared CNAME</li>
<li>ip-ssl: Shared CNAME of IP SSL type</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Shared CNAME name. 
     * @return SharedCNAME Shared CNAME name.
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set Shared CNAME name.
     * @param SharedCNAME Shared CNAME name.
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get When type is ip-ssl, show the associated IP SSL configuration message of the shared CNAME. 
     * @return IPSSLConfig When type is ip-ssl, show the associated IP SSL configuration message of the shared CNAME.
     */
    public IPSSLConfig getIPSSLConfig() {
        return this.IPSSLConfig;
    }

    /**
     * Set When type is ip-ssl, show the associated IP SSL configuration message of the shared CNAME.
     * @param IPSSLConfig When type is ip-ssl, show the associated IP SSL configuration message of the shared CNAME.
     */
    public void setIPSSLConfig(IPSSLConfig IPSSLConfig) {
        this.IPSSLConfig = IPSSLConfig;
    }

    /**
     * Get Number of acceleration domain names bound to the shared CNAME. 
     * @return BindDomainCount Number of acceleration domain names bound to the shared CNAME.
     */
    public Long getBindDomainCount() {
        return this.BindDomainCount;
    }

    /**
     * Set Number of acceleration domain names bound to the shared CNAME.
     * @param BindDomainCount Number of acceleration domain names bound to the shared CNAME.
     */
    public void setBindDomainCount(Long BindDomainCount) {
        this.BindDomainCount = BindDomainCount;
    }

    /**
     * Get List of acceleration domain names added to the shared CNAME. When the number of domains exceeds 100, only return the first 100 acceleration domain names. 
     * @return AccelerationDomains List of acceleration domain names added to the shared CNAME. When the number of domains exceeds 100, only return the first 100 acceleration domain names.
     */
    public ReferenceHolder [] getAccelerationDomains() {
        return this.AccelerationDomains;
    }

    /**
     * Set List of acceleration domain names added to the shared CNAME. When the number of domains exceeds 100, only return the first 100 acceleration domain names.
     * @param AccelerationDomains List of acceleration domain names added to the shared CNAME. When the number of domains exceeds 100, only return the first 100 acceleration domain names.
     */
    public void setAccelerationDomains(ReferenceHolder [] AccelerationDomains) {
        this.AccelerationDomains = AccelerationDomains;
    }

    public SharedCNAMEInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedCNAMEInfo(SharedCNAMEInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IPSSLConfig != null) {
            this.IPSSLConfig = new IPSSLConfig(source.IPSSLConfig);
        }
        if (source.BindDomainCount != null) {
            this.BindDomainCount = new Long(source.BindDomainCount);
        }
        if (source.AccelerationDomains != null) {
            this.AccelerationDomains = new ReferenceHolder[source.AccelerationDomains.length];
            for (int i = 0; i < source.AccelerationDomains.length; i++) {
                this.AccelerationDomains[i] = new ReferenceHolder(source.AccelerationDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "IPSSLConfig.", this.IPSSLConfig);
        this.setParamSimple(map, prefix + "BindDomainCount", this.BindDomainCount);
        this.setParamArrayObj(map, prefix + "AccelerationDomains.", this.AccelerationDomains);

    }
}

