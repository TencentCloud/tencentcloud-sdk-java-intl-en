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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamPackageSourceLocationRequest extends AbstractModel {

    /**
    * SourceLocation name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * BaseUrl.
    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * Whether to enable patching.
    */
    @SerializedName("SegmentDeliverEnable")
    @Expose
    private Boolean SegmentDeliverEnable;

    /**
    * Patch configuration.
    */
    @SerializedName("SegmentDeliverConf")
    @Expose
    private SegmentDeliverInfo SegmentDeliverConf;

    /**
    * Whether to enable package distribution sharding, it is enabled by default.
    */
    @SerializedName("SegmentDeliverUsePackageEnable")
    @Expose
    private Boolean SegmentDeliverUsePackageEnable;

    /**
     * Get SourceLocation name. 
     * @return Name SourceLocation name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set SourceLocation name.
     * @param Name SourceLocation name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get BaseUrl. 
     * @return BaseUrl BaseUrl.
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set BaseUrl.
     * @param BaseUrl BaseUrl.
     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get Whether to enable patching. 
     * @return SegmentDeliverEnable Whether to enable patching.
     */
    public Boolean getSegmentDeliverEnable() {
        return this.SegmentDeliverEnable;
    }

    /**
     * Set Whether to enable patching.
     * @param SegmentDeliverEnable Whether to enable patching.
     */
    public void setSegmentDeliverEnable(Boolean SegmentDeliverEnable) {
        this.SegmentDeliverEnable = SegmentDeliverEnable;
    }

    /**
     * Get Patch configuration. 
     * @return SegmentDeliverConf Patch configuration.
     */
    public SegmentDeliverInfo getSegmentDeliverConf() {
        return this.SegmentDeliverConf;
    }

    /**
     * Set Patch configuration.
     * @param SegmentDeliverConf Patch configuration.
     */
    public void setSegmentDeliverConf(SegmentDeliverInfo SegmentDeliverConf) {
        this.SegmentDeliverConf = SegmentDeliverConf;
    }

    /**
     * Get Whether to enable package distribution sharding, it is enabled by default. 
     * @return SegmentDeliverUsePackageEnable Whether to enable package distribution sharding, it is enabled by default.
     */
    public Boolean getSegmentDeliverUsePackageEnable() {
        return this.SegmentDeliverUsePackageEnable;
    }

    /**
     * Set Whether to enable package distribution sharding, it is enabled by default.
     * @param SegmentDeliverUsePackageEnable Whether to enable package distribution sharding, it is enabled by default.
     */
    public void setSegmentDeliverUsePackageEnable(Boolean SegmentDeliverUsePackageEnable) {
        this.SegmentDeliverUsePackageEnable = SegmentDeliverUsePackageEnable;
    }

    public CreateStreamPackageSourceLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageSourceLocationRequest(CreateStreamPackageSourceLocationRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BaseUrl != null) {
            this.BaseUrl = new String(source.BaseUrl);
        }
        if (source.SegmentDeliverEnable != null) {
            this.SegmentDeliverEnable = new Boolean(source.SegmentDeliverEnable);
        }
        if (source.SegmentDeliverConf != null) {
            this.SegmentDeliverConf = new SegmentDeliverInfo(source.SegmentDeliverConf);
        }
        if (source.SegmentDeliverUsePackageEnable != null) {
            this.SegmentDeliverUsePackageEnable = new Boolean(source.SegmentDeliverUsePackageEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamSimple(map, prefix + "SegmentDeliverEnable", this.SegmentDeliverEnable);
        this.setParamObj(map, prefix + "SegmentDeliverConf.", this.SegmentDeliverConf);
        this.setParamSimple(map, prefix + "SegmentDeliverUsePackageEnable", this.SegmentDeliverUsePackageEnable);

    }
}

