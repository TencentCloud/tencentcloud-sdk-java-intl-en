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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckResult extends AbstractModel {

    /**
    * Lifecycle management policy ID.
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
    * File system ID.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Directory absolute path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * List of management rules associated with the lifecycle management policy.
    */
    @SerializedName("LifecycleRules")
    @Expose
    private LifecycleRule [] LifecycleRules;

    /**
    * Target path.
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
     * Get Lifecycle management policy ID. 
     * @return LifecyclePolicyID Lifecycle management policy ID.
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set Lifecycle management policy ID.
     * @param LifecyclePolicyID Lifecycle management policy ID.
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    /**
     * Get File system ID. 
     * @return FileSystemId File system ID.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID.
     * @param FileSystemId File system ID.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Directory absolute path. 
     * @return Path Directory absolute path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Directory absolute path.
     * @param Path Directory absolute path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get List of management rules associated with the lifecycle management policy. 
     * @return LifecycleRules List of management rules associated with the lifecycle management policy.
     */
    public LifecycleRule [] getLifecycleRules() {
        return this.LifecycleRules;
    }

    /**
     * Set List of management rules associated with the lifecycle management policy.
     * @param LifecycleRules List of management rules associated with the lifecycle management policy.
     */
    public void setLifecycleRules(LifecycleRule [] LifecycleRules) {
        this.LifecycleRules = LifecycleRules;
    }

    /**
     * Get Target path. 
     * @return TargetPath Target path.
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set Target path.
     * @param TargetPath Target path.
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    public CheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckResult(CheckResult source) {
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.LifecycleRules != null) {
            this.LifecycleRules = new LifecycleRule[source.LifecycleRules.length];
            for (int i = 0; i < source.LifecycleRules.length; i++) {
                this.LifecycleRules[i] = new LifecycleRule(source.LifecycleRules[i]);
            }
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArrayObj(map, prefix + "LifecycleRules.", this.LifecycleRules);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);

    }
}

