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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrivateCARequest extends AbstractModel {

    /**
    * CA certificate name
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * CA certificate content
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
    * Content verifying the CA certificate
    */
    @SerializedName("VerifyCertText")
    @Expose
    private String VerifyCertText;

    /**
     * Get CA certificate name 
     * @return CertName CA certificate name
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set CA certificate name
     * @param CertName CA certificate name
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get CA certificate content 
     * @return CertText CA certificate content
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set CA certificate content
     * @param CertText CA certificate content
     */
    public void setCertText(String CertText) {
        this.CertText = CertText;
    }

    /**
     * Get Content verifying the CA certificate 
     * @return VerifyCertText Content verifying the CA certificate
     */
    public String getVerifyCertText() {
        return this.VerifyCertText;
    }

    /**
     * Set Content verifying the CA certificate
     * @param VerifyCertText Content verifying the CA certificate
     */
    public void setVerifyCertText(String VerifyCertText) {
        this.VerifyCertText = VerifyCertText;
    }

    public CreatePrivateCARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateCARequest(CreatePrivateCARequest source) {
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertText != null) {
            this.CertText = new String(source.CertText);
        }
        if (source.VerifyCertText != null) {
            this.VerifyCertText = new String(source.VerifyCertText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertText", this.CertText);
        this.setParamSimple(map, prefix + "VerifyCertText", this.VerifyCertText);

    }
}

