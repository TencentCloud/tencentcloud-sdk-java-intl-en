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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillSecScanResultRequest extends AbstractModel {

    /**
    * <p>Service ID.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest. Strictly follow the ZIP packaging specifications in the documentation</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>Response language. Valid values: zh / en. Default value: zh</p>
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
     * Get <p>Service ID.</p> 
     * @return ServiceId <p>Service ID.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Service ID.</p>
     * @param ServiceId <p>Service ID.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest. Strictly follow the ZIP packaging specifications in the documentation</p> 
     * @return ContentHash <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest. Strictly follow the ZIP packaging specifications in the documentation</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest. Strictly follow the ZIP packaging specifications in the documentation</p>
     * @param ContentHash <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest. Strictly follow the ZIP packaging specifications in the documentation</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>Response language. Valid values: zh / en. Default value: zh</p> 
     * @return Lang <p>Response language. Valid values: zh / en. Default value: zh</p>
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set <p>Response language. Valid values: zh / en. Default value: zh</p>
     * @param Lang <p>Response language. Valid values: zh / en. Default value: zh</p>
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public DescribeSkillSecScanResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillSecScanResultRequest(DescribeSkillSecScanResultRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "Lang", this.Lang);

    }
}

