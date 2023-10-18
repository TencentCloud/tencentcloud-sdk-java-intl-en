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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Certificate extends AbstractModel {

    /**
    * Certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Certificate name; It's an old parameter, please switch to CertificateAlias.
    */
    @SerializedName("CertificateName")
    @Expose
    private String CertificateName;

    /**
    * Certificate type.
    */
    @SerializedName("CertificateType")
    @Expose
    private Long CertificateType;

    /**
    * Certificate name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * Certificate creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Certificate effective time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * Certificate expiration time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Common name of the certificate issuer.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuerCN")
    @Expose
    private String IssuerCN;

    /**
    * Common name of the certificate subject.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectCN")
    @Expose
    private String SubjectCN;

    /**
     * Get Certificate ID 
     * @return CertificateId Certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID
     * @param CertificateId Certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Certificate name; It's an old parameter, please switch to CertificateAlias. 
     * @return CertificateName Certificate name; It's an old parameter, please switch to CertificateAlias.
     */
    public String getCertificateName() {
        return this.CertificateName;
    }

    /**
     * Set Certificate name; It's an old parameter, please switch to CertificateAlias.
     * @param CertificateName Certificate name; It's an old parameter, please switch to CertificateAlias.
     */
    public void setCertificateName(String CertificateName) {
        this.CertificateName = CertificateName;
    }

    /**
     * Get Certificate type. 
     * @return CertificateType Certificate type.
     */
    public Long getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type.
     * @param CertificateType Certificate type.
     */
    public void setCertificateType(Long CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Certificate name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertificateAlias Certificate name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set Certificate name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertificateAlias Certificate name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get Certificate creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT). 
     * @return CreateTime Certificate creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Certificate creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
     * @param CreateTime Certificate creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Certificate effective time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginTime Certificate effective time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Certificate effective time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginTime Certificate effective time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Certificate expiration time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Certificate expiration time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Certificate expiration time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Certificate expiration time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Common name of the certificate issuer.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuerCN Common name of the certificate issuer.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuerCN() {
        return this.IssuerCN;
    }

    /**
     * Set Common name of the certificate issuer.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuerCN Common name of the certificate issuer.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuerCN(String IssuerCN) {
        this.IssuerCN = IssuerCN;
    }

    /**
     * Get Common name of the certificate subject.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubjectCN Common name of the certificate subject.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubjectCN() {
        return this.SubjectCN;
    }

    /**
     * Set Common name of the certificate subject.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubjectCN Common name of the certificate subject.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectCN(String SubjectCN) {
        this.SubjectCN = SubjectCN;
    }

    public Certificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Certificate(Certificate source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CertificateName != null) {
            this.CertificateName = new String(source.CertificateName);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new Long(source.CertificateType);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IssuerCN != null) {
            this.IssuerCN = new String(source.IssuerCN);
        }
        if (source.SubjectCN != null) {
            this.SubjectCN = new String(source.SubjectCN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateName", this.CertificateName);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IssuerCN", this.IssuerCN);
        this.setParamSimple(map, prefix + "SubjectCN", this.SubjectCN);

    }
}

