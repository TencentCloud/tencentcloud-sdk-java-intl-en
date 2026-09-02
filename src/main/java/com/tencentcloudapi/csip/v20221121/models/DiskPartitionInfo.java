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

public class DiskPartitionInfo extends AbstractModel {

    /**
    * <p>Partition name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Mount path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Usage percentage</p>
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * <p>Partition size (MB)</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>Partition type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Used (MB)</p>
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get <p>Partition name</p> 
     * @return Name <p>Partition name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Partition name</p>
     * @param Name <p>Partition name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Mount path</p> 
     * @return Path <p>Mount path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Mount path</p>
     * @param Path <p>Mount path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Usage percentage</p> 
     * @return Percent <p>Usage percentage</p>
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>Usage percentage</p>
     * @param Percent <p>Usage percentage</p>
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>Partition size (MB)</p> 
     * @return Size <p>Partition size (MB)</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Partition size (MB)</p>
     * @param Size <p>Partition size (MB)</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>Partition type</p> 
     * @return Type <p>Partition type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Partition type</p>
     * @param Type <p>Partition type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Used (MB)</p> 
     * @return Used <p>Used (MB)</p>
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set <p>Used (MB)</p>
     * @param Used <p>Used (MB)</p>
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public DiskPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskPartitionInfo(DiskPartitionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

