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

public class InstanceNodeGroup extends AbstractModel {

    /**
    * Model.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Disk information.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpecPlus DataDisk;

    /**
    * Number of machines.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmCount")
    @Expose
    private Long CvmCount;

    /**
     * Get Model.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Model.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Model.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Model.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Disk information.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDisk Disk information.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpecPlus getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Disk information.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDisk Disk information.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisk(DiskSpecPlus DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Number of machines.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvmCount Number of machines.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCvmCount() {
        return this.CvmCount;
    }

    /**
     * Set Number of machines.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvmCount Number of machines.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvmCount(Long CvmCount) {
        this.CvmCount = CvmCount;
    }

    public InstanceNodeGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNodeGroup(InstanceNodeGroup source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpecPlus(source.DataDisk);
        }
        if (source.CvmCount != null) {
            this.CvmCount = new Long(source.CvmCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamSimple(map, prefix + "CvmCount", this.CvmCount);

    }
}

