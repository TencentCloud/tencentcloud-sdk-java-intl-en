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

public class ShareResourceToMember extends AbstractModel {

    /**
    * Shared unit resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Shared unit ID.
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * Shared unit name.
    */
    @SerializedName("UnitName")
    @Expose
    private String UnitName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Business resource ID.
    */
    @SerializedName("ProductResourceId")
    @Expose
    private String ProductResourceId;

    /**
    * Shared account Uin.
    */
    @SerializedName("ShareManagerUin")
    @Expose
    private Long ShareManagerUin;

    /**
     * Get Shared unit resource ID. 
     * @return ResourceId Shared unit resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Shared unit resource ID.
     * @param ResourceId Shared unit resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. 
     * @return Type Resource type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Resource type.
     * @param Type Resource type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Shared unit ID. 
     * @return UnitId Shared unit ID.
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set Shared unit ID.
     * @param UnitId Shared unit ID.
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get Shared unit name. 
     * @return UnitName Shared unit name.
     */
    public String getUnitName() {
        return this.UnitName;
    }

    /**
     * Set Shared unit name.
     * @param UnitName Shared unit name.
     */
    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
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
     * Get Business resource ID. 
     * @return ProductResourceId Business resource ID.
     */
    public String getProductResourceId() {
        return this.ProductResourceId;
    }

    /**
     * Set Business resource ID.
     * @param ProductResourceId Business resource ID.
     */
    public void setProductResourceId(String ProductResourceId) {
        this.ProductResourceId = ProductResourceId;
    }

    /**
     * Get Shared account Uin. 
     * @return ShareManagerUin Shared account Uin.
     */
    public Long getShareManagerUin() {
        return this.ShareManagerUin;
    }

    /**
     * Set Shared account Uin.
     * @param ShareManagerUin Shared account Uin.
     */
    public void setShareManagerUin(Long ShareManagerUin) {
        this.ShareManagerUin = ShareManagerUin;
    }

    public ShareResourceToMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareResourceToMember(ShareResourceToMember source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.UnitName != null) {
            this.UnitName = new String(source.UnitName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProductResourceId != null) {
            this.ProductResourceId = new String(source.ProductResourceId);
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
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "UnitName", this.UnitName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductResourceId", this.ProductResourceId);
        this.setParamSimple(map, prefix + "ShareManagerUin", this.ShareManagerUin);

    }
}

