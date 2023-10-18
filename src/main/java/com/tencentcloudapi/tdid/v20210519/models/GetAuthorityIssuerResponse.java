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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAuthorityIssuerResponse extends AbstractModel {

    /**
    * The authority name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The blockchain network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The blockchain group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The DID of the authority.
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The registration time.
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * The recognition time.
    */
    @SerializedName("RecognizeTime")
    @Expose
    private String RecognizeTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The authority name. 
     * @return Name The authority name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The authority name.
     * @param Name The authority name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The blockchain network ID. 
     * @return ClusterId The blockchain network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The blockchain network ID.
     * @param ClusterId The blockchain network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The blockchain group ID. 
     * @return GroupId The blockchain group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The blockchain group ID.
     * @param GroupId The blockchain group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The DID of the authority. 
     * @return Did The DID of the authority.
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set The DID of the authority.
     * @param Did The DID of the authority.
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The registration time. 
     * @return RegisterTime The registration time.
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set The registration time.
     * @param RegisterTime The registration time.
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get The recognition time. 
     * @return RecognizeTime The recognition time.
     */
    public String getRecognizeTime() {
        return this.RecognizeTime;
    }

    /**
     * Set The recognition time.
     * @param RecognizeTime The recognition time.
     */
    public void setRecognizeTime(String RecognizeTime) {
        this.RecognizeTime = RecognizeTime;
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

    public GetAuthorityIssuerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAuthorityIssuerResponse(GetAuthorityIssuerResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RegisterTime != null) {
            this.RegisterTime = new String(source.RegisterTime);
        }
        if (source.RecognizeTime != null) {
            this.RecognizeTime = new String(source.RecognizeTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "RecognizeTime", this.RecognizeTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

