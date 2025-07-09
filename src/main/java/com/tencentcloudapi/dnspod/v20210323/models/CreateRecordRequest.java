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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordRequest extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Record type, which is obtained through the record type API. The value contains uppercase letters, such as `A`.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Record split zone, which is obtained through the record split zone API.
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * Record value, such as `IP : 200.200.200.200`, `CNAME : cname.dnspod.com`, and `MX : mail.dnspod.com`.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Domain ID. The `DomainId` parameter has a higher priority than `Domain`. If `DomainId` is passed in, `Domain` will be ignored.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Host record such as `www`. If it is not passed in, it will be `@` by default.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Split zone ID, which is obtained through the record split zone API. The value is a string such as `10=1`. The `RecordLineId` parameter has a higher priority than `RecordLine`. If both of them are passed in, `RecordLineId` will be used first.
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * MX priority, which is required for an MX record and will take effect if the record type is MX. Value range: 1–20.
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * TTL. Value range: 1–604800. The minimum value varies by domain level.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Weight information, which is an integer between 0 and 100. It is supported only for enterprise VIP domains. `0` indicates not to pass in this parameter, i.e., not to set the weight.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Initial status of the record. Valid values: ENABLE, DISABLE. Default value: ENABLE. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Record type, which is obtained through the record type API. The value contains uppercase letters, such as `A`. 
     * @return RecordType Record type, which is obtained through the record type API. The value contains uppercase letters, such as `A`.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type, which is obtained through the record type API. The value contains uppercase letters, such as `A`.
     * @param RecordType Record type, which is obtained through the record type API. The value contains uppercase letters, such as `A`.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Record split zone, which is obtained through the record split zone API. 
     * @return RecordLine Record split zone, which is obtained through the record split zone API.
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set Record split zone, which is obtained through the record split zone API.
     * @param RecordLine Record split zone, which is obtained through the record split zone API.
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get Record value, such as `IP : 200.200.200.200`, `CNAME : cname.dnspod.com`, and `MX : mail.dnspod.com`. 
     * @return Value Record value, such as `IP : 200.200.200.200`, `CNAME : cname.dnspod.com`, and `MX : mail.dnspod.com`.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Record value, such as `IP : 200.200.200.200`, `CNAME : cname.dnspod.com`, and `MX : mail.dnspod.com`.
     * @param Value Record value, such as `IP : 200.200.200.200`, `CNAME : cname.dnspod.com`, and `MX : mail.dnspod.com`.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Domain ID. The `DomainId` parameter has a higher priority than `Domain`. If `DomainId` is passed in, `Domain` will be ignored. 
     * @return DomainId Domain ID. The `DomainId` parameter has a higher priority than `Domain`. If `DomainId` is passed in, `Domain` will be ignored.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID. The `DomainId` parameter has a higher priority than `Domain`. If `DomainId` is passed in, `Domain` will be ignored.
     * @param DomainId Domain ID. The `DomainId` parameter has a higher priority than `Domain`. If `DomainId` is passed in, `Domain` will be ignored.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Host record such as `www`. If it is not passed in, it will be `@` by default. 
     * @return SubDomain Host record such as `www`. If it is not passed in, it will be `@` by default.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Host record such as `www`. If it is not passed in, it will be `@` by default.
     * @param SubDomain Host record such as `www`. If it is not passed in, it will be `@` by default.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Split zone ID, which is obtained through the record split zone API. The value is a string such as `10=1`. The `RecordLineId` parameter has a higher priority than `RecordLine`. If both of them are passed in, `RecordLineId` will be used first. 
     * @return RecordLineId Split zone ID, which is obtained through the record split zone API. The value is a string such as `10=1`. The `RecordLineId` parameter has a higher priority than `RecordLine`. If both of them are passed in, `RecordLineId` will be used first.
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set Split zone ID, which is obtained through the record split zone API. The value is a string such as `10=1`. The `RecordLineId` parameter has a higher priority than `RecordLine`. If both of them are passed in, `RecordLineId` will be used first.
     * @param RecordLineId Split zone ID, which is obtained through the record split zone API. The value is a string such as `10=1`. The `RecordLineId` parameter has a higher priority than `RecordLine`. If both of them are passed in, `RecordLineId` will be used first.
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get MX priority, which is required for an MX record and will take effect if the record type is MX. Value range: 1–20. 
     * @return MX MX priority, which is required for an MX record and will take effect if the record type is MX. Value range: 1–20.
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX priority, which is required for an MX record and will take effect if the record type is MX. Value range: 1–20.
     * @param MX MX priority, which is required for an MX record and will take effect if the record type is MX. Value range: 1–20.
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get TTL. Value range: 1–604800. The minimum value varies by domain level. 
     * @return TTL TTL. Value range: 1–604800. The minimum value varies by domain level.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL. Value range: 1–604800. The minimum value varies by domain level.
     * @param TTL TTL. Value range: 1–604800. The minimum value varies by domain level.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Weight information, which is an integer between 0 and 100. It is supported only for enterprise VIP domains. `0` indicates not to pass in this parameter, i.e., not to set the weight. 
     * @return Weight Weight information, which is an integer between 0 and 100. It is supported only for enterprise VIP domains. `0` indicates not to pass in this parameter, i.e., not to set the weight.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight information, which is an integer between 0 and 100. It is supported only for enterprise VIP domains. `0` indicates not to pass in this parameter, i.e., not to set the weight.
     * @param Weight Weight information, which is an integer between 0 and 100. It is supported only for enterprise VIP domains. `0` indicates not to pass in this parameter, i.e., not to set the weight.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Initial status of the record. Valid values: ENABLE, DISABLE. Default value: ENABLE. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified. 
     * @return Status Initial status of the record. Valid values: ENABLE, DISABLE. Default value: ENABLE. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Initial status of the record. Valid values: ENABLE, DISABLE. Default value: ENABLE. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
     * @param Status Initial status of the record. Valid values: ENABLE, DISABLE. Default value: ENABLE. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CreateRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordRequest(CreateRecordRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

