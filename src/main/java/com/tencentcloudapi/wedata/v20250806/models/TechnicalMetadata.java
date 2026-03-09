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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TechnicalMetadata extends AbstractModel {

    /**
    * Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Data table location.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Storage size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
     * Get Responsible person.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Owner Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Owner Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Data table location.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Data table location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Data table location.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Data table location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Storage size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageSize Storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Storage size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageSize Storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    public TechnicalMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TechnicalMetadata(TechnicalMetadata source) {
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);

    }
}

