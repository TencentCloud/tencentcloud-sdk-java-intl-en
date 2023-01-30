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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskSyscallWhiteListBaseInfo extends AbstractModel{

    /**
    * Allowed item ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Number of images
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * Connection process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * List of syscall names
    */
    @SerializedName("SyscallNames")
    @Expose
    private String [] SyscallNames;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether it is allowed globally. `true`: Yes.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Array of image IDs
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
     * Get Allowed item ID 
     * @return Id Allowed item ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Allowed item ID
     * @param Id Allowed item ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Number of images 
     * @return ImageCount Number of images
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set Number of images
     * @param ImageCount Number of images
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get Connection process path 
     * @return ProcessPath Connection process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Connection process path
     * @param ProcessPath Connection process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get List of syscall names 
     * @return SyscallNames List of syscall names
     */
    public String [] getSyscallNames() {
        return this.SyscallNames;
    }

    /**
     * Set List of syscall names
     * @param SyscallNames List of syscall names
     */
    public void setSyscallNames(String [] SyscallNames) {
        this.SyscallNames = SyscallNames;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether it is allowed globally. `true`: Yes. 
     * @return IsGlobal Whether it is allowed globally. `true`: Yes.
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether it is allowed globally. `true`: Yes.
     * @param IsGlobal Whether it is allowed globally. `true`: Yes.
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Array of image IDs 
     * @return ImageIds Array of image IDs
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set Array of image IDs
     * @param ImageIds Array of image IDs
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    public RiskSyscallWhiteListBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskSyscallWhiteListBaseInfo(RiskSyscallWhiteListBaseInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.SyscallNames != null) {
            this.SyscallNames = new String[source.SyscallNames.length];
            for (int i = 0; i < source.SyscallNames.length; i++) {
                this.SyscallNames[i] = new String(source.SyscallNames[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamArraySimple(map, prefix + "SyscallNames.", this.SyscallNames);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

