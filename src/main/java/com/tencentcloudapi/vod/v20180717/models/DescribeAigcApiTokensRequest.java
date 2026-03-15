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

public class DescribeAigcApiTokensRequest extends AbstractModel {

    /**
    * <b>The VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. customers who activate vod services after december 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get <b>The VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. customers who activate vod services after december 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>. 
     * @return SubAppId <b>The VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. customers who activate vod services after december 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. customers who activate vod services after december 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>.
     * @param SubAppId <b>The VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. customers who activate vod services after december 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeAigcApiTokensRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcApiTokensRequest(DescribeAigcApiTokensRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

