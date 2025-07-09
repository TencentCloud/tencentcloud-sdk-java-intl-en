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

public class DMSDatabaseInfo extends AbstractModel {

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Schema name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Storage address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Basic object information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Schema name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchemaName Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchemaName Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Storage address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Storage address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Storage address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Storage address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Basic object information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Asset Basic object information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set Basic object information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Asset Basic object information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    public DMSDatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSDatabaseInfo(DMSDatabaseInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Asset != null) {
            this.Asset = new Asset(source.Asset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamObj(map, prefix + "Asset.", this.Asset);

    }
}

