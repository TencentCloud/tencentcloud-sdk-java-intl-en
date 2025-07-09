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

public class MediaSubStreamInfoItem extends AbstractModel {

    /**
    * The stream type. Valid values:
<li>`audio`: Audio only</li>
<li>`video`: Video (may include audio)</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The video width (px) if `Type` is `video`.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The video height (px) if `Type` is `video`.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The file size (bytes).
<font color=red>Note:</font>For adaptive bitrate streaming files generated before 2023-02-09T16:00:00Z, the value of this parameter is `0`.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get The stream type. Valid values:
<li>`audio`: Audio only</li>
<li>`video`: Video (may include audio)</li> 
     * @return Type The stream type. Valid values:
<li>`audio`: Audio only</li>
<li>`video`: Video (may include audio)</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The stream type. Valid values:
<li>`audio`: Audio only</li>
<li>`video`: Video (may include audio)</li>
     * @param Type The stream type. Valid values:
<li>`audio`: Audio only</li>
<li>`video`: Video (may include audio)</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The video width (px) if `Type` is `video`. 
     * @return Width The video width (px) if `Type` is `video`.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The video width (px) if `Type` is `video`.
     * @param Width The video width (px) if `Type` is `video`.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The video height (px) if `Type` is `video`. 
     * @return Height The video height (px) if `Type` is `video`.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The video height (px) if `Type` is `video`.
     * @param Height The video height (px) if `Type` is `video`.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The file size (bytes).
<font color=red>Note:</font>For adaptive bitrate streaming files generated before 2023-02-09T16:00:00Z, the value of this parameter is `0`. 
     * @return Size The file size (bytes).
<font color=red>Note:</font>For adaptive bitrate streaming files generated before 2023-02-09T16:00:00Z, the value of this parameter is `0`.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The file size (bytes).
<font color=red>Note:</font>For adaptive bitrate streaming files generated before 2023-02-09T16:00:00Z, the value of this parameter is `0`.
     * @param Size The file size (bytes).
<font color=red>Note:</font>For adaptive bitrate streaming files generated before 2023-02-09T16:00:00Z, the value of this parameter is `0`.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public MediaSubStreamInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubStreamInfoItem(MediaSubStreamInfoItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

