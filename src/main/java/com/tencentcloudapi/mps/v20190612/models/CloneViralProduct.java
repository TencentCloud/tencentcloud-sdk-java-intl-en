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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralProduct extends AbstractModel {

    /**
    * <p>Product image</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>Product name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Product description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Product image</p> 
     * @return Images <p>Product image</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>Product image</p>
     * @param Images <p>Product image</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Product name</p> 
     * @return Name <p>Product name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Product name</p>
     * @param Name <p>Product name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Product description</p> 
     * @return Description <p>Product description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Product description</p>
     * @param Description <p>Product description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CloneViralProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralProduct(CloneViralProduct source) {
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

