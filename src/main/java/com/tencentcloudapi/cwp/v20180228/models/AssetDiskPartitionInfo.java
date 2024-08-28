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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetDiskPartitionInfo extends AbstractModel {

    /**
    * Partition name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Partition size (unit: G)
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Partition utilization
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * File system type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Mounting directory
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Used space (unit: G)
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get Partition name 
     * @return Name Partition name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Partition name
     * @param Name Partition name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Partition size (unit: G) 
     * @return Size Partition size (unit: G)
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Partition size (unit: G)
     * @param Size Partition size (unit: G)
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Partition utilization 
     * @return Percent Partition utilization
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Partition utilization
     * @param Percent Partition utilization
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get File system type 
     * @return Type File system type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File system type
     * @param Type File system type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Mounting directory 
     * @return Path Mounting directory
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Mounting directory
     * @param Path Mounting directory
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Used space (unit: G) 
     * @return Used Used space (unit: G)
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set Used space (unit: G)
     * @param Used Used space (unit: G)
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public AssetDiskPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDiskPartitionInfo(AssetDiskPartitionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

