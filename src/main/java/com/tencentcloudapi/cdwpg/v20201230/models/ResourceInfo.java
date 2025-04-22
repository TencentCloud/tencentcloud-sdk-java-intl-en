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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInfo extends AbstractModel {

    /**
    * Resource name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Resource count.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Disk information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSpec")
    @Expose
    private CBSSpecInfo DiskSpec;

    /**
    * Node type. Valid values: cn and dn.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Resource name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Resource name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Resource name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Resource name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Resource count.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Resource count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Resource count.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Resource count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Disk information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskSpec Disk information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CBSSpecInfo getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set Disk information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskSpec Disk information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskSpec(CBSSpecInfo DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get Node type. Valid values: cn and dn.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Node type. Valid values: cn and dn.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Node type. Valid values: cn and dn.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Node type. Valid values: cn and dn.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new CBSSpecInfo(source.DiskSpec);
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

