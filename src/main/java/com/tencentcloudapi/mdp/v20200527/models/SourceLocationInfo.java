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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceLocationInfo extends AbstractModel {

    /**
    * ID, unique identification.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * SourceLocation name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * area.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * BaseUrl information.
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
    * List of bound live broadcast source ids.
    */
    @SerializedName("AttachedLiveSources")
    @Expose
    private String [] AttachedLiveSources;

    /**
    * List of bound on-demand source ids.
    */
    @SerializedName("AttachedVodSources")
    @Expose
    private String [] AttachedVodSources;

    /**
    * Source location creation time, Unix timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Source location last modified time, Unix timestamp.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Whether to enable package distribution sharding, it is enabled by default.
    */
    @SerializedName("SegmentDeliverUsePackageEnable")
    @Expose
    private Boolean SegmentDeliverUsePackageEnable;

    /**
     * Get ID, unique identification. 
     * @return Id ID, unique identification.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID, unique identification.
     * @param Id ID, unique identification.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

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
     * Get area. 
     * @return Region area.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set area.
     * @param Region area.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get BaseUrl information. 
     * @return BaseUrl BaseUrl information.
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set BaseUrl information.
     * @param BaseUrl BaseUrl information.
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
     * Get List of bound live broadcast source ids. 
     * @return AttachedLiveSources List of bound live broadcast source ids.
     */
    public String [] getAttachedLiveSources() {
        return this.AttachedLiveSources;
    }

    /**
     * Set List of bound live broadcast source ids.
     * @param AttachedLiveSources List of bound live broadcast source ids.
     */
    public void setAttachedLiveSources(String [] AttachedLiveSources) {
        this.AttachedLiveSources = AttachedLiveSources;
    }

    /**
     * Get List of bound on-demand source ids. 
     * @return AttachedVodSources List of bound on-demand source ids.
     */
    public String [] getAttachedVodSources() {
        return this.AttachedVodSources;
    }

    /**
     * Set List of bound on-demand source ids.
     * @param AttachedVodSources List of bound on-demand source ids.
     */
    public void setAttachedVodSources(String [] AttachedVodSources) {
        this.AttachedVodSources = AttachedVodSources;
    }

    /**
     * Get Source location creation time, Unix timestamp. 
     * @return CreateTime Source location creation time, Unix timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Source location creation time, Unix timestamp.
     * @param CreateTime Source location creation time, Unix timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Source location last modified time, Unix timestamp. 
     * @return UpdateTime Source location last modified time, Unix timestamp.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Source location last modified time, Unix timestamp.
     * @param UpdateTime Source location last modified time, Unix timestamp.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public SourceLocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceLocationInfo(SourceLocationInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        if (source.AttachedLiveSources != null) {
            this.AttachedLiveSources = new String[source.AttachedLiveSources.length];
            for (int i = 0; i < source.AttachedLiveSources.length; i++) {
                this.AttachedLiveSources[i] = new String(source.AttachedLiveSources[i]);
            }
        }
        if (source.AttachedVodSources != null) {
            this.AttachedVodSources = new String[source.AttachedVodSources.length];
            for (int i = 0; i < source.AttachedVodSources.length; i++) {
                this.AttachedVodSources[i] = new String(source.AttachedVodSources[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.SegmentDeliverUsePackageEnable != null) {
            this.SegmentDeliverUsePackageEnable = new Boolean(source.SegmentDeliverUsePackageEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamSimple(map, prefix + "SegmentDeliverEnable", this.SegmentDeliverEnable);
        this.setParamObj(map, prefix + "SegmentDeliverConf.", this.SegmentDeliverConf);
        this.setParamArraySimple(map, prefix + "AttachedLiveSources.", this.AttachedLiveSources);
        this.setParamArraySimple(map, prefix + "AttachedVodSources.", this.AttachedVodSources);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentDeliverUsePackageEnable", this.SegmentDeliverUsePackageEnable);

    }
}

