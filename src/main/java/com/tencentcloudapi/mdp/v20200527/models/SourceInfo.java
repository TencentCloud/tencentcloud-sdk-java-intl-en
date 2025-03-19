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

public class SourceInfo extends AbstractModel {

    /**
    * name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The source type distinguishes between live broadcast and on-demand Vod.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Source configuration.
    */
    @SerializedName("PackageConf")
    @Expose
    private SourcePackageConf [] PackageConf;

    /**
    * ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Create timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update timestamp.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get name. 
     * @return Name name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set name.
     * @param Name name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The source type distinguishes between live broadcast and on-demand Vod. 
     * @return Type The source type distinguishes between live broadcast and on-demand Vod.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The source type distinguishes between live broadcast and on-demand Vod.
     * @param Type The source type distinguishes between live broadcast and on-demand Vod.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Source configuration. 
     * @return PackageConf Source configuration.
     */
    public SourcePackageConf [] getPackageConf() {
        return this.PackageConf;
    }

    /**
     * Set Source configuration.
     * @param PackageConf Source configuration.
     */
    public void setPackageConf(SourcePackageConf [] PackageConf) {
        this.PackageConf = PackageConf;
    }

    /**
     * Get ID. 
     * @return Id ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID.
     * @param Id ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Create timestamp. 
     * @return CreateTime Create timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Create timestamp.
     * @param CreateTime Create timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update timestamp. 
     * @return UpdateTime Update timestamp.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timestamp.
     * @param UpdateTime Update timestamp.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public SourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInfo(SourceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PackageConf != null) {
            this.PackageConf = new SourcePackageConf[source.PackageConf.length];
            for (int i = 0; i < source.PackageConf.length; i++) {
                this.PackageConf[i] = new SourcePackageConf(source.PackageConf[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "PackageConf.", this.PackageConf);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

