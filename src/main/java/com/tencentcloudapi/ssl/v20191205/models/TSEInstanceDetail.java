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

public class TSEInstanceDetail extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * gateway name
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * Gateway certificate list
    */
    @SerializedName("CertificateList")
    @Expose
    private GatewayCertificate [] CertificateList;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get gateway name 
     * @return GatewayName gateway name
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set gateway name
     * @param GatewayName gateway name
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get Gateway certificate list 
     * @return CertificateList Gateway certificate list
     */
    public GatewayCertificate [] getCertificateList() {
        return this.CertificateList;
    }

    /**
     * Set Gateway certificate list
     * @param CertificateList Gateway certificate list
     */
    public void setCertificateList(GatewayCertificate [] CertificateList) {
        this.CertificateList = CertificateList;
    }

    public TSEInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TSEInstanceDetail(TSEInstanceDetail source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.CertificateList != null) {
            this.CertificateList = new GatewayCertificate[source.CertificateList.length];
            for (int i = 0; i < source.CertificateList.length; i++) {
                this.CertificateList[i] = new GatewayCertificate(source.CertificateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamArrayObj(map, prefix + "CertificateList.", this.CertificateList);

    }
}

