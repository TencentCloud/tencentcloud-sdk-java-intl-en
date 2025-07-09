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

public class GatewayCertificate extends AbstractModel {

    /**
    * Gateway certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Gateway certificate information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Bound domain name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * Certificate source
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
    * SSL certificate ID that is currently bound
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
     * Get Gateway certificate ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Gateway certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Gateway certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Gateway certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Gateway certificate information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Gateway certificate information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Gateway certificate information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Name Gateway certificate information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Bound domain name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BindDomains Bound domain name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set Bound domain name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BindDomains Bound domain name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get Certificate source
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CertSource Certificate source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set Certificate source
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CertSource Certificate source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get SSL certificate ID that is currently bound
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CertId SSL certificate ID that is currently bound
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set SSL certificate ID that is currently bound
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CertId SSL certificate ID that is currently bound
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    public GatewayCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayCertificate(GatewayCertificate source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.CertSource != null) {
            this.CertSource = new String(source.CertSource);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "CertId", this.CertId);

    }
}

