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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartPolicy extends AbstractModel {

    /**
    * Restart policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy display name
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Policy description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Optional range for the number of batch restarted nodes
    */
    @SerializedName("BatchSizeRange")
    @Expose
    private Long [] BatchSizeRange;

    /**
    * Whether it is the default policy
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
     * Get Restart policy name 
     * @return Name Restart policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Restart policy name
     * @param Name Restart policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy display name 
     * @return DisplayName Policy display name
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Policy display name
     * @param DisplayName Policy display name
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Policy description 
     * @return Describe Policy description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Policy description
     * @param Describe Policy description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Optional range for the number of batch restarted nodes 
     * @return BatchSizeRange Optional range for the number of batch restarted nodes
     */
    public Long [] getBatchSizeRange() {
        return this.BatchSizeRange;
    }

    /**
     * Set Optional range for the number of batch restarted nodes
     * @param BatchSizeRange Optional range for the number of batch restarted nodes
     */
    public void setBatchSizeRange(Long [] BatchSizeRange) {
        this.BatchSizeRange = BatchSizeRange;
    }

    /**
     * Get Whether it is the default policy 
     * @return IsDefault Whether it is the default policy
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default policy
     * @param IsDefault Whether it is the default policy
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    public RestartPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartPolicy(RestartPolicy source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.BatchSizeRange != null) {
            this.BatchSizeRange = new Long[source.BatchSizeRange.length];
            for (int i = 0; i < source.BatchSizeRange.length; i++) {
                this.BatchSizeRange[i] = new Long(source.BatchSizeRange[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArraySimple(map, prefix + "BatchSizeRange.", this.BatchSizeRange);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

