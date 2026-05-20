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
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * gateway certificate name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Bind Domain Name
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * Certificate source
    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
    * Currently bound SSL certificate ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
     * Get Gateway certificate ID 
     * @return Id Gateway certificate ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Gateway certificate ID
     * @param Id Gateway certificate ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get gateway certificate name 
     * @return Name gateway certificate name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set gateway certificate name
     * @param Name gateway certificate name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Bind Domain Name 
     * @return BindDomains Bind Domain Name
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set Bind Domain Name
     * @param BindDomains Bind Domain Name
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get Certificate source 
     * @return CertSource Certificate source
     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set Certificate source
     * @param CertSource Certificate source
     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get Currently bound SSL certificate ID 
     * @return CertId Currently bound SSL certificate ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Currently bound SSL certificate ID
     * @param CertId Currently bound SSL certificate ID
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

