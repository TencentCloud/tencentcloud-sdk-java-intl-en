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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubAppIdRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Mode 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 
     * @param Mode 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return StorageRegion 
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 
     * @param StorageRegion 
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get  
     * @return Tags 
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 
     * @param Tags 
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSubAppIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubAppIdRequest(CreateSubAppIdRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

