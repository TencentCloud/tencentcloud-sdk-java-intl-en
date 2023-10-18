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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAliasDomainRequest extends AbstractModel {

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The alias domain name.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * The target domain name.
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Certificate configuration. Values:
<li>`none`: Off</li>
<li>`hosting`: Managed SSL certificate</li>
<li>`apply`: Free certificate</li>The original configuration will apply if this field is not specified.
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * The certificate ID. This field is required when `CertType=hosting`.
    */
    @SerializedName("CertId")
    @Expose
    private String [] CertId;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The alias domain name. 
     * @return AliasName The alias domain name.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set The alias domain name.
     * @param AliasName The alias domain name.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get The target domain name. 
     * @return TargetName The target domain name.
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set The target domain name.
     * @param TargetName The target domain name.
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Certificate configuration. Values:
<li>`none`: Off</li>
<li>`hosting`: Managed SSL certificate</li>
<li>`apply`: Free certificate</li>The original configuration will apply if this field is not specified. 
     * @return CertType Certificate configuration. Values:
<li>`none`: Off</li>
<li>`hosting`: Managed SSL certificate</li>
<li>`apply`: Free certificate</li>The original configuration will apply if this field is not specified.
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate configuration. Values:
<li>`none`: Off</li>
<li>`hosting`: Managed SSL certificate</li>
<li>`apply`: Free certificate</li>The original configuration will apply if this field is not specified.
     * @param CertType Certificate configuration. Values:
<li>`none`: Off</li>
<li>`hosting`: Managed SSL certificate</li>
<li>`apply`: Free certificate</li>The original configuration will apply if this field is not specified.
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get The certificate ID. This field is required when `CertType=hosting`. 
     * @return CertId The certificate ID. This field is required when `CertType=hosting`.
     */
    public String [] getCertId() {
        return this.CertId;
    }

    /**
     * Set The certificate ID. This field is required when `CertType=hosting`.
     * @param CertId The certificate ID. This field is required when `CertType=hosting`.
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

