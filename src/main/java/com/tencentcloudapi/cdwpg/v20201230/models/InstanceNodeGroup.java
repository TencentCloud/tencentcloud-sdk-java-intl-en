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

public class InstanceNodeGroup extends AbstractModel {

    /**
    * Spec Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Data Disk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpecPlus DataDisk;

    /**
    * Cvm Count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmCount")
    @Expose
    private Long CvmCount;

    /**
     * Get Spec Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Spec Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Spec Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Spec Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Data Disk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDisk Data Disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpecPlus getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Data Disk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDisk Data Disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisk(DiskSpecPlus DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Cvm Count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvmCount Cvm Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCvmCount() {
        return this.CvmCount;
    }

    /**
     * Set Cvm Count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvmCount Cvm Count
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

