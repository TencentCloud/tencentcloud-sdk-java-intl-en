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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileSystemResponse extends AbstractModel{

    /**
    * File system
    */
    @SerializedName("FileSystem")
    @Expose
    private FileSystem FileSystem;

    /**
    * Used capacity of the file system, in bytes
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * Used ARCHIVE capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ArchiveCapacityUsed")
    @Expose
    private Long ArchiveCapacityUsed;

    /**
    * Used STANDARD capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StandardCapacityUsed")
    @Expose
    private Long StandardCapacityUsed;

    /**
    * Used STANDARD_IA capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DegradeCapacityUsed")
    @Expose
    private Long DegradeCapacityUsed;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get File system 
     * @return FileSystem File system
     */
    public FileSystem getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set File system
     * @param FileSystem File system
     */
    public void setFileSystem(FileSystem FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get Used capacity of the file system, in bytes
Note: this field may return `null`, indicating that no valid value was found. 
     * @return CapacityUsed Used capacity of the file system, in bytes
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set Used capacity of the file system, in bytes
Note: this field may return `null`, indicating that no valid value was found.
     * @param CapacityUsed Used capacity of the file system, in bytes
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get Used ARCHIVE capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ArchiveCapacityUsed Used ARCHIVE capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getArchiveCapacityUsed() {
        return this.ArchiveCapacityUsed;
    }

    /**
     * Set Used ARCHIVE capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ArchiveCapacityUsed Used ARCHIVE capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setArchiveCapacityUsed(Long ArchiveCapacityUsed) {
        this.ArchiveCapacityUsed = ArchiveCapacityUsed;
    }

    /**
     * Get Used STANDARD capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StandardCapacityUsed Used STANDARD capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStandardCapacityUsed() {
        return this.StandardCapacityUsed;
    }

    /**
     * Set Used STANDARD capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StandardCapacityUsed Used STANDARD capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStandardCapacityUsed(Long StandardCapacityUsed) {
        this.StandardCapacityUsed = StandardCapacityUsed;
    }

    /**
     * Get Used STANDARD_IA capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DegradeCapacityUsed Used STANDARD_IA capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Long getDegradeCapacityUsed() {
        return this.DegradeCapacityUsed;
    }

    /**
     * Set Used STANDARD_IA capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid value was found.
     * @param DegradeCapacityUsed Used STANDARD_IA capacity of COS, in bytes
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDegradeCapacityUsed(Long DegradeCapacityUsed) {
        this.DegradeCapacityUsed = DegradeCapacityUsed;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFileSystemResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileSystemResponse(DescribeFileSystemResponse source) {
        if (source.FileSystem != null) {
            this.FileSystem = new FileSystem(source.FileSystem);
        }
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.ArchiveCapacityUsed != null) {
            this.ArchiveCapacityUsed = new Long(source.ArchiveCapacityUsed);
        }
        if (source.StandardCapacityUsed != null) {
            this.StandardCapacityUsed = new Long(source.StandardCapacityUsed);
        }
        if (source.DegradeCapacityUsed != null) {
            this.DegradeCapacityUsed = new Long(source.DegradeCapacityUsed);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FileSystem.", this.FileSystem);
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamSimple(map, prefix + "ArchiveCapacityUsed", this.ArchiveCapacityUsed);
        this.setParamSimple(map, prefix + "StandardCapacityUsed", this.StandardCapacityUsed);
        this.setParamSimple(map, prefix + "DegradeCapacityUsed", this.DegradeCapacityUsed);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

