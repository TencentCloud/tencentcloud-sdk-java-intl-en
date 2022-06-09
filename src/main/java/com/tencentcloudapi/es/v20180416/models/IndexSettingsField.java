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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexSettingsField extends AbstractModel{

    /**
    * Number of primary shards
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NumberOfShards")
    @Expose
    private String NumberOfShards;

    /**
    * Number of replica shards
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NumberOfReplicas")
    @Expose
    private String NumberOfReplicas;

    /**
    * Index refresh interval
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RefreshInterval")
    @Expose
    private String RefreshInterval;

    /**
     * Get Number of primary shards
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NumberOfShards Number of primary shards
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getNumberOfShards() {
        return this.NumberOfShards;
    }

    /**
     * Set Number of primary shards
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NumberOfShards Number of primary shards
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNumberOfShards(String NumberOfShards) {
        this.NumberOfShards = NumberOfShards;
    }

    /**
     * Get Number of replica shards
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NumberOfReplicas Number of replica shards
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getNumberOfReplicas() {
        return this.NumberOfReplicas;
    }

    /**
     * Set Number of replica shards
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NumberOfReplicas Number of replica shards
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNumberOfReplicas(String NumberOfReplicas) {
        this.NumberOfReplicas = NumberOfReplicas;
    }

    /**
     * Get Index refresh interval
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RefreshInterval Index refresh interval
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set Index refresh interval
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RefreshInterval Index refresh interval
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRefreshInterval(String RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
    }

    public IndexSettingsField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexSettingsField(IndexSettingsField source) {
        if (source.NumberOfShards != null) {
            this.NumberOfShards = new String(source.NumberOfShards);
        }
        if (source.NumberOfReplicas != null) {
            this.NumberOfReplicas = new String(source.NumberOfReplicas);
        }
        if (source.RefreshInterval != null) {
            this.RefreshInterval = new String(source.RefreshInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfShards", this.NumberOfShards);
        this.setParamSimple(map, prefix + "NumberOfReplicas", this.NumberOfReplicas);
        this.setParamSimple(map, prefix + "RefreshInterval", this.RefreshInterval);

    }
}

