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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiZoneSetting extends AbstractModel {

    /**
    * "master", "standby" or "third-party".
    */
    @SerializedName("ZoneTag")
    @Expose
    private String ZoneTag;

    /**
    * None
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * None
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * None
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
     * Get "master", "standby" or "third-party". 
     * @return ZoneTag "master", "standby" or "third-party".
     */
    public String getZoneTag() {
        return this.ZoneTag;
    }

    /**
     * Set "master", "standby" or "third-party".
     * @param ZoneTag "master", "standby" or "third-party".
     */
    public void setZoneTag(String ZoneTag) {
        this.ZoneTag = ZoneTag;
    }

    /**
     * Get None 
     * @return VPCSettings None
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set None
     * @param VPCSettings None
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get None 
     * @return Placement None
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set None
     * @param Placement None
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get None 
     * @return ResourceSpec None
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set None
     * @param ResourceSpec None
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    public MultiZoneSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiZoneSetting(MultiZoneSetting source) {
        if (source.ZoneTag != null) {
            this.ZoneTag = new String(source.ZoneTag);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneTag", this.ZoneTag);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);

    }
}

