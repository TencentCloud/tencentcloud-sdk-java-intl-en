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

public class AddRecordBatch extends AbstractModel {

    /**
    * Record type. For more information, see the `DescribeRecordType` API.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Record value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Subdomain (host record), which is `@` by default.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API. If neither `RecordLine` nor `RecordLineId` is specified, the default split zone will be used.
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * Split zone ID of the DNS record. If both `RecordLine` and `RecordLineId` are specified, `RecordLineId` will be used.
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * The record weight (not supported).
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record value. It is `0` by default for non-MX records and required for MX records.
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * TTL value of the record, which is `600` by default.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Record status (not supported). Valid values: `0` (disabled); `1` (enabled). Default value: `1`.
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * Record remarks (not supported).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Record type. For more information, see the `DescribeRecordType` API. 
     * @return RecordType Record type. For more information, see the `DescribeRecordType` API.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type. For more information, see the `DescribeRecordType` API.
     * @param RecordType Record type. For more information, see the `DescribeRecordType` API.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Record value. 
     * @return Value Record value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Record value.
     * @param Value Record value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Subdomain (host record), which is `@` by default. 
     * @return SubDomain Subdomain (host record), which is `@` by default.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Subdomain (host record), which is `@` by default.
     * @param SubDomain Subdomain (host record), which is `@` by default.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API. If neither `RecordLine` nor `RecordLineId` is specified, the default split zone will be used. 
     * @return RecordLine Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API. If neither `RecordLine` nor `RecordLineId` is specified, the default split zone will be used.
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API. If neither `RecordLine` nor `RecordLineId` is specified, the default split zone will be used.
     * @param RecordLine Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API. If neither `RecordLine` nor `RecordLineId` is specified, the default split zone will be used.
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get Split zone ID of the DNS record. If both `RecordLine` and `RecordLineId` are specified, `RecordLineId` will be used. 
     * @return RecordLineId Split zone ID of the DNS record. If both `RecordLine` and `RecordLineId` are specified, `RecordLineId` will be used.
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set Split zone ID of the DNS record. If both `RecordLine` and `RecordLineId` are specified, `RecordLineId` will be used.
     * @param RecordLineId Split zone ID of the DNS record. If both `RecordLine` and `RecordLineId` are specified, `RecordLineId` will be used.
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get The record weight (not supported). 
     * @return Weight The record weight (not supported).
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set The record weight (not supported).
     * @param Weight The record weight (not supported).
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record value. It is `0` by default for non-MX records and required for MX records. 
     * @return MX MX record value. It is `0` by default for non-MX records and required for MX records.
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX record value. It is `0` by default for non-MX records and required for MX records.
     * @param MX MX record value. It is `0` by default for non-MX records and required for MX records.
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get TTL value of the record, which is `600` by default. 
     * @return TTL TTL value of the record, which is `600` by default.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL value of the record, which is `600` by default.
     * @param TTL TTL value of the record, which is `600` by default.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Record status (not supported). Valid values: `0` (disabled); `1` (enabled). Default value: `1`. 
     * @return Enabled Record status (not supported). Valid values: `0` (disabled); `1` (enabled). Default value: `1`.
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Record status (not supported). Valid values: `0` (disabled); `1` (enabled). Default value: `1`.
     * @param Enabled Record status (not supported). Valid values: `0` (disabled); `1` (enabled). Default value: `1`.
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Record remarks (not supported). 
     * @return Remark Record remarks (not supported).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Record remarks (not supported).
     * @param Remark Record remarks (not supported).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AddRecordBatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBatch(AddRecordBatch source) {
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

