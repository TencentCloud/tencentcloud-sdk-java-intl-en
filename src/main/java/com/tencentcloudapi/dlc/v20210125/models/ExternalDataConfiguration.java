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

public class ExternalDataConfiguration extends AbstractModel {

    /**
    * Metadata storage object
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sds")
    @Expose
    private DMSSds Sds;

    /**
    * View text
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ViewOriginalText")
    @Expose
    private String ViewOriginalText;

    /**
    * View text
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ViewExpandedText")
    @Expose
    private String ViewExpandedText;

    /**
    * Hive maintenance version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

    /**
    * Lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
    * Partition
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private DMSPartition [] Partitions;

    /**
     * Get Metadata storage object
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sds Metadata storage object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DMSSds getSds() {
        return this.Sds;
    }

    /**
     * Set Metadata storage object
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sds Metadata storage object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSds(DMSSds Sds) {
        this.Sds = Sds;
    }

    /**
     * Get View text
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ViewOriginalText View text
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getViewOriginalText() {
        return this.ViewOriginalText;
    }

    /**
     * Set View text
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ViewOriginalText View text
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViewOriginalText(String ViewOriginalText) {
        this.ViewOriginalText = ViewOriginalText;
    }

    /**
     * Get View text
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ViewExpandedText View text
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getViewExpandedText() {
        return this.ViewExpandedText;
    }

    /**
     * Set View text
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ViewExpandedText View text
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViewExpandedText(String ViewExpandedText) {
        this.ViewExpandedText = ViewExpandedText;
    }

    /**
     * Get Hive maintenance version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Retention Hive maintenance version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set Hive maintenance version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Retention Hive maintenance version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    /**
     * Get Lifecycle
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifeTime Lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLifeTime() {
        return this.LifeTime;
    }

    /**
     * Set Lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifeTime Lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifeTime(Long LifeTime) {
        this.LifeTime = LifeTime;
    }

    /**
     * Get Partition
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partitions Partition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DMSPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Partition
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partitions Partition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(DMSPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    public ExternalDataConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalDataConfiguration(ExternalDataConfiguration source) {
        if (source.Sds != null) {
            this.Sds = new DMSSds(source.Sds);
        }
        if (source.ViewOriginalText != null) {
            this.ViewOriginalText = new String(source.ViewOriginalText);
        }
        if (source.ViewExpandedText != null) {
            this.ViewExpandedText = new String(source.ViewExpandedText);
        }
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
        if (source.Partitions != null) {
            this.Partitions = new DMSPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new DMSPartition(source.Partitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Sds.", this.Sds);
        this.setParamSimple(map, prefix + "ViewOriginalText", this.ViewOriginalText);
        this.setParamSimple(map, prefix + "ViewExpandedText", this.ViewExpandedText);
        this.setParamSimple(map, prefix + "Retention", this.Retention);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);

    }
}

