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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddResourceTagRequest extends AbstractModel {

    /**
    * The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Resource to be associated, represented in the standard six-segment resource format. For the correct format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * Get The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1 
     * @return TagKey The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     * @param TagKey The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1 
     * @return TagValue The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     * @param TagValue The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Resource to be associated, represented in the standard six-segment resource format. For the correct format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1 
     * @return Resource Resource to be associated, represented in the standard six-segment resource format. For the correct format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource to be associated, represented in the standard six-segment resource format. For the correct format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
     * @param Resource Resource to be associated, represented in the standard six-segment resource format. For the correct format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    public AddResourceTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddResourceTagRequest(AddResourceTagRequest source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

