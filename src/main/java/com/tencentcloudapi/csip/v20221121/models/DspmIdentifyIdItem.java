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

public class DspmIdentifyIdItem extends AbstractModel {

    /**
    * Identity id.
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * User belonging to the cloud account uin.
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * Creator account uin user.
    */
    @SerializedName("CreatorUin")
    @Expose
    private DspmUinUser CreatorUin;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status. 0: inactive; 1: active
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Information of the personal user it belongs to
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

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
     * Get Identity type. 0: undefined; 2: long-term identity; 3: temporary identity 
     * @return IdentifyType Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
     * @param IdentifyType Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get User belonging to the cloud account uin. 
     * @return OwnerUin User belonging to the cloud account uin.
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User belonging to the cloud account uin.
     * @param OwnerUin User belonging to the cloud account uin.
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creator account uin user. 
     * @return CreatorUin Creator account uin user.
     */
    public DspmUinUser getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator account uin user.
     * @param CreatorUin Creator account uin user.
     */
    public void setCreatorUin(DspmUinUser CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Status. 0: inactive; 1: active 
     * @return Status Status. 0: inactive; 1: active
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: inactive; 1: active
     * @param Status Status. 0: inactive; 1: active
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Information of the personal user it belongs to 
     * @return Person Information of the personal user it belongs to
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set Information of the personal user it belongs to
     * @param Person Information of the personal user it belongs to
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    public DspmIdentifyIdItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyIdItem(DspmIdentifyIdItem source) {
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new DspmUinUser(source.CreatorUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "CreatorUin.", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Person.", this.Person);

    }
}

