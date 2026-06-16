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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceItem extends AbstractModel {

    /**
    * Resource name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * resource value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceValue")
    @Expose
    private Boolean ResourceValue;

    /**
    * Changeable
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanChange")
    @Expose
    private Boolean CanChange;

    /**
    * Prompt message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
     * Get Resource name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceName Resource name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceName Resource name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get resource value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceValue resource value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getResourceValue() {
        return this.ResourceValue;
    }

    /**
     * Set resource value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceValue resource value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceValue(Boolean ResourceValue) {
        this.ResourceValue = ResourceValue;
    }

    /**
     * Get Changeable
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanChange Changeable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanChange() {
        return this.CanChange;
    }

    /**
     * Set Changeable
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanChange Changeable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanChange(Boolean CanChange) {
        this.CanChange = CanChange;
    }

    /**
     * Get Prompt message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tips Prompt message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set Prompt message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tips Prompt message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    public ResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceItem(ResourceItem source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceValue != null) {
            this.ResourceValue = new Boolean(source.ResourceValue);
        }
        if (source.CanChange != null) {
            this.CanChange = new Boolean(source.CanChange);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceValue", this.ResourceValue);
        this.setParamSimple(map, prefix + "CanChange", this.CanChange);
        this.setParamSimple(map, prefix + "Tips", this.Tips);

    }
}

