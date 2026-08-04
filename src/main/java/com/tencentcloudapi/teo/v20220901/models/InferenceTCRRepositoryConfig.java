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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceTCRRepositoryConfig extends AbstractModel {

    /**
    * <p>TCR service type. Valid values: <li>Personal: personal edition;</li><li>Enterprise: enterprise edition.</li></p>
    */
    @SerializedName("TCRType")
    @Expose
    private String TCRType;

    /**
    * <p>Image address.</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>ID of the repository instance. Required when TCRType = Enterprise.</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Region name.</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get <p>TCR service type. Valid values: <li>Personal: personal edition;</li><li>Enterprise: enterprise edition.</li></p> 
     * @return TCRType <p>TCR service type. Valid values: <li>Personal: personal edition;</li><li>Enterprise: enterprise edition.</li></p>
     */
    public String getTCRType() {
        return this.TCRType;
    }

    /**
     * Set <p>TCR service type. Valid values: <li>Personal: personal edition;</li><li>Enterprise: enterprise edition.</li></p>
     * @param TCRType <p>TCR service type. Valid values: <li>Personal: personal edition;</li><li>Enterprise: enterprise edition.</li></p>
     */
    public void setTCRType(String TCRType) {
        this.TCRType = TCRType;
    }

    /**
     * Get <p>Image address.</p> 
     * @return Image <p>Image address.</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>Image address.</p>
     * @param Image <p>Image address.</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>ID of the repository instance. Required when TCRType = Enterprise.</p> 
     * @return RegistryId <p>ID of the repository instance. Required when TCRType = Enterprise.</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>ID of the repository instance. Required when TCRType = Enterprise.</p>
     * @param RegistryId <p>ID of the repository instance. Required when TCRType = Enterprise.</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Region name.</p> 
     * @return RegionName <p>Region name.</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>Region name.</p>
     * @param RegionName <p>Region name.</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public InferenceTCRRepositoryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceTCRRepositoryConfig(InferenceTCRRepositoryConfig source) {
        if (source.TCRType != null) {
            this.TCRType = new String(source.TCRType);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TCRType", this.TCRType);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

