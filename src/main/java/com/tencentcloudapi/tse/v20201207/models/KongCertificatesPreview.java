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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongCertificatesPreview extends AbstractModel {

    /**
    * certificate name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Bound domain name
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * Certificate status: expired.
active
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Certificate in pem format
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
    * Certificate Private Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * certificate expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Certificate upload time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Certificate issuance time
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * Certificate source: native (kong custom certificate)
ssl (platform cert)
    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
    * ssl Platform Certificate Id
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
     * Get certificate name 
     * @return Name certificate name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set certificate name
     * @param Name certificate name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Id 
     * @return Id Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Bound domain name 
     * @return BindDomains Bound domain name
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set Bound domain name
     * @param BindDomains Bound domain name
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get Certificate status: expired.
active 
     * @return Status Certificate status: expired.
active
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status: expired.
active
     * @param Status Certificate status: expired.
active
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Certificate in pem format 
     * @return Crt Certificate in pem format
     */
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set Certificate in pem format
     * @param Crt Certificate in pem format
     */
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    /**
     * Get Certificate Private Key 
     * @return Key Certificate Private Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Certificate Private Key
     * @param Key Certificate Private Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get certificate expiration time 
     * @return ExpireTime certificate expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set certificate expiration time
     * @param ExpireTime certificate expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Certificate upload time 
     * @return CreateTime Certificate upload time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Certificate upload time
     * @param CreateTime Certificate upload time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Certificate issuance time 
     * @return IssueTime Certificate issuance time
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set Certificate issuance time
     * @param IssueTime Certificate issuance time
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get Certificate source: native (kong custom certificate)
ssl (platform cert) 
     * @return CertSource Certificate source: native (kong custom certificate)
ssl (platform cert)
     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set Certificate source: native (kong custom certificate)
ssl (platform cert)
     * @param CertSource Certificate source: native (kong custom certificate)
ssl (platform cert)
     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get ssl Platform Certificate Id 
     * @return CertId ssl Platform Certificate Id
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ssl Platform Certificate Id
     * @param CertId ssl Platform Certificate Id
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    public KongCertificatesPreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongCertificatesPreview(KongCertificatesPreview source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Crt != null) {
            this.Crt = new String(source.Crt);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Crt", this.Crt);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "CertId", this.CertId);

    }
}

