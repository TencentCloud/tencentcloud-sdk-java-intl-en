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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageRegionInfo extends AbstractModel {

    /**
    * Storage region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Store region description information.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Status. Whether it is enabled. Valid values:
<li>opened: enabled.</li>
<li>unopened: not activated.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether it is the default storage region. true: yes; false: no.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Storage area. Valid values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Storage region. 
     * @return Region Storage region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Storage region.
     * @param Region Storage region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Store region description information. 
     * @return Description Store region description information.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Store region description information.
     * @param Description Store region description information.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Status. Whether it is enabled. Valid values:
<li>opened: enabled.</li>
<li>unopened: not activated.</li> 
     * @return Status Status. Whether it is enabled. Valid values:
<li>opened: enabled.</li>
<li>unopened: not activated.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Whether it is enabled. Valid values:
<li>opened: enabled.</li>
<li>unopened: not activated.</li>
     * @param Status Status. Whether it is enabled. Valid values:
<li>opened: enabled.</li>
<li>unopened: not activated.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether it is the default storage region. true: yes; false: no. 
     * @return IsDefault Whether it is the default storage region. true: yes; false: no.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default storage region. true: yes; false: no.
     * @param IsDefault Whether it is the default storage region. true: yes; false: no.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Storage area. Valid values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li> 
     * @return Area Storage area. Valid values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Storage area. Valid values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     * @param Area Storage area. Valid values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public StorageRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageRegionInfo(StorageRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

