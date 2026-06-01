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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalBinlogConfigDefault extends AbstractModel {

    /**
    * Local binlog retention duration. Valid values: [6,168].
    */
    @SerializedName("SaveHours")
    @Expose
    private Long SaveHours;

    /**
    * Local binlog space utilization. Valid values: [30,50].
    */
    @SerializedName("MaxUsage")
    @Expose
    private Long MaxUsage;

    /**
     * Get Local binlog retention duration. Valid values: [6,168]. 
     * @return SaveHours Local binlog retention duration. Valid values: [6,168].
     */
    public Long getSaveHours() {
        return this.SaveHours;
    }

    /**
     * Set Local binlog retention duration. Valid values: [6,168].
     * @param SaveHours Local binlog retention duration. Valid values: [6,168].
     */
    public void setSaveHours(Long SaveHours) {
        this.SaveHours = SaveHours;
    }

    /**
     * Get Local binlog space utilization. Valid values: [30,50]. 
     * @return MaxUsage Local binlog space utilization. Valid values: [30,50].
     */
    public Long getMaxUsage() {
        return this.MaxUsage;
    }

    /**
     * Set Local binlog space utilization. Valid values: [30,50].
     * @param MaxUsage Local binlog space utilization. Valid values: [30,50].
     */
    public void setMaxUsage(Long MaxUsage) {
        this.MaxUsage = MaxUsage;
    }

    public LocalBinlogConfigDefault() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalBinlogConfigDefault(LocalBinlogConfigDefault source) {
        if (source.SaveHours != null) {
            this.SaveHours = new Long(source.SaveHours);
        }
        if (source.MaxUsage != null) {
            this.MaxUsage = new Long(source.MaxUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaveHours", this.SaveHours);
        this.setParamSimple(map, prefix + "MaxUsage", this.MaxUsage);

    }
}

