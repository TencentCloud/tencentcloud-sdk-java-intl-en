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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KVNamespace extends AbstractModel {

    /**
    * Namespace name. It is unique within the same site.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Namespace description. Remark information filled in upon creation, used to describe the purpose or business meaning of the namespace. Supports up to 256 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Available capacity of the KV storage space, in bytes. It indicates the maximum capacity limit of storable data in the namespace, which defaults to 1 GB.
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * Used KV storage capacity in bytes. It indicates the currently used storage space size of the namespace.
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * List of instances that reference the namespace. Shows which edge function instances currently reference the namespace, as well as the site information of the references. If not referenced, return an empty array.
    */
    @SerializedName("References")
    @Expose
    private ComponentReference [] References;

    /**
    * Namespace creation time in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (UTC time).
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Last modification time of the namespace, following the ISO 8601 standard, format: YYYY-MM-DDThh:mm:ssZ (UTC time).
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Namespace name. It is unique within the same site. 
     * @return Namespace Namespace name. It is unique within the same site.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name. It is unique within the same site.
     * @param Namespace Namespace name. It is unique within the same site.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Namespace description. Remark information filled in upon creation, used to describe the purpose or business meaning of the namespace. Supports up to 256 characters. 
     * @return Remark Namespace description. Remark information filled in upon creation, used to describe the purpose or business meaning of the namespace. Supports up to 256 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Namespace description. Remark information filled in upon creation, used to describe the purpose or business meaning of the namespace. Supports up to 256 characters.
     * @param Remark Namespace description. Remark information filled in upon creation, used to describe the purpose or business meaning of the namespace. Supports up to 256 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Available capacity of the KV storage space, in bytes. It indicates the maximum capacity limit of storable data in the namespace, which defaults to 1 GB. 
     * @return Capacity Available capacity of the KV storage space, in bytes. It indicates the maximum capacity limit of storable data in the namespace, which defaults to 1 GB.
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Available capacity of the KV storage space, in bytes. It indicates the maximum capacity limit of storable data in the namespace, which defaults to 1 GB.
     * @param Capacity Available capacity of the KV storage space, in bytes. It indicates the maximum capacity limit of storable data in the namespace, which defaults to 1 GB.
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get Used KV storage capacity in bytes. It indicates the currently used storage space size of the namespace. 
     * @return CapacityUsed Used KV storage capacity in bytes. It indicates the currently used storage space size of the namespace.
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set Used KV storage capacity in bytes. It indicates the currently used storage space size of the namespace.
     * @param CapacityUsed Used KV storage capacity in bytes. It indicates the currently used storage space size of the namespace.
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get List of instances that reference the namespace. Shows which edge function instances currently reference the namespace, as well as the site information of the references. If not referenced, return an empty array. 
     * @return References List of instances that reference the namespace. Shows which edge function instances currently reference the namespace, as well as the site information of the references. If not referenced, return an empty array.
     */
    public ComponentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set List of instances that reference the namespace. Shows which edge function instances currently reference the namespace, as well as the site information of the references. If not referenced, return an empty array.
     * @param References List of instances that reference the namespace. Shows which edge function instances currently reference the namespace, as well as the site information of the references. If not referenced, return an empty array.
     */
    public void setReferences(ComponentReference [] References) {
        this.References = References;
    }

    /**
     * Get Namespace creation time in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (UTC time). 
     * @return CreatedOn Namespace creation time in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Namespace creation time in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (UTC time).
     * @param CreatedOn Namespace creation time in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Last modification time of the namespace, following the ISO 8601 standard, format: YYYY-MM-DDThh:mm:ssZ (UTC time). 
     * @return ModifiedOn Last modification time of the namespace, following the ISO 8601 standard, format: YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Last modification time of the namespace, following the ISO 8601 standard, format: YYYY-MM-DDThh:mm:ssZ (UTC time).
     * @param ModifiedOn Last modification time of the namespace, following the ISO 8601 standard, format: YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public KVNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KVNamespace(KVNamespace source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.References != null) {
            this.References = new ComponentReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ComponentReference(source.References[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

