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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAnimatedGraphicsTemplateRequest extends AbstractModel{

    /**
    * Unique ID of an animated image generating template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * ID of a [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Unique ID of an animated image generating template. 
     * @return Definition Unique ID of an animated image generating template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of an animated image generating template.
     * @param Definition Unique ID of an animated image generating template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get ID of a [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId ID of a [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set ID of a [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId ID of a [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

