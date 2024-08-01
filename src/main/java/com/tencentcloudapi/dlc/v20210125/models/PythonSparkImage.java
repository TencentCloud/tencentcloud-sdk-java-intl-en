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

public class PythonSparkImage extends AbstractModel {

    /**
    * Unique ID of the spark image
    */
    @SerializedName("SparkImageId")
    @Expose
    private String SparkImageId;

    /**
    * ID of the cluster image of the minor version
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
    * Name of the spark image
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * Description of the spark image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Unique ID of the spark image 
     * @return SparkImageId Unique ID of the spark image
     */
    public String getSparkImageId() {
        return this.SparkImageId;
    }

    /**
     * Set Unique ID of the spark image
     * @param SparkImageId Unique ID of the spark image
     */
    public void setSparkImageId(String SparkImageId) {
        this.SparkImageId = SparkImageId;
    }

    /**
     * Get ID of the cluster image of the minor version 
     * @return ChildImageVersionId ID of the cluster image of the minor version
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set ID of the cluster image of the minor version
     * @param ChildImageVersionId ID of the cluster image of the minor version
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    /**
     * Get Name of the spark image 
     * @return SparkImageVersion Name of the spark image
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set Name of the spark image
     * @param SparkImageVersion Name of the spark image
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get Description of the spark image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description of the spark image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the spark image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description of the spark image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public PythonSparkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PythonSparkImage(PythonSparkImage source) {
        if (source.SparkImageId != null) {
            this.SparkImageId = new String(source.SparkImageId);
        }
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SparkImageId", this.SparkImageId);
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

