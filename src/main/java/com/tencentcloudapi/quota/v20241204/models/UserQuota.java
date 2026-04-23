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
package com.tencentcloudapi.quota.v20241204.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserQuota extends AbstractModel {

    /**
    * uin
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Account nickname
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * Quota Instance ID
    */
    @SerializedName("QuotaInstanceId")
    @Expose
    private String QuotaInstanceId;

    /**
    * Quota ID
    */
    @SerializedName("QuotaId")
    @Expose
    private Long QuotaId;

    /**
    * quota name
    */
    @SerializedName("QuotaName")
    @Expose
    private String QuotaName;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Quota unit
    */
    @SerializedName("QuotaUnit")
    @Expose
    private String QuotaUnit;

    /**
    * Quota application method, enumeration value: 1: Can apply, 2: Ticket application, 3: Cannot apply.
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

    /**
    * User Total Quota
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * Total usage of user quota
    */
    @SerializedName("TotalUsage")
    @Expose
    private Long TotalUsage;

    /**
    * Quota description
    */
    @SerializedName("QuotaDescription")
    @Expose
    private String QuotaDescription;

    /**
    * Quota Dimension Value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QuotaDimensions")
    @Expose
    private QuotaDimension [] QuotaDimensions;

    /**
    * Status 5 Pending Approval
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get uin 
     * @return MemberUin uin
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set uin
     * @param MemberUin uin
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Account nickname 
     * @return MemberName Account nickname
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set Account nickname
     * @param MemberName Account nickname
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get Quota Instance ID 
     * @return QuotaInstanceId Quota Instance ID
     */
    public String getQuotaInstanceId() {
        return this.QuotaInstanceId;
    }

    /**
     * Set Quota Instance ID
     * @param QuotaInstanceId Quota Instance ID
     */
    public void setQuotaInstanceId(String QuotaInstanceId) {
        this.QuotaInstanceId = QuotaInstanceId;
    }

    /**
     * Get Quota ID 
     * @return QuotaId Quota ID
     */
    public Long getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set Quota ID
     * @param QuotaId Quota ID
     */
    public void setQuotaId(Long QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get quota name 
     * @return QuotaName quota name
     */
    public String getQuotaName() {
        return this.QuotaName;
    }

    /**
     * Set quota name
     * @param QuotaName quota name
     */
    public void setQuotaName(String QuotaName) {
        this.QuotaName = QuotaName;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Quota unit 
     * @return QuotaUnit Quota unit
     */
    public String getQuotaUnit() {
        return this.QuotaUnit;
    }

    /**
     * Set Quota unit
     * @param QuotaUnit Quota unit
     */
    public void setQuotaUnit(String QuotaUnit) {
        this.QuotaUnit = QuotaUnit;
    }

    /**
     * Get Quota application method, enumeration value: 1: Can apply, 2: Ticket application, 3: Cannot apply. 
     * @return ApplyType Quota application method, enumeration value: 1: Can apply, 2: Ticket application, 3: Cannot apply.
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Quota application method, enumeration value: 1: Can apply, 2: Ticket application, 3: Cannot apply.
     * @param ApplyType Quota application method, enumeration value: 1: Can apply, 2: Ticket application, 3: Cannot apply.
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get User Total Quota 
     * @return TotalQuota User Total Quota
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set User Total Quota
     * @param TotalQuota User Total Quota
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get Total usage of user quota 
     * @return TotalUsage Total usage of user quota
     */
    public Long getTotalUsage() {
        return this.TotalUsage;
    }

    /**
     * Set Total usage of user quota
     * @param TotalUsage Total usage of user quota
     */
    public void setTotalUsage(Long TotalUsage) {
        this.TotalUsage = TotalUsage;
    }

    /**
     * Get Quota description 
     * @return QuotaDescription Quota description
     */
    public String getQuotaDescription() {
        return this.QuotaDescription;
    }

    /**
     * Set Quota description
     * @param QuotaDescription Quota description
     */
    public void setQuotaDescription(String QuotaDescription) {
        this.QuotaDescription = QuotaDescription;
    }

    /**
     * Get Quota Dimension Value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QuotaDimensions Quota Dimension Value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QuotaDimension [] getQuotaDimensions() {
        return this.QuotaDimensions;
    }

    /**
     * Set Quota Dimension Value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QuotaDimensions Quota Dimension Value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuotaDimensions(QuotaDimension [] QuotaDimensions) {
        this.QuotaDimensions = QuotaDimensions;
    }

    /**
     * Get Status 5 Pending Approval 
     * @return Status Status 5 Pending Approval
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status 5 Pending Approval
     * @param Status Status 5 Pending Approval
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UserQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserQuota(UserQuota source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.QuotaInstanceId != null) {
            this.QuotaInstanceId = new String(source.QuotaInstanceId);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new Long(source.QuotaId);
        }
        if (source.QuotaName != null) {
            this.QuotaName = new String(source.QuotaName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.QuotaUnit != null) {
            this.QuotaUnit = new String(source.QuotaUnit);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.TotalUsage != null) {
            this.TotalUsage = new Long(source.TotalUsage);
        }
        if (source.QuotaDescription != null) {
            this.QuotaDescription = new String(source.QuotaDescription);
        }
        if (source.QuotaDimensions != null) {
            this.QuotaDimensions = new QuotaDimension[source.QuotaDimensions.length];
            for (int i = 0; i < source.QuotaDimensions.length; i++) {
                this.QuotaDimensions[i] = new QuotaDimension(source.QuotaDimensions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "QuotaInstanceId", this.QuotaInstanceId);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaName", this.QuotaName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "QuotaUnit", this.QuotaUnit);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "TotalUsage", this.TotalUsage);
        this.setParamSimple(map, prefix + "QuotaDescription", this.QuotaDescription);
        this.setParamArrayObj(map, prefix + "QuotaDimensions.", this.QuotaDimensions);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

