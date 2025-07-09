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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDomainBuyDetails extends AbstractModel {

    /**
    * The details ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The domains.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The status. Valid values: `SUCCESS`, `FAILURE`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The reason for failure.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * The creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The update time.
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Null: The DNS service is not transferred. `false`: The DNS service failed to be transferred. `true`: The DNS service is transferred successfully.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferDnsResult")
    @Expose
    private Boolean TransferDnsResult;

    /**
    * The reason for failure, expressed in Chinese.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReasonZh")
    @Expose
    private String ReasonZh;

    /**
    * The payment status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayStatus")
    @Expose
    private Long PayStatus;

    /**
     * Get The details ID. 
     * @return Id The details ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The details ID.
     * @param Id The details ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition). 
     * @return Action The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
     * @param Action The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The domains. 
     * @return Domain The domains.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domains.
     * @param Domain The domains.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The status. Valid values: `SUCCESS`, `FAILURE` 
     * @return Status The status. Valid values: `SUCCESS`, `FAILURE`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status. Valid values: `SUCCESS`, `FAILURE`
     * @param Status The status. Valid values: `SUCCESS`, `FAILURE`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The reason for failure.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason The reason for failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set The reason for failure.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason The reason for failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get The creation time. 
     * @return CreatedOn The creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time.
     * @param CreatedOn The creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The update time. 
     * @return UpdatedOn The update time.
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set The update time.
     * @param UpdatedOn The update time.
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Null: The DNS service is not transferred. `false`: The DNS service failed to be transferred. `true`: The DNS service is transferred successfully.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferDnsResult Null: The DNS service is not transferred. `false`: The DNS service failed to be transferred. `true`: The DNS service is transferred successfully.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTransferDnsResult() {
        return this.TransferDnsResult;
    }

    /**
     * Set Null: The DNS service is not transferred. `false`: The DNS service failed to be transferred. `true`: The DNS service is transferred successfully.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferDnsResult Null: The DNS service is not transferred. `false`: The DNS service failed to be transferred. `true`: The DNS service is transferred successfully.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferDnsResult(Boolean TransferDnsResult) {
        this.TransferDnsResult = TransferDnsResult;
    }

    /**
     * Get The reason for failure, expressed in Chinese.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReasonZh The reason for failure, expressed in Chinese.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReasonZh() {
        return this.ReasonZh;
    }

    /**
     * Set The reason for failure, expressed in Chinese.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReasonZh The reason for failure, expressed in Chinese.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReasonZh(String ReasonZh) {
        this.ReasonZh = ReasonZh;
    }

    /**
     * Get The payment status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayStatus The payment status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayStatus() {
        return this.PayStatus;
    }

    /**
     * Set The payment status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayStatus The payment status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayStatus(Long PayStatus) {
        this.PayStatus = PayStatus;
    }

    public BatchDomainBuyDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDomainBuyDetails(BatchDomainBuyDetails source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.TransferDnsResult != null) {
            this.TransferDnsResult = new Boolean(source.TransferDnsResult);
        }
        if (source.ReasonZh != null) {
            this.ReasonZh = new String(source.ReasonZh);
        }
        if (source.PayStatus != null) {
            this.PayStatus = new Long(source.PayStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "TransferDnsResult", this.TransferDnsResult);
        this.setParamSimple(map, prefix + "ReasonZh", this.ReasonZh);
        this.setParamSimple(map, prefix + "PayStatus", this.PayStatus);

    }
}

