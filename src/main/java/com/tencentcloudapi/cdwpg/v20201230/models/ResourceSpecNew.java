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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSpecNew extends AbstractModel {

    /**
    * Resource name.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Resource count.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Disk information.
    */
    @SerializedName("DiskSpec")
    @Expose
    private CBSSpec DiskSpec;

    /**
    * Resource type, DATA.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Resource name. 
     * @return SpecName Resource name.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Resource name.
     * @param SpecName Resource name.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Resource count. 
     * @return Count Resource count.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Resource count.
     * @param Count Resource count.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Disk information. 
     * @return DiskSpec Disk information.
     */
    public CBSSpec getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set Disk information.
     * @param DiskSpec Disk information.
     */
    public void setDiskSpec(CBSSpec DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get Resource type, DATA. 
     * @return Type Resource type, DATA.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Resource type, DATA.
     * @param Type Resource type, DATA.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ResourceSpecNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpecNew(ResourceSpecNew source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new CBSSpec(source.DiskSpec);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "DiskSpec.", this.DiskSpec);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

