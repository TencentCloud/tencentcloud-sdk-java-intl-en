/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlueprintAttributeRequest extends AbstractModel {

    /**
    * Image ID, which can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * New image name, which can contain up to 60 characters.
    */
    @SerializedName("BlueprintName")
    @Expose
    private String BlueprintName;

    /**
    * New image description, which can contain up to 60 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Image ID, which can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API. 
     * @return BlueprintId Image ID, which can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Image ID, which can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
     * @param BlueprintId Image ID, which can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get New image name, which can contain up to 60 characters. 
     * @return BlueprintName New image name, which can contain up to 60 characters.
     */
    public String getBlueprintName() {
        return this.BlueprintName;
    }

    /**
     * Set New image name, which can contain up to 60 characters.
     * @param BlueprintName New image name, which can contain up to 60 characters.
     */
    public void setBlueprintName(String BlueprintName) {
        this.BlueprintName = BlueprintName;
    }

    /**
     * Get New image description, which can contain up to 60 characters. 
     * @return Description New image description, which can contain up to 60 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New image description, which can contain up to 60 characters.
     * @param Description New image description, which can contain up to 60 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyBlueprintAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlueprintAttributeRequest(ModifyBlueprintAttributeRequest source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.BlueprintName != null) {
            this.BlueprintName = new String(source.BlueprintName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamSimple(map, prefix + "BlueprintName", this.BlueprintName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

