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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineImageVersion extends AbstractModel {

    /**
    * ID of the major version of the image
    */
    @SerializedName("ImageVersionId")
    @Expose
    private String ImageVersionId;

    /**
    * Name of the major version of the image
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * Description of the major version of the image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether it is a public version: 1: public version; 2: private version
    */
    @SerializedName("IsPublic")
    @Expose
    private Long IsPublic;

    /**
    * Cluster types: SparkSQL, PrestoSQL, and SparkBatch
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Version status. 1: initializing; 2: online; 3: offline
    */
    @SerializedName("IsSharedEngine")
    @Expose
    private Long IsSharedEngine;

    /**
    * Version status. 1: initializing; 2: online; 3: offline
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Insert time
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get ID of the major version of the image 
     * @return ImageVersionId ID of the major version of the image
     */
    public String getImageVersionId() {
        return this.ImageVersionId;
    }

    /**
     * Set ID of the major version of the image
     * @param ImageVersionId ID of the major version of the image
     */
    public void setImageVersionId(String ImageVersionId) {
        this.ImageVersionId = ImageVersionId;
    }

    /**
     * Get Name of the major version of the image 
     * @return ImageVersion Name of the major version of the image
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Name of the major version of the image
     * @param ImageVersion Name of the major version of the image
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get Description of the major version of the image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description of the major version of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the major version of the image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description of the major version of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether it is a public version: 1: public version; 2: private version 
     * @return IsPublic Whether it is a public version: 1: public version; 2: private version
     */
    public Long getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set Whether it is a public version: 1: public version; 2: private version
     * @param IsPublic Whether it is a public version: 1: public version; 2: private version
     */
    public void setIsPublic(Long IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get Cluster types: SparkSQL, PrestoSQL, and SparkBatch 
     * @return EngineType Cluster types: SparkSQL, PrestoSQL, and SparkBatch
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Cluster types: SparkSQL, PrestoSQL, and SparkBatch
     * @param EngineType Cluster types: SparkSQL, PrestoSQL, and SparkBatch
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Version status. 1: initializing; 2: online; 3: offline 
     * @return IsSharedEngine Version status. 1: initializing; 2: online; 3: offline
     */
    public Long getIsSharedEngine() {
        return this.IsSharedEngine;
    }

    /**
     * Set Version status. 1: initializing; 2: online; 3: offline
     * @param IsSharedEngine Version status. 1: initializing; 2: online; 3: offline
     */
    public void setIsSharedEngine(Long IsSharedEngine) {
        this.IsSharedEngine = IsSharedEngine;
    }

    /**
     * Get Version status. 1: initializing; 2: online; 3: offline 
     * @return State Version status. 1: initializing; 2: online; 3: offline
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Version status. 1: initializing; 2: online; 3: offline
     * @param State Version status. 1: initializing; 2: online; 3: offline
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Insert time 
     * @return InsertTime Insert time
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Insert time
     * @param InsertTime Insert time
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
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

    public DataEngineImageVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineImageVersion(DataEngineImageVersion source) {
        if (source.ImageVersionId != null) {
            this.ImageVersionId = new String(source.ImageVersionId);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Long(source.IsPublic);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.IsSharedEngine != null) {
            this.IsSharedEngine = new Long(source.IsSharedEngine);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageVersionId", this.ImageVersionId);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "IsSharedEngine", this.IsSharedEngine);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

