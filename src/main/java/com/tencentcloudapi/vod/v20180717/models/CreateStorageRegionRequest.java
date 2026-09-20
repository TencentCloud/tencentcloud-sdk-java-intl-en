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

public class CreateStorageRegionRequest extends AbstractModel {

    /**
    * <p>Pending storage region, which must be a supported region.</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">supported region list</a></p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get <p>Pending storage region, which must be a supported region.</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">supported region list</a></p> 
     * @return StorageRegion <p>Pending storage region, which must be a supported region.</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">supported region list</a></p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>Pending storage region, which must be a supported region.</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">supported region list</a></p>
     * @param StorageRegion <p>Pending storage region, which must be a supported region.</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">supported region list</a></p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public CreateStorageRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStorageRegionRequest(CreateStorageRegionRequest source) {
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

