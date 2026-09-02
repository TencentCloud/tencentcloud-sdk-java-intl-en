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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmApplyOrder extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Identity id.
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * Applicant account uin
    */
    @SerializedName("ApplicantUin")
    @Expose
    private DspmUinUser ApplicantUin;

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Region of the asset
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Application type. 0: associate an identity. 1: edit an identity. 2: create a temporary identity.
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

    /**
    * Permission request.
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * Access privilege expiration time calculated from when approval is complete. Temporary account validity. Milliseconds.
    */
    @SerializedName("ValidatePeriod")
    @Expose
    private Long ValidatePeriod;

    /**
    * Application reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Approval procedure
    */
    @SerializedName("ApproverSteps")
    @Expose
    private DspmApproverStep [] ApproverSteps;

    /**
    * Management type. 0: ordinary member; 1: administrator.
    */
    @SerializedName("ManagerType")
    @Expose
    private Long ManagerType;

    /**
    * Personal user information
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * Cloud account user information
    */
    @SerializedName("SubjectUser")
    @Expose
    private DspmUinUser SubjectUser;

    /**
    * Approval status. 0: Pending approval; 1: Approved; 2: Rejected
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Application creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Application ID 
     * @return OrderId Application ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Application ID
     * @param OrderId Application ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Identity id. 
     * @return IdentifyId Identity id.
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set Identity id.
     * @param IdentifyId Identity id.
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get Applicant account uin 
     * @return ApplicantUin Applicant account uin
     */
    public DspmUinUser getApplicantUin() {
        return this.ApplicantUin;
    }

    /**
     * Set Applicant account uin
     * @param ApplicantUin Applicant account uin
     */
    public void setApplicantUin(DspmUinUser ApplicantUin) {
        this.ApplicantUin = ApplicantUin;
    }

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset name 
     * @return AssetName Asset name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
     * @param AssetName Asset name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Region of the asset 
     * @return Region Region of the asset
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the asset
     * @param Region Region of the asset
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Application type. 0: associate an identity. 1: edit an identity. 2: create a temporary identity. 
     * @return ApplyType Application type. 0: associate an identity. 1: edit an identity. 2: create a temporary identity.
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Application type. 0: associate an identity. 1: edit an identity. 2: create a temporary identity.
     * @param ApplyType Application type. 0: associate an identity. 1: edit an identity. 2: create a temporary identity.
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get Permission request. 
     * @return Privilege Permission request.
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Permission request.
     * @param Privilege Permission request.
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Access privilege expiration time calculated from when approval is complete. Temporary account validity. Milliseconds. 
     * @return ValidatePeriod Access privilege expiration time calculated from when approval is complete. Temporary account validity. Milliseconds.
     */
    public Long getValidatePeriod() {
        return this.ValidatePeriod;
    }

    /**
     * Set Access privilege expiration time calculated from when approval is complete. Temporary account validity. Milliseconds.
     * @param ValidatePeriod Access privilege expiration time calculated from when approval is complete. Temporary account validity. Milliseconds.
     */
    public void setValidatePeriod(Long ValidatePeriod) {
        this.ValidatePeriod = ValidatePeriod;
    }

    /**
     * Get Application reason. 
     * @return Reason Application reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Application reason.
     * @param Reason Application reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Approval procedure 
     * @return ApproverSteps Approval procedure
     */
    public DspmApproverStep [] getApproverSteps() {
        return this.ApproverSteps;
    }

    /**
     * Set Approval procedure
     * @param ApproverSteps Approval procedure
     */
    public void setApproverSteps(DspmApproverStep [] ApproverSteps) {
        this.ApproverSteps = ApproverSteps;
    }

    /**
     * Get Management type. 0: ordinary member; 1: administrator. 
     * @return ManagerType Management type. 0: ordinary member; 1: administrator.
     */
    public Long getManagerType() {
        return this.ManagerType;
    }

    /**
     * Set Management type. 0: ordinary member; 1: administrator.
     * @param ManagerType Management type. 0: ordinary member; 1: administrator.
     */
    public void setManagerType(Long ManagerType) {
        this.ManagerType = ManagerType;
    }

    /**
     * Get Personal user information 
     * @return Person Personal user information
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set Personal user information
     * @param Person Personal user information
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get Cloud account user information 
     * @return SubjectUser Cloud account user information
     */
    public DspmUinUser getSubjectUser() {
        return this.SubjectUser;
    }

    /**
     * Set Cloud account user information
     * @param SubjectUser Cloud account user information
     */
    public void setSubjectUser(DspmUinUser SubjectUser) {
        this.SubjectUser = SubjectUser;
    }

    /**
     * Get Approval status. 0: Pending approval; 1: Approved; 2: Rejected 
     * @return Status Approval status. 0: Pending approval; 1: Approved; 2: Rejected
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Approval status. 0: Pending approval; 1: Approved; 2: Rejected
     * @param Status Approval status. 0: Pending approval; 1: Approved; 2: Rejected
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Application creation time. 
     * @return CreateTime Application creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Application creation time.
     * @param CreateTime Application creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DspmApplyOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmApplyOrder(DspmApplyOrder source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.ApplicantUin != null) {
            this.ApplicantUin = new DspmUinUser(source.ApplicantUin);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.ValidatePeriod != null) {
            this.ValidatePeriod = new Long(source.ValidatePeriod);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ApproverSteps != null) {
            this.ApproverSteps = new DspmApproverStep[source.ApproverSteps.length];
            for (int i = 0; i < source.ApproverSteps.length; i++) {
                this.ApproverSteps[i] = new DspmApproverStep(source.ApproverSteps[i]);
            }
        }
        if (source.ManagerType != null) {
            this.ManagerType = new Long(source.ManagerType);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.SubjectUser != null) {
            this.SubjectUser = new DspmUinUser(source.SubjectUser);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamObj(map, prefix + "ApplicantUin.", this.ApplicantUin);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "ValidatePeriod", this.ValidatePeriod);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArrayObj(map, prefix + "ApproverSteps.", this.ApproverSteps);
        this.setParamSimple(map, prefix + "ManagerType", this.ManagerType);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "SubjectUser.", this.SubjectUser);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

