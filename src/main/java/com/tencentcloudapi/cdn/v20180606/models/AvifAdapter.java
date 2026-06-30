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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvifAdapter extends AbstractModel {

    /**
    * Whether to enable `AvifAdapter` for image optimization. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * When the original image is avif and the client Accept header contains image/avif, return directly the original image.
When the original image is in avif format and the client Accept header does not include image/avif but includes image/webp, convert avif to webp format and return. if the Accept header does not include image/webp, convert to jpeg and return.

Valid values:. 
- []
- ["webp"]
- ["jpeg"]
- ["webp", "jpeg"]

"Webp": whether avif to webp is enabled, "jpeg": whether avif to jpeg is enabled. if both webp and jpeg are enabled, webp must be before jpeg.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FallbackFormats")
    @Expose
    private String [] FallbackFormats;

    /**
     * Get Whether to enable `AvifAdapter` for image optimization. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return Switch Whether to enable `AvifAdapter` for image optimization. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable `AvifAdapter` for image optimization. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param Switch Whether to enable `AvifAdapter` for image optimization. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get When the original image is avif and the client Accept header contains image/avif, return directly the original image.
When the original image is in avif format and the client Accept header does not include image/avif but includes image/webp, convert avif to webp format and return. if the Accept header does not include image/webp, convert to jpeg and return.

Valid values:. 
- []
- ["webp"]
- ["jpeg"]
- ["webp", "jpeg"]

"Webp": whether avif to webp is enabled, "jpeg": whether avif to jpeg is enabled. if both webp and jpeg are enabled, webp must be before jpeg.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FallbackFormats When the original image is avif and the client Accept header contains image/avif, return directly the original image.
When the original image is in avif format and the client Accept header does not include image/avif but includes image/webp, convert avif to webp format and return. if the Accept header does not include image/webp, convert to jpeg and return.

Valid values:. 
- []
- ["webp"]
- ["jpeg"]
- ["webp", "jpeg"]

"Webp": whether avif to webp is enabled, "jpeg": whether avif to jpeg is enabled. if both webp and jpeg are enabled, webp must be before jpeg.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFallbackFormats() {
        return this.FallbackFormats;
    }

    /**
     * Set When the original image is avif and the client Accept header contains image/avif, return directly the original image.
When the original image is in avif format and the client Accept header does not include image/avif but includes image/webp, convert avif to webp format and return. if the Accept header does not include image/webp, convert to jpeg and return.

Valid values:. 
- []
- ["webp"]
- ["jpeg"]
- ["webp", "jpeg"]

"Webp": whether avif to webp is enabled, "jpeg": whether avif to jpeg is enabled. if both webp and jpeg are enabled, webp must be before jpeg.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FallbackFormats When the original image is avif and the client Accept header contains image/avif, return directly the original image.
When the original image is in avif format and the client Accept header does not include image/avif but includes image/webp, convert avif to webp format and return. if the Accept header does not include image/webp, convert to jpeg and return.

Valid values:. 
- []
- ["webp"]
- ["jpeg"]
- ["webp", "jpeg"]

"Webp": whether avif to webp is enabled, "jpeg": whether avif to jpeg is enabled. if both webp and jpeg are enabled, webp must be before jpeg.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFallbackFormats(String [] FallbackFormats) {
        this.FallbackFormats = FallbackFormats;
    }

    public AvifAdapter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvifAdapter(AvifAdapter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FallbackFormats != null) {
            this.FallbackFormats = new String[source.FallbackFormats.length];
            for (int i = 0; i < source.FallbackFormats.length; i++) {
                this.FallbackFormats[i] = new String(source.FallbackFormats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "FallbackFormats.", this.FallbackFormats);

    }
}

