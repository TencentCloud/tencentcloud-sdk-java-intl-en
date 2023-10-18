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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseUsageDataRequest extends AbstractModel {

    /**
    * The start date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). The end date must be later than the start date.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The license type, which is DRM by default. Valid values:
<li> DRM</li>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get The start date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). 
     * @return StartTime The start date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     * @param StartTime The start date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). The end date must be later than the start date. 
     * @return EndTime The end date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). The end date must be later than the start date.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). The end date must be later than the start date.
     * @param EndTime The end date for the query in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). The end date must be later than the start date.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The license type, which is DRM by default. Valid values:
<li> DRM</li> 
     * @return LicenseType The license type, which is DRM by default. Valid values:
<li> DRM</li>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set The license type, which is DRM by default. Valid values:
<li> DRM</li>
     * @param LicenseType The license type, which is DRM by default. Valid values:
<li> DRM</li>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty. 
     * @return SubAppId The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     * @param SubAppId The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeLicenseUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseUsageDataRequest(DescribeLicenseUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

