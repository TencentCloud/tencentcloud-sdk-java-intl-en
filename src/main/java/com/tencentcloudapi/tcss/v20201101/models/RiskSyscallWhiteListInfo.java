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

public class RiskSyscallWhiteListInfo extends AbstractModel{

    /**
    * Array of image IDs. An empty array indicates all.
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Syscall name. The `DescribeRiskSyscallNames` API can be called to get the list of enumerated values.
    */
    @SerializedName("SyscallNames")
    @Expose
    private String [] SyscallNames;

    /**
    * Target process
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Allowed item ID, which is empty if the item is newly created.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Array of image IDs. An empty array indicates all. 
     * @return ImageIds Array of image IDs. An empty array indicates all.
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set Array of image IDs. An empty array indicates all.
     * @param ImageIds Array of image IDs. An empty array indicates all.
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get Syscall name. The `DescribeRiskSyscallNames` API can be called to get the list of enumerated values. 
     * @return SyscallNames Syscall name. The `DescribeRiskSyscallNames` API can be called to get the list of enumerated values.
     */
    public String [] getSyscallNames() {
        return this.SyscallNames;
    }

    /**
     * Set Syscall name. The `DescribeRiskSyscallNames` API can be called to get the list of enumerated values.
     * @param SyscallNames Syscall name. The `DescribeRiskSyscallNames` API can be called to get the list of enumerated values.
     */
    public void setSyscallNames(String [] SyscallNames) {
        this.SyscallNames = SyscallNames;
    }

    /**
     * Get Target process 
     * @return ProcessPath Target process
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Target process
     * @param ProcessPath Target process
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Allowed item ID, which is empty if the item is newly created. 
     * @return Id Allowed item ID, which is empty if the item is newly created.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Allowed item ID, which is empty if the item is newly created.
     * @param Id Allowed item ID, which is empty if the item is newly created.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public RiskSyscallWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskSyscallWhiteListInfo(RiskSyscallWhiteListInfo source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.SyscallNames != null) {
            this.SyscallNames = new String[source.SyscallNames.length];
            for (int i = 0; i < source.SyscallNames.length; i++) {
                this.SyscallNames[i] = new String(source.SyscallNames[i]);
            }
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArraySimple(map, prefix + "SyscallNames.", this.SyscallNames);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

