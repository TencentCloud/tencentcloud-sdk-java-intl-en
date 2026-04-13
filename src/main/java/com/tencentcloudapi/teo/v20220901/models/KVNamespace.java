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
    * Namespace name. Has uniqueness in the same site.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Namespace description. Remark information filled in upon creation, used for explaining the purpose or business meaning of the namespace. Supports a maximum of 256 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Available capacity of KV storage space in bytes. It indicates the maximum capacity limit of storable data in namespace, defaulting to 1 GB.
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * KV storage space used capacity in bytes (Byte). It indicates the currently used storage space size of the namespace.
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * List of referenced instances in the namespace. Shows which edge function instances reference the current namespace and the site information referenced. Returns an empty array if not referenced.
    */
    @SerializedName("References")
    @Expose
    private ComponentReference [] References;

    /**
    * The creation time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The last modification time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Namespace name. Has uniqueness in the same site. 
     * @return Namespace Namespace name. Has uniqueness in the same site.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name. Has uniqueness in the same site.
     * @param Namespace Namespace name. Has uniqueness in the same site.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Namespace description. Remark information filled in upon creation, used for explaining the purpose or business meaning of the namespace. Supports a maximum of 256 characters. 
     * @return Remark Namespace description. Remark information filled in upon creation, used for explaining the purpose or business meaning of the namespace. Supports a maximum of 256 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Namespace description. Remark information filled in upon creation, used for explaining the purpose or business meaning of the namespace. Supports a maximum of 256 characters.
     * @param Remark Namespace description. Remark information filled in upon creation, used for explaining the purpose or business meaning of the namespace. Supports a maximum of 256 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Available capacity of KV storage space in bytes. It indicates the maximum capacity limit of storable data in namespace, defaulting to 1 GB. 
     * @return Capacity Available capacity of KV storage space in bytes. It indicates the maximum capacity limit of storable data in namespace, defaulting to 1 GB.
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Available capacity of KV storage space in bytes. It indicates the maximum capacity limit of storable data in namespace, defaulting to 1 GB.
     * @param Capacity Available capacity of KV storage space in bytes. It indicates the maximum capacity limit of storable data in namespace, defaulting to 1 GB.
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get KV storage space used capacity in bytes (Byte). It indicates the currently used storage space size of the namespace. 
     * @return CapacityUsed KV storage space used capacity in bytes (Byte). It indicates the currently used storage space size of the namespace.
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set KV storage space used capacity in bytes (Byte). It indicates the currently used storage space size of the namespace.
     * @param CapacityUsed KV storage space used capacity in bytes (Byte). It indicates the currently used storage space size of the namespace.
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get List of referenced instances in the namespace. Shows which edge function instances reference the current namespace and the site information referenced. Returns an empty array if not referenced. 
     * @return References List of referenced instances in the namespace. Shows which edge function instances reference the current namespace and the site information referenced. Returns an empty array if not referenced.
     */
    public ComponentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set List of referenced instances in the namespace. Shows which edge function instances reference the current namespace and the site information referenced. Returns an empty array if not referenced.
     * @param References List of referenced instances in the namespace. Shows which edge function instances reference the current namespace and the site information referenced. Returns an empty array if not referenced.
     */
    public void setReferences(ComponentReference [] References) {
        this.References = References;
    }

    /**
     * Get The creation time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time). 
     * @return CreatedOn The creation time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
     * @param CreatedOn The creation time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The last modification time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time). 
     * @return ModifiedOn The last modification time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set The last modification time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
     * @param ModifiedOn The last modification time of the namespace follows the ISO 8601 standard in the format YYYY-MM-DDThh:mm:ssZ (UTC time).
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

