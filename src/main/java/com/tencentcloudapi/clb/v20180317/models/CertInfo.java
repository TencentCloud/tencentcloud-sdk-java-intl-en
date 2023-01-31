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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo extends AbstractModel{

    /**
    * ID of the certificate. If it's not specified, `CertContent` and `CertKey` are required. For a server certificate, you also need to specify `CertName`. 
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Name of the uploaded certificate. It's required if `CertId` is not specified.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Public key of the uploaded certificate. It's required if `CertId` is not specified.
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * Private key of the uploaded server certificate. It's required if `CertId` is not specified.
    */
    @SerializedName("CertKey")
    @Expose
    private String CertKey;

    /**
     * Get ID of the certificate. If it's not specified, `CertContent` and `CertKey` are required. For a server certificate, you also need to specify `CertName`.  
     * @return CertId ID of the certificate. If it's not specified, `CertContent` and `CertKey` are required. For a server certificate, you also need to specify `CertName`. 
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ID of the certificate. If it's not specified, `CertContent` and `CertKey` are required. For a server certificate, you also need to specify `CertName`. 
     * @param CertId ID of the certificate. If it's not specified, `CertContent` and `CertKey` are required. For a server certificate, you also need to specify `CertName`. 
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Name of the uploaded certificate. It's required if `CertId` is not specified. 
     * @return CertName Name of the uploaded certificate. It's required if `CertId` is not specified.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Name of the uploaded certificate. It's required if `CertId` is not specified.
     * @param CertName Name of the uploaded certificate. It's required if `CertId` is not specified.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Public key of the uploaded certificate. It's required if `CertId` is not specified. 
     * @return CertContent Public key of the uploaded certificate. It's required if `CertId` is not specified.
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * Set Public key of the uploaded certificate. It's required if `CertId` is not specified.
     * @param CertContent Public key of the uploaded certificate. It's required if `CertId` is not specified.
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * Get Private key of the uploaded server certificate. It's required if `CertId` is not specified. 
     * @return CertKey Private key of the uploaded server certificate. It's required if `CertId` is not specified.
     */
    public String getCertKey() {
        return this.CertKey;
    }

    /**
     * Set Private key of the uploaded server certificate. It's required if `CertId` is not specified.
     * @param CertKey Private key of the uploaded server certificate. It's required if `CertId` is not specified.
     */
    public void setCertKey(String CertKey) {
        this.CertKey = CertKey;
    }

    public CertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertInfo(CertInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertContent != null) {
            this.CertContent = new String(source.CertContent);
        }
        if (source.CertKey != null) {
            this.CertKey = new String(source.CertKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);

    }
}

