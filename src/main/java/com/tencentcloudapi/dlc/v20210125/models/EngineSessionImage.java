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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineSessionImage extends AbstractModel {

    /**
    * Specifies the unique id of the Spark mirror.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkImageId")
    @Expose
    private String SparkImageId;

    /**
    * Spark image version name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * Minor version image type. 1: TensorFlow, 2: Pytorch, 3: SK-learn.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkImageType")
    @Expose
    private Long SparkImageType;

    /**
    * Image address.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkImageTag")
    @Expose
    private String SparkImageTag;

    /**
     * Get Specifies the unique id of the Spark mirror.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkImageId Specifies the unique id of the Spark mirror.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkImageId() {
        return this.SparkImageId;
    }

    /**
     * Set Specifies the unique id of the Spark mirror.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkImageId Specifies the unique id of the Spark mirror.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkImageId(String SparkImageId) {
        this.SparkImageId = SparkImageId;
    }

    /**
     * Get Spark image version name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkImageVersion Spark image version name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set Spark image version name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkImageVersion Spark image version name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get Minor version image type. 1: TensorFlow, 2: Pytorch, 3: SK-learn.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkImageType Minor version image type. 1: TensorFlow, 2: Pytorch, 3: SK-learn.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSparkImageType() {
        return this.SparkImageType;
    }

    /**
     * Set Minor version image type. 1: TensorFlow, 2: Pytorch, 3: SK-learn.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkImageType Minor version image type. 1: TensorFlow, 2: Pytorch, 3: SK-learn.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkImageType(Long SparkImageType) {
        this.SparkImageType = SparkImageType;
    }

    /**
     * Get Image address.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkImageTag Image address.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkImageTag() {
        return this.SparkImageTag;
    }

    /**
     * Set Image address.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkImageTag Image address.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkImageTag(String SparkImageTag) {
        this.SparkImageTag = SparkImageTag;
    }

    public EngineSessionImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineSessionImage(EngineSessionImage source) {
        if (source.SparkImageId != null) {
            this.SparkImageId = new String(source.SparkImageId);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.SparkImageType != null) {
            this.SparkImageType = new Long(source.SparkImageType);
        }
        if (source.SparkImageTag != null) {
            this.SparkImageTag = new String(source.SparkImageTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SparkImageId", this.SparkImageId);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "SparkImageType", this.SparkImageType);
        this.setParamSimple(map, prefix + "SparkImageTag", this.SparkImageTag);

    }
}

