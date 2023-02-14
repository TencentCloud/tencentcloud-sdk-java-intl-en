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

public class Authority extends AbstractModel{

    /**
    * The authority ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The DID.
    */
    @SerializedName("DidId")
    @Expose
    private Long DidId;

    /**
    * The details of the DID.
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * The authority name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether the authority is certified. `1`: Yes; `2`: No.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The DID service ID.
    */
    @SerializedName("DidServiceId")
    @Expose
    private Long DidServiceId;

    /**
    * The application ID.
    */
    @SerializedName("ContractAppId")
    @Expose
    private Long ContractAppId;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The registration time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * The recognition time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RecognizeTime")
    @Expose
    private String RecognizeTime;

    /**
    * The creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * The on-chain label.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
     * Get The authority ID. 
     * @return Id The authority ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The authority ID.
     * @param Id The authority ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The DID. 
     * @return DidId The DID.
     */
    public Long getDidId() {
        return this.DidId;
    }

    /**
     * Set The DID.
     * @param DidId The DID.
     */
    public void setDidId(Long DidId) {
        this.DidId = DidId;
    }

    /**
     * Get The details of the DID. 
     * @return Did The details of the DID.
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set The details of the DID.
     * @param Did The details of the DID.
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

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
     * Get Whether the authority is certified. `1`: Yes; `2`: No. 
     * @return Status Whether the authority is certified. `1`: Yes; `2`: No.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the authority is certified. `1`: Yes; `2`: No.
     * @param Status Whether the authority is certified. `1`: Yes; `2`: No.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The DID service ID. 
     * @return DidServiceId The DID service ID.
     */
    public Long getDidServiceId() {
        return this.DidServiceId;
    }

    /**
     * Set The DID service ID.
     * @param DidServiceId The DID service ID.
     */
    public void setDidServiceId(Long DidServiceId) {
        this.DidServiceId = DidServiceId;
    }

    /**
     * Get The application ID. 
     * @return ContractAppId The application ID.
     */
    public Long getContractAppId() {
        return this.ContractAppId;
    }

    /**
     * Set The application ID.
     * @param ContractAppId The application ID.
     */
    public void setContractAppId(Long ContractAppId) {
        this.ContractAppId = ContractAppId;
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
     * Get The registration time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RegisterTime The registration time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set The registration time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RegisterTime The registration time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get The recognition time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RecognizeTime The recognition time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRecognizeTime() {
        return this.RecognizeTime;
    }

    /**
     * Set The recognition time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RecognizeTime The recognition time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRecognizeTime(String RecognizeTime) {
        this.RecognizeTime = RecognizeTime;
    }

    /**
     * Get The creation time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime The creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime The creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UpdateTime The last updated time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UpdateTime The last updated time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get The on-chain label. 
     * @return LabelName The on-chain label.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set The on-chain label.
     * @param LabelName The on-chain label.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    public Authority() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Authority(Authority source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DidId != null) {
            this.DidId = new Long(source.DidId);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DidServiceId != null) {
            this.DidServiceId = new Long(source.DidServiceId);
        }
        if (source.ContractAppId != null) {
            this.ContractAppId = new Long(source.ContractAppId);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DidId", this.DidId);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DidServiceId", this.DidServiceId);
        this.setParamSimple(map, prefix + "ContractAppId", this.ContractAppId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "RecognizeTime", this.RecognizeTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);

    }
}

