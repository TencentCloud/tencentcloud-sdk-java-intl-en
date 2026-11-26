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

public class ModifyAliasDomainRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Alias domain name.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Target domain name.
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Certificate configuration. Valid values:
<li> none: without configuring;</li>
<li> hosting: managed SSL certificate;</li>
<li> apply: apply for a free certificate.</li>Maintain the original configuration if not specified.
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * When CertType is hosting, fill in the certificate ID accordingly.
    */
    @SerializedName("CertId")
    @Expose
    private String [] CertId;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Alias domain name. 
     * @return AliasName Alias domain name.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Alias domain name.
     * @param AliasName Alias domain name.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Target domain name. 
     * @return TargetName Target domain name.
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Target domain name.
     * @param TargetName Target domain name.
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Certificate configuration. Valid values:
<li> none: without configuring;</li>
<li> hosting: managed SSL certificate;</li>
<li> apply: apply for a free certificate.</li>Maintain the original configuration if not specified. 
     * @return CertType Certificate configuration. Valid values:
<li> none: without configuring;</li>
<li> hosting: managed SSL certificate;</li>
<li> apply: apply for a free certificate.</li>Maintain the original configuration if not specified.
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate configuration. Valid values:
<li> none: without configuring;</li>
<li> hosting: managed SSL certificate;</li>
<li> apply: apply for a free certificate.</li>Maintain the original configuration if not specified.
     * @param CertType Certificate configuration. Valid values:
<li> none: without configuring;</li>
<li> hosting: managed SSL certificate;</li>
<li> apply: apply for a free certificate.</li>Maintain the original configuration if not specified.
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get When CertType is hosting, fill in the certificate ID accordingly. 
     * @return CertId When CertType is hosting, fill in the certificate ID accordingly.
     */
    public String [] getCertId() {
        return this.CertId;
    }

    /**
     * Set When CertType is hosting, fill in the certificate ID accordingly.
     * @param CertId When CertType is hosting, fill in the certificate ID accordingly.
     */
    public void setCertId(String [] CertId) {
        this.CertId = CertId;
    }

    public ModifyAliasDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAliasDomainRequest(ModifyAliasDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.CertId != null) {
            this.CertId = new String[source.CertId.length];
            for (int i = 0; i < source.CertId.length; i++) {
                this.CertId[i] = new String(source.CertId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamArraySimple(map, prefix + "CertId.", this.CertId);

    }
}

