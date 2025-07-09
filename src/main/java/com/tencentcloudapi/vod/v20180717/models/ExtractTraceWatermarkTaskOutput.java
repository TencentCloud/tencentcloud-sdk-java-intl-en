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

public class ExtractTraceWatermarkTaskOutput extends AbstractModel {

    /**
    * The distributor’s user ID, which is a six-digit hex number. This parameter is relevant when [digital watermarks](https://intl.cloud.tencent.com/document/product/266/75789?from_cn_redirect=1) are used.
    */
    @SerializedName("Uv")
    @Expose
    private String Uv;

    /**
    * This parameter has been deprecated.
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
     * Get The distributor’s user ID, which is a six-digit hex number. This parameter is relevant when [digital watermarks](https://intl.cloud.tencent.com/document/product/266/75789?from_cn_redirect=1) are used. 
     * @return Uv The distributor’s user ID, which is a six-digit hex number. This parameter is relevant when [digital watermarks](https://intl.cloud.tencent.com/document/product/266/75789?from_cn_redirect=1) are used.
     */
    public String getUv() {
        return this.Uv;
    }

    /**
     * Set The distributor’s user ID, which is a six-digit hex number. This parameter is relevant when [digital watermarks](https://intl.cloud.tencent.com/document/product/266/75789?from_cn_redirect=1) are used.
     * @param Uv The distributor’s user ID, which is a six-digit hex number. This parameter is relevant when [digital watermarks](https://intl.cloud.tencent.com/document/product/266/75789?from_cn_redirect=1) are used.
     */
    public void setUv(String Uv) {
        this.Uv = Uv;
    }

    /**
     * Get This parameter has been deprecated. 
     * @return Uid This parameter has been deprecated.
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set This parameter has been deprecated.
     * @param Uid This parameter has been deprecated.
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public ExtractTraceWatermarkTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractTraceWatermarkTaskOutput(ExtractTraceWatermarkTaskOutput source) {
        if (source.Uv != null) {
            this.Uv = new String(source.Uv);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uv", this.Uv);
        this.setParamSimple(map, prefix + "Uid", this.Uid);

    }
}

