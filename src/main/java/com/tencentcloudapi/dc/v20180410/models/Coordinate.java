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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coordinate extends AbstractModel {

    /**
    * Latitude
    */
    @SerializedName("Lat")
    @Expose
    private Float Lat;

    /**
    * Longitude
    */
    @SerializedName("Lng")
    @Expose
    private Float Lng;

    /**
     * Get Latitude 
     * @return Lat Latitude
     */
    public Float getLat() {
        return this.Lat;
    }

    /**
     * Set Latitude
     * @param Lat Latitude
     */
    public void setLat(Float Lat) {
        this.Lat = Lat;
    }

    /**
     * Get Longitude 
     * @return Lng Longitude
     */
    public Float getLng() {
        return this.Lng;
    }

    /**
     * Set Longitude
     * @param Lng Longitude
     */
    public void setLng(Float Lng) {
        this.Lng = Lng;
    }

    public Coordinate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coordinate(Coordinate source) {
        if (source.Lat != null) {
            this.Lat = new Float(source.Lat);
        }
        if (source.Lng != null) {
            this.Lng = new Float(source.Lng);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lat", this.Lat);
        this.setParamSimple(map, prefix + "Lng", this.Lng);

    }
}

