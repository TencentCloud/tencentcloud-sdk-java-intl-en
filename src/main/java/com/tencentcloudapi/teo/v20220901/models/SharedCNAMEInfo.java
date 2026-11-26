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
    * <p>Shared CNAME type: value range as follows:</p><li>custom: user-created custom shared CNAME</li><li>ip-ssl: IP SSL shared CNAME</li><li>zero-rating: zero-rating shared CNAME</li><li>preset: pre-configured resource shared CNAME</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Shared CNAME name.</p>
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>When type is ip-ssl, show the IP SSL configuration message associated with the shared CNAME.</p>
    */
    @SerializedName("IPSSLConfig")
    @Expose
    private IPSSLConfig IPSSLConfig;

    /**
    * <p>Number of acceleration domain names bound to the shared CNAME.</p>
    */
    @SerializedName("BindDomainCount")
    @Expose
    private Long BindDomainCount;

    /**
    * <p>List of acceleration domain names added to the shared CNAME. When the number of added domains exceeds 100, only return the first 100 acceleration domain names.</p>
    */
    @SerializedName("AccelerationDomains")
    @Expose
    private ReferenceHolder [] AccelerationDomains;

    /**
     * Get <p>Shared CNAME type: value range as follows:</p><li>custom: user-created custom shared CNAME</li><li>ip-ssl: IP SSL shared CNAME</li><li>zero-rating: zero-rating shared CNAME</li><li>preset: pre-configured resource shared CNAME</li> 
     * @return Type <p>Shared CNAME type: value range as follows:</p><li>custom: user-created custom shared CNAME</li><li>ip-ssl: IP SSL shared CNAME</li><li>zero-rating: zero-rating shared CNAME</li><li>preset: pre-configured resource shared CNAME</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Shared CNAME type: value range as follows:</p><li>custom: user-created custom shared CNAME</li><li>ip-ssl: IP SSL shared CNAME</li><li>zero-rating: zero-rating shared CNAME</li><li>preset: pre-configured resource shared CNAME</li>
     * @param Type <p>Shared CNAME type: value range as follows:</p><li>custom: user-created custom shared CNAME</li><li>ip-ssl: IP SSL shared CNAME</li><li>zero-rating: zero-rating shared CNAME</li><li>preset: pre-configured resource shared CNAME</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Shared CNAME name.</p> 
     * @return SharedCNAME <p>Shared CNAME name.</p>
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set <p>Shared CNAME name.</p>
     * @param SharedCNAME <p>Shared CNAME name.</p>
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>When type is ip-ssl, show the IP SSL configuration message associated with the shared CNAME.</p> 
     * @return IPSSLConfig <p>When type is ip-ssl, show the IP SSL configuration message associated with the shared CNAME.</p>
     */
    public IPSSLConfig getIPSSLConfig() {
        return this.IPSSLConfig;
    }

    /**
     * Set <p>When type is ip-ssl, show the IP SSL configuration message associated with the shared CNAME.</p>
     * @param IPSSLConfig <p>When type is ip-ssl, show the IP SSL configuration message associated with the shared CNAME.</p>
     */
    public void setIPSSLConfig(IPSSLConfig IPSSLConfig) {
        this.IPSSLConfig = IPSSLConfig;
    }

    /**
     * Get <p>Number of acceleration domain names bound to the shared CNAME.</p> 
     * @return BindDomainCount <p>Number of acceleration domain names bound to the shared CNAME.</p>
     */
    public Long getBindDomainCount() {
        return this.BindDomainCount;
    }

    /**
     * Set <p>Number of acceleration domain names bound to the shared CNAME.</p>
     * @param BindDomainCount <p>Number of acceleration domain names bound to the shared CNAME.</p>
     */
    public void setBindDomainCount(Long BindDomainCount) {
        this.BindDomainCount = BindDomainCount;
    }

    /**
     * Get <p>List of acceleration domain names added to the shared CNAME. When the number of added domains exceeds 100, only return the first 100 acceleration domain names.</p> 
     * @return AccelerationDomains <p>List of acceleration domain names added to the shared CNAME. When the number of added domains exceeds 100, only return the first 100 acceleration domain names.</p>
     */
    public ReferenceHolder [] getAccelerationDomains() {
        return this.AccelerationDomains;
    }

    /**
     * Set <p>List of acceleration domain names added to the shared CNAME. When the number of added domains exceeds 100, only return the first 100 acceleration domain names.</p>
     * @param AccelerationDomains <p>List of acceleration domain names added to the shared CNAME. When the number of added domains exceeds 100, only return the first 100 acceleration domain names.</p>
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

