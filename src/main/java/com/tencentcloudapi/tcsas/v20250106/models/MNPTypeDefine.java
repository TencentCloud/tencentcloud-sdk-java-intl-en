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

public class MNPTypeDefine extends AbstractModel {

    /**
    * Mini program category name.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Mini program category values.
    */
    @SerializedName("TypeValue")
    @Expose
    private String [] TypeValue;

    /**
    * Category ID.
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Creator.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Whether it is a system category.
    */
    @SerializedName("IsSystem")
    @Expose
    private Boolean IsSystem;

    /**
     * Get Mini program category name. 
     * @return TypeName Mini program category name.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Mini program category name.
     * @param TypeName Mini program category name.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Mini program category values. 
     * @return TypeValue Mini program category values.
     */
    public String [] getTypeValue() {
        return this.TypeValue;
    }

    /**
     * Set Mini program category values.
     * @param TypeValue Mini program category values.
     */
    public void setTypeValue(String [] TypeValue) {
        this.TypeValue = TypeValue;
    }

    /**
     * Get Category ID. 
     * @return TypeId Category ID.
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Category ID.
     * @param TypeId Category ID.
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creator. 
     * @return CreateUser Creator.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator.
     * @param CreateUser Creator.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Whether it is a system category. 
     * @return IsSystem Whether it is a system category.
     */
    public Boolean getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set Whether it is a system category.
     * @param IsSystem Whether it is a system category.
     */
    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public MNPTypeDefine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNPTypeDefine(MNPTypeDefine source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.TypeValue != null) {
            this.TypeValue = new String[source.TypeValue.length];
            for (int i = 0; i < source.TypeValue.length; i++) {
                this.TypeValue[i] = new String(source.TypeValue[i]);
            }
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.IsSystem != null) {
            this.IsSystem = new Boolean(source.IsSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "TypeValue.", this.TypeValue);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "IsSystem", this.IsSystem);

    }
}

