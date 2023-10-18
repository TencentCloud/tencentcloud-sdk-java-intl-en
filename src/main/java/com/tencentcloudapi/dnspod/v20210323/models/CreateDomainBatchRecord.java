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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainBatchRecord extends AbstractModel {

    /**
    * Subdomain (host record).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Record type. For more information, see the `DescribeRecordType` API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * Record value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * TTL value of the record
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Record adding status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Operation type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * ID of the record in the list
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Subdomain (host record).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubDomain Subdomain (host record).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Subdomain (host record).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubDomain Subdomain (host record).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Record type. For more information, see the `DescribeRecordType` API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordType Record type. For more information, see the `DescribeRecordType` API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type. For more information, see the `DescribeRecordType` API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordType Record type. For more information, see the `DescribeRecordType` API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordLine Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordLine Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get Record value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Record value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Record value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Record value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get TTL value of the record
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TTL TTL value of the record
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL value of the record
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TTL TTL value of the record
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Record adding status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Record adding status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Record adding status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Record adding status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Operation type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Operation Operation type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Operation Operation type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrMsg Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrMsg Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get ID of the record in the list 
     * @return Id ID of the record in the list
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID of the record in the list
     * @param Id ID of the record in the list
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public CreateDomainBatchRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainBatchRecord(CreateDomainBatchRecord source) {
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
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
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

