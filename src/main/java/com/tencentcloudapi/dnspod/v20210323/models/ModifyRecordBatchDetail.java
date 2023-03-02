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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordBatchDetail extends AbstractModel{

    /**
    * See `RecordInfoBatchModify`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordList")
    @Expose
    private BatchRecordInfo [] RecordList;

    /**
    * Task ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Domain
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainGrade")
    @Expose
    private String DomainGrade;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Task running status
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
    * Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get See `RecordInfoBatchModify`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordList See `RecordInfoBatchModify`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BatchRecordInfo [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set See `RecordInfoBatchModify`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordList See `RecordInfoBatchModify`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordList(BatchRecordInfo [] RecordList) {
        this.RecordList = RecordList;
    }

    /**
     * Get Task ID 
     * @return Id Task ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Task ID
     * @param Id Task ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Domain
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainGrade Domain level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainGrade() {
        return this.DomainGrade;
    }

    /**
     * Set Domain level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainGrade Domain level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainGrade(String DomainGrade) {
        this.DomainGrade = DomainGrade;
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
     * Get Task running status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task running status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task running status
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
     * Get Domain ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainId Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainId Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyRecordBatchDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordBatchDetail(ModifyRecordBatchDetail source) {
        if (source.RecordList != null) {
            this.RecordList = new BatchRecordInfo[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new BatchRecordInfo(source.RecordList[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainGrade != null) {
            this.DomainGrade = new String(source.DomainGrade);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainGrade", this.DomainGrade);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

