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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareUnitResource extends AbstractModel {

    /**
    * Shared resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Shared resource type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Product resource ID.
    */
    @SerializedName("ProductResourceId")
    @Expose
    private String ProductResourceId;

    /**
    * Number of members in a sharing unit.
    */
    @SerializedName("SharedMemberNum")
    @Expose
    private Long SharedMemberNum;

    /**
    * Number of members using shared resources.
    */
    @SerializedName("SharedMemberUseNum")
    @Expose
    private Long SharedMemberUseNum;

    /**
    * Sharing unit administrator.
    */
    @SerializedName("ShareManagerUin")
    @Expose
    private Long ShareManagerUin;

    /**
     * Get Shared resource ID. 
     * @return ResourceId Shared resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Shared resource ID.
     * @param ResourceId Shared resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Shared resource type. 
     * @return Type Shared resource type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Shared resource type.
     * @param Type Shared resource type.
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Product resource ID. 
     * @return ProductResourceId Product resource ID.
     */
    public String getProductResourceId() {
        return this.ProductResourceId;
    }

    /**
     * Set Product resource ID.
     * @param ProductResourceId Product resource ID.
     */
    public void setProductResourceId(String ProductResourceId) {
        this.ProductResourceId = ProductResourceId;
    }

    /**
     * Get Number of members in a sharing unit. 
     * @return SharedMemberNum Number of members in a sharing unit.
     */
    public Long getSharedMemberNum() {
        return this.SharedMemberNum;
    }

    /**
     * Set Number of members in a sharing unit.
     * @param SharedMemberNum Number of members in a sharing unit.
     */
    public void setSharedMemberNum(Long SharedMemberNum) {
        this.SharedMemberNum = SharedMemberNum;
    }

    /**
     * Get Number of members using shared resources. 
     * @return SharedMemberUseNum Number of members using shared resources.
     */
    public Long getSharedMemberUseNum() {
        return this.SharedMemberUseNum;
    }

    /**
     * Set Number of members using shared resources.
     * @param SharedMemberUseNum Number of members using shared resources.
     */
    public void setSharedMemberUseNum(Long SharedMemberUseNum) {
        this.SharedMemberUseNum = SharedMemberUseNum;
    }

    /**
     * Get Sharing unit administrator. 
     * @return ShareManagerUin Sharing unit administrator.
     */
    public Long getShareManagerUin() {
        return this.ShareManagerUin;
    }

    /**
     * Set Sharing unit administrator.
     * @param ShareManagerUin Sharing unit administrator.
     */
    public void setShareManagerUin(Long ShareManagerUin) {
        this.ShareManagerUin = ShareManagerUin;
    }

    public ShareUnitResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareUnitResource(ShareUnitResource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProductResourceId != null) {
            this.ProductResourceId = new String(source.ProductResourceId);
        }
        if (source.SharedMemberNum != null) {
            this.SharedMemberNum = new Long(source.SharedMemberNum);
        }
        if (source.SharedMemberUseNum != null) {
            this.SharedMemberUseNum = new Long(source.SharedMemberUseNum);
        }
        if (source.ShareManagerUin != null) {
            this.ShareManagerUin = new Long(source.ShareManagerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductResourceId", this.ProductResourceId);
        this.setParamSimple(map, prefix + "SharedMemberNum", this.SharedMemberNum);
        this.setParamSimple(map, prefix + "SharedMemberUseNum", this.SharedMemberUseNum);
        this.setParamSimple(map, prefix + "ShareManagerUin", this.ShareManagerUin);

    }
}

