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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaunchTemplateVersionsRequest extends AbstractModel {

    /**
    * The launch template ID
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * List of instance launch templates.
    */
    @SerializedName("LaunchTemplateVersions")
    @Expose
    private Long [] LaunchTemplateVersions;

    /**
    * The minimum version number specified, which defaults to 0.
    */
    @SerializedName("MinVersion")
    @Expose
    private Long MinVersion;

    /**
    * The maximum version number specified, which defaults to 30.
    */
    @SerializedName("MaxVersion")
    @Expose
    private Long MaxVersion;

    /**
    * The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specify whether to query the default version. This parameter and `LaunchTemplateVersions` cannot be specified at the same time.
    */
    @SerializedName("DefaultVersion")
    @Expose
    private Boolean DefaultVersion;

    /**
     * Get The launch template ID 
     * @return LaunchTemplateId The launch template ID
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set The launch template ID
     * @param LaunchTemplateId The launch template ID
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get List of instance launch templates. 
     * @return LaunchTemplateVersions List of instance launch templates.
     */
    public Long [] getLaunchTemplateVersions() {
        return this.LaunchTemplateVersions;
    }

    /**
     * Set List of instance launch templates.
     * @param LaunchTemplateVersions List of instance launch templates.
     */
    public void setLaunchTemplateVersions(Long [] LaunchTemplateVersions) {
        this.LaunchTemplateVersions = LaunchTemplateVersions;
    }

    /**
     * Get The minimum version number specified, which defaults to 0. 
     * @return MinVersion The minimum version number specified, which defaults to 0.
     */
    public Long getMinVersion() {
        return this.MinVersion;
    }

    /**
     * Set The minimum version number specified, which defaults to 0.
     * @param MinVersion The minimum version number specified, which defaults to 0.
     */
    public void setMinVersion(Long MinVersion) {
        this.MinVersion = MinVersion;
    }

    /**
     * Get The maximum version number specified, which defaults to 30. 
     * @return MaxVersion The maximum version number specified, which defaults to 30.
     */
    public Long getMaxVersion() {
        return this.MaxVersion;
    }

    /**
     * Set The maximum version number specified, which defaults to 30.
     * @param MaxVersion The maximum version number specified, which defaults to 30.
     */
    public void setMaxVersion(Long MaxVersion) {
        this.MaxVersion = MaxVersion;
    }

    /**
     * Get The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specify whether to query the default version. This parameter and `LaunchTemplateVersions` cannot be specified at the same time. 
     * @return DefaultVersion Specify whether to query the default version. This parameter and `LaunchTemplateVersions` cannot be specified at the same time.
     */
    public Boolean getDefaultVersion() {
        return this.DefaultVersion;
    }

    /**
     * Set Specify whether to query the default version. This parameter and `LaunchTemplateVersions` cannot be specified at the same time.
     * @param DefaultVersion Specify whether to query the default version. This parameter and `LaunchTemplateVersions` cannot be specified at the same time.
     */
    public void setDefaultVersion(Boolean DefaultVersion) {
        this.DefaultVersion = DefaultVersion;
    }

    public DescribeLaunchTemplateVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLaunchTemplateVersionsRequest(DescribeLaunchTemplateVersionsRequest source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateVersions != null) {
            this.LaunchTemplateVersions = new Long[source.LaunchTemplateVersions.length];
            for (int i = 0; i < source.LaunchTemplateVersions.length; i++) {
                this.LaunchTemplateVersions[i] = new Long(source.LaunchTemplateVersions[i]);
            }
        }
        if (source.MinVersion != null) {
            this.MinVersion = new Long(source.MinVersion);
        }
        if (source.MaxVersion != null) {
            this.MaxVersion = new Long(source.MaxVersion);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DefaultVersion != null) {
            this.DefaultVersion = new Boolean(source.DefaultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamArraySimple(map, prefix + "LaunchTemplateVersions.", this.LaunchTemplateVersions);
        this.setParamSimple(map, prefix + "MinVersion", this.MinVersion);
        this.setParamSimple(map, prefix + "MaxVersion", this.MaxVersion);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DefaultVersion", this.DefaultVersion);

    }
}

