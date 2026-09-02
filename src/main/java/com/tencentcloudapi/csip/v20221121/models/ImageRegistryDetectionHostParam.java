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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRegistryDetectionHostParam extends AbstractModel {

    /**
    * <p>Host UUID.</p>
    */
    @SerializedName("InstanceUuid")
    @Expose
    private String InstanceUuid;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Host quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get <p>Host UUID.</p> 
     * @return InstanceUuid <p>Host UUID.</p>
     */
    public String getInstanceUuid() {
        return this.InstanceUuid;
    }

    /**
     * Set <p>Host UUID.</p>
     * @param InstanceUuid <p>Host UUID.</p>
     */
    public void setInstanceUuid(String InstanceUuid) {
        this.InstanceUuid = InstanceUuid;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Host quuid</p> 
     * @return Quuid <p>Host quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host quuid</p>
     * @param Quuid <p>Host quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public ImageRegistryDetectionHostParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryDetectionHostParam(ImageRegistryDetectionHostParam source) {
        if (source.InstanceUuid != null) {
            this.InstanceUuid = new String(source.InstanceUuid);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceUuid", this.InstanceUuid);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

