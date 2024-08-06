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

public class AlterDMSDatabaseRequest extends AbstractModel {

    /**
    * Current name
    */
    @SerializedName("CurrentName")
    @Expose
    private String CurrentName;

    /**
    * Schema name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Path
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Basic object
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
     * Get Current name 
     * @return CurrentName Current name
     */
    public String getCurrentName() {
        return this.CurrentName;
    }

    /**
     * Set Current name
     * @param CurrentName Current name
     */
    public void setCurrentName(String CurrentName) {
        this.CurrentName = CurrentName;
    }

    /**
     * Get Schema name 
     * @return SchemaName Schema name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema name
     * @param SchemaName Schema name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Path 
     * @return Location Path
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Path
     * @param Location Path
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Basic object 
     * @return Asset Basic object
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set Basic object
     * @param Asset Basic object
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    public AlterDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlterDMSDatabaseRequest(AlterDMSDatabaseRequest source) {
        if (source.CurrentName != null) {
            this.CurrentName = new String(source.CurrentName);
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
        this.setParamSimple(map, prefix + "CurrentName", this.CurrentName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamObj(map, prefix + "Asset.", this.Asset);

    }
}

