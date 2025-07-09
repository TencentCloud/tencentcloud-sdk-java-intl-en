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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDidDetailResponse extends AbstractModel {

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
    * The public key.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Whether the DID is a certified authority.
    */
    @SerializedName("AuthorityState")
    @Expose
    private Long AuthorityState;

    /**
    * The consortium ID.
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * The consortium name.
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The BCOS resource ID.
    */
    @SerializedName("ResChainId")
    @Expose
    private String ResChainId;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get The public key. 
     * @return PublicKey The public key.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set The public key.
     * @param PublicKey The public key.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Whether the DID is a certified authority. 
     * @return AuthorityState Whether the DID is a certified authority.
     */
    public Long getAuthorityState() {
        return this.AuthorityState;
    }

    /**
     * Set Whether the DID is a certified authority.
     * @param AuthorityState Whether the DID is a certified authority.
     */
    public void setAuthorityState(Long AuthorityState) {
        this.AuthorityState = AuthorityState;
    }

    /**
     * Get The consortium ID. 
     * @return ConsortiumId The consortium ID.
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set The consortium ID.
     * @param ConsortiumId The consortium ID.
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get The consortium name. 
     * @return ConsortiumName The consortium name.
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set The consortium name.
     * @param ConsortiumName The consortium name.
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
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
     * Get The BCOS resource ID. 
     * @return ResChainId The BCOS resource ID.
     */
    public String getResChainId() {
        return this.ResChainId;
    }

    /**
     * Set The BCOS resource ID.
     * @param ResChainId The BCOS resource ID.
     */
    public void setResChainId(String ResChainId) {
        this.ResChainId = ResChainId;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetDidDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidDetailResponse(GetDidDetailResponse source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.AuthorityState != null) {
            this.AuthorityState = new Long(source.AuthorityState);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResChainId != null) {
            this.ResChainId = new String(source.ResChainId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "AuthorityState", this.AuthorityState);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ResChainId", this.ResChainId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

