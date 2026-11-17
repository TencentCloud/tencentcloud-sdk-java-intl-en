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

public class DescribeAigcWhitelistRequest extends AbstractModel {

    /**
    * <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
    */
    @SerializedName("AigcType")
    @Expose
    private String AigcType;

    /**
     * Get <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul> 
     * @return AigcType <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
     */
    public String getAigcType() {
        return this.AigcType;
    }

    /**
     * Set <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
     * @param AigcType <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
     */
    public void setAigcType(String AigcType) {
        this.AigcType = AigcType;
    }

    public DescribeAigcWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcWhitelistRequest(DescribeAigcWhitelistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.AigcType != null) {
            this.AigcType = new String(source.AigcType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AigcType", this.AigcType);

    }
}

