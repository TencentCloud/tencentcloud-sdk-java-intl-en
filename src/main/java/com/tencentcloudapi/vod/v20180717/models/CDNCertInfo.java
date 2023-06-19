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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDNCertInfo extends AbstractModel{

    /**
    * Server certificate ID, which is auto-generated when the certificate is being managed by the SSL Certificate Service
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Server certificate information.
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * Server key information.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * Time when the certificate expires;Can be left blank when used as an input parameter.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Server certificate ID, which is auto-generated when the certificate is being managed by the SSL Certificate Service 
     * @return CertId Server certificate ID, which is auto-generated when the certificate is being managed by the SSL Certificate Service
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID, which is auto-generated when the certificate is being managed by the SSL Certificate Service
     * @param CertId Server certificate ID, which is auto-generated when the certificate is being managed by the SSL Certificate Service
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Server certificate information. 
     * @return Certificate Server certificate information.
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Server certificate information.
     * @param Certificate Server certificate information.
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Server key information. 
     * @return PrivateKey Server key information.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Server key information.
     * @param PrivateKey Server key information.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get Time when the certificate expires;Can be left blank when used as an input parameter. 
     * @return ExpireTime Time when the certificate expires;Can be left blank when used as an input parameter.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Time when the certificate expires;Can be left blank when used as an input parameter.
     * @param ExpireTime Time when the certificate expires;Can be left blank when used as an input parameter.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public CDNCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CDNCertInfo(CDNCertInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Certificate != null) {
            this.Certificate = new String(source.Certificate);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

