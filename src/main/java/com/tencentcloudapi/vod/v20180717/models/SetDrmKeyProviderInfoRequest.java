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

public class SetDrmKeyProviderInfoRequest extends AbstractModel {

    /**
    * <p>DRM key provider information related to SDMC.</p><p>The SDMC service will be gradually phased out subsequently. Please use the VOD DRM encryption service.</p>
    */
    @SerializedName("SDMCInfo")
    @Expose
    private SDMCDrmKeyProviderInfo SDMCInfo;

    /**
    * <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get <p>DRM key provider information related to SDMC.</p><p>The SDMC service will be gradually phased out subsequently. Please use the VOD DRM encryption service.</p> 
     * @return SDMCInfo <p>DRM key provider information related to SDMC.</p><p>The SDMC service will be gradually phased out subsequently. Please use the VOD DRM encryption service.</p>
     */
    public SDMCDrmKeyProviderInfo getSDMCInfo() {
        return this.SDMCInfo;
    }

    /**
     * Set <p>DRM key provider information related to SDMC.</p><p>The SDMC service will be gradually phased out subsequently. Please use the VOD DRM encryption service.</p>
     * @param SDMCInfo <p>DRM key provider information related to SDMC.</p><p>The SDMC service will be gradually phased out subsequently. Please use the VOD DRM encryption service.</p>
     */
    public void setSDMCInfo(SDMCDrmKeyProviderInfo SDMCInfo) {
        this.SDMCInfo = SDMCInfo;
    }

    /**
     * Get <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public SetDrmKeyProviderInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetDrmKeyProviderInfoRequest(SetDrmKeyProviderInfoRequest source) {
        if (source.SDMCInfo != null) {
            this.SDMCInfo = new SDMCDrmKeyProviderInfo(source.SDMCInfo);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SDMCInfo.", this.SDMCInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

