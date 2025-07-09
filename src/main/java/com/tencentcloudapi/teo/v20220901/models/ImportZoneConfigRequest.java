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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportZoneConfigRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The configuration content to be imported, which should be in the JSON format and be encoded in the UTF-8 mode. The configuration content can be obtained through the site configuration export API (ExportZoneConfig). You can individually import "Site Acceleration - Global Acceleration Configuration" or "Site Acceleration - Rule Engine" by passing in the corresponding fields. Refer to the example below for details.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The configuration content to be imported, which should be in the JSON format and be encoded in the UTF-8 mode. The configuration content can be obtained through the site configuration export API (ExportZoneConfig). You can individually import "Site Acceleration - Global Acceleration Configuration" or "Site Acceleration - Rule Engine" by passing in the corresponding fields. Refer to the example below for details. 
     * @return Content The configuration content to be imported, which should be in the JSON format and be encoded in the UTF-8 mode. The configuration content can be obtained through the site configuration export API (ExportZoneConfig). You can individually import "Site Acceleration - Global Acceleration Configuration" or "Site Acceleration - Rule Engine" by passing in the corresponding fields. Refer to the example below for details.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set The configuration content to be imported, which should be in the JSON format and be encoded in the UTF-8 mode. The configuration content can be obtained through the site configuration export API (ExportZoneConfig). You can individually import "Site Acceleration - Global Acceleration Configuration" or "Site Acceleration - Rule Engine" by passing in the corresponding fields. Refer to the example below for details.
     * @param Content The configuration content to be imported, which should be in the JSON format and be encoded in the UTF-8 mode. The configuration content can be obtained through the site configuration export API (ExportZoneConfig). You can individually import "Site Acceleration - Global Acceleration Configuration" or "Site Acceleration - Rule Engine" by passing in the corresponding fields. Refer to the example below for details.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ImportZoneConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportZoneConfigRequest(ImportZoneConfigRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

