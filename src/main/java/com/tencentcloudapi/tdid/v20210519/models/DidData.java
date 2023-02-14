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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DidData extends AbstractModel{

    /**
    * The service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The DID.
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The status of the authority. `1`: Not registered; `2`: Not certified; `3`: Certified.
    */
    @SerializedName("AuthorityState")
    @Expose
    private Long AuthorityState;

    /**
    * The label of the DID.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * The DID creation time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The consortium name.
    */
    @SerializedName("AllianceName")
    @Expose
    private String AllianceName;

    /**
    * The label ID.
    */
    @SerializedName("LabelId")
    @Expose
    private Long LabelId;

    /**
     * Get The service ID. 
     * @return ServiceId The service ID.
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set The service ID.
     * @param ServiceId The service ID.
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The application name. 
     * @return AppName The application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The application name.
     * @param AppName The application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The DID. 
     * @return Did The DID.
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set The DID.
     * @param Did The DID.
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The status of the authority. `1`: Not registered; `2`: Not certified; `3`: Certified. 
     * @return AuthorityState The status of the authority. `1`: Not registered; `2`: Not certified; `3`: Certified.
     */
    public Long getAuthorityState() {
        return this.AuthorityState;
    }

    /**
     * Set The status of the authority. `1`: Not registered; `2`: Not certified; `3`: Certified.
     * @param AuthorityState The status of the authority. `1`: Not registered; `2`: Not certified; `3`: Certified.
     */
    public void setAuthorityState(Long AuthorityState) {
        this.AuthorityState = AuthorityState;
    }

    /**
     * Get The label of the DID. 
     * @return LabelName The label of the DID.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set The label of the DID.
     * @param LabelName The label of the DID.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get The DID creation time. 
     * @return CreatedAt The DID creation time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set The DID creation time.
     * @param CreatedAt The DID creation time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The consortium name. 
     * @return AllianceName The consortium name.
     */
    public String getAllianceName() {
        return this.AllianceName;
    }

    /**
     * Set The consortium name.
     * @param AllianceName The consortium name.
     */
    public void setAllianceName(String AllianceName) {
        this.AllianceName = AllianceName;
    }

    /**
     * Get The label ID. 
     * @return LabelId The label ID.
     */
    public Long getLabelId() {
        return this.LabelId;
    }

    /**
     * Set The label ID.
     * @param LabelId The label ID.
     */
    public void setLabelId(Long LabelId) {
        this.LabelId = LabelId;
    }

    public DidData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidData(DidData source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AuthorityState != null) {
            this.AuthorityState = new Long(source.AuthorityState);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AllianceName != null) {
            this.AllianceName = new String(source.AllianceName);
        }
        if (source.LabelId != null) {
            this.LabelId = new Long(source.LabelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AuthorityState", this.AuthorityState);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AllianceName", this.AllianceName);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);

    }
}

