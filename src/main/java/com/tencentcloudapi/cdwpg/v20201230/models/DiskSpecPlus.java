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

public class DiskSpecPlus extends AbstractModel {

    /**
    * Disk Count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Max Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * Min Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * Disk Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * Cvm Class
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmClass")
    @Expose
    private String CvmClass;

    /**
     * Get Disk Count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskCount Disk Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Disk Count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskCount Disk Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Max Disk Size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxDiskSize Max Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set Max Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxDiskSize Max Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get Min Disk Size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinDiskSize Min Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set Min Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinDiskSize Min Disk Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get Disk Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskType Disk Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskType Disk Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskDesc Disk Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set Disk Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskDesc Disk Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get Cvm Class
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvmClass Cvm Class
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCvmClass() {
        return this.CvmClass;
    }

    /**
     * Set Cvm Class
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvmClass Cvm Class
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvmClass(String CvmClass) {
        this.CvmClass = CvmClass;
    }

    public DiskSpecPlus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSpecPlus(DiskSpecPlus source) {
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
        if (source.CvmClass != null) {
            this.CvmClass = new String(source.CvmClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);
        this.setParamSimple(map, prefix + "CvmClass", this.CvmClass);

    }
}

