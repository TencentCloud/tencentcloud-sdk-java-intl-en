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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientCert extends AbstractModel{

    /**
    * Client Certificate
PEM format, requires Base64 encoding.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * Client certificate name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Certificate expiration time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Certificate issuance time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
     * Get Client Certificate
PEM format, requires Base64 encoding.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Certificate Client Certificate
PEM format, requires Base64 encoding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Client Certificate
PEM format, requires Base64 encoding.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Certificate Client Certificate
PEM format, requires Base64 encoding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Client certificate name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertName Client certificate name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Client certificate name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertName Client certificate name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Certificate expiration time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Certificate expiration time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Certificate expiration time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Certificate expiration time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Certificate issuance time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeployTime Certificate issuance time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Certificate issuance time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeployTime Certificate issuance time
When this is used as an input parameter, it can be left blank.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);

    }
}

