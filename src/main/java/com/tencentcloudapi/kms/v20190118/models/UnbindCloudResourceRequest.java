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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindCloudResourceRequest extends AbstractModel {

    /**
    * CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Unique ID of a Tencent Cloud service
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Resource/instance ID, which is stored as a string and defined by the caller based on the Tencent Cloud service's features.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get CMK ID 
     * @return KeyId CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK ID
     * @param KeyId CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Unique ID of a Tencent Cloud service 
     * @return ProductId Unique ID of a Tencent Cloud service
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Unique ID of a Tencent Cloud service
     * @param ProductId Unique ID of a Tencent Cloud service
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Resource/instance ID, which is stored as a string and defined by the caller based on the Tencent Cloud service's features. 
     * @return ResourceId Resource/instance ID, which is stored as a string and defined by the caller based on the Tencent Cloud service's features.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource/instance ID, which is stored as a string and defined by the caller based on the Tencent Cloud service's features.
     * @param ResourceId Resource/instance ID, which is stored as a string and defined by the caller based on the Tencent Cloud service's features.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public UnbindCloudResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindCloudResourceRequest(UnbindCloudResourceRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

