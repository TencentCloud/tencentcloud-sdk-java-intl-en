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

public class CreateStreamPackageSourceRequest extends AbstractModel {

    /**
    * The location id to which this source belongs is required and uniquely bound to one location.
    */
    @SerializedName("AttachedLocation")
    @Expose
    private String AttachedLocation;

    /**
    * Source name, globally unique under location.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Distinguish between live broadcast and on-demand VOD source types. Optional values: Live, VOD.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * source specific configuration.
    */
    @SerializedName("PackageConfs")
    @Expose
    private SourcePackageConf [] PackageConfs;

    /**
     * Get The location id to which this source belongs is required and uniquely bound to one location. 
     * @return AttachedLocation The location id to which this source belongs is required and uniquely bound to one location.
     */
    public String getAttachedLocation() {
        return this.AttachedLocation;
    }

    /**
     * Set The location id to which this source belongs is required and uniquely bound to one location.
     * @param AttachedLocation The location id to which this source belongs is required and uniquely bound to one location.
     */
    public void setAttachedLocation(String AttachedLocation) {
        this.AttachedLocation = AttachedLocation;
    }

    /**
     * Get Source name, globally unique under location. 
     * @return Name Source name, globally unique under location.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Source name, globally unique under location.
     * @param Name Source name, globally unique under location.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Distinguish between live broadcast and on-demand VOD source types. Optional values: Live, VOD. 
     * @return Type Distinguish between live broadcast and on-demand VOD source types. Optional values: Live, VOD.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Distinguish between live broadcast and on-demand VOD source types. Optional values: Live, VOD.
     * @param Type Distinguish between live broadcast and on-demand VOD source types. Optional values: Live, VOD.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get source specific configuration. 
     * @return PackageConfs source specific configuration.
     */
    public SourcePackageConf [] getPackageConfs() {
        return this.PackageConfs;
    }

    /**
     * Set source specific configuration.
     * @param PackageConfs source specific configuration.
     */
    public void setPackageConfs(SourcePackageConf [] PackageConfs) {
        this.PackageConfs = PackageConfs;
    }

    public CreateStreamPackageSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageSourceRequest(CreateStreamPackageSourceRequest source) {
        if (source.AttachedLocation != null) {
            this.AttachedLocation = new String(source.AttachedLocation);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PackageConfs != null) {
            this.PackageConfs = new SourcePackageConf[source.PackageConfs.length];
            for (int i = 0; i < source.PackageConfs.length; i++) {
                this.PackageConfs[i] = new SourcePackageConf(source.PackageConfs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttachedLocation", this.AttachedLocation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "PackageConfs.", this.PackageConfs);

    }
}

