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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetaOwner extends AbstractModel {

    /**
    * Metadata name (full name): catalog.schema.table
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Owner type: User
    */
    @SerializedName("OwnerType")
    @Expose
    private String OwnerType;

    /**
    * Owner: Unique ID (uin)
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Owner name.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
     * Get Metadata name (full name): catalog.schema.table 
     * @return FullName Metadata name (full name): catalog.schema.table
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Metadata name (full name): catalog.schema.table
     * @param FullName Metadata name (full name): catalog.schema.table
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Owner type: User 
     * @return OwnerType Owner type: User
     */
    public String getOwnerType() {
        return this.OwnerType;
    }

    /**
     * Set Owner type: User
     * @param OwnerType Owner type: User
     */
    public void setOwnerType(String OwnerType) {
        this.OwnerType = OwnerType;
    }

    /**
     * Get Owner: Unique ID (uin) 
     * @return Owner Owner: Unique ID (uin)
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Owner: Unique ID (uin)
     * @param Owner Owner: Unique ID (uin)
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Owner name. 
     * @return OwnerName Owner name.
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set Owner name.
     * @param OwnerName Owner name.
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public MetaOwner() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaOwner(MetaOwner source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.OwnerType != null) {
            this.OwnerType = new String(source.OwnerType);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "OwnerType", this.OwnerType);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);

    }
}

