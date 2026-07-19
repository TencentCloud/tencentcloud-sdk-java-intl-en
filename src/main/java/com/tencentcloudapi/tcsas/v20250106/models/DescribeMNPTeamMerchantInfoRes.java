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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPTeamMerchantInfoRes extends AbstractModel {

    /**
    * <p>Merchant ID.</p>
    */
    @SerializedName("MerchantID")
    @Expose
    private String MerchantID;

    /**
    * <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * <p>Merchant binding ID of the mini program team, used to unbind the merchant.</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>Merchant name.</p>
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
     * Get <p>Merchant ID.</p> 
     * @return MerchantID <p>Merchant ID.</p>
     */
    public String getMerchantID() {
        return this.MerchantID;
    }

    /**
     * Set <p>Merchant ID.</p>
     * @param MerchantID <p>Merchant ID.</p>
     */
    public void setMerchantID(String MerchantID) {
        this.MerchantID = MerchantID;
    }

    /**
     * Get <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p> 
     * @return ApprovalStatus <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
     * @param ApprovalStatus <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get <p>Merchant binding ID of the mini program team, used to unbind the merchant.</p> 
     * @return ID <p>Merchant binding ID of the mini program team, used to unbind the merchant.</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>Merchant binding ID of the mini program team, used to unbind the merchant.</p>
     * @param ID <p>Merchant binding ID of the mini program team, used to unbind the merchant.</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Merchant name.</p> 
     * @return MerchantName <p>Merchant name.</p>
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set <p>Merchant name.</p>
     * @param MerchantName <p>Merchant name.</p>
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    public DescribeMNPTeamMerchantInfoRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPTeamMerchantInfoRes(DescribeMNPTeamMerchantInfoRes source) {
        if (source.MerchantID != null) {
            this.MerchantID = new String(source.MerchantID);
        }
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantID", this.MerchantID);
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);

    }
}

