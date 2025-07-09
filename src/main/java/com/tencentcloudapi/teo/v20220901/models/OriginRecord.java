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

public class OriginRecord extends AbstractModel {

    /**
    * The origin record value, which can be an IPv4/IPv6 address or a domain name.
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`AWS_S3`: AWS S3 bucket address
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The origin record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Weight of an origin. Range: 0-100. If it is not specified, a random weight is assigned. If `0` is passed in, there is no traffic scheduled to this origin.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Whether to enable private authentication. It is valid when `OriginType=COS/AWS_S3`. Values:
<li>`true`: Yes.</li>
<li>`false`: No.</li>Default: `false`.

    */
    @SerializedName("Private")
    @Expose
    private Boolean Private;

    /**
    * Private authentication parameters. This field is valid when `Private=true`.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
     * Get The origin record value, which can be an IPv4/IPv6 address or a domain name. 
     * @return Record The origin record value, which can be an IPv4/IPv6 address or a domain name.
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set The origin record value, which can be an IPv4/IPv6 address or a domain name.
     * @param Record The origin record value, which can be an IPv4/IPv6 address or a domain name.
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`AWS_S3`: AWS S3 bucket address 
     * @return Type The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`AWS_S3`: AWS S3 bucket address
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`AWS_S3`: AWS S3 bucket address
     * @param Type The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`AWS_S3`: AWS S3 bucket address
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The origin record ID. 
     * @return RecordId The origin record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set The origin record ID.
     * @param RecordId The origin record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Weight of an origin. Range: 0-100. If it is not specified, a random weight is assigned. If `0` is passed in, there is no traffic scheduled to this origin.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Weight Weight of an origin. Range: 0-100. If it is not specified, a random weight is assigned. If `0` is passed in, there is no traffic scheduled to this origin.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of an origin. Range: 0-100. If it is not specified, a random weight is assigned. If `0` is passed in, there is no traffic scheduled to this origin.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Weight Weight of an origin. Range: 0-100. If it is not specified, a random weight is assigned. If `0` is passed in, there is no traffic scheduled to this origin.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Whether to enable private authentication. It is valid when `OriginType=COS/AWS_S3`. Values:
<li>`true`: Yes.</li>
<li>`false`: No.</li>Default: `false`.
 
     * @return Private Whether to enable private authentication. It is valid when `OriginType=COS/AWS_S3`. Values:
<li>`true`: Yes.</li>
<li>`false`: No.</li>Default: `false`.

     */
    public Boolean getPrivate() {
        return this.Private;
    }

    /**
     * Set Whether to enable private authentication. It is valid when `OriginType=COS/AWS_S3`. Values:
<li>`true`: Yes.</li>
<li>`false`: No.</li>Default: `false`.

     * @param Private Whether to enable private authentication. It is valid when `OriginType=COS/AWS_S3`. Values:
<li>`true`: Yes.</li>
<li>`false`: No.</li>Default: `false`.

     */
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    /**
     * Get Private authentication parameters. This field is valid when `Private=true`. 
     * @return PrivateParameters Private authentication parameters. This field is valid when `Private=true`.
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameters. This field is valid when `Private=true`.
     * @param PrivateParameters Private authentication parameters. This field is valid when `Private=true`.
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public OriginRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecord(OriginRecord source) {
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Private != null) {
            this.Private = new Boolean(source.Private);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new PrivateParameter[source.PrivateParameters.length];
            for (int i = 0; i < source.PrivateParameters.length; i++) {
                this.PrivateParameters[i] = new PrivateParameter(source.PrivateParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Private", this.Private);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

