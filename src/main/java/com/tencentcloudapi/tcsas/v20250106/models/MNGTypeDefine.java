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

public class MNGTypeDefine extends AbstractModel {

    /**
    * <p>Mini game category name</p>
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * <p>Mini game category</p>
    */
    @SerializedName("TypeValue")
    @Expose
    private String [] TypeValue;

    /**
    * <p>Category ID</p>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>Creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Creator</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Whether this is a system category</p>
    */
    @SerializedName("IsSystem")
    @Expose
    private Boolean IsSystem;

    /**
     * Get <p>Mini game category name</p> 
     * @return TypeName <p>Mini game category name</p>
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set <p>Mini game category name</p>
     * @param TypeName <p>Mini game category name</p>
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get <p>Mini game category</p> 
     * @return TypeValue <p>Mini game category</p>
     */
    public String [] getTypeValue() {
        return this.TypeValue;
    }

    /**
     * Set <p>Mini game category</p>
     * @param TypeValue <p>Mini game category</p>
     */
    public void setTypeValue(String [] TypeValue) {
        this.TypeValue = TypeValue;
    }

    /**
     * Get <p>Category ID</p> 
     * @return TypeId <p>Category ID</p>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>Category ID</p>
     * @param TypeId <p>Category ID</p>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>Creation time</p> 
     * @return CreateTime <p>Creation time</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time</p>
     * @param CreateTime <p>Creation time</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Creator</p> 
     * @return CreateUser <p>Creator</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator</p>
     * @param CreateUser <p>Creator</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Whether this is a system category</p> 
     * @return IsSystem <p>Whether this is a system category</p>
     */
    public Boolean getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set <p>Whether this is a system category</p>
     * @param IsSystem <p>Whether this is a system category</p>
     */
    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public MNGTypeDefine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNGTypeDefine(MNGTypeDefine source) {
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

