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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LSqueezeSetting extends AbstractModel {

    /**
    * Advertising benchmark position, 0 top left, 1 top right, 2 bottom right, 3 bottom left, default value 0, corresponding TOP_LEFT,TOP_RIGHT,BOTTOM_RIGHT,BOTTOM_LEFT
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * The default value for the percentage in the X-axis direction is 20, with a range of 0-50
    */
    @SerializedName("OffsetX")
    @Expose
    private Long OffsetX;

    /**
    * The default value for the percentage in the Y-axis direction is 20, with a range of 0-50
    */
    @SerializedName("OffsetY")
    @Expose
    private Long OffsetY;

    /**
    * Background image URL, starting with http/https and ending in jpg/jpeg/png
    */
    @SerializedName("BackgroundImgUrl")
    @Expose
    private String BackgroundImgUrl;

    /**
    * Compress time. Unit ms, default value 2000, range: 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
    */
    @SerializedName("SqueezeInPeriod")
    @Expose
    private Long SqueezeInPeriod;

    /**
    * Restore to full screen time. Unit ms, default value 2000, range 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
    */
    @SerializedName("SqueezeOutPeriod")
    @Expose
    private Long SqueezeOutPeriod;

    /**
     * Get Advertising benchmark position, 0 top left, 1 top right, 2 bottom right, 3 bottom left, default value 0, corresponding TOP_LEFT,TOP_RIGHT,BOTTOM_RIGHT,BOTTOM_LEFT 
     * @return Location Advertising benchmark position, 0 top left, 1 top right, 2 bottom right, 3 bottom left, default value 0, corresponding TOP_LEFT,TOP_RIGHT,BOTTOM_RIGHT,BOTTOM_LEFT
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set Advertising benchmark position, 0 top left, 1 top right, 2 bottom right, 3 bottom left, default value 0, corresponding TOP_LEFT,TOP_RIGHT,BOTTOM_RIGHT,BOTTOM_LEFT
     * @param Location Advertising benchmark position, 0 top left, 1 top right, 2 bottom right, 3 bottom left, default value 0, corresponding TOP_LEFT,TOP_RIGHT,BOTTOM_RIGHT,BOTTOM_LEFT
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get The default value for the percentage in the X-axis direction is 20, with a range of 0-50 
     * @return OffsetX The default value for the percentage in the X-axis direction is 20, with a range of 0-50
     */
    public Long getOffsetX() {
        return this.OffsetX;
    }

    /**
     * Set The default value for the percentage in the X-axis direction is 20, with a range of 0-50
     * @param OffsetX The default value for the percentage in the X-axis direction is 20, with a range of 0-50
     */
    public void setOffsetX(Long OffsetX) {
        this.OffsetX = OffsetX;
    }

    /**
     * Get The default value for the percentage in the Y-axis direction is 20, with a range of 0-50 
     * @return OffsetY The default value for the percentage in the Y-axis direction is 20, with a range of 0-50
     */
    public Long getOffsetY() {
        return this.OffsetY;
    }

    /**
     * Set The default value for the percentage in the Y-axis direction is 20, with a range of 0-50
     * @param OffsetY The default value for the percentage in the Y-axis direction is 20, with a range of 0-50
     */
    public void setOffsetY(Long OffsetY) {
        this.OffsetY = OffsetY;
    }

    /**
     * Get Background image URL, starting with http/https and ending in jpg/jpeg/png 
     * @return BackgroundImgUrl Background image URL, starting with http/https and ending in jpg/jpeg/png
     */
    public String getBackgroundImgUrl() {
        return this.BackgroundImgUrl;
    }

    /**
     * Set Background image URL, starting with http/https and ending in jpg/jpeg/png
     * @param BackgroundImgUrl Background image URL, starting with http/https and ending in jpg/jpeg/png
     */
    public void setBackgroundImgUrl(String BackgroundImgUrl) {
        this.BackgroundImgUrl = BackgroundImgUrl;
    }

    /**
     * Get Compress time. Unit ms, default value 2000, range: 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration 
     * @return SqueezeInPeriod Compress time. Unit ms, default value 2000, range: 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
     */
    public Long getSqueezeInPeriod() {
        return this.SqueezeInPeriod;
    }

    /**
     * Set Compress time. Unit ms, default value 2000, range: 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
     * @param SqueezeInPeriod Compress time. Unit ms, default value 2000, range: 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
     */
    public void setSqueezeInPeriod(Long SqueezeInPeriod) {
        this.SqueezeInPeriod = SqueezeInPeriod;
    }

    /**
     * Get Restore to full screen time. Unit ms, default value 2000, range 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration 
     * @return SqueezeOutPeriod Restore to full screen time. Unit ms, default value 2000, range 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
     */
    public Long getSqueezeOutPeriod() {
        return this.SqueezeOutPeriod;
    }

    /**
     * Set Restore to full screen time. Unit ms, default value 2000, range 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
     * @param SqueezeOutPeriod Restore to full screen time. Unit ms, default value 2000, range 500-10000, SqueezeInPeriod+SqueezeOutPeriod cannot be greater than duration, included in duration
     */
    public void setSqueezeOutPeriod(Long SqueezeOutPeriod) {
        this.SqueezeOutPeriod = SqueezeOutPeriod;
    }

    public LSqueezeSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LSqueezeSetting(LSqueezeSetting source) {
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
        if (source.OffsetX != null) {
            this.OffsetX = new Long(source.OffsetX);
        }
        if (source.OffsetY != null) {
            this.OffsetY = new Long(source.OffsetY);
        }
        if (source.BackgroundImgUrl != null) {
            this.BackgroundImgUrl = new String(source.BackgroundImgUrl);
        }
        if (source.SqueezeInPeriod != null) {
            this.SqueezeInPeriod = new Long(source.SqueezeInPeriod);
        }
        if (source.SqueezeOutPeriod != null) {
            this.SqueezeOutPeriod = new Long(source.SqueezeOutPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "OffsetX", this.OffsetX);
        this.setParamSimple(map, prefix + "OffsetY", this.OffsetY);
        this.setParamSimple(map, prefix + "BackgroundImgUrl", this.BackgroundImgUrl);
        this.setParamSimple(map, prefix + "SqueezeInPeriod", this.SqueezeInPeriod);
        this.setParamSimple(map, prefix + "SqueezeOutPeriod", this.SqueezeOutPeriod);

    }
}

